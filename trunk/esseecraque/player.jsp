<%@ taglib uri="WEB-INF/TLD/struts-bean.tld" prefix="bean" %>   
<%@ taglib uri="WEB-INF/TLD/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/TLD/struts-logic.tld" prefix="logic" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>      
<title><bean:message key="titulo.paginas"/></title>
<link href="<html:rewrite page="/_css/estilo.css" />" rel="stylesheet" type="text/css">
<link href="<html:rewrite page="/_css/slide.css" />" rel="stylesheet" type="text/css">
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
			<dt class="box_busca">
				<div class="sep_busca"></div>
				<div class="txt_busca"><input name="busca" type="text" class="txt_buscar" /></div>
				<div class="btn_busca"><img src="_imgs/btnbusca.jpg" class="linkado"/></div>
			</dt>
			<dt class="player">
<!-- INICIO PLAYER -->

	<embed allowFullScreen="true"src="player.swf?movie=<bean:write name='Video' property='realPath' />&autoplay=off" quality="high"bgcolor="#000000" width="640" height="419"align="middle" allowScriptAccess="sameDomain"type="application/x-shockwave-flash" />

<!-- FIM PLAYER -->			
			</dt>
			<dt class="desc_player">
				<div class="dir_desc">
					<div class="data_pl"><bean:write name='Video' property='dataUpload' format="dd/MM/yyyy" /></div>
					<div class="desc_pl"><bean:write name='Video' property='title' /></div>
					<div class="data_pl">Compartilhar o v�deo (copie e cole a URL)</div>
					<div class="fundo_desc"><bean:write name='Video' property='url' /></div>
				</div>
				<div class="meio_desc">
					<div><img src="_imgs/votar.jpg" class="linkado"/></div>
					<div><img src="_imgs/ver_perfil.jpg" class="mgn5_linkado"/></div>
				</div>
				<div class="esq_desc">
					<div>Dispon�vel para contrata��o</div>
				</div>
			</dt>
			<dt id="ultimos_videos">

<!-- IN�CIO GALERIA �LTIMOS V�DEOS -->

<img src="_imgs/ultimos_videos.jpg" />

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

<logic:iterate id="uv" name="UltimosVideos">
		<div class="panel">
			<a href="player.do?act=playerVideo&idVideo=<bean:write name='uv' property='id' />&secao=liberada" >
				<img src="<bean:write name='uv' property='pathImage' />" width="100" height="73" border="0" alt="<bean:write name='uv' property='title' />" class="imgs" />
			</a>
		</div>
</logic:iterate>

	</div>
</div>
	<a class="prev" href="javascript:stepcarousel.stepBy('image-gallery', -5)">Prev</a>
	<a class="next" href="javascript:stepcarousel.stepBy('image-gallery', 5)">Next</a>
</div>

<!-- FIM GALERIA �LTIMOS V�DEOS -->
			</dt>
<!-- INICIO DA GALERIA V�DEOS MAIS VOTADOS -->
			<dt id="mais_votados">
				<div class="seta"><img src="_imgs/seta_tras.jpg" /></div>
				<div class="imgs"><img src="_imgs/img_videos.jpg" /></div>
				<div class="imgs"><img src="_imgs/img_videos.jpg" /></div>
				<div class="imgs"><img src="_imgs/img_videos.jpg" /></div>
				<div class="imgs"><img src="_imgs/img_videos.jpg" /></div>
				<div class="imgs"><img src="_imgs/img_videos.jpg" /></div>
				<div class="seta2"><img src="_imgs/seta_frente.jpg" /></div>			
			</dt>
			<dt class="banner2"><img src="_imgs/bannergrande.jpg" class="linkado"/><img src="_imgs/txt_pub.jpg" /></dt>
		</div>
		<div id="direita">
			<div id="lists">
<img src="_imgs/btn_videos.jpg" class="linkado"/><img src="_imgs/btn_usuarios.jpg" class="linkado"/><img src="_imgs/btn_canais.jpg" class="linkado"/><div class="nav">
					<div class="nav_esq"><img src="_imgs/nav_esq.jpg" /></div>
					<div class="nav1">P�g. </div>
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
			D�vidas mais frequentes &nbsp;|&nbsp;
			Como publicar um v�deo &nbsp;|&nbsp;
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
	Acordo de utiliza��o &nbsp;|&nbsp;
	Anuncie &nbsp;|&nbsp;
	Desenvolvedores &nbsp;|&nbsp;
	Comunidade no orkut &nbsp;|&nbsp;
	Rss Feed &nbsp;|&nbsp;
	Adicionar a Del.icio.us &nbsp;|&nbsp;
	Download Logo
</div>


</body>   
</html>