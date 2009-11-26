<%@ taglib uri="/WEB-INF/TLD/struts-bean.tld" prefix="bean" %>   
<%@ taglib uri="/WEB-INF/TLD/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/TLD/struts-logic.tld" prefix="logic" %>

<html>
<body>

<logic:present name="mensagem">
	<font color="red"><bean:write name="mensagem"/></font>
</logic:present>

<table border="1">
	<logic:notEmpty name="Videos">
		<tr>
			<td>TÍTULO</td>
			<td>DESCRIÇÃO</td>
			<td>STATUS</td>
		</tr>
		<logic:iterate id="v" name="Videos">
		<tr>
			<td><bean:write name="v" property="title" /></td>
			<td><bean:write name="v" property="description" /></td>
			<td>
				<logic:equal name="v" property="status" value="0"><a href="video.do?act=updateStatus&videoId=<bean:write name="v" property="id" />&status=1">AINDA INDISPONÍVEL</a></logic:equal>
				<logic:equal name="v" property="status" value="1"><a href="video.do?act=updateStatus&videoId=<bean:write name="v" property="id" />&status=0">DISPONÍVEL</a></logic:equal>
			</td>
		</tr>
		</logic:iterate>
	</logic:notEmpty>
</table>
</body>
</html>