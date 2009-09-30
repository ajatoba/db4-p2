package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class upload_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Simple upload page</title>\n");
      out.write("        <script src='resources/js/upload.js'> </script>\n");
      out.write("        <script src='dwr/interface/UploadMonitor.js'> </script>\n");
      out.write("        <script src='dwr/engine.js'> </script>\n");
      out.write("        <script src='dwr/util.js'> </script>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            body { font: 11px Lucida Grande, Verdana, Arial, Helvetica, sans serif; }\n");
      out.write("            #progressBar { padding-top: 5px; }\n");
      out.write("            #progressBarBox { width: 350px; height: 20px; border: 1px inset; background: #eee;}\n");
      out.write("            #progressBarBoxContent { width: 0; height: 20px; border-right: 1px solid #444; background: #9ACB34; }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<form action=\"uploadVideo.do?act=uploadVideo\" enctype=\"multipart/form-data\" method=\"post\" onsubmit=\"startProgress()\">\n");
      out.write("    <p>\n");
      out.write("        <h1>Upload de Vídeo</h1>\n");
      out.write("    </p>\n");
      out.write("\n");
      out.write("    <p>\n");
      out.write("       <input class=\"default\" type=\"file\" id=\"file1\" name=\"file1\"/><br/>\n");
      out.write("       <!-- HIDDENS PARA UPLOADS MÚLTIPLOS -->\n");
      out.write("       <input class=\"default\" type=\"hidden\" id=\"file2\" name=\"file2\"/>\n");
      out.write("       <input class=\"default\" type=\"hidden\" id=\"file3\" name=\"file3\"/>\n");
      out.write("       <input class=\"default\" type=\"hidden\" id=\"file4\" name=\"file4\"/>\n");
      out.write("       <!-- ****************************** -->\n");
      out.write("        <input type=\"submit\" value=\"Upload\" id=\"uploadbutton\"/>\n");
      out.write("\n");
      out.write("        <br/>\n");
      out.write("\n");
      out.write("        <div id=\"progressBar\" style=\"display: none;\">\n");
      out.write("\n");
      out.write("            <div id=\"theMeter\">\n");
      out.write("                <div id=\"progressBarText\"></div>\n");
      out.write("\n");
      out.write("                <div id=\"progressBarBox\">\n");
      out.write("                    <div id=\"progressBarBoxContent\"></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </p>\n");
      out.write("</form>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
