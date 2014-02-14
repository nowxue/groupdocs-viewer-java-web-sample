package com.groupdocs.viewer.samples.javaweb;

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
public class GetDocumentPageImageHandlerServlet extends ViewerServlet{

    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String params[] = request.getQueryString().split("&");
            String width = params[0].split("=")[1];
            int quality = Integer.valueOf(params[1].split("=")[1]);
            boolean usePdf = Boolean.valueOf(params[2].split("=")[1]);
            int pageIndex = Integer.valueOf(params[3].split("=")[1]);
            String path = params[4].split("=")[1];
            viewerHandler.getDocumentPageImageHandler(path, width, quality, usePdf, pageIndex, response);
        } catch (Exception ex) {
            Logger.getLogger(GetDocumentPageImageHandlerServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Not needed
    }

}
