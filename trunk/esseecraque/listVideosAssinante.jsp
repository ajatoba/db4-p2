<%@ taglib uri="/WEB-INF/TLD/struts-bean.tld" prefix="bean" %>   
<%@ taglib uri="/WEB-INF/TLD/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/TLD/struts-logic.tld" prefix="logic" %>
<%@page import="java.text.SimpleDateFormat" %>

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
		<dt class="box_busca">
				<form action="busca.do?act=busca" method="post">
					<div class="sep_busca"></div>
					<div class="txt_busca">
						<input type="text" name="busca" Class="txt_buscar" />
					</div>
					<div class="btn_busca">
						<input type="image" src="/eec/_imgs/btnbusca.jpg" name="Submit" Class="linkado" />
					</div>
				</form>
			</dt>
<table border="0" cellspacing="3" cellpadding="3">
	<logic:notEmpty name="VideosAssinante">
		<logic:iterate id="v" name="VideosAssinante">
			<tr>
				<td>
					<table class="table_videos">
						<tr>
							<td width="540">
								<a href="player.do?act=playerVideo&idVideo=<bean:write name='v' property='id' />&secao=liberada" >
									<img src="<bean:write name='v' property='pathImage' />" width="100" height="73" border="0"/>
								</a>
							</td>
						</tr>
						<tr>
							<td class="data"><bean:write name="v" property="dataUpload" format="dd/MM/yyyy" /></td>
						</tr>
						<tr>
							<td class="desc"><bean:write name="v" property="title" /></td>
						</tr>
					</table>
				</td>
			</tr>
		</logic:iterate>
	</logic:notEmpty>
	<logic:empty name="VideosAssinante">  
       	<tr>  
	       	<td>Nenhum vídeo encontrado para esse assinante.</td>  
        </tr>
		<tr>  
        	<td>&nbsp;</td>  
        </tr>
		<tr>  
            <td>&nbsp;</td>  
        </tr>    
    </logic:empty>
</table>
</div>
<div id="direita">
			
<!-- INCLUDE DOS VÍDEOS LATERAIS -->

<jsp:include page="perfil.jsp" />

<!-- INCLUDE DOS VÍDEOS LATERAIS -->
			
			<dt class="banner"><img src="/eec/_imgs/banner.jpg" class="linkado"/></dt>
			<dt><img src="/eec/_imgs/txt_pub.jpg" style="margin-bottom:6px;" /></dt>
			<dt><img src="/eec/_imgs/banner_redondo.jpg" class="linkado" /></dt>
		</div>
	</div>
</div>
<jsp:include page="rodape.jsp" />
</body>   
</html>
</body>   
</html>