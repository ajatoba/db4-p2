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
		<div id="genericas">
<div id="top_genericas">
<div id="tit_anuncie"></div>

</div>

			<div id="conteudo_genericas">
<div class="txt_genericas">
Para ver o perfil completo de um jogador você precisa estar logado.<br />
<br />
Utilize os campos localizados no topo do site para se logar.<br />
<br />
Caso ainda não tenha um login e senha, efetue seu cadastro.
</div>
</div>

</div>

			
			




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
<jsp:include page="rodape.jsp" />


</body>   
</html>