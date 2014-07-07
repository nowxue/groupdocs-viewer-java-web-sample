package com.groupdocs.viewer.samples.javaweb.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Alex Bobkov, Aleksey Permyakov
 */
public class GetJsHandlerServlet extends ViewerServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        writeOutput((InputStream) viewerHandler.getJsHandler(request.getParameter("script"), response), response);
    }

}
