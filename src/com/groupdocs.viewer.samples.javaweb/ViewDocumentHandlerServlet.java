package com.groupdocs.viewer.samples.javaweb;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @author Alex Bobkov
 */
public class ViewDocumentHandlerServlet extends ViewerServlet{

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //TODO
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setHeader("Content-type", "application/json;charset=UTF-8");
        response.getWriter().print(viewerHandler.viewDocumentHandler(request));
        //response.getWriter().print(request.getServerName() + request.getServerPort() + request.getContextPath());
    }
    
}
