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
public class GetFileHandlerServlet extends ViewerServlet{

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = request.getParameter("path");
        boolean getPdf = Boolean.valueOf(request.getParameter("getPdf"));
        writeOutput((InputStream) viewerHandler.getFileHandler(path, getPdf, response), response);
    }
   
}
