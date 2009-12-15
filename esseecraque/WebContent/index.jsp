<%@ taglib uri="/TLD/struts-bean.tld" prefix="bean" %>   
<%@ taglib uri="/TLD/struts-html.tld" prefix="html" %>
<%@ taglib uri="/TLD/struts-logic.tld" prefix="logic" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>      
<title><bean:message key="titulo.paginas"/></title>
<link href="/eec/_css/estilo.css" rel="stylesheet" type="text/css">
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
	<div id="lista_videos">
	
	<!-- THUMBS VIDEOS -->
	<%@ include file="ultimos_videos.html" %>
	<!-- ************* -->
	</div>

</div>
<!---->
<dt class="banner2"><img src="/eec/_imgs/bannergrande.jpg" class="linkado"/><img src="/eec/_imgs/txt_pub.jpg" /></dt>
</div>

<!-- FIM GALERIA ÚLTIMOS VÍDEOS -->
			


			
		
		
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