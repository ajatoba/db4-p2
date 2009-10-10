package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_005fname_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005frewrite_005fpage_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_005fname_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fbean_005fmessage_005fkey_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005frewrite_005fpage_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_005fname_005fid.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.release();
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
      out.write("\r\n");
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
      out.write("\r\n");
      out.write("\t\t\t<dt class=\"box_busca\">\r\n");
      out.write("\t\t\t\t<form action=\"busca.do?act=busca\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t<div class=\"sep_busca\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"txt_busca\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"busca\" Class=\"txt_buscar\" />\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"btn_busca\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"image\" src=\"_imgs/btnbusca.jpg\" name=\"Submit\" Class=\"linkado\" />\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</dt>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<dt class=\"player\">\r\n");
      out.write("\r\n");
      out.write("<!-- INICIO PLAYER -->\r\n");
      out.write("\r\n");
      out.write("<embed allowFullScreen='true'src='player.swf?movie=videos/100000001.flv&autoplay=off' quality='high'bgcolor='#000000' width='640' height='419'align='middle' allowScriptAccess='sameDomain'type='application/x-shockwave-flash'/>\r\n");
      out.write("\r\n");
      out.write("<!-- FIM PLAYER -->\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t</dt>\r\n");
      out.write("\t\t\t<dt class=\"desc_player\">\r\n");
      out.write("\t\t\t\t<div class=\"dir_desc\">\r\n");
      out.write("\t\t\t\t\t<div class=\"data_pl\">09/06/2009 10:26</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"desc_pl\">Edson dos Santos em pedala e da show de bola</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"data_pl\">Compartilhar o vídeo (copie e cole a URL)</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"fundo_desc\">http://www.orkut.com/watch?=4fsfafdge</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"meio_desc\">\r\n");
      out.write("\t\t\t\t\t<div><img src=\"_imgs/votar.jpg\" class=\"linkado\"/></div>\r\n");
      out.write("\t\t\t\t\t<div><img src=\"_imgs/ver_perfil.jpg\" class=\"mgn5_linkado\"/></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"esq_desc\">\r\n");
      out.write("\t\t\t\t\t<div>Disponível para contratação</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</dt>\r\n");
      out.write("\t\t\t<dt id=\"ultimos_videos\">\r\n");
      out.write("\r\n");
      out.write("<!-- INÍCIO GALERIA ÚLTIMOS VÍDEOS -->\r\n");
      out.write("\r\n");
      out.write("<img src=\"_imgs/ultimos_videos.jpg\" />\r\n");
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
      out.write("\t\r\n");
      out.write("<div id=\"image-gallery\" class=\"stepcarousel\">\r\n");
      out.write("\t<div class=\"belt\">\r\n");
      out.write("\r\n");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fiterate_005f0.setParent(null);
      _jspx_th_logic_005fiterate_005f0.setId("uv");
      _jspx_th_logic_005fiterate_005f0.setName("UltimosVideos");
      int _jspx_eval_logic_005fiterate_005f0 = _jspx_th_logic_005fiterate_005f0.doStartTag();
      if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Object uv = null;
        if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_005fiterate_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_005fiterate_005f0.doInitBody();
        }
        uv = (java.lang.Object) _jspx_page_context.findAttribute("uv");
        do {
          out.write("\r\n");
          out.write("\t\t<div class=\"panel\">\r\n");
          out.write("\t\t\t<a href=\"player.do?act=playerVideo&idVideo=");
          if (_jspx_meth_bean_005fwrite_005f0(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
            return;
          out.write("&secao=liberada\" >\r\n");
          out.write("\t\t\t\t<img src=\"");
          if (_jspx_meth_bean_005fwrite_005f1(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
            return;
          out.write("\" width=\"100\" height=\"73\" border=\"0\" alt=\"");
          if (_jspx_meth_bean_005fwrite_005f2(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
            return;
          out.write("\" class=\"imgs\" />\r\n");
          out.write("\t\t\t</a>\r\n");
          out.write("\t\t</div>\r\n");
          int evalDoAfterBody = _jspx_th_logic_005fiterate_005f0.doAfterBody();
          uv = (java.lang.Object) _jspx_page_context.findAttribute("uv");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\t<a class=\"prev\" href=\"javascript:stepcarousel.stepBy('image-gallery', -5)\">Prev</a>\r\n");
      out.write("\t<a class=\"next\" href=\"javascript:stepcarousel.stepBy('image-gallery', 5)\">Next</a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- FIM GALERIA ÚLTIMOS VÍDEOS -->\r\n");
      out.write("\t\t\t</dt>\r\n");
      out.write("<!-- INICIO DA GALERIA VÍDEOS MAIS VOTADOS -->\r\n");
      out.write("\t\t\t<dt id=\"mais_votados\">\r\n");
      out.write("\t\t\t\t<div class=\"seta\"><img src=\"_imgs/seta_tras.jpg\" /></div>\r\n");
      out.write("\t\t\t\t<div class=\"imgs\"><img src=\"_imgs/img_videos.jpg\" /></div>\r\n");
      out.write("\t\t\t\t<div class=\"imgs\"><img src=\"_imgs/img_videos.jpg\" /></div>\r\n");
      out.write("\t\t\t\t<div class=\"imgs\"><img src=\"_imgs/img_videos.jpg\" /></div>\r\n");
      out.write("\t\t\t\t<div class=\"imgs\"><img src=\"_imgs/img_videos.jpg\" /></div>\r\n");
      out.write("\t\t\t\t<div class=\"imgs\"><img src=\"_imgs/img_videos.jpg\" /></div>\r\n");
      out.write("\t\t\t\t<div class=\"seta2\"><img src=\"_imgs/seta_frente.jpg\" /></div>\t\t\t\r\n");
      out.write("\t\t\t</dt>\r\n");
      out.write("\t\t\t<dt class=\"banner2\"><img src=\"_imgs/bannergrande.jpg\" class=\"linkado\"/><img src=\"_imgs/txt_pub.jpg\" /></dt>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div id=\"direita\">\r\n");
      out.write("\t\t\r\n");
      out.write("<!-- INCLUDE DOS VÍDEOS LATERIAIS -->\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "videosLaterais.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- INCLUDE DOS VÍDEOS LATERAIS -->\r\n");
      out.write("\t\t\t\t\t\t\r\n");
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

  private boolean _jspx_meth_bean_005fwrite_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f0 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f0.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    _jspx_th_bean_005fwrite_005f0.setName("uv");
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
    _jspx_th_bean_005fwrite_005f1.setName("uv");
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
    _jspx_th_bean_005fwrite_005f2.setName("uv");
    _jspx_th_bean_005fwrite_005f2.setProperty("title");
    int _jspx_eval_bean_005fwrite_005f2 = _jspx_th_bean_005fwrite_005f2.doStartTag();
    if (_jspx_th_bean_005fwrite_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
    return false;
  }
}
