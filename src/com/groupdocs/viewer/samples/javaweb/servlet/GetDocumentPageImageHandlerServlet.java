package com.groupdocs.viewer.samples.javaweb.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author Alex Bobkov
 */
public class GetDocumentPageImageHandlerServlet extends ViewerServlet{
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int width = Integer.valueOf(request.getParameter("width"));
        int quality = Integer.valueOf(request.getParameter("quality"));
        boolean usePdf = Boolean.valueOf(request.getParameter("usePdf"));
        int pageIndex = Integer.valueOf(request.getParameter("pageIndex"));
        String path = request.getParameter("path");
        writeOutput((InputStream) viewerHandler.getDocumentPageImageHandler(path, width, quality, usePdf, pageIndex, response), response);
    }

}
