<%@ taglib uri="WEB-INF/TLD/struts-bean.tld" prefix="bean" %>   
<%@ taglib uri="WEB-INF/TLD/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/TLD/struts-logic.tld" prefix="logic" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>      
<title><bean:message key="titulo.paginas"/></title>
<link href="/eec/_css/estilo.css" rel="stylesheet" type="text/css">
<link href="/eec/_css/slide.css"  rel="stylesheet" type="text/css">
<script type="text/javascript" src="/eec/js/jquery-1.2.6-packed.js"></script>
<script type="text/javascript" src="/eec/js/slide.noconflict.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1"> 
</head>
<body>

<!-- INCLUDE HOME -->

<jsp:include page="topo.jsp" />

<!-- INCLUDE HOME -->

<div id="meio_fundo">
	<div id="meio">
		<div id="esquerda">
			<div id="top_player_videos">
<div id="tit_player_videos"></div>

</div>
			<dt class="player">
<!-- INICIO PLAYER -->
	<logic:equal name="Video" property="status" value="0">
		<bean:message key="video.unavailable"/>
	</logic:equal>
	<logic:equal name="Video" property="status" value="1">
		<embed allowFullScreen="true"src="player.swf?movie=<bean:message key="video.server"/>/<bean:write name='Video' property='url' />&autoplay=off" quality="high"bgcolor="#000000" width="640" height="400"align="middle" allowScriptAccess="sameDomain"type="application/x-shockwave-flash" wmode="transparent" />
	</logic:equal> 
<!-- FIM PLAYER -->			
			</dt>
			<dt class="desc_player">
				<div class="dir_desc">
					<div class="data_pl"><bean:write name='Video' property='dataUpload' format="dd/MM/yyyy" /></div>
					<div class="desc_pl"><bean:write name='Video' property='title' /></div>
					<div class="data_pl"></div>
					<div class="fundo_desc"><bean:write name='Video' property='url' /></div>
				</div>
				<div class="meio_desc">
					<div><img src="/eec/_imgs/ver_perfil.jpg" class="mgn5_linkado"/></div>
					<div></div>
				</div>
				
			</dt>
		<!-- IN�CIO GALERIA �LTIMOS V�DEOS -->

<div id="ultimos_videos">
	<div id="top_ultimos_videos"></div>
	<div id="lista_videos">
	
	<!-- THUMBS VIDEOS -->
	<jsp:include page="ultimos_videos.jsp" />
	<!-- ************* -->
	</div>

</div>
<!---->

			<dt class="banner2"><img src="/eec/_imgs/bannergrande.jpg" class="linkado"/><img src="/eec/_imgs/txt_pub.jpg" /></dt>
		</div>
			<div id="direita">
		
<!--BUSCA SIMPLES-->
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
		


<jsp:include page="busca.jsp" />


						
			<div id="bnn_01"></div>
			<dt><img src="/eec/_imgs/txt_pub.jpg" style="margin-bottom:10px;" /></dt>
			<div id="bnn_02"></div>
			<dt><img src="/eec/_imgs/txt_pub.jpg" style="margin-bottom:10px;" /></dt>
			<div id="bnn_03"></div>
			<dt><img src="/eec/_imgs/txt_pub.jpg" style="margin-bottom:10px;" /></dt>
			<dt><img src="/eec/_imgs/banner_redondo.jpg" class="linkado" /></dt>
		
	</div>
	</div>
</div>
<jsp:include page="rodape.jsp" />


</body>   
</html>