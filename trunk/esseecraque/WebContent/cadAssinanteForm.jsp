<%@ taglib uri="WEB-INF/TLD/struts-bean.tld" prefix="bean" %>   
<%@ taglib uri="WEB-INF/TLD/struts-html.tld" prefix="html" %>
<%@ taglib uri="WEB-INF/TLD/struts-logic.tld" prefix="logic" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>      
<title><bean:message key="titulo.paginas"/></title>
<link href="/eec/_css/estilo.css" rel="stylesheet" type="text/css">
<link href="/eec/_css/slide.css" rel="stylesheet" type="text/css">
<link href="/eec/_css/cadastro.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="/eec/js/jquery-1.2.6-packed.js"></script>
<script type="text/javascript" src="/eec/js/slide.noconflict.js"></script>
<script language="javascript">
function submitUser(){
document.assinanteForm.opcao_cadastro.value="1";
document.assinanteForm.submit();
}

function submitAssinante(){
	document.assinanteForm.opcao_cadastro.value="2";
	document.assinanteForm.submit();
}

</script>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1"> 
</head>
<body>

<!-- INCLUDE HOME -->

<jsp:include page="topo.jsp" />

<!-- INCLUDE HOME -->

<div id="meio_fundo">
	<div id="meio">
		<div id="esquerda">
		<div id="conteudo_cadastro">
		<div id="top_cadastro">
		<div id="tit_cadastro"></div>
		</div>
		
<div id="cadastro" >
<table border="0" cellpadding="0" cellspacing="0" align="center">
	<tr>
		<td>
			<span class="txtMsg">		
			<logic:present name="mensagem_erro">
	  			<img src="/eec/_imgs/iconeErro.jpg" /> <bean:message key="msg.add.assinante.erro"/><br/>
	  			<font color="red"><bean:write name="mensagem_erro"/></font>
	  		</logic:present>
			</span>
		</td>
	</tr>
</table>
<html:form action="cadAssinante.do?act=add">   
<table border="0" cellpadding="3" cellspacing="3">
<tr>   
    <td valign="middle" class="form_nome">Nome&nbsp;&nbsp;&nbsp;
    <html:text property="nome" styleClass="form_campo_nome" /></td>   
    <td valign="middle" class="valida_form"><html:errors  property="erro.vcNomeAssinante" /></td>   
</tr>
<tr>   
    <td valign="middle" class="form_nome">E-mail&nbsp;&nbsp;
    <html:text property="email" styleClass="form_campo_nome" /></td>   
    <td valign="middle" class="valida_form"><html:errors property="erro.vcEmailAssinante"  /> 
    </td>   
</tr>
<tr>   
    <td valign="middle" class="form_nome">Msn / Icq / Yahoo&nbsp;&nbsp;
    <html:text property="aim" styleClass="form_campo_msn" /></td>   
    <td valign="middle" class="valida_form"></td>   
</tr> 
<tr>   
    <td valign="middle" class="form_nome">Senha&nbsp;
    <html:password property="password" styleClass="form_campo_senha" />&nbsp;&nbsp; Confirmar Senha &nbsp;<html:password property="confPassword" styleClass="form_campo_senha" /></td>   
    <td valign="middle" class="valida_form"><html:errors  property="erro.vcPasswordAssinante" /><html:errors  property="erro.vcConfPasswordAssinante" /></td>   
</tr>


