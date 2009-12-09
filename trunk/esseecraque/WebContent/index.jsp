<%@ taglib uri="/TLD/struts-bean.tld" prefix="bean" %>   
<%@ taglib uri="/TLD/struts-html.tld" prefix="html" %>
<%@ taglib uri="/TLD/struts-logic.tld" prefix="logic" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>      
<title><bean:message key="titulo.paginas"/></title>
<link href="http://dev2.esseecraque.com.br/eec/_css/estilo.css" rel="stylesheet" type="text/css">
<link href="/eec/_css/slide.css"  rel="stylesheet" type="text/css">
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

			

			<table border="0" cellpadding="0" cellspacing="0" align="center">
				<tr>
					<td>
						<span class="txtMsg">		
						<logic:present name="mensagem_erro">				  			
				  			<font color="red"><bean:write name="mensagem_erro"/></font>
				  		</logic:present>
				  		<logic:present name="mensagem_sucesso">				  			
				  			<font color="red"><bean:write name="mensagem_sucesso"/></font>
				  		</logic:present>
						</span>
					</td>
				</tr>
			</table>

	<div id="flash_home"></div>
			

<!-- INÍCIO GALERIA ÚLTIMOS VÍDEOS -->

<div id="ultimos_videos">
<div id="top_ultimos_videos"></div>
<!--THUMBS-->
<div id="lista_videos">
<div class="box_videos">
<dt class="thumb"><img src="/eec/_imgs/foto.jpg" width="128" height="87" /></dt>
<dt class="desc_video">
<span class="data_thumb">29/05/2008</span>&nbsp;<span class="txt_thumb">-&nbsp;Gols de Ziggy "O Cara" dos gols mais bonitos da pelada...</span>
</dt>
<div class="thumb_no_over" onmouseover="this.className='thumb_over';" onmouseout="this.className='thumb_no_over';"></div>
</div>

<div class="box_videos2">
<dt class="thumb"><img src="/eec/_imgs/foto.jpg" width="128" height="87" /></dt>
<dt class="desc_video">
<span class="data_thumb">29/05/2008</span>&nbsp;<span class="txt_thumb">-&nbsp;Gols de Ziggy "O Cara" dos gols mais bonitos da pelada...</span>
</dt>
<div class="thumb_no_over" onmouseover="this.className='thumb_over';" onmouseout="this.className='thumb_no_over';"></div>
</div>
<div class="box_videos2">
<dt class="thumb"><img src="/eec/_imgs/foto.jpg" width="128" height="87" /></dt>
<dt class="desc_video">
<span class="data_thumb">29/05/2008</span>&nbsp;<span class="txt_thumb">-&nbsp;Gols de Ziggy "O Cara" dos gols mais bonitos da pelada...</span>
</dt>
<div class="thumb_no_over" onmouseover="this.className='thumb_over';" onmouseout="this.className='thumb_no_over';"></div>
</div>
<div class="box_videos2">
<dt class="thumb"><img src="/eec/_imgs/foto.jpg" width="128" height="87" /></dt>
<dt class="desc_video">
<span class="data_thumb">29/05/2008</span>&nbsp;<span class="txt_thumb">-&nbsp;Gols de Ziggy "O Cara" dos gols mais bonitos da pelada...</span>
</dt>
<div class="thumb_no_over" onmouseover="this.className='thumb_over';" onmouseout="this.className='thumb_no_over';"></div>
</div>
</div>
<!---->

</div>

<!-- FIM GALERIA ÚLTIMOS VÍDEOS -->
			


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
		
<!-- INCLUDE DOS VÍDEOS LATERAIS -->

<jsp:include page="busca.jsp" />

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
<div id="rodape">
	<div class="rodape_in">
		<div class="rod_esq">
			<span>Ajuda</span> <br>
			Dúvidas mais frequentes &nbsp;|&nbsp;
			Como publicar um vídeo &nbsp;|&nbsp;
			Fale conosco
			<dt><img src="/eec/_imgs/ico_okt.jpg" class="ico" /><img src="/eec/_imgs/ico_face.jpg" class="ico" /><img src="/eec/_imgs/ico_rss.jpg" class="ico" /></dt>		
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