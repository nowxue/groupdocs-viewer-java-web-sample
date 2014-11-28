package com.groupdocs.viewer.samples.javaweb.servlet;

import java.io.IOException;
import java.io.InputStream;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alex Bobkov
 */
public class GetHtmlResourcesHandlerServlet extends ViewerServlet{
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        writeOutput((InputStream) viewerHandler.getHtmlResourcesHandler(request.getParameter("filePath"), response), response);
    }

}
