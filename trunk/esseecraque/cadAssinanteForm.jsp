<%@ taglib uri="WEB-INF/TLD/struts-bean.tld" prefix="bean" %>   
<%@ taglib uri="WEB-INF/TLD/struts-html.tld" prefix="html" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
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
<html:form action="loginAssinante.do?act=login" focus="email">
<div id="menu">
	<dt>
		<span></span>
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
				
          <td width="56" height="25" class="txt_logs">&nbsp;&nbsp;&nbsp;&nbsp;Login:</td>
				
          <td width="118"><dt class="box_log"><html:text property="email" styleClass="txt_logar" /></dt></td>
				
          <td width="30"><img src="_imgs/setinha_login.jpg" width="23" height="25" /></td>
			  </tr>
			  <tr> 
				<td height="10"></td>
				<td colspan="2"></td>
			  </tr>
			  <tr> 
				
          <td width="56" height="25" class="txt_logs">&nbsp;&nbsp;&nbsp;&nbsp;Senha:</td>
				<td><dt class="box_log"><html:password property="password" styleClass="txt_logar" /></dt></td>
				
          <td><img src="_imgs/setinha_login.jpg" width="23" height="25" /></td>
			  </tr>
			  <tr> 
				<td height="55" colspan="3"> <table width="204" height="55" border="0" cellpadding="0" cellspacing="0">
              <tr> 
					  
                <td width="164"> 
                  <table width="164" border="0" cellpadding="0" cellspacing="0">
						  <tr> 
							<td width="187" class="txt_logs2" height="22">&nbsp;&nbsp;&nbsp;&nbsp;Esqueci minha senha!</td>
						  </tr>
						  <tr> 
							<td class="txt_logs2">&nbsp;&nbsp;&nbsp;&nbsp;<html:link page="/cadAssinanteForm.do" styleClass="link_logs2">Ainda n&atilde;o sou cadastrado.</html:link></td>
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

<html:form action="cadAssinante.do?act=add" focus="email" onsubmit="return validateAssinanteForm(this)">   
<table border="0" cellpadding="0" cellspacing="0">
<tr>   
    <td valign="middle" class="form_nome">E-mail:</td>   
    <td valign="middle"><html:text property="email" styleClass="form_campo_nome" /></td>
	<td valign="middle" class="valida_form"><html:errors property="erro.vcEmailAssinante"  /></td>   
</tr>   
<tr>   
    <td valign="middle" class="form_nome">Senha:</td>   
    <td valign="middle"><html:password property="password" styleClass="form_campo_nome" /></td>
	<td valign="middle" class="valida_form"><html:errors  property="erro.vcPasswordAssinante" /></td>   
</tr>
<tr>   
    <td valign="middle" class="form_nome">Confirmar Senha:</td>   
    <td valign="middle"><html:password property="confPassword" styleClass="form_campo_nome" /></td>
	<td valign="middle" class="valida_form"><html:errors  property="erro.vcConfPasswordAssinante" /></td>   
</tr>
<tr>   
    <td valign="middle" class="form_nome">Nome:</td>   
    <td valign="middle"><html:text property="nome" styleClass="form_campo_nome" /></td>
	<td valign="middle" class="valida_form"><html:errors  property="erro.vcNomeAssinante" /></td>   
</tr>
<tr>   
    <td valign="middle" class="form_nome">CPF:</td>   
    <td valign="middle"><html:text property="cpf" styleClass="form_campo_nome" /></td>
	<td valign="middle" class="valida_form"><html:errors  property="erro.vcCPFAssinante" /></td>   
</tr>
<tr>   
    <td valign="middle" class="form_nome">Endereço:</td>   
    <td valign="middle"><html:text property="endereco" styleClass="form_campo_nome" /></td>
	<td valign="middle" class="valida_form"><html:errors  property="erro.vcEnderecoAssinante" /></td>   
</tr>
<tr>   
    <td valign="middle" class="form_nome">Cidade:</td>   
    <td valign="middle"><html:text property="cidade" styleClass="form_campo_nome" /></td>
	<td valign="middle" class="valida_form"><html:errors  property="erro.vcCidadeAssinante" /></td>   
</tr>
<tr>   
    <td valign="middle" class="form_nome">Estado:</td>   
    <td valign="middle"><html:text property="estado" styleClass="form_campo_nome" /></td>
	<td valign="middle" class="valida_form"><html:errors  property="erro.vcEstadoAssinante" /></td>   
</tr>        
</table>   
<html:submit styleClass="botao"><bean:message key="botao.submit"/>
</html:submit>
<html:javascript formName="AssinanteForm" dynamicJavascript="true" staticJavascript="true" />   
</html:form>

<br />
<html:link page="/home.jsp" styleClass="menu_topo">Voltar para home</html:link>
<br />

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