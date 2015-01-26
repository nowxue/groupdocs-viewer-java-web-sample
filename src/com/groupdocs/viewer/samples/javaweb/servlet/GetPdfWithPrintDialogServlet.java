package com.groupdocs.viewer.samples.javaweb.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alex Bobkov
 */
public class GetPdfWithPrintDialogServlet extends ViewerServlet{
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            writeOutput((InputStream) viewerHandler.getPdfWithPrintDialog(request.getParameter("path"), response), response);
        } catch (Exception ex) {
            Logger.getLogger(GetPdfWithPrintDialogServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
