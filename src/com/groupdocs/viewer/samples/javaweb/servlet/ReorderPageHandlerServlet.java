package com.groupdocs.viewer.samples.javaweb.servlet;

import java.io.IOException;
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
        viewerHandler.reorderPageHandler(request, response);
    }
}
