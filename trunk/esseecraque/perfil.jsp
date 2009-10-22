<%@ taglib uri="/WEB-INF/TLD/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/TLD/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/TLD/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>


<div id="lists"><bean:write name="Assinante" property="nome"/>
      <div>
        <dt class="fundo_abas">
       	<dt><bean:write name="Assinante" property="position"/><dt>	
          <dt class="conteudo_abas">
          <table>
          <tr>
	          <td>THUMB</td>
	          <td>
	          Nome : <bean:write name="Assinante" property="nome"/>
	          Altura <bean:write name="Assinante" property="height"/>: Peso: <bean:write name="Assinante" property="weight"/>                     
	          </td>
          </tr>
          </table>
          </dt>
        </dt>
      </div>
  
</div>
