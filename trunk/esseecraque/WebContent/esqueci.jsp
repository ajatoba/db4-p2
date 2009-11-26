<%@ taglib uri="/TLD/struts-bean.tld" prefix="bean" %>   
<%@ taglib uri="/TLD/struts-html.tld" prefix="html" %>
<%@ taglib uri="/TLD/struts-logic.tld" prefix="logic" %>

<logic:present name="mensagem">
	<font color="red"><bean:write name="mensagem"/></font>
</logic:present>

<form action="assinante.do?act=remindPassword" method="POST">

<table width="250" border="0" cellspacing="3" cellpadding="3">
  <tr>
    <td width="23%">Email : </td>
    <td width="77%"><label>
      <input type="text" name="email" id="email" />
    </label></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td><label>
      <input type="submit" name="button" id="button" value="Submit" />
    </label></td>
  </tr>
</table>

</form>