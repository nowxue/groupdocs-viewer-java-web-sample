Groupdocs Viewer for Java (Java WEB Sample)
===========================================

1. Download and extract GroupDocs Viewer for Java into desired directory. http://groupdocs.com/java/document-viewer-library
2. Download sample source code to any directory.
3. Open file `nbproject\project.properties`. Update file.reference.viewer-1.6.9.jar (on line 31).
4. Open file `src\java\com\groupdocs\viewer\samples\javaweb\ViewerServlet.java`. Edit init() method to fill your needs.
5. Open cmd and run command `ant -DforceRedeploy=false -Dnb.internal.action.name=build dist`.
6. Go to dist folder.
7. Copy war file into your tomcat webapps directory.
8. Run tomcat.
9. Open URL `http://127.0.0.1:8080/document-viewer/` in your browser, make sure that port 8080 is free (you can change port number in your tomcat configuration)
