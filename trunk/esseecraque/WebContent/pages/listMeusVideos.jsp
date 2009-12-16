<%@ taglib uri="/WEB-INF/TLD/struts-bean.tld" prefix="bean" %>   
<%@ taglib uri="/WEB-INF/TLD/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/TLD/struts-logic.tld" prefix="logic" %>
<%@page import="java.text.SimpleDateFormat" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>      
<title><bean:message key="titulo.paginas"/></title>
<link href="/eec/_css/estilo.css" rel="stylesheet" type="text/css"/>
<link href="/eec/_css/slide.css" rel="stylesheet" type="text/css"/>
<script type="text/javascript" src="/eec/js/jquery-1.2.6-packed.js"></script>
<script type="text/javascript" src="/eec/js/slide.noconflict.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1"/> 
</head>
<body>
<!--INCLUDE DO MENU-->
<jsp:include page="/topo.jsp" />

<!--FIM INCLUDE DO MENU-->


<div id="meio_fundo">
	<div id="meio">
		<div id="esquerda">
		<div id="top_meus_videos">
<div id="tit_meus_videos"></div>

</div>
			
			<!-- INÍCIO LISTA MEUS VÍDEOS -->
			<table border="0" cellpadding="0" cellspacing="0" align="center">
	<tr>
		<td>
			<span class="txtMsg">		
			<logic:present name="mensagem">
	  			<font color="red"><bean:write name="mensagem"/></font>
	  		</logic:present>
			</span>
		</td>
	</tr>
</table>
	<dt id="meus_videos">
			<table border="0" cellspacing="3" cellpadding="3" class="table_videos">
				<logic:notEmpty name="meusVideos">
					<logic:iterate id="v" name="meusVideos">
					<form action="excluirVideo.do?act=excluirPerg" method="post">
						<tr>
							<td>
								<table>
									<tr>
										<td width="540"><img src="<bean:write name='v' property='pathImage' />" width="100" height="73"/></td>
									</tr>
									<tr>
										<td class="data"><bean:write name="v" property="dataUpload" format="dd/MM/yyyy" /></td>
									</tr>
									<tr>
										<td class="desc"><bean:write name="v" property="title" /></td>
									</tr>
								</table>
							</td>

							<td>
								<input type="hidden" name="id" value="<bean:write name='v' property='id' />" />
								<input type="image" src="/eec/_imgs/icone_excluir.jpg" name="Submit" styleClass="linkado" />
							</td>
						</tr>
					</form>
					</logic:iterate>
				</logic:notEmpty>
				<logic:empty name="meusVideos">  
                	<tr>  
                    	<td>Nenhum vídeo encontrado.</td>  
                    </tr>
					<tr>  
                    	<td>&nbsp;</td>  
                    </tr>
					<tr>  
                    	<td>&nbsp;</td>  
                    </tr>    
                </logic:empty>
			</table>
</dt>					
			<!-- FIM LISTA MEUS VÍDEOS -->

		<!-- INÍCIO GALERIA ÚLTIMOS VÍDEOS -->

<div id="ultimos_videos">
	<div id="top_ultimos_videos"></div>
	<div id="lista_videos">
	
	<!-- THUMBS VIDEOS -->
	<jsp:include page="/ultimos_videos.jsp" />
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
		
<!-- INCLUDE DOS VÍDEOS LATERAIS -->

<jsp:include page="/busca.jsp" />

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
<jsp:include page="/rodape.jsp" />

</body>   
</html>