package com.groupdocs.viewer.samples.javaweb;

import com.groupdocs.viewer.config.ServiceConfiguration;
import com.groupdocs.viewer.domain.Assets;
import com.groupdocs.viewer.handlers.ViewerHandler;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alex Bobkov
 */
public abstract class ViewerServlet extends HttpServlet {

    protected ViewerHandler viewerHandler;

    @Override
    public void init() throws ServletException {
        try {
            final String appPath = "http://localhost:8080/";
            final String basePath = "D:\\Projects\\GroupDocs\\app\\xFiles";
            final String licensePath = null;
            final String absolutePath = "D:\\Projects\\GroupDocs\\app\\xFiles\\temp";
            final Assets assets = new Assets(absolutePath, "/document-viewer");
            final ServiceConfiguration config = new ServiceConfiguration(appPath, basePath, licensePath, assets, Boolean.FALSE);
            viewerHandler = new ViewerHandler(config);
        } catch (Exception ex) {
            Logger.getLogger(ViewerServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public abstract void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
    
    @Override
    public abstract void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
