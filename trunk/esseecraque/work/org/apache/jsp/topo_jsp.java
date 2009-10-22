package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class topo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/WEB-INF/TLD/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/TLD/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/TLD/struts-logic.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fnotPresent_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fform_005ffocus_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_005fstyleClass_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fpassword_005fstyleClass_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005flink_005fstyleClass_005fpage;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fimage_005fsrc_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fpresent_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fimage_005fstyleClass_005fsrc_005fnobody;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005flogic_005fnotPresent_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fform_005ffocus_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_005fstyleClass_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fpassword_005fstyleClass_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005flink_005fstyleClass_005fpage = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fimage_005fsrc_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fpresent_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fimage_005fstyleClass_005fsrc_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005flogic_005fnotPresent_005fname.release();
    _005fjspx_005ftagPool_005fhtml_005fform_005ffocus_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_005fstyleClass_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fpassword_005fstyleClass_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005flink_005fstyleClass_005fpage.release();
    _005fjspx_005ftagPool_005fhtml_005fimage_005fsrc_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fpresent_005fname.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fimage_005fstyleClass_005fsrc_005fnobody.release();
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
      out.write("<div id=\"topo\">\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\r\n");
      out.write("\t\t<dt class=\"logo\"><img src=\"/eec/_imgs/logo.jpg\" class=\"linkado\"/></dt>\r\n");
      out.write("\t\t<dt class=\"form\"><img src=\"/eec/_imgs/banner_assine.jpg\" /></dt>\r\n");
      out.write("\t\t<dt class=\"frm_in\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<!-- ******** SE O USUÁRIO NÃO ESTIVER LOGADO *************** -->\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_logic_005fnotPresent_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t<!-- ******** ********* *************** -->\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<!-- ******** SE O USUÁRIO ESTIVER LOGADO *************** -->\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_logic_005fpresent_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t<!-- ******** ***************** *************** -->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</dt>\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
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

  private boolean _jspx_meth_logic_005fnotPresent_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:notPresent
    org.apache.struts.taglib.logic.NotPresentTag _jspx_th_logic_005fnotPresent_005f0 = (org.apache.struts.taglib.logic.NotPresentTag) _005fjspx_005ftagPool_005flogic_005fnotPresent_005fname.get(org.apache.struts.taglib.logic.NotPresentTag.class);
    _jspx_th_logic_005fnotPresent_005f0.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fnotPresent_005f0.setParent(null);
    _jspx_th_logic_005fnotPresent_005f0.setName("Assinante");
    int _jspx_eval_logic_005fnotPresent_005f0 = _jspx_th_logic_005fnotPresent_005f0.doStartTag();
    if (_jspx_eval_logic_005fnotPresent_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_html_005fform_005f0(_jspx_th_logic_005fnotPresent_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_logic_005fnotPresent_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fnotPresent_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fnotPresent_005fname.reuse(_jspx_th_logic_005fnotPresent_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fnotPresent_005fname.reuse(_jspx_th_logic_005fnotPresent_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005fform_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotPresent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:form
    org.apache.struts.taglib.html.FormTag _jspx_th_html_005fform_005f0 = (org.apache.struts.taglib.html.FormTag) _005fjspx_005ftagPool_005fhtml_005fform_005ffocus_005faction.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_html_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fform_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotPresent_005f0);
    _jspx_th_html_005fform_005f0.setAction("loginAssinante.do?act=login");
    _jspx_th_html_005fform_005f0.setFocus("email");
    int _jspx_eval_html_005fform_005f0 = _jspx_th_html_005fform_005f0.doStartTag();
    if (_jspx_eval_html_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t    <table width=\"204\" height=\"133\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
        out.write("\t\t        <tr> \r\n");
        out.write("\t\t\t\t\t<td height=\"18\" colspan=\"3\"></td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t<tr>\t\t\t\r\n");
        out.write("\t\t          <td width=\"56\" height=\"25\" class=\"txt_logs\">&nbsp;&nbsp;&nbsp;&nbsp;Login:</td>\t\t\t\t\r\n");
        out.write("\t\t          <td width=\"118\"><dt class=\"box_log\">");
        if (_jspx_meth_html_005ftext_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("</dt></td>\t\t\t\t\r\n");
        out.write("\t\t          <td width=\"30\"><img src=\"/eec/_imgs/setinha_login.jpg\" width=\"23\" height=\"25\" /></td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t<tr> \r\n");
        out.write("\t\t\t\t\t<td height=\"10\"></td>\r\n");
        out.write("\t\t\t\t\t<td colspan=\"2\"></td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t<tr>\t\t\t\r\n");
        out.write("\t\t        \t<td width=\"56\" height=\"25\" class=\"txt_logs\">&nbsp;&nbsp;&nbsp;&nbsp;Senha:</td>\r\n");
        out.write("\t\t\t\t\t<td><dt class=\"box_log\">");
        if (_jspx_meth_html_005fpassword_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("</dt></td>\t\t\t\t\r\n");
        out.write("\t\t        \t<td><img src=\"/eec/_imgs/setinha_login.jpg\" width=\"23\" height=\"25\" /></td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t<tr> \r\n");
        out.write("\t\t\t\t\t<td height=\"55\" colspan=\"3\"> \r\n");
        out.write("\t\t\t\t\t\t<table width=\"204\" height=\"55\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
        out.write("\t\t\t\t\t        <tr>\t\t\t\t  \r\n");
        out.write("\t\t\t\t\t        \t<td width=\"164\"> \r\n");
        out.write("\t\t\t\t\t            \t<table width=\"164\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t  <tr> \r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"187\" class=\"txt_logs2\" height=\"22\">&nbsp;&nbsp;&nbsp;&nbsp;<!-- Esqueci minha senha! --></td>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t  </tr>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t  <tr> \r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<td class=\"txt_logs2\">&nbsp;&nbsp;&nbsp;&nbsp;");
        if (_jspx_meth_html_005flink_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t  </tr>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t</table>\r\n");
        out.write("\t\t\t\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t            \t\t<td align=\"right\" valign=\"bottom\">\r\n");
        out.write("\t\t\t            \t\t\t");
        if (_jspx_meth_html_005fimage_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t            \t\t</td>\r\n");
        out.write("\t\t\t\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\t\t</table>\r\n");
        out.write("\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t</table>\t\t\t\r\n");
        out.write("\t\t\t");
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
    org.apache.struts.taglib.html.ImageTag _jspx_th_html_005fimage_005f0 = (org.apache.struts.taglib.html.ImageTag) _005fjspx_005ftagPool_005fhtml_005fimage_005fsrc_005fproperty_005fnobody.get(org.apache.struts.taglib.html.ImageTag.class);
    _jspx_th_html_005fimage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fimage_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    _jspx_th_html_005fimage_005f0.setSrc("/eec/_imgs/btn_logar.jpg");
    _jspx_th_html_005fimage_005f0.setProperty("Submit");
    int _jspx_eval_html_005fimage_005f0 = _jspx_th_html_005fimage_005f0.doStartTag();
    if (_jspx_th_html_005fimage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fimage_005fsrc_005fproperty_005fnobody.reuse(_jspx_th_html_005fimage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fimage_005fsrc_005fproperty_005fnobody.reuse(_jspx_th_html_005fimage_005f0);
    return false;
  }

  private boolean _jspx_meth_logic_005fpresent_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:present
    org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_005fpresent_005f0 = (org.apache.struts.taglib.logic.PresentTag) _005fjspx_005ftagPool_005flogic_005fpresent_005fname.get(org.apache.struts.taglib.logic.PresentTag.class);
    _jspx_th_logic_005fpresent_005f0.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fpresent_005f0.setParent(null);
    _jspx_th_logic_005fpresent_005f0.setName("Assinante");
    int _jspx_eval_logic_005fpresent_005f0 = _jspx_th_logic_005fpresent_005f0.doStartTag();
    if (_jspx_eval_logic_005fpresent_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t<table width=\"204\" height=\"133\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
        out.write("\t\t\t\t<tr> \t\t\r\n");
        out.write("\t\t    \t    <td width=\"204\" height=\"20\" class=\"txt_logs\">&nbsp;&nbsp;&nbsp;&nbsp;Olá, ");
        if (_jspx_meth_bean_005fwrite_005f0(_jspx_th_logic_005fpresent_005f0, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t<tr> \r\n");
        out.write("\t\t\t\t\t<td width=\"204\" height=\"20\" class=\"txt_logs\">&nbsp;&nbsp;&nbsp;&nbsp;Você possui ");
        if (_jspx_meth_bean_005fwrite_005f1(_jspx_th_logic_005fpresent_005f0, _jspx_page_context))
          return true;
        out.write(" vídeos</td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t        <tr>\r\n");
        out.write("\t\t        \t<td width=\"204\" class=\"txt_logs\">&nbsp;&nbsp;&nbsp;&nbsp;>&nbsp;&nbsp; ");
        if (_jspx_meth_html_005flink_005f1(_jspx_th_logic_005fpresent_005f0, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("\t\t        </tr>\t\r\n");
        out.write("\t\t        <!-- \r\n");
        out.write("\t\t        <tr>\r\n");
        out.write("\t\t        \t<td width=\"204\" class=\"txt_logs\">&nbsp;&nbsp;&nbsp;&nbsp;>&nbsp;&nbsp; ");
        if (_jspx_meth_html_005flink_005f2(_jspx_th_logic_005fpresent_005f0, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("\t\t        </tr>\r\n");
        out.write("\t\t        -->\r\n");
        out.write("\t\t        <tr>\r\n");
        out.write("\t\t        \t<td width=\"204\" class=\"txt_logs\">&nbsp;&nbsp;&nbsp;&nbsp;>&nbsp;&nbsp; ");
        if (_jspx_meth_html_005flink_005f3(_jspx_th_logic_005fpresent_005f0, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("\t\t        </tr>\r\n");
        out.write("\t\t        <tr>\r\n");
        out.write("\t\t        \t<td width=\"204\" class=\"txt_logs\">&nbsp;&nbsp;&nbsp;&nbsp;>&nbsp;&nbsp; ");
        if (_jspx_meth_html_005flink_005f4(_jspx_th_logic_005fpresent_005f0, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("\t\t        </tr>\r\n");
        out.write("\t\t        <tr>\r\n");
        out.write("\t\t        \t<td width=\"204\" class=\"txt_logs\">&nbsp;&nbsp;&nbsp;&nbsp;>&nbsp;&nbsp; ");
        if (_jspx_meth_html_005flink_005f5(_jspx_th_logic_005fpresent_005f0, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("\t\t        </tr>\r\n");
        out.write("\t\t\t</table>\r\n");
        out.write("\t\t\t<!-- \r\n");
        out.write("\t\t\t<div style=\"width:204px;\">\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_html_005flink_005f6(_jspx_th_logic_005fpresent_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t</div>  \r\n");
        out.write("\t\t\t-->\r\n");
        out.write("\t\t\t\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_logic_005fpresent_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fpresent_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fpresent_005fname.reuse(_jspx_th_logic_005fpresent_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fpresent_005fname.reuse(_jspx_th_logic_005fpresent_005f0);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fpresent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f0 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f0.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f0);
    _jspx_th_bean_005fwrite_005f0.setName("Assinante");
    _jspx_th_bean_005fwrite_005f0.setProperty("nome");
    int _jspx_eval_bean_005fwrite_005f0 = _jspx_th_bean_005fwrite_005f0.doStartTag();
    if (_jspx_th_bean_005fwrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fpresent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f1 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f1.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f0);
    _jspx_th_bean_005fwrite_005f1.setName("qtdVideo");
    int _jspx_eval_bean_005fwrite_005f1 = _jspx_th_bean_005fwrite_005f1.doStartTag();
    if (_jspx_th_bean_005fwrite_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
    return false;
  }

  private boolean _jspx_meth_html_005flink_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fpresent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f1 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_005fstyleClass_005fpage.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_005flink_005f1.setPageContext(_jspx_page_context);
    _jspx_th_html_005flink_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f0);
    _jspx_th_html_005flink_005f1.setPage("/listMeusVideos.do?act=list");
    _jspx_th_html_005flink_005f1.setStyleClass("menu_topo");
    int _jspx_eval_html_005flink_005f1 = _jspx_th_html_005flink_005f1.doStartTag();
    if (_jspx_eval_html_005flink_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005flink_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005flink_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005flink_005f1.doInitBody();
      }
      do {
        out.write("Meus vídeos");
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

  private boolean _jspx_meth_html_005flink_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fpresent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f2 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_005fstyleClass_005fpage.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_005flink_005f2.setPageContext(_jspx_page_context);
    _jspx_th_html_005flink_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f0);
    _jspx_th_html_005flink_005f2.setPage("/minhaConta.do");
    _jspx_th_html_005flink_005f2.setStyleClass("menu_topo");
    int _jspx_eval_html_005flink_005f2 = _jspx_th_html_005flink_005f2.doStartTag();
    if (_jspx_eval_html_005flink_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005flink_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005flink_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005flink_005f2.doInitBody();
      }
      do {
        out.write("Minha conta");
        int evalDoAfterBody = _jspx_th_html_005flink_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005flink_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005flink_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005flink_005fstyleClass_005fpage.reuse(_jspx_th_html_005flink_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005flink_005fstyleClass_005fpage.reuse(_jspx_th_html_005flink_005f2);
    return false;
  }

  private boolean _jspx_meth_html_005flink_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fpresent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f3 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_005fstyleClass_005fpage.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_005flink_005f3.setPageContext(_jspx_page_context);
    _jspx_th_html_005flink_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f0);
    _jspx_th_html_005flink_005f3.setPage("/editarPerfilForm.do");
    _jspx_th_html_005flink_005f3.setStyleClass("menu_topo");
    int _jspx_eval_html_005flink_005f3 = _jspx_th_html_005flink_005f3.doStartTag();
    if (_jspx_eval_html_005flink_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005flink_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005flink_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005flink_005f3.doInitBody();
      }
      do {
        out.write("Editar perfil");
        int evalDoAfterBody = _jspx_th_html_005flink_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005flink_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005flink_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005flink_005fstyleClass_005fpage.reuse(_jspx_th_html_005flink_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005flink_005fstyleClass_005fpage.reuse(_jspx_th_html_005flink_005f3);
    return false;
  }

  private boolean _jspx_meth_html_005flink_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fpresent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f4 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_005fstyleClass_005fpage.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_005flink_005f4.setPageContext(_jspx_page_context);
    _jspx_th_html_005flink_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f0);
    _jspx_th_html_005flink_005f4.setPage("/cadVideoForm.do");
    _jspx_th_html_005flink_005f4.setStyleClass("menu_topo");
    int _jspx_eval_html_005flink_005f4 = _jspx_th_html_005flink_005f4.doStartTag();
    if (_jspx_eval_html_005flink_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005flink_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005flink_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005flink_005f4.doInitBody();
      }
      do {
        out.write("Subir Vídeo");
        int evalDoAfterBody = _jspx_th_html_005flink_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005flink_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005flink_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005flink_005fstyleClass_005fpage.reuse(_jspx_th_html_005flink_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005flink_005fstyleClass_005fpage.reuse(_jspx_th_html_005flink_005f4);
    return false;
  }

  private boolean _jspx_meth_html_005flink_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fpresent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f5 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_005fstyleClass_005fpage.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_005flink_005f5.setPageContext(_jspx_page_context);
    _jspx_th_html_005flink_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f0);
    _jspx_th_html_005flink_005f5.setPage("/assinante.do?act=logout");
    _jspx_th_html_005flink_005f5.setStyleClass("menu_topo");
    int _jspx_eval_html_005flink_005f5 = _jspx_th_html_005flink_005f5.doStartTag();
    if (_jspx_eval_html_005flink_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005flink_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005flink_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005flink_005f5.doInitBody();
      }
      do {
        out.write("Sair");
        int evalDoAfterBody = _jspx_th_html_005flink_005f5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005flink_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005flink_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005flink_005fstyleClass_005fpage.reuse(_jspx_th_html_005flink_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005flink_005fstyleClass_005fpage.reuse(_jspx_th_html_005flink_005f5);
    return false;
  }

  private boolean _jspx_meth_html_005flink_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fpresent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_005flink_005f6 = (org.apache.struts.taglib.html.LinkTag) _005fjspx_005ftagPool_005fhtml_005flink_005fstyleClass_005fpage.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_005flink_005f6.setPageContext(_jspx_page_context);
    _jspx_th_html_005flink_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f0);
    _jspx_th_html_005flink_005f6.setPage("/cadVideoForm.do");
    _jspx_th_html_005flink_005f6.setStyleClass("menu_topo");
    int _jspx_eval_html_005flink_005f6 = _jspx_th_html_005flink_005f6.doStartTag();
    if (_jspx_eval_html_005flink_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005flink_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005flink_005f6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005flink_005f6.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_html_005fimage_005f1(_jspx_th_html_005flink_005f6, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_html_005flink_005f6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005flink_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005flink_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005flink_005fstyleClass_005fpage.reuse(_jspx_th_html_005flink_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005flink_005fstyleClass_005fpage.reuse(_jspx_th_html_005flink_005f6);
    return false;
  }

  private boolean _jspx_meth_html_005fimage_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005flink_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:image
    org.apache.struts.taglib.html.ImageTag _jspx_th_html_005fimage_005f1 = (org.apache.struts.taglib.html.ImageTag) _005fjspx_005ftagPool_005fhtml_005fimage_005fstyleClass_005fsrc_005fnobody.get(org.apache.struts.taglib.html.ImageTag.class);
    _jspx_th_html_005fimage_005f1.setPageContext(_jspx_page_context);
    _jspx_th_html_005fimage_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005flink_005f6);
    _jspx_th_html_005fimage_005f1.setSrc("/eec/_imgs/publicar.jpg");
    _jspx_th_html_005fimage_005f1.setStyleClass("linkado");
    int _jspx_eval_html_005fimage_005f1 = _jspx_th_html_005fimage_005f1.doStartTag();
    if (_jspx_th_html_005fimage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fimage_005fstyleClass_005fsrc_005fnobody.reuse(_jspx_th_html_005fimage_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fimage_005fstyleClass_005fsrc_005fnobody.reuse(_jspx_th_html_005fimage_005f1);
    return false;
  }
}
