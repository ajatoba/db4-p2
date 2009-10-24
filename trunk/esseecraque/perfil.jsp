<%@ taglib uri="/WEB-INF/TLD/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/TLD/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/TLD/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

<logic:present name="AssinanteVideos">
	<div id="lists">
		<bean:write name="AssinanteVideos" property="nome"/> (<bean:write name="AssinanteVideos" property="position"/>)<br/>
		Altura <bean:write name="AssinanteVideos" property="height"/><br/>
		Peso: <bean:write name="AssinanteVideos" property="weight"/>
	</div>
</logic:present>
<logic:notPresent name="AssinanteVideos">
	<div>
        <dt class="fundo_abas">
			Erro ao obter dados do Assinante proprietário dos vídeos
		</dt>
	</div>
</logic:notPresent>

