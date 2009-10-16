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
<!-- INCLUDE HOME -->

<jsp:include page="topo.jsp" />

<!-- INCLUDE HOME -->
<div id="meio_fundo">
	<div id="meio">
		<div id="esquerda">
		<dt class="box_busca">
				<form action="busca.do?act=busca" method="post">
					<div class="sep_busca"></div>
					<div class="txt_busca">
						<input type="text" name="busca" Class="txt_buscar" />
					</div>
					<div class="btn_busca">
						<input type="image" src="_imgs/btnbusca.jpg" name="Submit" Class="linkado" />
					</div>
				</form>
			</dt>
<table border="0" cellspacing="3" cellpadding="3">
	<logic:notEmpty name="AssinanteLetra">
 		<logic:iterate id="a" name="AssinanteLetra">
			<form action="listVideosAssinante.do?act=listVideosAssinante" method="post">
				<input type="hidden" name="id" value="<bean:write name='a' property='id' />" />
				<tr>
					<td>
						<table>
							<tr>
								<td><bean:write name="a" property="nome" /></td>
							</tr>
							<tr>
								<td class="data"><input type="submit" value="ver vídeos" name="Submit" styleClass="linkado" /></td>
							</tr>
						</table>
					</td>
				</tr>
			</form>
		</logic:iterate>
	</logic:notEmpty>
	<logic:empty name="AssinanteLetra">  
			<tr>  
            	<td>&nbsp;</td>  
            </tr>
			<tr>  
            	<td><bean:message key="msg.nenhum.assinante"/></td>  
            </tr>    
    </logic:empty>
</table>
</div>
<div id="direita">
			
<!-- INCLUDE DOS VÍDEOS LATERAIS -->

<jsp:include page="buscaAvancada.jsp" />

<!-- INCLUDE DOS VÍDEOS LATERAIS -->
			
			<dt class="banner"><img src="_imgs/banner.jpg" class="linkado"/></dt>
			<dt><img src="_imgs/txt_pub.jpg" style="margin-bottom:6px;" /></dt>
			<dt><img src="_imgs/banner_redondo.jpg" class="linkado" /></dt>
		</div>
	</div>
</div>
<jsp:include page="rodape.jsp" />
</body>   
</html>