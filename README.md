##GroupDocs.Viewer for Java
####Servlets Sample 2.12.0
![Alt text](https://media.licdn.com/media/p/7/005/059/258/39b2da3.png "GroupDocs")

<br/><br/>

How-to install/run
------

#####Windows/Linux/MacOS
1. Download and extract GroupDocs.Viewer for Java into desired directory. http://groupdocs.com/java/document-viewer-library
2. Download sample source code to any directory.
3. Open file `build.properties`. Update `project.viewer.path` property (on line 3) and `project.tomcat.home` property (on line 11).
4. Open file `src\application.properties`. Edit application path, etc.. to fill your needs.
5. Open cmd and run command `ant war`.
6. Go to dist folder.
7. Copy war file into your tomcat webapps directory.
8. Delete `ROOT` folder in your tomcat webapps directory if it is exists
9. Rename `document-viewer.war` to `ROOT.war`
8. Run tomcat.
9. Open URL `http://127.0.0.1:8080/` in your browser, make sure that port 8080 is free (you can change port number in your tomcat configuration)
<br/><br/>


How to view/open file documents
---------------
1. Go to http://127.0.0.1:8080/view?file=fileId
2. Go to http://127.0.0.1:8080/view?file=path_to_file_from_root_dir
3. Go to http://127.0.0.1:8080/view?file=url_to_file
4. Go to http://127.0.0.1:8080/view?tokenId=tokenId
<br/><br/>


Description
---------------
A powerful document viewer API that allows you to display over 50 document formats in your Java applications. The viewer can work two ways: by rasterizing documents or by converting them to a combination of SVG, HTML and CSS. Both methods deliver high-fidelity rendering.

Supported file formats include: Microsoft Office, Visio, Project and Outlook documents, PDFs, AutoCAD, image files (TIFF, JPG, BMP, GIF, TIFF, etc.) and more.
