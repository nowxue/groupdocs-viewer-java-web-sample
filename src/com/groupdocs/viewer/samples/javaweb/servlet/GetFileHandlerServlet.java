package com.groupdocs.viewer.samples.javaweb.servlet;

import org.apache.log4j.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @author Alex Bobkov
 */
public class GetFileHandlerServlet extends ViewerServlet{

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String path = request.getParameter("path");
            boolean getPdf = Boolean.valueOf(request.getParameter("getPdf"));
            viewerHandler.getFileHandler(path, getPdf, response);
        } catch (Exception ex) {
            Logger.getLogger(this.getClass()).error(ex);
        }
    }
   
}
