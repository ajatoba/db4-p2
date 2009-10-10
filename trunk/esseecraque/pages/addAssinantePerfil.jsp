<%@ taglib uri="/WEB-INF/TLD/struts-bean.tld" prefix="bean" %>   
<%@ taglib uri="/WEB-INF/TLD/struts-html.tld" prefix="html" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@page import="esseecraque.bean.Assinante"%>
<%@page import="esseecraque.util.Constants"%>

<html xmlns="http://www.w3.org/1999/xhtml">

<head>      
<title><bean:message key="titulo.paginas"/></title>
<link href="<html:rewrite page="/_css/estilo.css" />" rel="stylesheet" type="text/css">
<link href="<html:rewrite page="/_css/slide.css" />" rel="stylesheet" type="text/css">
<link href="<html:rewrite page="/_css/cadastro.css" />" rel="stylesheet" type="text/css">
<script type="text/javascript" src="js/jquery-1.2.6-packed.js"></script>
<script type="text/javascript" src="js/slide.noconflict.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1"> 
</head>
<body>
<script>
function montarTorneios(){
	var formulario = document.forms[0];
	var titulo = formulario.titulo.value + ' - ' + formulario.time.value + ' - ' + formulario.local.value + ' - ' + formulario.ano.value + '\n'; 

	formulario.tournaments.value=formulario.tournaments.value+titulo;

	formulario.titulo.value = '';
	formulario.time.value = '';
	formulario.local.value = '';
	formulario.ano.value = '';  
}

function montarExperiencia(){
	var formulario = document.forms[0];
	var titulo = formulario.nomeTime.value + ' - ' + formulario.cidadeTime.value + ' - ' + formulario.anoInicio.value + ' até ' + formulario.anoFim.value + '\n'; 

	formulario.teams.value=formulario.teams.value+titulo;

	formulario.nomeTime.value = '';
	formulario.cidadeTime.value = '';
	formulario.anoInicio.value = '';
	formulario.anoFim.value = '';  
}
</script>

<% Assinante a = (Assinante)session.getAttribute(Constants.ASSINANTE_BEAN); %>


<html:form action="cadAssinante.do?act=addPerfil">   
<table border="0" cellpadding="0" cellspacing="0">
<tr>   
    <td valign="middle" class="form_nome">Altura:</td>   
    <td valign="middle"><html:text property="height" styleClass="form_campo_nome" /></td>
	<td valign="middle" class="valida_form"></td>   
</tr>   
<tr>   
    <td valign="middle" class="form_nome">Peso:</td>   
    <td valign="middle"><html:text property="weight" styleClass="form_campo_nome" /></td>
	<td valign="middle" class="valida_form"></td>   
</tr>
<tr>   
    <td valign="middle" class="form_nome">Posição:</td>   
    <td valign="middle"><html:text property="position" styleClass="form_campo_nome" /></td>
	<td valign="middle" class="valida_form"></td>   
</tr>
<tr>   
    <td colspan="3" valign="middle" class="form_nome">Times em que jogou:</td>
</tr>
<tr>    
    <td colspan="2" valign="middle">
    Time:<input type="text" name="nomeTime">
    Cidade:<input type="text" name="cidadeTime">
   <br>
    Ano de Início:<input type="text" name="anoInicio">
    Ano de Fim:<input type="text" name="anoFim">
    <input type="button" value="adicionar" onclick="montarExperiencia();">
    <br/>
    
    <html:textarea property="teams" rows="5" cols ="100" />
    </td>
	<td valign="middle" class="valida_form"></td>   
</tr>

<tr>   
    <td valign="middle" class="form_nome" colspan="3">Titulos que ganhou:</td>   
       
</tr>

<tr>   
    <td colspan="2"valign="middle">
    Título: <input type="text" name="titulo">
    Time: <input type="text" name="time">
    <br>
    Local: <input type="text" name="local">
    Ano: <input type="text" name="ano">
    <input type="button" value="adicionar" onclick="montarTorneios();">
    <br/>
    
    <html:textarea property="tournaments" rows="5" cols ="100" />
    </td>
	<td valign="middle" class="valida_form"></td>   
</tr>
<tr>   
    <td valign="middle" class="form_nome">Comentário:</td>   
    <td valign="middle"><html:textarea property="comment" rows="5" cols ="100" /></td>
	<td valign="middle" class="valida_form"></td>   
</tr>
</table> 
<!-- HIDDENS -->
<html:hidden property="email" value="<%=a.getEmail()%>"/>
<html:hidden property="password" value="<%=a.getPassword()%>"/>
<html:hidden property="confPassword" value="<%=a.getPassword()%>"/>
<html:hidden property="nome" value="<%=a.getNome()%>"/>
<html:hidden property="cpf" value="<%=a.getCpf()%>"/>
<html:hidden property="endereco" value="<%=a.getEndereco()%>"/>
<html:hidden property="cidade" value="<%=a.getCidade()%>"/>
<html:hidden property="estado" value="<%=a.getEstado()%>"/>
<html:hidden property="username" value="<%=a.getUsername()%>"/>

<!-- ******************** -->

<html:submit styleClass="botao"><bean:message key="botao.submit"/>
</html:submit>
   
</html:form>


</body>
</html>