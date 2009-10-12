<%@ taglib uri="/WEB-INF/TLD/struts-bean.tld" prefix="bean" %>   
<%@ taglib uri="/WEB-INF/TLD/struts-html.tld" prefix="html" %>
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
<!--INCLUDE DO MENU-->
<jsp:include page="topo.jsp" />

<!--FIM INCLUDE DO MENU-->


<div id="meio_fundo">
	<div id="meio">
		<div id="esquerda">
			<dt class="box_busca">
				<div class="sep_busca"></div>
				<div class="txt_busca"><input name="busca" type="text" class="txt_buscar" /></div>
				<div class="btn_busca"><img src="_imgs/btnbusca.jpg" class="linkado"/></div>
			</dt>
			<dt class="form_upload">

<html:form action="cadVideo.do?act=add">  

<table>

<tr>   
    <td class="form_nome">Titulo:</td>   
    <td><html:text property="title"/></td>   
</tr>   
<tr>   
    <td class="form_nome">Descricao:</td>   
    <td><html:text property="description"/></td>   
</tr>
<tr>   
    <td class="form_nome">Tags:</td>   
    <td><html:text property="tagVideo"/></td>   
</tr>

<tr>   
    <td colspan="2">
    <html:submit>
    	<bean:message key="botao.submit"/>
	</html:submit>
    
    </td>
</tr>

</table>
</html:form>
            
            </dt>
			
			<dt id="ultimos_videos">
<!-- INÍCIO GALERIA ÚLTIMOS VÍDEOS -->
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
		<div class="panel">
			<a href="#" title="Link 1" >
				<img src="_imgs/img_videos.jpg" width="100" height="73" border="0" alt="Imagem 1" class="imgs" />
			</a>
		</div>
		<div class="panel">
			<a href="#" title="Link 2" >
				<img src="_imgs/img_videos.jpg" width="100" height="73" border="0" alt="Imagem 2" class="imgs" />
			</a>
		</div>
		<div class="panel">
			<a href="#" title="Link 3" >
				<img src="_imgs/img_videos.jpg" width="100" height="73" border="0" alt="Imagem 3" class="imgs" />
			</a>
		</div>
		<div class="panel">
			<a href="#" title="Link 4" >
				<img src="_imgs/img_videos.jpg" width="100" height="73" border="0" alt="Imagm 4" class="imgs" />
			</a>
		</div>
		<div class="panel">
			<a href="#" title="Link 5" >
				<img src="_imgs/img_videos.jpg" width="100" height="73" border="0" alt="Imagem 5" class="imgs" />
			</a>
		</div>
		<div class="panel">
			<a href="#" title="Link 6" >
				<img src="_imgs/img_videos.jpg" width="100" height="73" border="0" alt="Imagem 6" class="imgs" />
			</a>
		</div>
		<div class="panel">
			<a href="#" title="Link 7" >
				<img src="_imgs/img_videos.jpg" width="100" height="73" border="0" alt="Imagem 7" class="imgs" />
			</a>
		</div>
				<div class="panel">
			<a href="#" title="Link 8" >
				<img src="_imgs/img_videos.jpg" width="100" height="73" border="0" alt="Imagem 8" class="imgs" />
			</a>
		</div>
		<div class="panel">
			<a href="#" title="Link 9" >
				<img src="_imgs/img_videos.jpg" width="100" height="73" border="0" alt="Imagem 9" class="imgs" />
			</a>
		</div>
		<div class="panel">
			<a href="#" title="Link 10" >
				<img src="_imgs/img_videos.jpg" width="100" height="73" border="0" alt="Imagem 10" class="imgs" />
			</a>
		</div>
		<div class="panel">
			<a href="#" title="Link 11" >
				<img src="_imgs/img_videos.jpg" width="100" height="73" border="0" alt="Imagm 11" class="imgs" />
			</a>
		</div>
		<div class="panel">
			<a href="#" title="Link 12" >
				<img src="_imgs/img_videos.jpg" width="100" height="73" border="0" alt="Imagem 12" class="imgs" />
			</a>
		</div>
		<div class="panel">
			<a href="#" title="Link 13" >
				<img src="_imgs/img_videos.jpg" width="100" height="73" border="0" alt="Imagem 13" class="imgs" />
			</a>
		</div>
		<div class="panel">
			<a href="#" title="Link 14" >
				<img src="_imgs/img_videos.jpg" width="100" height="73" border="0" alt="Imagem 14" class="imgs" />
			</a>
		</div>
		<div class="panel">
			<a href="#" title="Link 15" >
				<img src="_imgs/img_videos.jpg" width="100" height="73" border="0" alt="Imagem 15" class="imgs" />
			</a>
		</div>
	</div>
</div>
	<a class="prev" href="javascript:stepcarousel.stepBy('image-gallery', -5)">Prev</a>
	<a class="next" href="javascript:stepcarousel.stepBy('image-gallery', 5)">Next</a>
</div>

<!-- FIM GALERIA ÚLTIMOS VÍDEOS -->
			</dt>
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