

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FilenameUtils;

public class UploadFile extends HttpServlet {

   // String saveFile = "C:\\Users\\AmineHN\\Desktop\\Upload";
//String saveFile ="C:\\Users\\AmineHN\\Documents\\NetBeansProjects\\UploadImage\\web\\images";
 String saveFile ="C:\\Users\\AmineHN\\Documents\\NetBeansProjectsDAOPlace\\Client_Scientifique_Article\\web\\images";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try {
            boolean ismultipart = ServletFileUpload.isMultipartContent(request);
            if (!ismultipart) {

            } else {
                FileItemFactory factory = new DiskFileItemFactory();
                ServletFileUpload upload = new ServletFileUpload(factory);
                List items = null;
                try {
                    items = upload.parseRequest(request);
                } catch (Exception e) {
                }
                Iterator itr = items.iterator();
                while (itr.hasNext()) {
                    FileItem item = (FileItem) itr.next();
                    if (item.isFormField()) {

                    } else {
                        String itemname = item.getName();
                        if ((itemname == null) || itemname.equals("")) {
                            continue;
                        }
                        String filename = FilenameUtils.getName(itemname);
                        String extention = FilenameUtils.getExtension(filename);
                       // File f = checkExist(filename);
                        File f = checkExist("Amine."+extention);
                        item.write(f);
                    }
                }
            }
           String nn= request.getParameter("nom");
           response.getWriter().write(nn);
        } catch (Exception e) {

        }
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

    private File checkExist(String fileName) {
        File f = new File(saveFile + "/" + fileName);
        if (f.exists()) {
            StringBuffer sb = new StringBuffer(fileName);
            sb.insert(sb.lastIndexOf("."), "-" + new Date().getTime());
            f=new File(saveFile+"/"+sb.toString());
        }
        return f;
    }

}
