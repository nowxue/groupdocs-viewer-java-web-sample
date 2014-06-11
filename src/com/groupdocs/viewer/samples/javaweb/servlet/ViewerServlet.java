package com.groupdocs.viewer.samples.javaweb.servlet;

import com.groupdocs.viewer.config.ServiceConfiguration;
import com.groupdocs.viewer.handlers.ViewerHandler;
import com.groupdocs.viewer.samples.javaweb.config.Configuration;
import org.apache.log4j.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
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
            final ServiceConfiguration config = new ServiceConfiguration(new Configuration());
            viewerHandler = new ViewerHandler(config);
        } catch (Exception ex) {
            Logger.getLogger(this.getClass()).error(ex);
        }
    }

    protected void writeOutput(String contentType, HttpServletResponse response, Object object) throws IOException{
        String json = (String) object;
        response.getOutputStream().write(json.getBytes(DEFAULT_ENCODING));
        if(contentType != null && !contentType.isEmpty()){
            response.setContentType(contentType);
        }
    }
}