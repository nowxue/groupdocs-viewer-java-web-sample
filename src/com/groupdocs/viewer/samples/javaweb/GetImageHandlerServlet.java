package com.groupdocs.viewer.samples.javaweb;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Author Aleksey Permyakov
 */
public class GetImageHandlerServlet extends ViewerServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setHeader("Content-type", "image/png");
        String contextPath = request.getPathInfo();
        String[] path = contextPath.split("/");
        viewerHandler.getImageHandler(path[path.length - 1], response);
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //TODO
    }
}
