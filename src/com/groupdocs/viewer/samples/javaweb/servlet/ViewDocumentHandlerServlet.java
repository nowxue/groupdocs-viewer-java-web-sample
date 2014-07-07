package com.groupdocs.viewer.samples.javaweb.servlet;

import com.groupdocs.viewer.samples.javaweb.domain.media.MediaType;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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
        writeOutput(MediaType.APPLICATION_JSON, response, viewerHandler.viewDocumentHandler(request, response));
    }
    
}
