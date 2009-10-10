package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class rodape_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<div id=\"rodape\">\r\n");
      out.write("\t<div class=\"rodape_in\">\r\n");
      out.write("\t\t<div class=\"rod_esq\">\r\n");
      out.write("\t\t\t<span>Ajuda</span> <br>\r\n");
      out.write("\t\t\tDúvidas mais frequentes &nbsp;|&nbsp;\r\n");
      out.write("\t\t\tComo publicar um vídeo &nbsp;|&nbsp;\r\n");
      out.write("\t\t\tFale conosco\r\n");
      out.write("\t\t\t<dt><img src=\"_imgs/ico_okt.jpg\" class=\"ico\" /><img src=\"_imgs/ico_face.jpg\" class=\"ico\" /><img src=\"_imgs/ico_rss.jpg\" class=\"ico\" /></dt>\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"rod_dir\">\r\n");
      out.write("\t\t\t<span>Sobre</span> <br>\r\n");
      out.write("\t\t\tLorem Ipsum is simply dummy text of the printing and typesetting \r\n");
      out.write("\t\t\tindustry. Lorem Ipsum has been the industry's standard dummy text\r\n");
      out.write("\t\t\t ever since the 1500s, when an unknown printer took a galley of\r\n");
      out.write("\t\t\t  type and scrambled it to make a type specimen book. It has survived\r\n");
      out.write("\t\t\t   not only five centuries, but also the leap into electronic typesetting,\r\n");
      out.write("\t\t\t    remaining essentially unchanged. It was popularised in the 1960s\r\n");
      out.write("\t\t\t\t with the release of Letraset sheets containing Lorem Ipsum\r\n");
      out.write("\t\t\t\t  passages, and more recently with desktop publishing software.\r\n");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"rodape_baixo\">\r\n");
      out.write("\t<span>2009. Todos os direitos reservados</span>\r\n");
      out.write("\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;    \r\n");
      out.write("\tAcordo de utilização &nbsp;|&nbsp;\r\n");
      out.write("\tAnuncie &nbsp;|&nbsp;\r\n");
      out.write("\tDesenvolvedores &nbsp;|&nbsp;\r\n");
      out.write("\tComunidade no orkut &nbsp;|&nbsp;\r\n");
      out.write("\tRss Feed &nbsp;|&nbsp;\r\n");
      out.write("\tAdicionar a Del.icio.us &nbsp;|&nbsp;\r\n");
      out.write("\tDownload Logo\r\n");
      out.write("</div>\r\n");
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
