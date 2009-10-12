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
					<div><a href="votar.do"><img src="_imgs/votar.jpg" class="linkado" border="0" /></a></div>
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
			<!-- INCLUDE DOS V�DEOS LATERAIS -->

<jsp:include page="buscaAvancada.jsp" />

<!-- INCLUDE DOS V�DEOS LATERAIS -->	
			<dt class="banner"><img src="_imgs/banner.jpg" class="linkado"/></dt>
			<dt><img src="_imgs/txt_pub.jpg" style="margin-bottom:6px;" /></dt>
			<dt><img src="_imgs/banner_redondo.jpg" class="linkado" /></dt>
		</div>
	</div>
</div>
<jsp:include page="rodape.jsp" />


</body>   
</html>