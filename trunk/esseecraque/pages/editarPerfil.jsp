<%@ taglib uri="/WEB-INF/TLD/struts-bean.tld" prefix="bean" %>   
<%@ taglib uri="/WEB-INF/TLD/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/TLD/struts-logic.tld" prefix="logic" %>
<%@page import="java.text.SimpleDateFormat" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>      
<title><bean:message key="titulo.paginas"/></title>
<link href="/eec/_css/estilo.css" rel="stylesheet" type="text/css">
<link href="/eec/_css/minha_conta.css" rel="stylesheet" type="text/css">
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
<dt class="box_busca">
				<div class="sep_busca"></div>
				<div class="txt_busca"><input name="busca" type="text" class="txt_buscar" /></div>
				<div class="btn_busca"><img src="/eec/_imgs/btnbusca.jpg" class="linkado"/></div>
			</dt>
<!-- IN�CIO FORM DE EDI��O DO ASSINANTE -->
<div id="dados_conta">
<html:form action="editAssinante.do?act=edit" focus="VC_EMAIL_ASSINANTE" onsubmit="return validateAssinanteForm(this)">
<html:hidden name="Assinante" property="id" />   
<table border="0" cellpadding="3" cellspacing="3">
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
    <td valign="middle"><html:text name="Assinante" property="estado" styleClass="form_campo_nome" /></td>
	<td valign="middle" class="valida_form"><html:errors  property="erro.vcEstadoAssinante" /></td>   
</tr>
<tr>   
    <td valign="middle" class="form_nome">URL do assinante:</td>   
    <td valign="middle">http://www.esseecraque.com.br/<html:text property="username" styleClass="form_campo_path" /></td>
	<td valign="middle" class="valida_form"><html:errors  property="erro.vcUsername" /></td>   
</tr>      
</table>
<html:hidden name="Assinante" property="dataCadastro" />   
<html:submit styleClass="botao"><bean:message key="botao.submit"/>
</html:submit>  
</html:form>  
</div>
			<!-- FIM FORM DE EDI��O DE ASSINANTE -->

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
		<div class="panel">
			<a href="#" title="Link 1" >
				<img src="/eec/_imgs/img_videos.jpg" width="100" height="73" border="0" alt="Imagem 1" class="imgs" />
			</a>
		</div>
		<div class="panel">
			<a href="#" title="Link 2" >
				<img src="/eec/_imgs/img_videos.jpg" width="100" height="73" border="0" alt="Imagem 2" class="imgs" />
			</a>
		</div>
		<div class="panel">
			<a href="#" title="Link 3" >
				<img src="/eec/_imgs/img_videos.jpg" width="100" height="73" border="0" alt="Imagem 3" class="imgs" />
			</a>
		</div>
		<div class="panel">
			<a href="#" title="Link 4" >
				<img src="/eec/_imgs/img_videos.jpg" width="100" height="73" border="0" alt="Imagm 4" class="imgs" />
			</a>
		</div>
		<div class="panel">
			<a href="#" title="Link 5" >
				<img src="/eec/_imgs/img_videos.jpg" width="100" height="73" border="0" alt="Imagem 5" class="imgs" />
			</a>
		</div>
		<div class="panel">
			<a href="#" title="Link 6" >
				<img src="/eec/_imgs/img_videos.jpg" width="100" height="73" border="0" alt="Imagem 6" class="imgs" />
			</a>
		</div>
		<div class="panel">
			<a href="#" title="Link 7" >
				<img src="/eec/_imgs/img_videos.jpg" width="100" height="73" border="0" alt="Imagem 7" class="imgs" />
			</a>
		</div>
				<div class="panel">
			<a href="#" title="Link 8" >
				<img src="/eec/_imgs/img_videos.jpg" width="100" height="73" border="0" alt="Imagem 8" class="imgs" />
			</a>
		</div>
		<div class="panel">
			<a href="#" title="Link 9" >
				<img src="/eec/_imgs/img_videos.jpg" width="100" height="73" border="0" alt="Imagem 9" class="imgs" />
			</a>
		</div>
		<div class="panel">
			<a href="#" title="Link 10" >
				<img src="/eec/_imgs/img_videos.jpg" width="100" height="73" border="0" alt="Imagem 10" class="imgs" />
			</a>
		</div>
		<div class="panel">
			<a href="#" title="Link 11" >
				<img src="/eec/_imgs/img_videos.jpg" width="100" height="73" border="0" alt="Imagm 11" class="imgs" />
			</a>
		</div>
		<div class="panel">
			<a href="#" title="Link 12" >
				<img src="/eec/_imgs/img_videos.jpg" width="100" height="73" border="0" alt="Imagem 12" class="imgs" />
			</a>
		</div>
		<div class="panel">
			<a href="#" title="Link 13" >
				<img src="/eec/_imgs/img_videos.jpg" width="100" height="73" border="0" alt="Imagem 13" class="imgs" />
			</a>
		</div>
		<div class="panel">
			<a href="#" title="Link 14" >
				<img src="/eec/_imgs/img_videos.jpg" width="100" height="73" border="0" alt="Imagem 14" class="imgs" />
			</a>
		</div>
		<div class="panel">
			<a href="#" title="Link 15" >
				<img src="/eec/_imgs/img_videos.jpg" width="100" height="73" border="0" alt="Imagem 15" class="imgs" />
			</a>
		</div>
	</div>
</div>
	<a class="prev" href="javascript:stepcarousel.stepBy('image-gallery', -5)">Prev</a>
	<a class="next" href="javascript:stepcarousel.stepBy('image-gallery', 5)">Next</a>
</div>

<!-- FIM GALERIA �LTIMOS V�DEOS -->
			</dt>
			<dt id="mais_votados">
				<div class="seta"><img src="/eec/_imgs/seta_tras.jpg" /></div>
				<div class="imgs"><img src="/eec/_imgs/img_videos.jpg" /></div>
				<div class="imgs"><img src="/eec/_imgs/img_videos.jpg" /></div>
				<div class="imgs"><img src="/eec/_imgs/img_videos.jpg" /></div>
				<div class="imgs"><img src="/eec/_imgs/img_videos.jpg" /></div>
				<div class="imgs"><img src="/eec/_imgs/img_videos.jpg" /></div>
				<div class="seta2"><img src="/eec/_imgs/seta_frente.jpg" /></div>			
			</dt>
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