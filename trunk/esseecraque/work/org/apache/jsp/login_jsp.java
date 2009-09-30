package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fform_005ffocus_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_005fstyleClass_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fpassword_005fstyleClass_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005flink_005fstyleClass_005fpage;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fimage_005fstyleClass_005fsrc_005fproperty_005fnobody;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005frewrite_005fpage_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fform_005ffocus_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_005fstyleClass_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fpassword_005fstyleClass_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005flink_005fstyleClass_005fpage = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fimage_005fstyleClass_005fsrc_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005frewrite_005fpage_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fform_005ffocus_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_005fstyleClass_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fpassword_005fstyleClass_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005flink_005fstyleClass_005fpage.release();
    _005fjspx_005ftagPool_005fhtml_005fimage_005fstyleClass_005fsrc_005fproperty_005fnobody.release();
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
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.2.6-packed.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/slide.noconflict.js\"></script>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\"> \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      if (_jspx_meth_html_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"meio_fundo\">\r\n");
      out.write("\t<div id=\"meio\">\r\n");
      out.write("\t\t<div id=\"esquerda\">\r\n");
      out.write("\r\n");
      out.write("\t\t\tFavor se logar...\r\n");
      out.write("\r\n");
      out.write("<br />\r\n");
      out.write("<br />\r\n");
      out.write("<br />\r\n");
      if (_jspx_meth_html_005flink_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<br />\r\n");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
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
    _jspx_th_html_005frewrite_005f1.setPage("/_css/slide.css");
    int _jspx_eval_html_005frewrite_005f1 = _jspx_th_html_005frewrite_005f1.doStartTag();
    if (_jspx_th_html_005frewrite_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005frewrite_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005frewrite_005fpage_005fnobody.reuse(_jspx_th_html_005frewrite_005f1);
    return false;
  }

  private boolean _jspx_meth_html_005fform_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:form
    org.apache.struts.taglib.html.FormTag _jspx_th_html_005fform_005f0 = (org.apache.struts.taglib.html.FormTag) _005fjspx_005ftagPool_005fhtml_005fform_005ffocus_005faction.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_html_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fform_005f0.setParent(null);
    _jspx_th_html_005fform_005f0.setAction("loginAssinante.do?act=login");
    _jspx_th_html_005fform_005f0.setFocus("email");
    int _jspx_eval_html_005fform_005f0 = _jspx_th_html_005fform_005f0.doStartTag();
    if (_jspx_eval_html_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("<div id=\"menu\">\r\n");
        out.write("\t<dt>\r\n");
        out.write("\t\t<span></span>\r\n");
        out.write("\t</dt>\r\n");
        out.write("</div>\r\n");
        out.write("<div id=\"topo\">\r\n");
        out.write("\t<div>\r\n");
        out.write("\t\t<dt class=\"logo\"><img src=\"_imgs/logo.jpg\" class=\"linkado\"/></dt>\r\n");
        out.write("\t\t<dt class=\"form\"><img src=\"_imgs/banner_assine.jpg\" /></dt>\r\n");
        out.write("\t\t<dt class=\"frm_in\">\r\n");
        out.write("\t\t\t\r\n");
        out.write("      <table width=\"204\" height=\"133\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
        out.write("        <tr> \r\n");
        out.write("\t\t\t\t<td height=\"18\" colspan=\"3\"></td>\r\n");
        out.write("\t\t\t  </tr>\r\n");
        out.write("\t\t\t  <tr> \r\n");
        out.write("\t\t\t\t\r\n");
        out.write("          <td width=\"56\" height=\"25\" class=\"txt_logs\">&nbsp;&nbsp;&nbsp;&nbsp;Login:</td>\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("          <td width=\"118\"><dt class=\"box_log\">");
        if (_jspx_meth_html_005ftext_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("</dt></td>\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("          <td width=\"30\"><img src=\"_imgs/setinha_login.jpg\" width=\"23\" height=\"25\" /></td>\r\n");
        out.write("\t\t\t  </tr>\r\n");
        out.write("\t\t\t  <tr> \r\n");
        out.write("\t\t\t\t<td height=\"10\"></td>\r\n");
        out.write("\t\t\t\t<td colspan=\"2\"></td>\r\n");
        out.write("\t\t\t  </tr>\r\n");
        out.write("\t\t\t  <tr> \r\n");
        out.write("\t\t\t\t\r\n");
        out.write("          <td width=\"56\" height=\"25\" class=\"txt_logs\">&nbsp;&nbsp;&nbsp;&nbsp;Senha:</td>\r\n");
        out.write("\t\t\t\t<td><dt class=\"box_log\">");
        if (_jspx_meth_html_005fpassword_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("</dt></td>\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("          <td><img src=\"_imgs/setinha_login.jpg\" width=\"23\" height=\"25\" /></td>\r\n");
        out.write("\t\t\t  </tr>\r\n");
        out.write("\t\t\t  <tr> \r\n");
        out.write("\t\t\t\t<td height=\"55\" colspan=\"3\"> <table width=\"204\" height=\"55\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
        out.write("              <tr> \r\n");
        out.write("\t\t\t\t\t  \r\n");
        out.write("                <td width=\"164\"> \r\n");
        out.write("                  <table width=\"164\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
        out.write("\t\t\t\t\t\t  <tr> \r\n");
        out.write("\t\t\t\t\t\t\t<td width=\"187\" class=\"txt_logs2\" height=\"22\">&nbsp;&nbsp;&nbsp;&nbsp;Esqueci minha senha!</td>\r\n");
        out.write("\t\t\t\t\t\t  </tr>\r\n");
        out.write("\t\t\t\t\t\t  <tr> \r\n");
        out.write("\t\t\t\t\t\t\t<td class=\"txt_logs2\">&nbsp;&nbsp;&nbsp;&nbsp;");
        if (_jspx_meth_html_005flink_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("\t\t\t\t\t\t  </tr>\r\n");
        out.write("\t\t\t\t\t\t</table></td>\r\n");
        out.write("                <td align=\"right\" valign=\"bottom\"><img src=\"_imgs/btn_logar.jpg\" width=\"40\" height=\"34\" class=\"linkado\" style=\"border:0px;\" /></td>\r\n");
        out.write("\t\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t  </table></td>\r\n");
        out.write("\t\t\t  </tr>\r\n");
        out.write("\t\t\t</table>\r\n");
        out.write("\t\t\t<div style=\"width:204px;\">");
        if (_jspx_meth_html_005fimage_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("</div>\r\n");
        out.write("\t\t</dt>\r\n");
        out.write("\t</div>\r\n");
        out.write("</div>\r\n");
        out.write("\r\n");
        int evalDoAfterBody = _jspx_th_html_005fform_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_html_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fform_005ffocus_005faction.reuse(_jspx_th_html_005fform_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fform_005ffocus_005faction.reuse(_jspx_th_html_005fform_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f0 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_005fstyleClass_005fproperty_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    _jspx_th_html_005ftext_005f0.setProperty("email");
    _jspx_th_html_005ftext_005f0.setStyleClass("txt_logar");
    int _jspx_eval_html_005ftext_005f0 = _jspx_th_html_005ftext_005f0.doStartTag();
    if (_jspx_th_html_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_005fstyleClass_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_005fstyleClass_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005fpassword_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:password
    org.apache.struts.taglib.html.PasswordTag _jspx_th_html_005fpassword_005f0 = (org.apache.struts.taglib.html.PasswordTag) _005fjspx_005ftagPool_005fhtml_005fpassword_005fstyleClass_005fproperty_005fnobody.get(org.apache.struts.taglib.html.PasswordTag.class);
    _jspx_th_html_005fpassword_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fpassword_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    _jspx_th_html_005fpassword_005f0.setProperty("password");
    _jspx_th_html_005fpassword_005f0.setStyleClass("txt_logar");
    int _jspx_eval_html_005fpassword_005f0 = _jspx_th_html_005fpassword_005f0.doStartTag();
    if (_jspx_th_html_005fpassword_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fpassword_005fstyleClass_005fproperty_005fnobody.reuse(_jspx_th_html_005fpassword_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fpassword_005fstyleClass_005fproperty_005fnobody.reuse(_jspx_th_html_005fpassword_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005flink_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f0 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_005fstyleClass_005fpage.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_005flink_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005flink_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    _jspx_th_html_005flink_005f0.setPage("/cadAssinanteForm.do");
    _jspx_th_html_005flink_005f0.setStyleClass("link_logs2");
    int _jspx_eval_html_005flink_005f0 = _jspx_th_html_005flink_005f0.doStartTag();
    if (_jspx_eval_html_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005flink_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005flink_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005flink_005f0.doInitBody();
      }
      do {
        out.write("Ainda n&atilde;o sou cadastrado.");
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

  private boolean _jspx_meth_html_005fimage_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:image
    org.apache.struts.taglib.html.ImageTag _jspx_th_html_005fimage_005f0 = (org.apache.struts.taglib.html.ImageTag) _005fjspx_005ftagPool_005fhtml_005fimage_005fstyleClass_005fsrc_005fproperty_005fnobody.get(org.apache.struts.taglib.html.ImageTag.class);
    _jspx_th_html_005fimage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fimage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    _jspx_th_html_005fimage_005f0.setSrc("_imgs/publicar.jpg");
    _jspx_th_html_005fimage_005f0.setProperty("Submit");
    _jspx_th_html_005fimage_005f0.setStyleClass("linkado");
    int _jspx_eval_html_005fimage_005f0 = _jspx_th_html_005fimage_005f0.doStartTag();
    if (_jspx_th_html_005fimage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fimage_005fstyleClass_005fsrc_005fproperty_005fnobody.reuse(_jspx_th_html_005fimage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fimage_005fstyleClass_005fsrc_005fproperty_005fnobody.reuse(_jspx_th_html_005fimage_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005flink_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f1 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_005fstyleClass_005fpage.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_005flink_005f1.setPageContext(_jspx_page_context);
    _jspx_th_html_005flink_005f1.setParent(null);
    _jspx_th_html_005flink_005f1.setPage("/home.jsp");
    _jspx_th_html_005flink_005f1.setStyleClass("menu_topo");
    int _jspx_eval_html_005flink_005f1 = _jspx_th_html_005flink_005f1.doStartTag();
    if (_jspx_eval_html_005flink_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005flink_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005flink_005f1.doInitBody();
      }
      do {
        out.write("Voltar para home");
        int evalDoAfterBody = _jspx_th_html_005flink_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005flink_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005flink_005fstyleClass_005fpage.reuse(_jspx_th_html_005flink_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005flink_005fstyleClass_005fpage.reuse(_jspx_th_html_005flink_005f1);
    return false;
  }
}
