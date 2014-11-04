package com.groupdocs.viewer.samples.javaweb.servlet;

import com.groupdocs.viewer.samples.javaweb.domain.media.MediaType;
import static com.groupdocs.viewer.samples.javaweb.servlet.ViewerServlet.viewerHandler;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alex Bobkov
 */
public class RotatePageHandlerServlet extends ViewerServlet{
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        writeOutput(MediaType.APPLICATION_JSON, response, viewerHandler.rotatePageHandler(request, response));
    }

}
