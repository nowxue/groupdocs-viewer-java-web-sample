package com.groupdocs.viewer.samples.javaweb.servlet;

import com.groupdocs.viewer.samples.javaweb.domain.media.MediaType;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alex Bobkov
 */
public class LoadFileBrowserTreeDataHandlerServlet extends ViewerServlet{

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Implement this method to support IE
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        writeOutput(MediaType.APPLICATION_JSON, response, viewerHandler.loadFileBrowserTreeDataHandler(request, response));
    }
    
}
