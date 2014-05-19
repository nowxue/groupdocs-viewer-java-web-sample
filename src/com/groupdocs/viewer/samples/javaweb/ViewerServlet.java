package com.groupdocs.viewer.samples.javaweb;

import com.groupdocs.viewer.config.ServiceConfiguration;
import com.groupdocs.viewer.handlers.ViewerHandler;
import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @author Alex Bobkov
 */
public abstract class ViewerServlet extends HttpServlet {
    private final String DEFAULT_ENCODING = "UTF-8";
    protected ViewerHandler viewerHandler;

    @Override
    public void init() throws ServletException {
        try {
            final String appPath = "http://127.0.0.1:8080/document-viewer/";
            final String basePath = "E:\\Projects\\GroupDocs\\app\\xFiles";
            final String licensePath = null;
            final int width = 1000;
            final ServiceConfiguration config = new ServiceConfiguration(appPath, basePath, licensePath, Boolean.FALSE, Boolean.FALSE, width);
            viewerHandler = new ViewerHandler(config);
        } catch (Exception ex) {
            Logger.getLogger(this.getClass()).error(ex);
        }
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        
    }
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        
    }
    
    protected void writeOutput(String contentType, HttpServletResponse response, Object object) throws IOException{
        String json = (String) object;
        response.getOutputStream().write(json.getBytes(DEFAULT_ENCODING));
        if(contentType != null && !contentType.isEmpty()){
            response.setContentType(contentType);
        }
    }
}
