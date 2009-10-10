package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;

public final class minhaConta_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/WEB-INF/TLD/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/TLD/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/TLD/struts-logic.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005frewrite_005fpage_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005flink_005fstyleClass_005fpage;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005frewrite_005fpage_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005flink_005fstyleClass_005fpage = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005frewrite_005fpage_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005flink_005fstyleClass_005fpage.release();
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

      out.write("   \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>      \r\n");
      out.write("<title>");
      if (_jspx_meth_bean_005fmessage_005f0(_jspx_page_context))
        return;
      out.write("</title>\r\n");
      out.write("<link href=\"");
      if (_jspx_meth_html_005frewrite_005f0(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link href=\"");
      if (_jspx_meth_html_005frewrite_005f1(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link href=\"");
      if (_jspx_meth_html_005frewrite_005f2(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.2.6-packed.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/slide.noconflict.js\"></script>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\"> \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!--INCLUDE DO MENU-->\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "topo.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--FIM INCLUDE DO MENU-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"meio_fundo\">\r\n");
      out.write("\t<div id=\"meio\">\r\n");
      out.write("\t\t<div id=\"esquerda\">\r\n");
      out.write("\r\n");
      out.write("<!-- INÍCIO MINHA CONTA -->\r\n");
      out.write("\r\n");
      out.write("<div><b>Histórico Financeiro</b></div>\r\n");
      out.write("<div>...</div>\r\n");
      out.write("<br /><br />\r\n");
      out.write("<div><b>Data do Próximo Pagamento</b></div>\r\n");
      out.write("<div>29/10/2009</div>\r\n");
      out.write("\r\n");
      out.write("<!-- FIM MINHA CONTA -->\r\n");
      out.write("\r\n");
      out.write("<br />\r\n");
      out.write("<br />\r\n");
      if (_jspx_meth_html_005flink_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<br />\r\n");
      out.write("<br />\r\n");
      out.write("\r\n");
      out.write("\t\t\t<dt class=\"banner2\"><img src=\"_imgs/bannergrande.jpg\" class=\"linkado\"/><img src=\"_imgs/txt_pub.jpg\" /></dt>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"direita\">\r\n");
      out.write("\t\t\t<div id=\"lists\">\r\n");
      out.write("<img src=\"_imgs/btn_videos.jpg\" class=\"linkado\"/><img src=\"_imgs/btn_usuarios.jpg\" class=\"linkado\"/><img src=\"_imgs/btn_canais.jpg\" class=\"linkado\"/><div class=\"nav\">\r\n");
      out.write("\t\t\t\t\t<div class=\"nav_esq\"><img src=\"_imgs/nav_esq.jpg\" /></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"nav1\">Pág. </div>\r\n");
      out.write("\t\t\t\t\t<div class=\"navega\"> <input name=\"page\" type=\"text\" class=\"box_nav\" /> </div>\r\n");
      out.write("\t\t\t\t\t<div class=\"nav2\">de 250</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"nav_dir\"><img src=\"_imgs/nav_dir.jpg\" /></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"atrasOut\" onmouseover=\"this.className='atrasIn';\" onmouseout=\"this.className='atrasOut';\">\r\n");
      out.write("\t\t\t\t\t<dt class=\"frente\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"voto0\"><img src=\"_imgs/img_listas.jpg\" /></div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"data\">09/06/2009 10:26</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"desc\">Edson dos Santos em pedala e da show de bola</div>\r\n");
      out.write("\t\t\t\t\t</dt>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"atrasOut\" onmouseover=\"this.className='atrasIn';\" onmouseout=\"this.className='atrasOut';\">\r\n");
      out.write("\t\t\t\t\t<dt class=\"frente\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"voto0\"><img src=\"_imgs/img_listas.jpg\" /></div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"data\">09/06/2009 10:26</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"desc\">Edson dos Santos em pedala e da show de bola</div>\r\n");
      out.write("\t\t\t\t\t</dt>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"atrasOut\" onmouseover=\"this.className='atrasIn';\" onmouseout=\"this.className='atrasOut';\">\r\n");
      out.write("\t\t\t\t\t<dt class=\"frente\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"voto0\"><img src=\"_imgs/img_listas.jpg\" /></div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"data\">09/06/2009 10:26</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"desc\">Edson dos Santos em pedala e da show de bola</div>\r\n");
      out.write("\t\t\t\t\t</dt>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"atrasOut\" onmouseover=\"this.className='atrasIn';\" onmouseout=\"this.className='atrasOut';\">\r\n");
      out.write("\t\t\t\t\t<dt class=\"frente\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"voto0\"><img src=\"_imgs/img_listas.jpg\" /></div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"data\">09/06/2009 10:26</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"desc\">Edson dos Santos em pedala e da show de bola</div>\r\n");
      out.write("\t\t\t\t\t</dt>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"atrasOut\" onmouseover=\"this.className='atrasIn';\" onmouseout=\"this.className='atrasOut';\">\r\n");
      out.write("\t\t\t\t\t<dt class=\"frente\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"voto0\"><img src=\"_imgs/img_listas.jpg\" /></div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"data\">09/06/2009 10:26</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"desc\">Edson dos Santos em pedala e da show de bola</div>\r\n");
      out.write("\t\t\t\t\t</dt>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\t\t\t\r\n");
      out.write("\t\t\t<dt class=\"banner\"><img src=\"_imgs/banner.jpg\" class=\"linkado\"/></dt>\r\n");
      out.write("\t\t\t<dt><img src=\"_imgs/txt_pub.jpg\" style=\"margin-bottom:6px;\" /></dt>\r\n");
      out.write("\t\t\t<dt><img src=\"_imgs/banner_redondo.jpg\" class=\"linkado\" /></dt>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "rodape.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>   \r\n");
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

  private boolean _jspx_meth_html_005frewrite_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f0 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f0.setParent(null);
    _jspx_th_html_005frewrite_005f0.setPage("/_css/estilo.css");
    int _jspx_eval_html_005frewrite_005f0 = _jspx_th_html_005frewrite_005f0.doStartTag();
    if (_jspx_th_html_005frewrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f1 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f1.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f1.setParent(null);
    _jspx_th_html_005frewrite_005f1.setPage("/_css/cadastro.css");
    int _jspx_eval_html_005frewrite_005f1 = _jspx_th_html_005frewrite_005f1.doStartTag();
    if (_jspx_th_html_005frewrite_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f1);
    return false;
  }

  private boolean _jspx_meth_html_005frewrite_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:rewrite
    org.apache.struts.taglib.html.RewriteTag _jspx_th_html_005frewrite_005f2 = (org.apache.struts.taglib.html.RewriteTag) _005fjspx_005ftagPool_005fhtml_005frewrite_005fpage_005fnobody.get(org.apache.struts.taglib.html.RewriteTag.class);
    _jspx_th_html_005frewrite_005f2.setPageContext(_jspx_page_context);
    _jspx_th_html_005frewrite_005f2.setParent(null);
    _jspx_th_html_005frewrite_005f2.setPage("/_css/slide.css");
    int _jspx_eval_html_005frewrite_005f2 = _jspx_th_html_005frewrite_005f2.doStartTag();
    if (_jspx_th_html_005frewrite_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f2);
    return false;
  }

  private boolean _jspx_meth_html_005flink_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f0 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_005fstyleClass_005fpage.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_005flink_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005flink_005f0.setParent(null);
    _jspx_th_html_005flink_005f0.setPage("/valtarHome.do");
    _jspx_th_html_005flink_005f0.setStyleClass("menu_topo");
    int _jspx_eval_html_005flink_005f0 = _jspx_th_html_005flink_005f0.doStartTag();
    if (_jspx_eval_html_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005flink_005f0.doInitBody();
      }
      do {
        out.write("Voltar para home");
        int evalDoAfterBody = _jspx_th_html_005flink_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005flink_005fstyleClass_005fpage.reuse(_jspx_th_html_005flink_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005flink_005fstyleClass_005fpage.reuse(_jspx_th_html_005flink_005f0);
    return false;
  }
}
