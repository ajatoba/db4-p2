<%@ taglib uri="/WEB-INF/TLD/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/TLD/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/TLD/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>


<div id="lists"><img src="_imgs/btn_jogadores.jpg" class="linkado"/><img src="_imgs/btn_posicoes.jpg" class="linkado"/><img src="_imgs/btn_categorias.jpg" class="linkado"/>
  <display:table name="VideosLaterais" id="lv" pagesize="7" requestURI="welcome.do?act=carregaHome">
    <display:column>
      <div class="atrasOut" onmouseover="this.className='atrasIn';" onmouseout="this.className='atrasOut';">
        <dt class="frente">
          <div class="voto0">
            <div class="img_list"><img src="<bean:write name='lv' property='pathImage' />"  /></div>
            <div class="desc">
              <bean:write name="lv" property="title" />
            </div>
            <div class="data">
              <bean:write name="lv" property="dataUpload" format="{0,date,dd-MM-yyyy}" />
            </div>
          </div>
        </dt>
      </div>
    </display:column>
  </display:table>
</div>
