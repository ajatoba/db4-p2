package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class upload_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/WEB-INF/TLD/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/TLD/struts-html.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.release();
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

      out.write("   \n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("        <title>");
      if (_jspx_meth_bean_005fmessage_005f0(_jspx_page_context))
        return;
      out.write("</title>\n");
      out.write("        <link href=\"/eec/_css/estilo.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\t\t<link href=\"/eec/_css/slide.css\"  rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
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
      out.write("      \n");
      out.write("    </head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<!--INCLUDE DO MENU-->\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/topo.jsp", out, false);
      out.write("\n");
      out.write("<!--FIM INCLUDE DO MENU-->\n");
      out.write("<div id=\"meio_fundo\">\n");
      out.write("\t<div id=\"meio\">\n");
      out.write("\t\t<div id=\"esquerda\">\n");
      out.write("<dt class=\"box_busca\">\n");
      out.write("\t\t\t\t<form action=\"busca.do?act=busca\" method=\"post\">\n");
      out.write("\t\t\t\t\t<div class=\"sep_busca\"></div>\n");
      out.write("\t\t\t\t\t<div class=\"txt_busca\">\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"busca\" Class=\"txt_buscar\" />\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"btn_busca\">\n");
      out.write("\t\t\t\t\t\t<input type=\"image\" src=\"/eec/_imgs/btnbusca.jpg\" name=\"Submit\" Class=\"linkado\" />\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</dt>\n");
      out.write("<form action=\"pages/uploadVideo.do?act=uploadVideo\" enctype=\"multipart/form-data\" method=\"post\" onsubmit=\"startProgress()\">\n");
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
      out.write("       <!-- ****************************** -->     \n");
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
      out.write("                \n");
      out.write("             \n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </p>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"direita\">\n");
      out.write("\t\t<!--INCLUDE LISTAGEM DE VIDEOS-->\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/buscaAvancada.jsp", out, false);
      out.write("\n");
      out.write("\t\t<!--INCLUDE LISTAGEM DE VIDEOS-->\n");
      out.write("\t\t\t<dt class=\"banner\"><img src=\"/eec/_imgs/banner.jpg\" class=\"linkado\"/></dt>\n");
      out.write("\t\t\t<dt><img src=\"/eec/_imgs/txt_pub.jpg\" style=\"margin-bottom:6px;\" /></dt>\n");
      out.write("\t\t\t<dt><img src=\"/eec/_imgs/banner_redondo.jpg\" class=\"linkado\" /></dt>\n");
      out.write("\t\t</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/rodape.jsp", out, false);
      out.write("\n");
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

  private boolean _jspx_meth_bean_005fmessage_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_005fmessage_005f0 = (org.apache.struts.taglib.bean.MessageTag) _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_005fmessage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fmessage_005f0.setParent(null);
    _jspx_th_bean_005fmessage_005f0.setKey("titulo.paginas");
    int _jspx_eval_bean_005fmessage_005f0 = _jspx_th_bean_005fmessage_005f0.doStartTag();
    if (_jspx_th_bean_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.reuse(_jspx_th_bean_005fmessage_005f0);
    return false;
  }
}
