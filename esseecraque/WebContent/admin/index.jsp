<%@ taglib uri="/WEB-INF/TLD/struts-bean.tld" prefix="bean" %>   
<%@ taglib uri="/WEB-INF/TLD/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/TLD/struts-logic.tld" prefix="logic" %>

<html>
<body>

<logic:present name="mensagem">
	<font color="red"><bean:write name="mensagem"/></font>
</logic:present>

<table>
	<tr>
		<td>
		<a href="video.do?act=listLastVideos">Publicar �ltimos V�deos</a>
		</td>
	</tr>
	<tr>
		<td>
		<a href="index.do?act=updateAssinanteIndex">Atualizar �ndice de Assinantes</a>
		</td>
	</tr>
	<tr>
		<td>
		<a href="index.do?act=updateVideoIndex">Atualizar �ndice de V�deos</a>
		</td>
	</tr>
		<tr>
		<td>
		<a href="video.do?act=listAllVideos">Listar V�deos</a>
		</td>
	</tr>
</table>

</body>
</html>