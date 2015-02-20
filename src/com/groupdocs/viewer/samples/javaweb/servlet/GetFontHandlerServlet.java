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
public class GetFontHandlerServlet extends ViewerServlet{

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String pathInfo = request.getPathInfo();
            String[] path = pathInfo.split("/");
            writeOutput(viewerHandler.getFontHandler(path[path.length - 1], request, response), response);
        } catch (Exception ex) {
            Logger.getLogger(GetFontHandlerServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
