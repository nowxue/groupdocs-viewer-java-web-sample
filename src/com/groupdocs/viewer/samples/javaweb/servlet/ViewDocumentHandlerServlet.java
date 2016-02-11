package com.groupdocs.viewer.samples.javaweb.servlet;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.io.CharStreams;
import com.groupdocs.viewer.config.IServiceConfiguration;
import com.groupdocs.viewer.config.ServiceConfiguration;
import com.groupdocs.viewer.domain.request.ViewDocumentRequest;
import com.groupdocs.viewer.domain.response.ViewDocumentResponse;
import com.groupdocs.viewer.samples.javaweb.domain.media.MediaType;


/**
 *
 * @author Alex Bobkov
 */
public class ViewDocumentHandlerServlet extends ViewerServlet{

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Implement this method to support IE
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
			JSONObject js = new JSONObject(CharStreams.toString(request.getReader())); 
        	ViewDocumentRequest dr = getDocumentRequest(vhb.getLocale(), js);
        	
        	ViewDocumentResponse dresp = vhb.viewDocument(dr, "");
        	
        	ObjectMapper mapper = new ObjectMapper();
        	String jsString = mapper.writeValueAsString(dresp);
        	            
            response.setContentType(MediaType.APPLICATION_JSON.toString());
            response.setCharacterEncoding(DEFAULT_ENCODING);
            response.getWriter().write(jsString);
            //writeOutput(MediaType.APPLICATION_JSON, response, viewerHandler.viewDocumentHandler(request, response));
        } catch (Exception ex) {
            Logger.getLogger(ViewDocumentHandlerServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private ViewDocumentRequest getDocumentRequest(String locale, JSONObject js) throws JSONException {
		ServiceConfiguration config = vhb.getConfiguration();
		IServiceConfiguration c = config.getConfig();

		ViewDocumentRequest dr = new ViewDocumentRequest();
		
		dr.setPath(js.getString("path"));
		dr.setConvertWordDocumentsCompletely(c
				.isConvertWordDocumentsCompletely());
//		dr.setEmbedImagesIntoHtmlForWordFiles(true);
		dr.setFileDisplayName(js.getString("fileDisplayName"));
		dr.setIgnoreDocumentAbsence(js.getBoolean("ignoreDocumentAbsence"));
		// dr.setInstanceIdToken("");//TODO
		dr.setLocale(locale);
//		 dr.setPassword(js.getString("password"));//TODO
		dr.setPreloadPagesCount(js.getInt("preloadPagesCount"));
		// dr.setPrivateKey(c.getEncryptionKey());//TODO
//		dr.setQuality(js.getInt("quality"));//TODO
		dr.setSupportListOfBookmarks(js.getBoolean("supportListOfBookmarks"));
		dr.setSupportListOfContentControls(js.getBoolean("supportListOfContentControls"));
		dr.setSupportPageRotation(js.getBoolean("supportPageRotation"));
		dr.setUseHtmlBasedEngine(c.isUseHtmlBasedEngine());
//		dr.setUsePdf(js.getBoolean("usePdf"));
		
		dr.setUsePngImagesForHtmlBasedEngine(c.isUsePngImagesForHtmlBasedEngine());
		// dr.setUserId("");//TODO
		dr.setWatermarkColor(js.getString("watermarkColor"));
		dr.setWatermarkFontSize(c.getWatermarkFontSize());
		dr.setWatermarkPosition(js.getString("watermarkPosition"));
		dr.setWatermarkText(js.getString("watermarkText"));
		//TODO do safe js reading
//		Object wm = js.get("watermarkWidth");
//		dr.setWatermarkWidth(wm != null ? Integer.parseInt(wm.toString()) : null);
		dr.setWatermarkWidth(null);

//		dr.setWidth(js.getInt("width"));
		
		return dr;
	}
}
