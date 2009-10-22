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
      out.write("<link href=\"/eec/_css/estilo.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link href=\"/eec/_css/minha_conta.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link href=\"/eec/_css/slide.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"/eec/js/jquery-1.2.6-packed.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/eec/js/slide.noconflict.js\"></script>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\"> \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!--INCLUDE DO MENU-->\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/topo.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--FIM INCLUDE DO MENU-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"meio_fundo\">\r\n");
      out.write("\t<div id=\"meio\">\r\n");
      out.write("\t\t<div id=\"esquerda\">\r\n");
      out.write("<dt class=\"box_busca\">\r\n");
      out.write("\t\t\t\t<div class=\"sep_busca\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"txt_busca\"><input name=\"busca\" type=\"text\" class=\"txt_buscar\" /></div>\r\n");
      out.write("\t\t\t\t<div class=\"btn_busca\"><img src=\"/eec/_imgs/btnbusca.jpg\" class=\"linkado\"/></div>\r\n");
      out.write("\t\t\t</dt>\r\n");
      out.write("<!-- INÍCIO MINHA CONTA -->\r\n");
      out.write("<div id=\"dados_conta\">\r\n");
      out.write("<div class=\"itens_conta\"><b>Histórico Financeiro</b></div>\r\n");
      out.write("<div>...</div>\r\n");
      out.write("<br /><br />\r\n");
      out.write("<div class=\"itens_conta\"><b>Data do Próximo Pagamento</b></div>\r\n");
      out.write("<div>29/10/2009</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- FIM MINHA CONTA -->\r\n");
      out.write("<dt id=\"ultimos_videos\">\r\n");
      out.write("<!-- INÍCIO GALERIA ÚLTIMOS VÍDEOS -->\r\n");
      out.write("<img src=\"/eec/_imgs/ultimos_videos.jpg\" />\r\n");
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
      out.write("\t\t<div class=\"panel\">\r\n");
      out.write("\t\t\t<a href=\"#\" title=\"Link 1\" >\r\n");
      out.write("\t\t\t\t<img src=\"/eec/_imgs/img_videos.jpg\" width=\"100\" height=\"73\" border=\"0\" alt=\"Imagem 1\" class=\"imgs\" />\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"panel\">\r\n");
      out.write("\t\t\t<a href=\"#\" title=\"Link 2\" >\r\n");
      out.write("\t\t\t\t<img src=\"/eec/_imgs/img_videos.jpg\" width=\"100\" height=\"73\" border=\"0\" alt=\"Imagem 2\" class=\"imgs\" />\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"panel\">\r\n");
      out.write("\t\t\t<a href=\"#\" title=\"Link 3\" >\r\n");
      out.write("\t\t\t\t<img src=\"/eec/_imgs/img_videos.jpg\" width=\"100\" height=\"73\" border=\"0\" alt=\"Imagem 3\" class=\"imgs\" />\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"panel\">\r\n");
      out.write("\t\t\t<a href=\"#\" title=\"Link 4\" >\r\n");
      out.write("\t\t\t\t<img src=\"/eec/_imgs/img_videos.jpg\" width=\"100\" height=\"73\" border=\"0\" alt=\"Imagm 4\" class=\"imgs\" />\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"panel\">\r\n");
      out.write("\t\t\t<a href=\"#\" title=\"Link 5\" >\r\n");
      out.write("\t\t\t\t<img src=\"/eec/_imgs/img_videos.jpg\" width=\"100\" height=\"73\" border=\"0\" alt=\"Imagem 5\" class=\"imgs\" />\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"panel\">\r\n");
      out.write("\t\t\t<a href=\"#\" title=\"Link 6\" >\r\n");
      out.write("\t\t\t\t<img src=\"/eec/_imgs/img_videos.jpg\" width=\"100\" height=\"73\" border=\"0\" alt=\"Imagem 6\" class=\"imgs\" />\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"panel\">\r\n");
      out.write("\t\t\t<a href=\"#\" title=\"Link 7\" >\r\n");
      out.write("\t\t\t\t<img src=\"/eec/_imgs/img_videos.jpg\" width=\"100\" height=\"73\" border=\"0\" alt=\"Imagem 7\" class=\"imgs\" />\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"panel\">\r\n");
      out.write("\t\t\t<a href=\"#\" title=\"Link 8\" >\r\n");
      out.write("\t\t\t\t<img src=\"/eec/_imgs/img_videos.jpg\" width=\"100\" height=\"73\" border=\"0\" alt=\"Imagem 8\" class=\"imgs\" />\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"panel\">\r\n");
      out.write("\t\t\t<a href=\"#\" title=\"Link 9\" >\r\n");
      out.write("\t\t\t\t<img src=\"/eec/_imgs/img_videos.jpg\" width=\"100\" height=\"73\" border=\"0\" alt=\"Imagem 9\" class=\"imgs\" />\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"panel\">\r\n");
      out.write("\t\t\t<a href=\"#\" title=\"Link 10\" >\r\n");
      out.write("\t\t\t\t<img src=\"/eec/_imgs/img_videos.jpg\" width=\"100\" height=\"73\" border=\"0\" alt=\"Imagem 10\" class=\"imgs\" />\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"panel\">\r\n");
      out.write("\t\t\t<a href=\"#\" title=\"Link 11\" >\r\n");
      out.write("\t\t\t\t<img src=\"/eec/_imgs/img_videos.jpg\" width=\"100\" height=\"73\" border=\"0\" alt=\"Imagm 11\" class=\"imgs\" />\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"panel\">\r\n");
      out.write("\t\t\t<a href=\"#\" title=\"Link 12\" >\r\n");
      out.write("\t\t\t\t<img src=\"/eec/_imgs/img_videos.jpg\" width=\"100\" height=\"73\" border=\"0\" alt=\"Imagem 12\" class=\"imgs\" />\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"panel\">\r\n");
      out.write("\t\t\t<a href=\"#\" title=\"Link 13\" >\r\n");
      out.write("\t\t\t\t<img src=\"/eec/_imgs/img_videos.jpg\" width=\"100\" height=\"73\" border=\"0\" alt=\"Imagem 13\" class=\"imgs\" />\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"panel\">\r\n");
      out.write("\t\t\t<a href=\"#\" title=\"Link 14\" >\r\n");
      out.write("\t\t\t\t<img src=\"/eec/_imgs/img_videos.jpg\" width=\"100\" height=\"73\" border=\"0\" alt=\"Imagem 14\" class=\"imgs\" />\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"panel\">\r\n");
      out.write("\t\t\t<a href=\"#\" title=\"Link 15\" >\r\n");
      out.write("\t\t\t\t<img src=\"/eec/_imgs/img_videos.jpg\" width=\"100\" height=\"73\" border=\"0\" alt=\"Imagem 15\" class=\"imgs\" />\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\t<a class=\"prev\" href=\"javascript:stepcarousel.stepBy('image-gallery', -5)\">Prev</a>\r\n");
      out.write("\t<a class=\"next\" href=\"javascript:stepcarousel.stepBy('image-gallery', 5)\">Next</a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- FIM GALERIA ÚLTIMOS VÍDEOS -->\r\n");
      out.write("\t\t\t</dt>\r\n");
      out.write("\t\t\t<dt id=\"mais_votados\">\r\n");
      out.write("\t\t\t\t<div class=\"seta\"><img src=\"/eec/_imgs/seta_tras.jpg\" /></div>\r\n");
      out.write("\t\t\t\t<div class=\"imgs\"><img src=\"/eec/_imgs/img_videos.jpg\" /></div>\r\n");
      out.write("\t\t\t\t<div class=\"imgs\"><img src=\"/eec/_imgs/img_videos.jpg\" /></div>\r\n");
      out.write("\t\t\t\t<div class=\"imgs\"><img src=\"/eec/_imgs/img_videos.jpg\" /></div>\r\n");
      out.write("\t\t\t\t<div class=\"imgs\"><img src=\"/eec/_imgs/img_videos.jpg\" /></div>\r\n");
      out.write("\t\t\t\t<div class=\"imgs\"><img src=\"/eec/_imgs/img_videos.jpg\" /></div>\r\n");
      out.write("\t\t\t\t<div class=\"seta2\"><img src=\"/eec/_imgs/seta_frente.jpg\" /></div>\t\t\t\r\n");
      out.write("\t\t\t</dt>\r\n");
      out.write("\t\t\t<dt class=\"banner2\"><img src=\"/eec/_imgs/bannergrande.jpg\" class=\"linkado\"/><img src=\"/eec/_imgs/txt_pub.jpg\" /></dt>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"direita\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<!--INCLUDE LISTAGEM DE VIDEOS-->\r\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/buscaAvancada.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t<!--INCLUDE LISTAGEM DE VIDEOS-->\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<dt class=\"banner\"><img src=\"/eec/_imgs/banner.jpg\" class=\"linkado\"/></dt>\r\n");
      out.write("\t\t\t<dt><img src=\"/eec/_imgs/txt_pub.jpg\" style=\"margin-bottom:6px;\" /></dt>\r\n");
      out.write("\t\t\t<dt><img src=\"/eec/_imgs/banner_redondo.jpg\" class=\"linkado\" /></dt>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/rodape.jsp", out, false);
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
}
