package com.groupdocs.viewer.samples.javaweb;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alex Bobkov
 */
public class LoadFileBrowserTreeDataHandlerServlet extends ViewerServlet{

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //TODO
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Content-type", "application/json;charset=UTF-8");
        response.getWriter().print(viewerHandler.loadFileBrowserTreeDataHandler(request));
    }
    
}
