<%@ taglib uri="/WEB-INF/TLD/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/TLD/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/TLD/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>      
<link href="/eec/_css/estilo.css" rel="stylesheet" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<script>
function submitBusca(){
	document.busca.submit();
}
</script>
</head>
<body>
	 <dt class="fundo_abas">
	               <!--TABELA DE BUSCA-->
	
		<form action="listAssinantes.do?act=search" method="POST" name="busca" target="_parent">
		<table width="300" border="0" cellspacing="3" cellpadding="3">
		  <tr>
		    <td width="64" class="txt_busca_avancada">Nome :</td>
		  </tr>
		  <tr>
		    <td width="236"><input type="text" name="nome" class="form_busca_avancada" id="textfield" /></td>
		  </tr>
		  <tr>
		    <td class="txt_busca_avancada">Posição : </td>
		  </tr>
		  <tr>
		    <td><input type="text" name="posicao" class="form_busca_avancada" id="textfield2" /></td>
		  </tr>
		  <tr>
		    <td class="txt_busca_avancada">Cidade :</td>
		  </tr>
		  <tr>
		    <td><input type="text" name="cidade" class="form_busca_avancada" id="textfield8" /></td>
		  </tr>
		  <tr>    
		    <td>
		    <input  type="image" src="/eec/_imgs/btn_busca.jpg" name="button" id="button" value="Submit" onclick="javascript: submitBusca();" /></td>
		  </tr>
		</table>
		</form>
	          
	          <!--FIM TABELA DE BUSCA-->
	        </dt>

</body>
</html>