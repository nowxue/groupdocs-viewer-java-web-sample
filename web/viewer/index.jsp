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
        <div id="test" style="width:1000px;height:500px;overflow:hidden;position:relative;margin-bottom:20px;background-color:gray;border:1px solid #ccc;"></div>
        <script type="text/javascript">
            $(function() {
                var localizedStrings = null;
                var thumbsImageBase64Encoded = null;
                $('#test').groupdocsViewer({
                    filePath: '',
                    docViewerId: 'doc_viewer1',
                    quality: 100,
                    showThumbnails: false,
                    openThumbnails: false,
                    initialZoom: 100,
                    zoomToFitWidth: true,
                    zoomToFitHeight: false,
                    width: 1000,
                    height: 500,
                    backgroundColor: '',
                    showFolderBrowser: true,
                    showPrint: true,
                    showDownload: true,
                    showZoom: true,
                    showPaging: true,
                    showViewerStyleControl: true,
                    showSearch: true,
                    preloadPagesCount: 0,
                    viewerStyle: 1,
                    supportTextSelection: true,
                    usePdfPrinting: false,
                    localizedStrings: localizedStrings,
                    thumbsImageBase64Encoded: thumbsImageBase64Encoded,
                    toolbarButtonsBoxShadowStyle: '',
                    toolbarButtonsBoxShadowHoverStyle: '',
                    thumbnailsContainerBackgroundColor: '',
                    thumbnailsContainerBorderRightColor: '',
                    toolbarBorderBottomColor: '',
                    toolbarInputFieldBorderColor: '',
                    toolbarButtonBorderColor: '',
                    toolbarButtonBorderHoverColor: '',
                    thumbnailsContainerWidth: 0,
                    jqueryFileDownloadCookieName: 'jqueryFileDownloadJSForGD',
                    showDownloadErrorsInPopup: true,
                    showImageWidth: false,
                    showHeader: true,
                    minimumImageWidth: 0,
                    enableStandardErrorHandling: true
                });
            });
        </script>
    </body>
</html>
