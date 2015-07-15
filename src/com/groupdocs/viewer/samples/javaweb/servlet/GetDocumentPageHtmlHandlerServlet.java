package com.groupdocs.viewer.samples.javaweb.servlet;

import com.groupdocs.viewer.samples.javaweb.domain.media.MediaType;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alex Bobkov
 */
public class GetDocumentPageHtmlHandlerServlet extends ViewerServlet{
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        try {
            writeOutput(MediaType.APPLICATION_JSON, response, viewerHandler.getDocumentPageHtmlHandler(request, response));
        } catch (Exception ex) {
            Logger.getLogger(GetDocumentPageHtmlHandlerServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
