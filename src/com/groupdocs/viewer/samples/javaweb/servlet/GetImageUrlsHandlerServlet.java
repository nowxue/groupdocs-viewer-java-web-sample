package com.groupdocs.viewer.samples.javaweb.servlet;

import java.io.IOException;
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
import com.groupdocs.viewer.domain.request.ImageUrlsRequest;
import com.groupdocs.viewer.domain.request.ViewDocumentRequest;
import com.groupdocs.viewer.domain.response.ImageUrlsResponse;
import com.groupdocs.viewer.domain.response.ViewDocumentResponse;
import com.groupdocs.viewer.samples.javaweb.domain.media.MediaType;

/**
 *
 * @author Alex Bobkov
 */
public class GetImageUrlsHandlerServlet extends ViewerServlet{

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Implement this method to support IE
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
			JSONObject js = new JSONObject(CharStreams.toString(request.getReader())); 
        	ImageUrlsRequest dr = getUrlRequest(js);
        	
        	ImageUrlsResponse dresp = vhb.getImageUrls(dr, "");
        	
        	ObjectMapper mapper = new ObjectMapper();
        	String jsString = mapper.writeValueAsString(dresp);
        	            
            response.setContentType(MediaType.APPLICATION_JSON.toString());
            response.setCharacterEncoding(DEFAULT_ENCODING);
            response.getWriter().write(jsString);
            //writeOutput(MediaType.APPLICATION_JSON, response, viewerHandler.getImageUrlsHandler(request, response));
        } catch (Exception ex) {
            Logger.getLogger(GetImageUrlsHandlerServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private ImageUrlsRequest getUrlRequest(JSONObject js) throws JSONException {
		ServiceConfiguration config = vhb.getConfiguration();
		IServiceConfiguration c = config.getConfig();

		ImageUrlsRequest dr = new ImageUrlsRequest();
		
		dr.setPath(js.getString("path"));
		dr.setIgnoreDocumentAbsence(js.getBoolean("ignoreDocumentAbsence"));
//		dr.setPrivateKey(js.getString("privateKey"));//TODO handle null
		dr.setQuality(js.getInt("quality"));
		dr.setSupportPageRotation(js.getBoolean("supportPageRotation"));
		dr.setUseHtmlBasedEngine(c.isUseHtmlBasedEngine());
		dr.setUsePdf(js.getBoolean("usePdf"));
		dr.setUseHtmlBasedEngine(js.getBoolean("useHtmlBasedEngine"));
		dr.setUserId(js.getString("userId"));
		//TODO handle null:
//		dr.setWatermarkColor(js.getString("watermarkColor"));
//		dr.setWatermarkFontSize(js.getInt("watermarkFontSize"));
//		dr.setWatermarkPosition(js.getString("watermarkPosition"));
		dr.setWatermarkPosition("0");
//		dr.setWatermarkText(js.getString("watermarkText"));
		dr.setWidth(js.getInt("width"));
		
		return dr;
	}
}
