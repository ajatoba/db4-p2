<%@ taglib uri="/WEB-INF/TLD/struts-bean.tld" prefix="bean" %>   
<%@ taglib uri="/WEB-INF/TLD/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/TLD/struts-logic.tld" prefix="logic" %>

<html>
<head><title>Concluído</title></head>
<body>
<bean:write name="name"/> - <bean:write name="size"/>Kb<br>

  <logic:present name="mensagem_sucesso">
  	<bean:write name="mensagem_sucesso"/>
  </logic:present>
  <logic:present name="mensagem_erro">
  	<bean:write name="mensagem_erro"/>
  </logic:present>

</body>
</html>