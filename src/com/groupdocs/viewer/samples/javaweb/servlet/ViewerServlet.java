package com.groupdocs.viewer.samples.javaweb.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.groupdocs.viewer.config.ServiceConfiguration;
import com.groupdocs.viewer.handlers.ViewerHandler;
import com.groupdocs.viewer.samples.javaweb.config.Configuration;
import com.groupdocs.viewer.samples.javaweb.domain.media.MediaType;
import org.apache.log4j.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.io.IOUtils;

/**
 *
 * @author Alex Bobkov
 */
public abstract class ViewerServlet extends HttpServlet {
    private final String DEFAULT_ENCODING = "UTF-8";
    protected static ViewerHandler viewerHandler;

    @Override
    public void init() throws ServletException {
        try {
            if(viewerHandler == null){
                final ServiceConfiguration config = new ServiceConfiguration(new Configuration());
                viewerHandler = new ViewerHandler(config);
            }
        } catch (Exception ex) {
            Logger.getLogger(this.getClass()).error(ex);
        }
    }

    protected void writeOutput(MediaType contentType, HttpServletResponse response, Object object) throws IOException{
        String json;
        if (object instanceof String) {
            json = (String) object;
        } else {
            try (ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
                new ObjectMapper().writeValue(outputStream, object);
                try (ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray())) {
                    json = IOUtils.toString(inputStream);
                }
            }
        }
        response.getOutputStream().write(json.getBytes(DEFAULT_ENCODING));
        if(contentType != null && !contentType.toString().isEmpty()){
            response.setContentType(contentType.toString());
        }
    }
    
    protected void writeOutput(Object inputStream, HttpServletResponse response) throws IOException{
        if(inputStream != null){
            IOUtils.copy((InputStream) inputStream, response.getOutputStream());
        }else{
            response.setStatus(HttpServletResponse.SC_NOT_MODIFIED);
        }
    }
}