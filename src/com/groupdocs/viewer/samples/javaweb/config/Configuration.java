package com.groupdocs.viewer.samples.javaweb.config;

import com.groupdocs.viewer.config.ServiceConfigurationBase;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alex Bobkov
 */
public class Configuration implements ServiceConfigurationBase{
    private Properties properties;
    
    public Configuration(){
        if(properties == null){
            properties = new Properties();
            InputStream is = null;
            try {
                // Load property file
                is = getClass().getClassLoader().getResourceAsStream("application.properties");
                properties.load(is);
            } catch (IOException ex) {
                Logger.getLogger(Configuration.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                try {
                    if(is != null){
                        is.close();
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Configuration.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public String getLicensePath() {
        return properties.getProperty("groupdocs.viewer.licensePath");
    }

    @Override
    public String getApplicationPath() {
        return properties.getProperty("groupdocs.viewer.applicationPath");
    }

    @Override
    public String getBasePath() {
        return properties.getProperty("groupdocs.viewer.filePath");
    }

    @Override
    public boolean isUseAuthorization() {
        return Boolean.valueOf(properties.getProperty("groupdocs.viewer.useAuthorization"));
    }

    @Override
    public boolean isUseCache() {
        return Boolean.valueOf(properties.getProperty("groupdocs.viewer.useCache"));
    }
    
    @Override
    public boolean isUseBrowserCache(){
        return Boolean.valueOf(properties.getProperty("groupdocs.viewer.useBrowserCache"));
    }

    @Override
    public int getExpirationDate() {
        return Integer.valueOf(properties.getProperty("groupdocs.viewer.expirationDate"));
    }

    @Override
    public String getEncryptionKey() {
        return properties.getProperty("groupdocs.viewer.encKey");
    }
    
    @Override
    public String getLocalesPath() {
        return properties.getProperty("groupdocs.viewer.localesPath");
    }

    @Override
    public int getQuality() {
        return Integer.valueOf(properties.getProperty("groupdocs.viewer.quality"));
    }

    @Override
    public boolean isShowThumbnails() {
        return Boolean.valueOf(properties.getProperty("groupdocs.viewer.showThumbnails"));
    }

    @Override
    public boolean isOpenThumbnails() {
        return Boolean.valueOf(properties.getProperty("groupdocs.viewer.openThumbnails"));
    }

    @Override
    public int getInitialZoom() {
        return Integer.valueOf(properties.getProperty("groupdocs.viewer.initialZoom"));
    }

    @Override
    public boolean isZoomToFitWidth() {
        return Boolean.valueOf(properties.getProperty("groupdocs.viewer.zoomToFitWidth"));
    }

    @Override
    public boolean isZoomToFitHeight() {
        return Boolean.valueOf(properties.getProperty("groupdocs.viewer.zoomToFitHeight"));
    }

    @Override
    public int getWidth() {
        return Integer.valueOf(properties.getProperty("groupdocs.viewer.width"));
    }

    @Override
    public int getHeight() {
        return Integer.valueOf(properties.getProperty("groupdocs.viewer.height"));
    }

    @Override
    public String getBackgroundColor() {
        return properties.getProperty("groupdocs.viewer.backgroundColor");
    }

    @Override
    public boolean isShowFolderBrowser() {
        return Boolean.valueOf(properties.getProperty("groupdocs.viewer.showFolderBrowser"));
    }

    @Override
    public boolean isShowPrint() {
        return Boolean.valueOf(properties.getProperty("groupdocs.viewer.showPrint"));
    }

    @Override
    public boolean isShowDownload() {
        return Boolean.valueOf(properties.getProperty("groupdocs.viewer.showDownload"));
    }

    @Override
    public boolean isShowZoom() {
        return Boolean.valueOf(properties.getProperty("groupdocs.viewer.showZoom"));
    }

    @Override
    public boolean isShowPaging() {
        return Boolean.valueOf(properties.getProperty("groupdocs.viewer.showPaging"));
    }

    @Override
    public boolean isShowViewerStyleControl() {
        return Boolean.valueOf(properties.getProperty("groupdocs.viewer.showViewerStyleControl"));
    }

    @Override
    public boolean isShowSearch() {
        return Boolean.valueOf(properties.getProperty("groupdocs.viewer.showSearch"));
    }

    @Override
    public int getPreloadPagesCount() {
        return Integer.valueOf(properties.getProperty("groupdocs.viewer.preloadPagesCount"));
    }

    @Override
    public int getViewerStyle() {
        return Integer.valueOf(properties.getProperty("groupdocs.viewer.viewerStyle"));
    }

    @Override
    public boolean isSupportTextSelection() {
        return Boolean.valueOf(properties.getProperty("groupdocs.viewer.supportTextSelection"));
    }

    @Override
    public boolean isUsePdfPrinting() {
        return Boolean.valueOf(properties.getProperty("groupdocs.viewer.usePdfPrinting"));
    }

    @Override
    public String getToolbarButtonsBoxShadowStyle() {
        return properties.getProperty("groupdocs.viewer.toolbarButtonsBoxShadowStyle");
    }

    @Override
    public String getToolbarButtonsBoxShadowHoverStyle() {
        return properties.getProperty("groupdocs.viewer.toolbarButtonsBoxShadowHoverStyle");
    }

    @Override
    public String getThumbnailsContainerBackgroundColor() {
        return properties.getProperty("groupdocs.viewer.thumbnailsContainerBackgroundColor");
    }

    @Override
    public String getThumbnailsContainerBorderRightColor() {
        return properties.getProperty("groupdocs.viewer.thumbnailsContainerBorderRightColor");
    }

    @Override
    public String getToolbarBorderBottomColor() {
        return properties.getProperty("groupdocs.viewer.toolbarBorderBottomColor");
    }

    @Override
    public String getToolbarInputFieldBorderColor() {
        return properties.getProperty("groupdocs.viewer.toolbarInputFieldBorderColor");
    }

    @Override
    public String getToolbarButtonBorderColor() {
        return properties.getProperty("groupdocs.viewer.toolbarButtonBorderColor");
    }

    @Override
    public String getToolbarButtonBorderHoverColor() {
        return properties.getProperty("groupdocs.viewer.toolbarButtonBorderHoverColor");
    }

    @Override
    public int getThumbnailsContainerWidth() {
        return Integer.valueOf(properties.getProperty("groupdocs.viewer.thumbnailsContainerWidth"));
    }

    @Override
    public boolean isShowDownloadErrorsInPopup() {
        return Boolean.valueOf(properties.getProperty("groupdocs.viewer.showDownloadErrorsInPopup"));
    }

    @Override
    public boolean isShowImageWidth() {
        return Boolean.valueOf(properties.getProperty("groupdocs.viewer.showImageWidth"));
    }

    @Override
    public boolean isShowHeader() {
        return Boolean.valueOf(properties.getProperty("groupdocs.viewer.showHeader"));
    }

    @Override
    public int getMinimumImageWidth() {
        return Integer.valueOf(properties.getProperty("groupdocs.viewer.minimumImageWidth"));
    }

    @Override
    public boolean isEnableStandardErrorHandling() {
        return Boolean.valueOf(properties.getProperty("groupdocs.viewer.enableStandardErrorHandling"));
    }

    @Override
    public boolean isUseHtmlBasedEngine() {
        return Boolean.valueOf(properties.getProperty("groupdocs.viewer.useHtmlBasedEngine"));
    }

    @Override
    public boolean isUseImageBasedPrinting() {
        return Boolean.valueOf(properties.getProperty("groupdocs.viewer.useImageBasedPrinting"));
    }

    @Override
    public boolean isDownloadPdfFile() {
        return Boolean.valueOf(properties.getProperty("groupdocs.viewer.downloadPdfFile"));
    }

    @Override
    public boolean isSearchForSeparateWords() {
        return Boolean.valueOf(properties.getProperty("groupdocs.viewer.searchForSeparateWords"));
    }

    @Override
    public boolean isPreventTouchEventsBubbling() {
        return Boolean.valueOf(properties.getProperty("groupdocs.viewer.preventTouchEventsBubbling"));
    }

    @Override
    public boolean isUseInnerThumbnails() {
        return Boolean.valueOf(properties.getProperty("groupdocs.viewer.useInnerThumbnails"));
    }

    @Override
    public String getWatermarkText() {
        return properties.getProperty("groupdocs.viewer.watermarkText");
    }

    @Override
    public String getWatermarkColor() {
        return properties.getProperty("groupdocs.viewer.watermarkColor");
    }

    @Override
    public boolean isSupportPageReordering() {
        return Boolean.valueOf(properties.getProperty("groupdocs.viewer.supportPageReordering"));
    }

    @Override
    public boolean isOnlyShrinkLargePages() {
        return Boolean.valueOf(properties.getProperty("groupdocs.viewer.onlyShrinkLargePages"));
    }

    @Override
    public String getSearchHighlightColor() {
        return properties.getProperty("groupdocs.viewer.searchHighlightColor");
    }

    @Override
    public String getCurrentSearchHighlightColor() {
        return properties.getProperty("groupdocs.viewer.currentSearchHighlightColor");
    }

    @Override
    public boolean isTreatPhrasesInDoubleQuotesAsExactPhrases() {
        return Boolean.valueOf(properties.getProperty("groupdocs.viewer.treatPhrasesInDoubleQuotesAsExactPhrases"));
    }

    @Override
    public boolean isUsePngImagesForHtmlBasedEngine() {
        return Boolean.valueOf(properties.getProperty("groupdocs.viewer.usePngImagesForHtmlBasedEngine"));
    }

    @Override
    public boolean isShowOnePageInRow() {
        return Boolean.valueOf(properties.getProperty("groupdocs.viewer.showOnePageInRow"));
    }

    @Override
    public boolean isLoadAllPagesOnSearch() {
        return Boolean.valueOf(properties.getProperty("groupdocs.viewer.loadAllPagesOnSearch"));
    }

    @Override
    public boolean isUseEmScaling() {
        return Boolean.valueOf(properties.getProperty("groupdocs.viewer.useEmScaling"));
    }
    
}
