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
public class GetHtmlResourcesHandlerServlet extends ViewerServlet{
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        try {
            String guid = request.getParameter("guid");
            String page = request.getParameter("page");
            String resourceName = request.getParameter("resourceName");
            writeOutput(
                    viewerHandler.getHtmlResourcesHandler(
                            request.getParameter("filePath"),
                            guid,
                            page == null ? null : Integer.valueOf(page),
                            resourceName,
                            response),
                    response);
        } catch (Exception ex) {
            Logger.getLogger(GetHtmlResourcesHandlerServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
