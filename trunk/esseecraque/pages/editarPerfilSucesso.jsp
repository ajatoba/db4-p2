<%@ taglib uri="/WEB-INF/TLD/struts-bean.tld" prefix="bean" %>   
<%@ taglib uri="/WEB-INF/TLD/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/TLD/struts-logic.tld" prefix="logic" %>
<%@page import="java.text.SimpleDateFormat" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>      
<title><bean:message key="titulo.paginas"/></title>
<link href="<html:rewrite page="/_css/estilo.css" />" rel="stylesheet" type="text/css">
<link href="<html:rewrite page="/_css/cadastro.css" />" rel="stylesheet" type="text/css">
<link href="<html:rewrite page="/_css/slide.css" />" rel="stylesheet" type="text/css">
<script type="text/javascript" src="js/jquery-1.2.6-packed.js"></script>
<script type="text/javascript" src="js/slide.noconflict.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1"> 
</head>
<body>
<!--INCLUDE DO MENU-->
<jsp:include page="topo.jsp" />

<!--FIM INCLUDE DO MENU-->


<div id="meio_fundo">
	<div id="meio">
		<div id="esquerda">

<table border="0" cellpadding="0" cellspacing="0" align="center">
	<tr>
		<td><img src="_imgs/iconeSucesso.jpg" /></td>
		<td>&nbsp;</td>
		<td><span class="txtMsg"><bean:message key="msg.edit.assinante.sucesso"/></span></td>
	</tr>
</table>
<br />

<!-- INÍCIO FORM DE EDIÇÃO DO ASSINANTE -->

<html:form action="editAssinante.do?act=edit" focus="VC_EMAIL_ASSINANTE" onsubmit="return validateAssinanteForm(this)">
<html:hidden name="Assinante" property="id" />   
<table border="0">
<tr>   
    <td valign="middle" class="form_nome">E-mail:</td>   
    <td valign="middle"><html:text name="Assinante" property="email" styleClass="form_campo_nome" /></td>
	<td valign="middle"><html:errors  property="erro.vcEmailAssinante" /></td>   
</tr>   
<tr>   
    <td valign="middle" class="form_nome">Senha:</td>   
    <td valign="middle"><html:password property="password" styleClass="form_campo_nome" /></td>
	<td valign="middle"><html:errors  property="erro.vcPasswordAssinante" /></td>   
</tr>
<tr>   
    <td valign="middle" class="form_nome">Confirmar Senha:</td>   
    <td valign="middle"><html:password property="confPassword" styleClass="form_campo_nome" /></td>
	<td valign="middle"><html:errors  property="erro.vcConfPasswordAssinante" /></td>   
</tr>
<tr>   
    <td valign="middle" class="form_nome">Nome:</td>   
    <td valign="middle"><html:text name="Assinante" property="nome" styleClass="form_campo_nome" /></td>
	<td valign="middle" class="valida_form"><html:errors  property="erro.vcNomeAssinante" /></td>   
</tr>
<tr>   
    <td valign="middle" class="form_nome">CPF:</td>   
    <td valign="middle"><html:text name="Assinante" property="cpf" styleClass="form_campo_nome" /></td>
	<td valign="middle" class="valida_form"><html:errors  property="erro.vcCPFAssinante" /></td>   
</tr>
<tr>   
    <td valign="middle" class="form_nome">Endereço:</td>   
    <td valign="middle"><html:text name="Assinante" property="endereco" styleClass="form_campo_nome" /></td>
	<td valign="middle" class="valida_form"><html:errors  property="erro.vcEnderecoAssinante" /></td>   
</tr>
<tr>   
    <td valign="middle" class="form_nome">Cidade:</td>   
    <td valign="middle"><html:text name="Assinante" property="cidade" styleClass="form_campo_nome" /></td>
	<td valign="middle" class="valida_form"><html:errors  property="erro.vcCidadeAssinante" /></td>   
</tr>
<tr>   
    <td valign="middle" class="form_nome">Estado:</td>   
    <td valign="middle"><html:text name="Assinante" property="estado" styleClass="form_campo_nome" /></td>
	<td valign="middle" class="valida_form"><html:errors  property="erro.vcEstadoAssinante" /></td>   
</tr>        
</table>
<html:hidden name="Assinante" property="dataCadastro" />   
<html:submit styleClass="botao"><bean:message key="botao.submit"/>
</html:submit>  
</html:form>  

			<!-- FIM FORM DE EDIÇÃO DE ASSINANTE -->

<br />
<br />
<html:link page="/valtarHome.do" styleClass="menu_topo">Voltar para home</html:link>
<br />
<br />

			<dt class="banner2"><img src="_imgs/bannergrande.jpg" class="linkado"/><img src="_imgs/txt_pub.jpg" /></dt>
		</div>
		<div id="direita">
			
			<!--INCLUDE LISTAGEM DE VIDEOS-->
			<jsp:include page="jogadores.jsp" />
		<!--INCLUDE LISTAGEM DE VIDEOS-->
			
			<dt class="banner"><img src="_imgs/banner.jpg" class="linkado"/></dt>
			<dt><img src="_imgs/txt_pub.jpg" style="margin-bottom:6px;" /></dt>
			<dt><img src="_imgs/banner_redondo.jpg" class="linkado" /></dt>
		</div>
	</div>
</div>
<jsp:include page="rodape.jsp" />


</body>   
</html>