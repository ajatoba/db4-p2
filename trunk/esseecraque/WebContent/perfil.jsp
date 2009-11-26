<%@ taglib uri="/WEB-INF/TLD/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/TLD/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/TLD/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

<logic:present name="AssinanteVideos">
	<div id="lists">
	
	
		<dt class="pos_nome">
        <div class="nome" align="center"><img src="/eec/_imgs/tv.jpg" width="22" height="35" align="absmiddle"/></strong> <bean:write name="AssinanteVideos" property="nome"/></strong></div></dt>
        
		<dt class="posicao">
        <div class="posmeio" align="center"><bean:write name="AssinanteVideos" property="position"/></div></dt>
        
        <dt class="fundo_abas">
        
	        <div class="espaco_abas">
				<strong>Nome:</strong> <bean:write name="AssinanteVideos" property="nome"/><br/>
				<strong>Altura:</strong> <bean:write name="AssinanteVideos" property="height"/><br/>
				<strong>Peso:</strong> <bean:write name="AssinanteVideos" property="weight"/>
			</div>
		
		</dt>
		
	</div>
</logic:present>
<logic:notPresent name="AssinanteVideos">
	<div id="lists">
	
		<dt class="topoposicao">
        </dt>
        
        <dt class="fundo_abas">
        	<div class="espaco_abas">
			Erro ao obter dados do Assinante proprietário dos vídeos</div>
		</dt>
	</div>
</logic:notPresent>

