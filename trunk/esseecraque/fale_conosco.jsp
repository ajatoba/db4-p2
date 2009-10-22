<%@ taglib uri="/TLD/struts-bean.tld" prefix="bean" %>   
<%@ taglib uri="/TLD/struts-html.tld" prefix="html" %>
<%@ taglib uri="/TLD/struts-logic.tld" prefix="logic" %>

<logic:present name="mensagem">
	<font color="red"><bean:write name="mensagem"/></font>
</logic:present>

<form action="assinante.do?act=sendCommunication" method="POST">
<table width="400" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td width="9%" valign="top">Nome :</td>
    <td width="91%"><input type="text" name="nome" id="nome" /></td>
  </tr>
  <tr>
    <td valign="top">E-Mail :</td>
    <td><input type="text" name="email" id="email" /></td>
  </tr>
  <tr>
    <td valign="top">Mensagem :</td>
    <td><textarea name="mensagem" id="mensagem" cols="45" rows="5"></textarea></td>
  </tr>
  <tr>
    <td><input type="submit" name="button" id="button" value="Submit" /></td>
    <td>&nbsp;</td>
  </tr>
</table>
</form>