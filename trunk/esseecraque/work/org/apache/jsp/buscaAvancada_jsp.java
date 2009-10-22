package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class buscaAvancada_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<script>\r\n");
      out.write("function submitBusca(){\r\n");
      out.write("\tdocument.busca.submit();\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<div id=\"lists\"><img src=\"/eec/_imgs/btn_jogadores.jpg\" class=\"linkado\"/><img src=\"/eec/_imgs/btn_posicoes.jpg\" class=\"linkado\"/><img src=\"/eec/_imgs/btn_categorias.jpg\" class=\"linkado\"/>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("      <div>\r\n");
      out.write("        <dt class=\"fundo_abas\">\r\n");
      out.write("               <!--TABELA DE BUSCA-->\r\n");
      out.write("\r\n");
      out.write("<form action=\"listAssinantes.do?act=search\" method=\"POST\" name=\"busca\">\r\n");
      out.write(" <table width=\"300\" border=\"0\" cellspacing=\"3\" cellpadding=\"3\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"64\" class=\"txt_busca_avancada\">Nome :</td>\r\n");
      out.write("    <td width=\"236\"><input type=\"text\" name=\"nome\" class=\"form_busca_avancada\" id=\"textfield\" /></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td class=\"txt_busca_avancada\">Posição : </td>\r\n");
      out.write("    <td><input type=\"text\" name=\"posicao\" class=\"form_busca_avancada\" id=\"textfield2\" /></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td class=\"txt_busca_avancada\">Cidade :</td>\r\n");
      out.write("    <td><input type=\"text\" name=\"cidade\" class=\"form_busca_avancada\" id=\"textfield8\" /></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("    <td><input type=\"button\" name=\"button\" id=\"button\" value=\"Submit\" onclick=\"javascript:submitBusca();\" /></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("          \r\n");
      out.write("          <!--FIM TABELA DE BUSCA-->\r\n");
      out.write("        </dt>\r\n");
      out.write("      </div>\r\n");
      out.write("  \r\n");
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
