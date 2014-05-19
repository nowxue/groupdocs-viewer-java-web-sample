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
        <div id="test"></div>
        <script>
             $(function () { 
                var localizedStrings = 'null';
                var thumbsImageBase64Encoded = null;
                $('#test').groupdocsViewer({ 
                    filePath: '',
                    quality: 100, 
                    showThumbnails: true, 
                    openThumbnails: true, 
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
                    preloadPagesCount: 2, 
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
                    showDownloadErrorsInPopup: false,
                    showImageWidth: false, 
                    showHeader: true,
                    minimumImageWidth: 0, 
                    enableStandardErrorHandling: true,
                    useHtmlBasedEngine: false, 
                    useImageBasedPrinting: true, 
                    fileDisplayName: '', 
                    downloadPdfFile: false,
                    searchForSeparateWords: false,
                    preventTouchEventsBubbling: false, 
                    useInnerThumbnails: true,
                    watermarkText: '', 
                    supportPageReordering: false,
                    watermarkFontSize: null,
                    watermarkColor: null,
                    watermarkLeft: null,
                    watermarkTop: null
                }); 
            }); 
        </script>
    </body>
</html>
