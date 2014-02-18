package com.groupdocs.viewer.samples.javaweb;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 *
 * @author Alex Bobkov
 */
public class GetDocumentPageImageHandlerServlet extends ViewerServlet{

    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setHeader("Content-Type", "image/png");
        try {
            String width = request.getParameter("width");
            int quality = Integer.valueOf(request.getParameter("quality"));
            boolean usePdf = Boolean.valueOf(request.getParameter("usePdf"));
            int pageIndex = Integer.valueOf(request.getParameter("pageIndex"));
            String path = request.getParameter("path");
            viewerHandler.getDocumentPageImageHandler(path, width, quality, usePdf, pageIndex, response);
        } catch (Exception ex) {
            Logger.getLogger(this.getClass()).error(ex);
        }
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Not needed
    }

}
