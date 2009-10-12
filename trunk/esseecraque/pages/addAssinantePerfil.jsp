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
<!-- INCLUDE HOME -->

<jsp:include page="topo.jsp" />

<!-- INCLUDE HOME -->
<div id="meio_fundo">
	<div id="meio">
		<div id="esquerda">
		<dt class="box_busca">
				<div class="sep_busca"></div>
				<div class="txt_busca"><input name="busca" type="text" class="txt_buscar" /></div>
				<div class="btn_busca"><img src="_imgs/btnbusca.jpg" class="linkado"/></div>
			</dt>
<% Assinante a = (Assinante)session.getAttribute(Constants.ASSINANTE_BEAN); %>



<html:form action="cadAssinante.do?act=addPerfil">   
<table border="0" cellpadding="3" cellspacing="3">
<tr>   
    <td width="74" valign="top" class="form_nome">Altura:</td>   
    <td width="408" valign="top" ><html:text property="height" styleClass="form_campo_altura" /></td>
	<td width="44" valign="top" class="valida_form"></td>   
</tr>   
<tr>   
    <td valign="top" class="form_nome">Peso:</td>   
    <td valign="top""><html:text property="weight" styleClass="form_campo_altura" /></td>
	<td valign="top" class="valida_form"></td>   
</tr>
<tr>   
    <td valign="top" class="form_nome">Posição:</td>   
    <td valign="top"><html:text property="position" styleClass="form_campo_posicao" /></td>
	<td valign="top" class="valida_form"></td>   
</tr>
<tr>   
    <td colspan="3" valign="middle" class="form_nome">Times em que jogou :</td>
</tr>
<tr>    
    <td colspan="3" valign="middle" class="campo_cadastro">
      Time : 
        <input type="text" width="120" name="nomeTime" class="form_campo_posicao">
      Cidade : 
      <input type="text" width="150" name="cidadeTime" class="form_campo_posicao">
      <br/>
    </td>
  </tr>
<tr>    
    <td colspan="3" valign="middle" class="campo_cadastro">
      Ano de Início :
      <input type="text" name="anoInicio" class="form_campo_posicao">
      Ano de Fim :
      <input type="text" name="anoFim" class="form_campo_posicao">
      
      <br/>
      <br/>
      <html:textarea property="teams" rows="5" cols ="50" />
      <br>
      <input type="button" value="adicionar" onclick="montarExperiencia();">
    </td>
  </tr>

<tr>   
    <td valign="middle" class="form_nome" colspan="3">Titulos que ganhou :</td>   
       
</tr>

<tr>   
     <td colspan="2" valign="middle" class="campo_cadastro">
    Título: <input type="text" name="titulo" class="form_campo_posicao">
    Time: <input type="text" name="time" class="form_campo_posicao">
    </td>
    </tr>
    <tr>
    <td colspan="2" class="campo_cadastro" class="form_campo_posicao">
    Local: <input type="text" name="local" class="form_campo_posicao">
    Ano: <input type="text" name="ano" class="form_campo_posicao"><br /><br>
    <html:textarea property="tournaments" rows="5" cols ="50" /><br />
    <input type="button" value="adicionar" onclick="montarTorneios();">
    </td>
	<td valign="middle" class="valida_form"></td>   
</tr>
<tr>   
    <td valign="middle" class="form_nome">Comentário:</td>  
    <td valign="middle"><html:textarea property="comment" rows="5" cols ="50" /></td>
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
</div>
<div id="direita">
		<!--INCLUDE LISTAGEM DE VIDEOS-->
			<jsp:include page="/buscaAvancada.jsp" />
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