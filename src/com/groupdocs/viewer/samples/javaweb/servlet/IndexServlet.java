package com.groupdocs.viewer.samples.javaweb.servlet;

import com.groupdocs.viewer.domain.path.EncodedPath;
import com.groupdocs.viewer.domain.path.GroupDocsPath;
import com.groupdocs.viewer.domain.path.TokenId;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alex Bobkov
 */
public class IndexServlet extends ViewerServlet{
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String file = request.getParameter("file");
            String tokenId = request.getParameter("tokenId");
            
            GroupDocsPath path = null;
            if(file != null && !file.isEmpty()){
                path = new EncodedPath(file, viewerHandler.getConfiguration());
            }else if(tokenId != null && !tokenId.isEmpty()){
                TokenId tki = new TokenId(tokenId, viewerHandler.getConfiguration().getConfig().getEncryptionKey());
                if(!tki.isExpired()){
                    path = tki;
                }
            }
            
            String viewerId = "test";
            String initialFilePath = (path == null) ? "" : path.getPath();
            String locale = viewerHandler.getLocale();
            request.setAttribute("viewer_head", viewerHandler.getHeader());
            request.setAttribute("viewerScript", viewerHandler.getViewerScript(viewerId, initialFilePath, locale));
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("viewer/index.jsp");
            requestDispatcher.forward(request, response);
        } catch (Exception ex) {
            Logger.getLogger(IndexServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
