<%@ taglib uri="/WEB-INF/TLD/struts-bean.tld" prefix="bean" %>   
<%@ taglib uri="/WEB-INF/TLD/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/TLD/struts-logic.tld" prefix="logic" %>
<%@page import="java.text.SimpleDateFormat" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>      
<title><bean:message key="titulo.paginas"/></title>
<link href="/eec/_css/estilo.css" rel="stylesheet" type="text/css">
<link href="/eec/_css/cadastro.css" rel="stylesheet" type="text/css">
<link href="/eec/_css/slide.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="/eec/js/jquery-1.2.6-packed.js"></script>
<script type="text/javascript" src="/eec/js/slide.noconflict.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1"> 
</head>
<body>
<!--INCLUDE DO MENU-->
<jsp:include page="topo.jsp" />

<!--FIM INCLUDE DO MENU-->


<div id="meio_fundo">
	<div id="meio">
		<div id="esquerda">
<!-- INÍCIO FORM DE CADASTRO DE VÍDEOS -->
<table border="0" cellpadding="0" cellspacing="0" align="center">
	<tr>
		<td><img src="/eec/_imgs/iconeSucesso.jpg" /></td>
		<td>&nbsp;</td>
		<td><span class="txtMsg"><bean:message key="msg.add.video.sucesso"/></span></td>
	</tr>
</table>
<br />

<html:form action="uploadVideo?act=add" focus="title" onsubmit="return validateVideoForm(this)">   
<table>
<tr>   
    <td class="form_nome">Titulo:</td>   
    <td><html:text property="title" maxlength="150" styleClass="form_campo_titulo" /></td>   
</tr>   
<tr>   
    <td class="form_nome">Descricao:</td>   
    <td><html:textarea property="description" styleClass="form_campo_descricao" /></td>   
</tr>
<tr>   
    <td class="form_nome">URL:</td>   
    <td><html:text property="url" maxlength="150" styleClass="form_campo_titulo" /></td>   
</tr>
<tr>   
    <td class="form_nome">PATH:</td>   
    <td><html:text property="realPath" maxlength="150" styleClass="form_campo_titulo" /></td>
</tr>
<tr>   
    <td class="form_nome">PATH IMAGE:</td>
    <td><html:text property="pathImage" maxlength="150" styleClass="form_campo_titulo" /></td>   
</tr>      
</table>
<html:hidden name="Assinante" property="id" />    
<html:submit><bean:message key="botao.submit"/>
</html:submit>

</html:form>
			<!-- FIM FORM DE CADASTRO DE VÍDEOS -->

<br />
<br />
<html:link page="/valtarHome.do" styleClass="menu_topo">Voltar para home</html:link>
<br />
<br />

			<dt class="banner2"><img src="/eec/_imgs/bannergrande.jpg" class="linkado"/><img src="/eec/_imgs/txt_pub.jpg" /></dt>
		</div>
		<div id="direita">
		
			<!--INCLUDE LISTAGEM DE VIDEOS-->
			<jsp:include page="/buscaAvancada.jsp" />
		<!--INCLUDE LISTAGEM DE VIDEOS-->
		
			<dt class="banner"><img src="/eec/_imgs/banner.jpg" class="linkado"/></dt>
			<dt><img src="/eec/_imgs/txt_pub.jpg" style="margin-bottom:6px;" /></dt>
			<dt><img src="/eec/_imgs/banner_redondo.jpg" class="linkado" /></dt>
		</div>
	</div>
</div>
<jsp:include page="rodape.jsp" />


</body>   
</html>