<tr>   
    <td valign="middle" class="form_nome">Data de Nascimento&nbsp;&nbsp;
      <html:text property="diaNascimento" styleClass="form_campo_altura" value="" />
      /
    <html:select property="mesNascimento" styleClass="form_campo_posicao">    	
		<html:option  value="1">Jan</html:option>
		<html:option  value="2">Fev</html:option>
		<html:option  value="3">Mar</html:option>
		<html:option  value="4">Abr</html:option>
		<html:option  value="5">Mai</html:option>
		<html:option  value="6">Jun</html:option> 
		<html:option  value="7">Jul</html:option>
		<html:option  value="8">Ago</html:option>
		<html:option  value="9">Set</html:option>
		<html:option  value="10">Out</html:option>
		<html:option  value="11">Nov</html:option>
		<html:option  value="12">Dez</html:option>
	</html:select>
		/
	<html:select property="anoNascimento" styleClass="form_campo_posicao">    	
		<html:option  value="1977">1977</html:option>
		<html:option  value="1978">1978</html:option>
		<html:option  value="1979">1979</html:option>
		<html:option  value="1980">1980</html:option>
		<html:option  value="1981">1981</html:option>
		<html:option  value="1982">1982</html:option>
		<html:option  value="1983">1983</html:option>
		<html:option  value="1984">1984</html:option>
		<html:option  value="1985">1985</html:option>
		<html:option  value="1986">1986</html:option>
		<html:option  value="1987">1987</html:option>
		<html:option  value="1988">1988</html:option>
		<html:option  value="1989">1989</html:option>
		<html:option  value="1990">1990</html:option>
		<html:option  value="1991">1991</html:option>
		<html:option  value="1992">1992</html:option>
		<html:option  value="1993">1993</html:option>
		<html:option  value="1994">1994</html:option>
		<html:option  value="1995">1995</html:option>
		<html:option  value="1996">1996</html:option>
		<html:option  value="1997">1997</html:option>
		<html:option  value="1998">1998</html:option>
		<html:option  value="1999">1999</html:option>
		<html:option  value="2000">2000</html:option>
		<html:option  value="2001">2001</html:option>
		<html:option  value="2002">2002</html:option>
		<html:option  value="2003">2003</html:option>
		<html:option  value="2004">2004</html:option>
		<html:option  value="2005">2005</html:option>
		<html:option  value="2006">2006</html:option>
		<html:option  value="2007">2007</html:option>
	</html:select>	</td>   
    <td valign="middle" class="valida_form"></td>   
</tr>
<tr>   
    <td valign="middle" class="form_nome">Endereço&nbsp;&nbsp;
    <html:text property="endereco" styleClass="form_campo_end" /></td>   
    <td valign="middle" class="valida_form"><html:errors  property="erro.vcEnderecoAssinante" /></td>   
</tr>
<tr>   
    <td valign="middle" class="form_nome">Cidade&nbsp;&nbsp;
    <html:text property="cidade" styleClass="form_campo_senha2"/>&nbsp;&nbsp;<html:errors  property="erro.vcCidadeAssinante" />Estado&nbsp;&nbsp;
    <html:select property="estado" styleClass="form_campo_senha2">    	
        <html:option  value="Acre">Acre</html:option>
        <html:option  value="Alagoas">Alagoas</html:option>
        <html:option  value="Amapá">Amapá</html:option>
        <html:option  value="Amazonas">Amazonas</html:option>
        <html:option  value="Bahia">Bahia</html:option>
        <html:option  value="Ceará">Ceará</html:option> 
        <html:option  value="Distrito Federal">Distrito Federal</html:option> 
        <html:option  value="Espírito Santos">Espírito Santos</html:option>
        <html:option  value="Goias">Goias</html:option>
        <html:option  value="Maranhão">Maranhão</html:option>
        <html:option  value="Mato Grosso">Mato Grosso</html:option>
        <html:option  value="Mato Grosso do Sul">Mato Grosso do Sul</html:option>
        <html:option  value="Minas Gerais">Minas Gerais</html:option> 
        <html:option  value="Pará">Pará</html:option>
        <html:option  value="Paraíba">Paraíba</html:option> 
        <html:option  value="Paraná">Paraná</html:option>
        <html:option  value="Pernambuco">Pernambuco</html:option>
        <html:option  value="Piauí">Piauí</html:option>
        <html:option  value="Rio de Janeiro">Rio de Janeiro</html:option>
        <html:option  value="Rio Grande do Norte">Rio Grande do Norte</html:option>
        <html:option  value="Rio Grande do Sul">Rio Grande do Sul</html:option>
        <html:option  value="Rondônia">Rondônia</html:option>
        <html:option  value="Roraima">Roraima</html:option>
        <html:option  value="Santa Catarina">Santa Catarina</html:option>
        <html:option  value="São Paulo">São Paulo</html:option>
        <html:option  value="Sergipe">Sergipe</html:option> 
        <html:option  value="Tocantins">Tocantins</html:option>
      </html:select>  &nbsp;&nbsp;País &nbsp;&nbsp;
    <html:text property="pais" styleClass="form_campo_senha2" />   </td> 
    <td valign="middle" class="valida_form"><html:errors  property="erro.vcEstadoAssinante" /></td>   
