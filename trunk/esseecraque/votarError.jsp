<%@ taglib uri="/WEB-INF/TLD/struts-bean.tld" prefix="bean" %>   
<%@ taglib uri="/WEB-INF/TLD/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/TLD/struts-logic.tld" prefix="logic" %>
<%@page import="java.text.SimpleDateFormat" %>

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
<!--INCLUDE DO MENU-->
<jsp:include page="topo.jsp" />

<!--FIM INCLUDE DO MENU-->


<div id="meio_fundo">
	<div id="meio">
		<div id="esquerda">
			<!-- VOTAR -->
			<br />
			<table border="0" cellpadding="0" cellspacing="0">
				<tr>
					<td><img src="_imgs/iconeErro.jpg" /></td>
					<td>&nbsp;</td>
					<td><span class="txtMsg"><bean:message key="msg.add.erro.voto" /></span></td>
				</tr>
			</table>

			<br />
			<br />
			Que nota você dá para esse vídeo?
			<br />
			
			<table border="0">
				<tr>
					<td>
						<form action="votarAdd.do?act=votarAdd" method="Post">
							<input type="hidden" name="idVideo" value="<bean:write name='Video' property='id' />" />
							<input type="hidden" name="nota" value="1" />
							<input type="submit" name="Submit" value="(1)" />
						</form>
					</td>
					<td>
						<form action="votarAdd.do?act=votarAdd" method="Post">
							<input type="hidden" name="idVideo" value="<bean:write name='Video' property='id' />" />
							<input type="hidden" name="nota" value="2" />
							<input type="submit" name="Submit" value="(2)" />
						</form>
					</td>
					<td>
						<form action="votarAdd.do?act=votarAdd" method="Post">
							<input type="hidden" name="idVideo" value="<bean:write name='Video' property='id' />" />
							<input type="hidden" name="nota" value="3" />
							<input type="submit" name="Submit" value="(3)" />
						</form>
					</td>
					<td>
						<form action="votarAdd.do?act=votarAdd" method="Post">
							<input type="hidden" name="idVideo" value="<bean:write name='Video' property='id' />" />
							<input type="hidden" name="nota" value="4" />
							<input type="submit" name="Submit" value="(4)" />
						</form>
					</td>
					<td>
						<form action="votarAdd.do?act=votarAdd" method="Post">
							<input type="hidden" name="idVideo" value="<bean:write name='Video' property='id' />" />
							<input type="hidden" name="nota" value="5" />
							<input type="submit" name="Submit" value="(5)" />
						</form>
					</td>
				</tr>
			</table>


			<table>
				<tr>
					<td><img src="<bean:write name="Video" property="pathImage" />" /></td>
				</tr>
				<tr>
					<td class="data"><bean:write name="Video" property="dataUpload" format="dd/MM/yyyy" /></td>
				</tr>
				<tr>
					<td class="desc"><bean:write name="Video" property="title" /></td>
				</tr>
			</table>
					
			<!-- VOTAR -->

<br />
<br />
<html:link page="/valtarHome.do" styleClass="menu_topo">Voltar para home</html:link>
&nbsp;&nbsp;&nbsp;
<a Class="menu_topo" href="player.do?act=playerVideo&idVideo=<bean:write name='Video' property='id' />&secao=liberada" >Visualizar o vídeo novamente</a>
<br />
<br />
<br />

			<dt class="banner2"><img src="_imgs/bannergrande.jpg" class="linkado"/><img src="_imgs/txt_pub.jpg" /></dt>
		</div>
		<div id="direita">
			
			<!--INCLUDE LISTAGEM DE VIDEOS-->
			<jsp:include page="videosLaterais.jsp" />
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