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
<html:form action="loginAssinante.do?act=login" focus="email">
<div id="menu">
	<dt>
		<span><bean:write name="Assinante" property="nome" /> ></span>
		<html:link page="/listMeusVideos.do?act=list" styleClass="menu_topo">Meus vídeos</html:link>
		<label class="link_principal">&nbsp;|&nbsp;</label>
		<html:link page="/minhaConta.do" styleClass="menu_topo">Minha conta</html:link>
		<label class="link_principal">&nbsp;|&nbsp;</label>
		<html:link page="/editarPerfilForm.do" styleClass="menu_topo">Editar perfil</html:link>
		<label class="link_principal">&nbsp;|&nbsp;</label>
		<html:link page="/cadVideoForm.do" styleClass="menu_topo">Publicar vídeo</html:link>
	</dt>
</div>
<div id="topo">
	<div>
		<dt class="logo"><img src="_imgs/logo.jpg" class="linkado"/></dt>
		<dt class="form"><img src="_imgs/banner_assine.jpg" /></dt>
		<dt class="frm_in">
			
      <table width="204" height="133" border="0" cellpadding="0" cellspacing="0">
        <tr> 
				<td height="18" colspan="3"></td>
			  </tr>
			  <tr> 
				
          <td width="204" height="25" colspan="3" class="txt_logs">&nbsp;&nbsp;&nbsp;&nbsp;Olá, <bean:write name="Assinante" property="nome" /></td>
				
			  </tr>
			  <tr> 
				
          <td width="204" height="25" colspan="3" class="txt_logs">&nbsp;&nbsp;&nbsp;&nbsp;Você possui <bean:write name="qtdVideo" /> vídeos</td>

			  </tr>
			  <tr> 
				<td height="55" colspan="3"> <table width="204" height="55" border="0" cellpadding="0" cellspacing="0">
              <tr> 
					  
                <td width="164"> 
                  <table width="164" border="0" cellpadding="0" cellspacing="0">
						  <tr> 
							<td width="187" class="txt_logs2" height="22">&nbsp;&nbsp;&nbsp;&nbsp;</td>
						  </tr>
						  <tr> 
							<td class="txt_logs2">&nbsp;&nbsp;&nbsp;&nbsp;</td>
						  </tr>
						</table></td>
                <td align="right" valign="bottom"><img src="_imgs/btn_logar.jpg" width="40" height="34" class="linkado" style="border:0px;" /></td>
					</tr>
				  </table></td>
			  </tr>
			</table>
			<div style="width:204px;"><html:image src="_imgs/publicar.jpg" property="Submit" styleClass="linkado" /></div>
		</dt>
	</div>
</div>

</html:form>

<div id="meio_fundo">
	<div id="meio">
		<div id="esquerda">

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
			<div id="lists">
<img src="_imgs/btn_videos.jpg" class="linkado"/><img src="_imgs/btn_usuarios.jpg" class="linkado"/><img src="_imgs/btn_canais.jpg" class="linkado"/><div class="nav">
					<div class="nav_esq"><img src="_imgs/nav_esq.jpg" /></div>
					<div class="nav1">Pág. </div>
					<div class="navega"> <input name="page" type="text" class="box_nav" /> </div>
					<div class="nav2">de 250</div>
					<div class="nav_dir"><img src="_imgs/nav_dir.jpg" /></div>
				</div>
				<div class="atrasOut" onmouseover="this.className='atrasIn';" onmouseout="this.className='atrasOut';">
					<dt class="frente">
						<div class="voto0"><img src="_imgs/img_listas.jpg" /></div>
						<div class="data">09/06/2009 10:26</div>
						<div class="desc">Edson dos Santos em pedala e da show de bola</div>
					</dt>
				</div>
				<div class="atrasOut" onmouseover="this.className='atrasIn';" onmouseout="this.className='atrasOut';">
					<dt class="frente">
						<div class="voto0"><img src="_imgs/img_listas.jpg" /></div>
						<div class="data">09/06/2009 10:26</div>
						<div class="desc">Edson dos Santos em pedala e da show de bola</div>
					</dt>
				</div>
				<div class="atrasOut" onmouseover="this.className='atrasIn';" onmouseout="this.className='atrasOut';">
					<dt class="frente">
						<div class="voto0"><img src="_imgs/img_listas.jpg" /></div>
						<div class="data">09/06/2009 10:26</div>
						<div class="desc">Edson dos Santos em pedala e da show de bola</div>
					</dt>
				</div>
				<div class="atrasOut" onmouseover="this.className='atrasIn';" onmouseout="this.className='atrasOut';">
					<dt class="frente">
						<div class="voto0"><img src="_imgs/img_listas.jpg" /></div>
						<div class="data">09/06/2009 10:26</div>
						<div class="desc">Edson dos Santos em pedala e da show de bola</div>
					</dt>
				</div>
				<div class="atrasOut" onmouseover="this.className='atrasIn';" onmouseout="this.className='atrasOut';">
					<dt class="frente">
						<div class="voto0"><img src="_imgs/img_listas.jpg" /></div>
						<div class="data">09/06/2009 10:26</div>
						<div class="desc">Edson dos Santos em pedala e da show de bola</div>
					</dt>
				</div>
			</div>			
			<dt class="banner"><img src="_imgs/banner.jpg" class="linkado"/></dt>
			<dt><img src="_imgs/txt_pub.jpg" style="margin-bottom:6px;" /></dt>
			<dt><img src="_imgs/banner_redondo.jpg" class="linkado" /></dt>
		</div>
	</div>
</div>
<div id="rodape">
	<div class="rodape_in">
		<div class="rod_esq">
			<span>Ajuda</span> <br>
			Dúvidas mais frequentes &nbsp;|&nbsp;
			Como publicar um vídeo &nbsp;|&nbsp;
			Fale conosco
			<dt><img src="_imgs/ico_okt.jpg" class="ico" /><img src="_imgs/ico_face.jpg" class="ico" /><img src="_imgs/ico_rss.jpg" class="ico" /></dt>		
		</div>
		<div class="rod_dir">
			<span>Sobre</span> <br>
			Lorem Ipsum is simply dummy text of the printing and typesetting 
			industry. Lorem Ipsum has been the industry's standard dummy text
			 ever since the 1500s, when an unknown printer took a galley of
			  type and scrambled it to make a type specimen book. It has survived
			   not only five centuries, but also the leap into electronic typesetting,
			    remaining essentially unchanged. It was popularised in the 1960s
				 with the release of Letraset sheets containing Lorem Ipsum
				  passages, and more recently with desktop publishing software.

			
			
		</div>
	</div>
</div>
<div id="rodape_baixo">
	<span>2009. Todos os direitos reservados</span>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;    
	Acordo de utilização &nbsp;|&nbsp;
	Anuncie &nbsp;|&nbsp;
	Desenvolvedores &nbsp;|&nbsp;
	Comunidade no orkut &nbsp;|&nbsp;
	Rss Feed &nbsp;|&nbsp;
	Adicionar a Del.icio.us &nbsp;|&nbsp;
	Download Logo
</div>


</body>   
</html>