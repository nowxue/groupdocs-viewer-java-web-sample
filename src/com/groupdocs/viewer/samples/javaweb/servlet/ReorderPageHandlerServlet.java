package com.groupdocs.viewer.samples.javaweb.servlet;

import com.groupdocs.viewer.samples.javaweb.domain.media.MediaType;
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
public class ReorderPageHandlerServlet extends ViewerServlet{
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            writeOutput(MediaType.APPLICATION_JSON, response, viewerHandler.reorderPageHandler(request, response));
        } catch (Exception ex) {
            Logger.getLogger(ReorderPageHandlerServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
