package com.groupdocs.viewer.samples.javaweb.servlet;

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
public class GetDocumentPageImageHandlerServlet extends ViewerServlet{
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            int width = Integer.valueOf(request.getParameter("width"));
            int quality = Integer.valueOf(request.getParameter("quality"));
            boolean usePdf = Boolean.valueOf(request.getParameter("usePdf"));
            int pageIndex = Integer.valueOf(request.getParameter("pageIndex"));
            boolean isPrint = Boolean.valueOf(request.getParameter("isPrint"));
            final String watermarkPosition = request.getParameter("watermarkPosition");
            final Integer watermarkFontSize = Integer.valueOf(request.getParameter("watermarkFontSize"));
            final Boolean useHtmlBasedEngine = Boolean.valueOf(request.getParameter("useHtmlBasedEngine"));
            final Boolean rotate = Boolean.valueOf(request.getParameter("rotate"));

            String path = request.getParameter("path");
            writeOutput(viewerHandler.getDocumentPageImageHandler(path, width, quality, usePdf, pageIndex, isPrint, watermarkPosition, watermarkFontSize, useHtmlBasedEngine, rotate, response), response);
        } catch (Exception ex) {
            Logger.getLogger(GetDocumentPageImageHandlerServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
