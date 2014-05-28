<%-- 
    Document   : index
    Created on : Feb 13, 2014, 3:35:58 PM
    Author     : Alex Bobkov
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>GroupDocs.Viewer for Java Sample</title>
        <%=(String)request.getAttribute("viewer_head")%>
    </head>
    <body>
        <div>
            <form enctype="multipart/form-data" method="POST" action="UploadFile">
                <input type="file" id="fileUpload" name="file"/>
                <input type="submit" value="Upload"/>
            </form>
        </div>
        <div id="test"></div>
        <%=(String)request.getAttribute("viewerScript")%>
    </body>
</html>
