package com.groupdocs.viewer.samples.javaweb;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alex Bobkov
 */
public class GetPdf2JavaScriptHandlerServlet extends ViewerServlet{

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Implement this method to support IE
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        writeOutput("application/json", response, viewerHandler.getPdf2JavaScriptHandler(request, response));
    }
    
}
