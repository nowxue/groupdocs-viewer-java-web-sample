package com.groupdocs.viewer.samples.javaweb.servlet;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Alex Bobkov
 */

@MultipartConfig(fileSizeThreshold=1024*1024*2, maxFileSize=1024*1024*10, maxRequestSize=1024*1024*50) 
public class UploadFileHandlerServlet extends ViewerServlet{

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        for(Part part : request.getParts()){
            try {
                String fileName = extractFileName(part);
                String uploadResponse = (String) viewerHandler.uploadFile(part.getInputStream(), fileName, 0);
                JSONObject obj = new JSONObject(uploadResponse);
                response.sendRedirect("?tokenId=" + obj.getString("tokenId"));
                return;
            } catch (JSONException ex) {
                Logger.getLogger(UploadFileHandlerServlet.class.getName()).log(Level.SEVERE, null, ex);
                return;
            }
        }
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
    
    private String extractFileName(Part part) {
        String contentDisp = part.getHeader("content-disposition");
        String[] items = contentDisp.split(";");
        for (String s : items) {
            if (s.trim().startsWith("filename")) {
                return s.substring(s.indexOf("=") + 2, s.length()-1);
            }
        }
        return "";
    }
    
}
