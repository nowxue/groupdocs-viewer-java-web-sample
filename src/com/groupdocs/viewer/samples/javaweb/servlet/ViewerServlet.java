package com.groupdocs.viewer.samples.javaweb.servlet;

import com.groupdocs.viewer.handlers.ViewerHandler;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @author Alex Bobkov
 */
public abstract class ViewerServlet extends HttpServlet {
    private final String DEFAULT_ENCODING = "UTF-8";
    protected static ViewerHandler viewerHandler;

    protected void writeOutput(String contentType, HttpServletResponse response, Object object) throws IOException{
        String json = (String) object;
        response.getOutputStream().write(json.getBytes(DEFAULT_ENCODING));
        if(contentType != null && !contentType.isEmpty()){
            response.setContentType(contentType);
        }
    }
}
