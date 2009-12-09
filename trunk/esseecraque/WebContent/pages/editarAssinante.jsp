<%@ taglib uri="/WEB-INF/TLD/struts-bean.tld" prefix="bean" %>   
<%@ taglib uri="/WEB-INF/TLD/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/TLD/struts-logic.tld" prefix="logic" %>
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
function preencheData(){
	var data = '<bean:write name="Assinante" property="birthDate"/>';
	var dia = data.substring(8,10);
	var mes = data.substring(5,7);
	var ano = data.substring(0,4);

	document.assinanteForm.diaNascimento.value = dia;
	document.assinanteForm.anoNascimento.selectedValue=ano;
	document.assinanteForm.mesNascimento.selectedValue=mes;
}

function submitUser(){
document.assinanteForm.submit();
}

</script>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1"> 
</head>
<body onload="javascript:preencheData();">

<!-- INCLUDE HOME -->

<jsp:include page="/topo.jsp" />

<!-- INCLUDE HOME -->

<div id="meio_fundo">
	<div id="meio">
		<div id="esquerda">
		<dt class="box_busca">
				<form action="busca.do?act=busca" method="post">
					<div class="sep_busca"></div>
					<div class="txt_busca">
						<input type="text" name="busca" Class="txt_buscar" />
					</div>
					<div class="btn_busca">
						<input type="image" src="/eec/_imgs/btnbusca.jpg" name="Submit" Class="linkado" />
					</div>
				</form>
			</dt>
<dt id="cadastro" >
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
<html:form action="editarAssinante.do?act=edit">   
<table border="0" cellpadding="3" cellspacing="3">
<tr>   
    <td valign="middle" class="form_nome">Nome:</td>   
    <td valign="middle"><html:text name="Assinante" property="nome" styleClass="form_campo_nome"/></td>
	<td valign="middle" class="valida_form"><html:errors  property="erro.vcNomeAssinante" /></td>   
</tr>
<tr>   
    <td valign="middle" class="form_nome">E-mail:</td>   
    <td valign="middle"><html:text name="Assinante" property="email" styleClass="form_campo_nome" /></td>
	<td valign="middle" class="valida_form"><html:errors property="erro.vcEmailAssinante"  /> 
	</td>   
</tr>
<tr>   
    <td valign="middle" class="form_nome">AIM:</td>   
    <td valign="middle"><html:text name="Assinante" property="aim" styleClass="form_campo_nome" /></td>
	<td valign="middle" class="valida_form"></td>   
</tr> 

<tr>   
    <td valign="middle" class="form_nome">Data de Nascimento:</td>   
    <td valign="middle"><html:text property="diaNascimento" styleClass="form_campo_altura"></html:text>/
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
	</html:select>
	</td>
	<td valign="middle" class="valida_form"></td>   
</tr>
<tr>   
    <td valign="middle" class="form_nome">Endere�o:</td>   
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
    <td valign="middle">
    <html:select name="Assinante" property="estado" styleClass="form_campo_posicao">    	
		<html:option  value="Acre">Acre</html:option>
		<html:option  value="Alagoas">Alagoas</html:option>
		<html:option  value="Amap�">Amap�</html:option>
		<html:option  value="Amazonas">Amazonas</html:option>
		<html:option  value="Bahia">Bahia</html:option>
		<html:option  value="Cear�">Cear�</html:option> 
		<html:option  value="Distrito Federal">Distrito Federal</html:option> 
		<html:option  value="Esp�rito Santos">Esp�rito Santos</html:option>
		<html:option  value="Goias">Goias</html:option>
		<html:option  value="Maranh�o">Maranh�o</html:option>
		<html:option  value="Mato Grosso">Mato Grosso</html:option>
		<html:option  value="Mato Grosso do Sul">Mato Grosso do Sul</html:option>
		<html:option  value="Minas Gerais">Minas Gerais</html:option> 
		<html:option  value="Par�">Par�</html:option>
		<html:option  value="Para�ba">Para�ba</html:option> 
		<html:option  value="Paran�">Paran�</html:option>
		<html:option  value="Pernambuco">Pernambuco</html:option>
		<html:option  value="Piau�">Piau�</html:option>
		<html:option  value="Rio de Janeiro">Rio de Janeiro</html:option>
		<html:option  value="Rio Grande do Norte">Rio Grande do Norte</html:option>
		<html:option  value="Rio Grande do Sul">Rio Grande do Sul</html:option>
		<html:option  value="Rond�nia">Rond�nia</html:option>
		<html:option  value="Roraima">Roraima</html:option>
		<html:option  value="Santa Catarina">Santa Catarina</html:option>
		<html:option  value="S�o Paulo">S�o Paulo</html:option>
		<html:option  value="Sergipe">Sergipe</html:option> 
		<html:option  value="Tocantins">Tocantins</html:option>
	</html:select>
    </td>
	<td valign="middle" class="valida_form"><html:errors  property="erro.vcEstadoAssinante" /></td>   
