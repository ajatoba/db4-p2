<%@ taglib uri="/WEB-INF/TLD/struts-bean.tld" prefix="bean" %>   
<%@ taglib uri="/WEB-INF/TLD/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/TLD/struts-logic.tld" prefix="logic" %>
<%@page import="java.text.SimpleDateFormat" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>      
<title><bean:message key="titulo.paginas"/></title>
<link href="/eec/_css/estilo.css" rel="stylesheet" type="text/css">
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
			<!-- INÍCIO LISTA MEUS VÍDEOS -->

<br />
<bean:message key="pergunta.excluir.video" />
<br />
<br />

<img src="<bean:write name='session_video_excluir' property='pathImage' />" />
<div class="data"><bean:write name="session_video_excluir" property="dataUpload" format="dd/MM/yyyy" /></div>
<div class="desc"><bean:write name="session_video_excluir" property="title" /></div>

<br />

<h3>
<html:link page="/excluirVideoSim.do?act=excluir" styleClass="menu_topo">Sim</html:link> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <html:link page="/listMeusVideos.do?act=list" styleClass="menu_topo">Não</html:link>
</h3>
					
			<!-- FIM LISTA MEUS VÍDEOS -->

<br />
<br />
<html:link page="/valtarHome.do" styleClass="menu_topo">Voltar para home</html:link>
<br />
<br />
<br />

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