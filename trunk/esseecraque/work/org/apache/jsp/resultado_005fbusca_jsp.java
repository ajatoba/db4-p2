package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class resultado_005fbusca_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/WEB-INF/TLD/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/TLD/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/TLD/struts-logic.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_005fname_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fempty_005fname;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_005fname_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fempty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fname.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_005fname_005fid.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fempty_005fname.release();
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
      out.write("<link href=\"/eec/_css/estilo.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link href=\"/eec/_css/slide_busca.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"/eec/js/jquery-1.2.6-packed.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/eec/js/slide.noconflict.js\"></script>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\"> \r\n");
      out.write("</head>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function abaBusca(id){\r\n");
      out.write("\r\n");
      out.write("document.getElementById(\"btnRes1\").className = 'openRes';\r\n");
      out.write("document.getElementById(\"btnRes2\").className = 'openRes';\r\n");
      out.write("document.getElementById(\"btnRes3\").className = 'openRes';\r\n");
      out.write("\r\n");
      out.write("document.getElementById(\"btnRes\"+ id).className = 'closeRes';\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<body>\r\n");
      out.write("<!-- INCLUDE HOME -->\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "topo.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- INCLUDE HOME -->\r\n");
      out.write("\r\n");
      out.write("<div id=\"meio_fundo\">\r\n");
      out.write("\t<div id=\"meio\">\r\n");
      out.write("\t\t<div id=\"esquerda\">\r\n");
      out.write("\t\t\t<dt class=\"box_busca\">\r\n");
      out.write("\t\t\t\t<div class=\"sep_busca\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"txt_busca\"><input name=\"busca\" type=\"text\" class=\"txt_buscar\" /></div>\r\n");
      out.write("\t\t\t\t<div class=\"btn_busca\"><img src=\"/eec/_imgs/btnbusca.jpg\" class=\"linkado\"/></div>\r\n");
      out.write("\t\t\t</dt>\r\n");
      out.write("\t\t\t<dt class=\"player\"><img src=\"/eec/_imgs/player.jpg\" /></dt>\r\n");
      out.write("\t\t\t<dt class=\"desc_player\">\r\n");
      out.write("\t\t\t\t<div class=\"dir_desc\">\r\n");
      out.write("\t\t\t\t\t<div class=\"data_pl\">09/06/2009 10:26</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"desc_pl\">Edson dos Santos em pedala e da show de bola</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"data_pl\">Compartilhar o vídeo (copie e cole a URL)</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"fundo_desc\">http://www.orkut.com/watch?=4fsfafdge</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"meio_desc\">\r\n");
      out.write("\t\t\t\t\t<div><img src=\"/eec/_imgs/votar.jpg\" class=\"linkado\"/></div>\r\n");
      out.write("\t\t\t\t\t<div><img src=\"/eec/_imgs/ver_perfil.jpg\" class=\"mgn5 linkado\"/></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"esq_desc\">\r\n");
      out.write("\t\t\t\t\t<div>Disponível para contratação</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</dt>\r\n");
      out.write("\t\t\t<dt id=\"resultado_busca\">\r\n");
      out.write("\t\t\t\t<div class=\"topo_rbusca\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"btns_rbusca\">\r\n");
      out.write("\t\t\t\t\t<div id=\"btnRes1\" class=\"closeRes\" onclick=\"abaBusca(1);\"></div>\r\n");
      out.write("\t\t\t\t\t<div id=\"btnRes2\" class=\"openRes\" onclick=\"abaBusca(2);\"></div>\r\n");
      out.write("\t\t\t\t\t<div id=\"btnRes3\" class=\"openRes\" onclick=\"abaBusca(3);\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"down_rbusca\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("<!-- Início Resultado Busca -->\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("<div id=\"image-gallery-wrapper\">\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\tstepcarousel.setup({\r\n");
      out.write("\t\tgalleryid: 'image-gallery', //id of carousel DIV\r\n");
      out.write("\t\tbeltclass: 'belt', //class of inner \"belt\" DIV containing all the panel DIVs\r\n");
      out.write("\t\tpanelclass: 'panel', //class of panel DIVs each holding content\r\n");
      out.write("\t\tpanelbehavior: {speed:500, wraparound:true, persist:true},\r\n");
      out.write("\t\tdefaultbuttons: {enable: false},\r\n");
      out.write("\t\tstatusvars: ['statusA', 'statusB', 'statusC'], //register 3 variables that contain current panel (start), current panel (last), and total panels\r\n");
      out.write("\t\tcontenttype: ['external'] //content setting ['inline'] or ['external', 'path_to_external_file']\r\n");
      out.write("\t})\r\n");
      out.write("\t\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("<div id=\"image-gallery\" class=\"stepcarousel\">\r\n");
      out.write("\t<div class=\"belt\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t");
      //  logic:notEmpty
      org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_005fnotEmpty_005f0 = (org.apache.struts.taglib.logic.NotEmptyTag) _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fname.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
      _jspx_th_logic_005fnotEmpty_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fnotEmpty_005f0.setParent(null);
      _jspx_th_logic_005fnotEmpty_005f0.setName("videos_busca");
      int _jspx_eval_logic_005fnotEmpty_005f0 = _jspx_th_logic_005fnotEmpty_005f0.doStartTag();
      if (_jspx_eval_logic_005fnotEmpty_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t");
          //  logic:iterate
          org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
          _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fiterate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
          _jspx_th_logic_005fiterate_005f0.setId("resulBusca");
          _jspx_th_logic_005fiterate_005f0.setName("videos_busca");
          int _jspx_eval_logic_005fiterate_005f0 = _jspx_th_logic_005fiterate_005f0.doStartTag();
          if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            java.lang.Object resulBusca = null;
            if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_logic_005fiterate_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_logic_005fiterate_005f0.doInitBody();
            }
            resulBusca = (java.lang.Object) _jspx_page_context.findAttribute("resulBusca");
            do {
              out.write("\t\t\t\t\r\n");
              out.write("\t\t\t\t\t\t<tr>\r\n");
              out.write("\t\t\t\t\t\t\t<td>\r\n");
              out.write("\t\t\t\t\t\t\t\t<a href=\"player.do?act=playerVideo&idVideo=");
              if (_jspx_meth_bean_005fwrite_005f0(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                return;
              out.write("&secao=liberada\" >\r\n");
              out.write("\t\t\t\t\t\t\t\t\t<img src=\"");
              if (_jspx_meth_bean_005fwrite_005f1(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                return;
              out.write("\" width=\"100\" height=\"73\" border=\"0\" alt=\"");
              if (_jspx_meth_bean_005fwrite_005f2(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                return;
              out.write("\"/>\r\n");
              out.write("\t\t\t\t\t\t\t\t</a>\r\n");
              out.write("\t\t\t\t\t\t\t</td>\r\n");
              out.write("\t\t\t\t\t\t</tr>\r\n");
              out.write("\t\t\t\t\t\r\n");
              out.write("\t\t\t\t\t");
              int evalDoAfterBody = _jspx_th_logic_005fiterate_005f0.doAfterBody();
              resulBusca = (java.lang.Object) _jspx_page_context.findAttribute("resulBusca");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_logic_005fiterate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fiterate_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fiterate_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
          out.write("\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\r\n");
          out.write("\t\t\t\t");
          int evalDoAfterBody = _jspx_th_logic_005fnotEmpty_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_005fnotEmpty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fname.reuse(_jspx_th_logic_005fnotEmpty_005f0);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fnotEmpty_005fname.reuse(_jspx_th_logic_005fnotEmpty_005f0);
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_logic_005fempty_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("</div><!-- /image-gallery -->\r\n");
      out.write("\t<a class=\"prev\" href=\"javascript:stepcarousel.stepBy('image-gallery', -2)\">Prev</a>\r\n");
      out.write("\t<a class=\"next\" href=\"javascript:stepcarousel.stepBy('image-gallery', 2)\">Next</a>\r\n");
      out.write("</div><!-- /image-gallery-wrapper -->\r\n");
      out.write("\r\n");
      out.write("<!-- Fim resultado busca -->\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t</dt>\r\n");
      out.write("\t\t\t<dt class=\"banner2\"><img src=\"/eec/_imgs/bannergrande.jpg\" class=\"linkado\"/><img src=\"/eec/_imgs/txt_pub.jpg\" /></dt>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"direita\">\r\n");
      out.write("\t\t\t<!-- INCLUDE DOS VÍDEOS LATERAIS -->\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "buscaAvancada.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- INCLUDE DOS VÍDEOS LATERAIS -->\t\r\n");
      out.write("\t\t\t<dt class=\"banner\"><img src=\"/eec/_imgs/banner.jpg\" class=\"linkado\"/></dt>\r\n");
      out.write("\t\t\t<dt><img src=\"/eec/_imgs/txt_pub.jpg\" style=\"margin-bottom:6px;\" /></dt>\r\n");
      out.write("\t\t\t<dt><img src=\"/eec/_imgs/banner_redondo.jpg\" class=\"linkado\" /></dt>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "rodape.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_bean_005fwrite_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f0 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f0.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    _jspx_th_bean_005fwrite_005f0.setName("resulBusca");
    _jspx_th_bean_005fwrite_005f0.setProperty("id");
    int _jspx_eval_bean_005fwrite_005f0 = _jspx_th_bean_005fwrite_005f0.doStartTag();
    if (_jspx_th_bean_005fwrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f1 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f1.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    _jspx_th_bean_005fwrite_005f1.setName("resulBusca");
    _jspx_th_bean_005fwrite_005f1.setProperty("pathImage");
    int _jspx_eval_bean_005fwrite_005f1 = _jspx_th_bean_005fwrite_005f1.doStartTag();
    if (_jspx_th_bean_005fwrite_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f2 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f2.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    _jspx_th_bean_005fwrite_005f2.setName("resulBusca");
    _jspx_th_bean_005fwrite_005f2.setProperty("title");
    int _jspx_eval_bean_005fwrite_005f2 = _jspx_th_bean_005fwrite_005f2.doStartTag();
    if (_jspx_th_bean_005fwrite_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
    return false;
  }

  private boolean _jspx_meth_logic_005fempty_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:empty
    org.apache.struts.taglib.logic.EmptyTag _jspx_th_logic_005fempty_005f0 = (org.apache.struts.taglib.logic.EmptyTag) _005fjspx_005ftagPool_005flogic_005fempty_005fname.get(org.apache.struts.taglib.logic.EmptyTag.class);
    _jspx_th_logic_005fempty_005f0.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fempty_005f0.setParent(null);
    _jspx_th_logic_005fempty_005f0.setName("videos_busca");
    int _jspx_eval_logic_005fempty_005f0 = _jspx_th_logic_005fempty_005f0.doStartTag();
    if (_jspx_eval_logic_005fempty_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("  \r\n");
        out.write("                \t<tr>\r\n");
        out.write("\t                \t<td>\r\n");
        out.write("\t                \tNenhum vídeo encontrado.\r\n");
        out.write("\t                \t</td>\r\n");
        out.write("                \t</tr>\r\n");
        out.write("                \t\r\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_logic_005fempty_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fempty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fempty_005fname.reuse(_jspx_th_logic_005fempty_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fempty_005fname.reuse(_jspx_th_logic_005fempty_005f0);
    return false;
  }
}
