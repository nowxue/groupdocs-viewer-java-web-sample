package com.groupdocs.viewer.samples.javaweb.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Alex Bobkov, Aleksey Permyakov
 */
public class GetImageHandlerServlet extends ViewerServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String contextPath = request.getPathInfo();
            String[] path = contextPath.split("/");
            writeOutput(viewerHandler.getImageHandler(path[path.length - 1], request, response), response);
        } catch (Exception ex) {
            Logger.getLogger(GetImageHandlerServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