</tr>
<tr>   
    <td valign="middle" class="form_nome">CEP:
    <html:text property="cep" styleClass="form_campo_senha2" /></td>   
    <td valign="middle" class="valida_form"></td>   
</tr>

<tr>   
    <td valign="middle" class="form_nome">Telefone (DD-XXXX-XXXX):
    <html:text property="phoneNumber" styleClass="form_campo_senha2" /></td>   
    <td valign="middle" class="valida_form"></td>   
</tr>
<tr>   
    <td valign="middle" class="form_nome">Celular (DD-XXXX-XXXX):
    <html:text property="cellPhoneNumber" styleClass="form_campo_senha2" /></td>   
    <td valign="middle" class="valida_form"></td>   
</tr>
<tr>   
    <td valign="middle" class="form_nome">Nacionalidade:
    <html:text property="nacionalidade" styleClass="form_campo_senha3" /></td>   
    <td valign="middle" class="valida_form"></td>   
</tr>
<tr>   
    <td valign="middle" class="form_nome">URL do assinante:http://www.esseecraque.com.br/<html:text property="username" styleClass="form_campo_path" /></td>   
    <td valign="middle" class="valida_form"><html:errors  property="erro.vcUsername" /></td>   
</tr>
<input type="hidden" name="opcao_cadastro" value="1"/>
</table>   
<div id="bottom_erro">
<div id="btn_cadastro">
<html:button property="" onclick="javascript:submitUser();">Finalizar Cadastro</html:button>
<html:button property="" onclick="javascript:submitAssinante();">Sou Jogador</html:button> </div>
</div>
 
</html:form>
</div>

			
			<dt class="banner2"><img src="/eec/_imgs/bannergrande.jpg" class="linkado"/><img src="/eec/_imgs/txt_pub.jpg" /></dt>
		</div>
</div>
<div id="direita">
<div id="box_busca_simples">
<form action="busca.do?act=search" method="post">
        <div class="sep_busca"></div>
        <div class="txt_busca">
          <input type="text" name="busca" Class="txt_buscar" />
        </div>
        <div class="btn_busca"><input type="image" src="/eec/_imgs/btnbusca.jpg" name="Submit" Class="linkado" /></div>
</form>
</div>
<!--FIM-->		
		
<!-- INCLUDE DOS VÍDEOS LATERAIS -->

<jsp:include page="/busca.jsp" />

<!-- INCLUDE DOS VÍDEOS LATERAIS -->
						
			<div id="bnn_01"></div>
			<dt><img src="/eec/_imgs/txt_pub.jpg" style="margin-bottom:6px;" /></dt>
			<div id="bnn_02"></div>
			<dt><img src="/eec/_imgs/txt_pub.jpg" style="margin-bottom:6px;" /></dt>
			<div id="bnn_03"></div>
			<dt><img src="/eec/_imgs/txt_pub.jpg" style="margin-bottom:6px;" /></dt>
			<dt><img src="/eec/_imgs/banner_redondo.jpg" class="linkado" /></dt>
		</div>
	</div>
</div>
<jsp:include page="rodape.jsp" />


</body>   
</html>