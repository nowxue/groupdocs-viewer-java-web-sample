package com.groupdocs.viewer.samples.javaweb.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Author Alex Bobkov, Aleksey Permyakov
 */
public class GetCssHandlerServlet extends ViewerServlet {
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setHeader("Content-type", "text/css");
        viewerHandler.getCssHandler(request.getParameter("script"), response);
    }

}