</tr>
<tr>   
    <td valign="middle" class="form_nome">Pa�s:</td>   
    <td valign="middle"><html:text name="Assinante" property="pais" styleClass="form_campo_nome" /></td>
	<td valign="middle" class="valida_form"></td>   
</tr>
<tr>   
    <td valign="middle" class="form_nome">CEP:</td>   
    <td valign="middle"><html:text name="Assinante" property="cep" styleClass="form_campo_nome" /></td>
	<td valign="middle" class="valida_form"></td>   
</tr>

<tr>   
    <td valign="middle" class="form_nome">Telefone (DD-XXXX-XXXX):</td>   
    <td valign="middle"><html:text name="Assinante" property="phoneNumber" styleClass="form_campo_nome" /></td>
	<td valign="middle" class="valida_form"></td>   
</tr>
<tr>   
    <td valign="middle" class="form_nome">Celular (DD-XXXX-XXXX):</td>   
    <td valign="middle"><html:text name="Assinante" property="cellPhoneNumber" styleClass="form_campo_nome" /></td>
	<td valign="middle" class="valida_form"></td>   
</tr>
<tr>   
    <td valign="middle" class="form_nome">Nacionalidade:</td>   
    <td valign="middle"><html:text name="Assinante" property="nacionalidade" styleClass="form_campo_nome" /></td>
	<td valign="middle" class="valida_form"></td>   
</tr>
<tr>   
    <td valign="middle" class="form_nome">URL do assinante:</td>   
    <td valign="middle">http://www.esseecraque.com.br/<html:text name="Assinante" property="username" readonly="true" styleClass="form_campo_path" /></td>
	<td valign="middle" class="valida_form"><html:errors  property="erro.vcUsername" /></td>   
</tr>
<input type="hidden" name="opcao_cadastro" value="1"/>
</table>   
<html:button property="" onclick="javascript:submitUser();">Submeter</html:button>  
</html:form>
</dt>
<dt class="desc_player">
			
			</dt>
			<dt id="ultimos_videos">
<!-- IN�CIO GALERIA �LTIMOS V�DEOS -->
<img src="/eec/_imgs/ultimos_videos.jpg" />

<div id="image-gallery-wrapper">
	<script type="text/javascript">
	stepcarousel.setup({
		galleryid: 'image-gallery', //id of carousel DIV
		beltclass: 'belt', //class of inner "belt" DIV containing all the panel DIVs
		panelclass: 'panel', //class of panel DIVs each holding content
		panelbehavior: {speed:500, wraparound:true, persist:true},
		defaultbuttons: {enable: false},
		statusvars: ['statusA', 'statusB', 'statusC'], //register 3 variables that contain current panel (start), current panel (last), and total panels
		contenttype: ['external'] //content setting ['inline'] or ['external', 'path_to_external_file']
	})
	
	</script>
	
<div id="image-gallery" class="stepcarousel">

	<div class="belt">
	<jsp:include page="/ultimosVideos.html" />
	</div>

	<a class="prev" href="javascript:stepcarousel.stepBy('image-gallery', -5)">Prev</a>
	<a class="next" href="javascript:stepcarousel.stepBy('image-gallery', 5)">Next</a>
</div>

<!-- FIM GALERIA �LTIMOS V�DEOS -->
			</dt>
			
			<dt class="banner2"><img src="/eec/_imgs/bannergrande.jpg" class="linkado"/><img src="/eec/_imgs/txt_pub.jpg" /></dt>
		</div>


<div id="direita">
			
<!-- INCLUDE DOS V�DEOS LATERAIS -->

<jsp:include page="/buscaAvancada.jsp" />

<!-- INCLUDE DOS V�DEOS LATERAIS -->
			
			<dt class="banner"><img src="/eec/_imgs/banner.jpg" class="linkado"/></dt>
			<dt><img src="/eec/_imgs/txt_pub.jpg" style="margin-bottom:6px;" /></dt>
			<dt><img src="/eec/_imgs/banner_redondo.jpg" class="linkado" /></dt>
		</div>
	</div>
</div>
<jsp:include page="/rodape.jsp" />


</body>   
</html>