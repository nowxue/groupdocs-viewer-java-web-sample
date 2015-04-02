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
public class GetHtmlResourcesHandlerServlet extends ViewerServlet{
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        try {
            writeOutput(viewerHandler.getHtmlResourcesHandler(request.getParameter("filePath"), request.getParameter("guid"), Integer.valueOf(request.getParameter("page")), request.getParameter("resourceName"), response), response);
        } catch (Exception ex) {
            Logger.getLogger(GetHtmlResourcesHandlerServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
