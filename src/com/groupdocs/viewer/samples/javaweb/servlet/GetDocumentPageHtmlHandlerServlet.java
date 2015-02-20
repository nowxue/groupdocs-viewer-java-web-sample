package com.groupdocs.viewer.samples.javaweb.servlet;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alex Bobkov
 */
public class GetDocumentPageHtmlHandlerServlet extends ViewerServlet{
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        try {
            writeOutput(viewerHandler.getDocumentPageHtmlHandler(request, response), response);
        } catch (Exception ex) {
            Logger.getLogger(GetDocumentPageHtmlHandlerServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
