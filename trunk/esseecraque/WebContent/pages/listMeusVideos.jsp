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
		<dt class="box_busca">
				<div class="sep_busca"></div>
				<div class="txt_busca"><input name="busca" type="text" class="txt_buscar" /></div>
				<div class="btn_busca"><img src="/eec/_imgs/btnbusca.jpg" class="linkado"/></div>
			</dt>
			
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

<dt id="ultimos_videos">
<!-- INÍCIO GALERIA ÚLTIMOS VÍDEOS -->
<img src="/eec/_imgs/ultimos_videos.jpg" />
 
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
	<jsp:include page="../ultimosVideos.html" />
	</div>
</div>
	<a class="prev" href="javascript:stepcarousel.stepBy('image-gallery', -5)">Prev</a>
	<a class="next" href="javascript:stepcarousel.stepBy('image-gallery', 5)">Next</a>
</div>

<!-- FIM GALERIA ÚLTIMOS VÍDEOS -->
			</dt>
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
<jsp:include page="/rodape.jsp" />

</body>   
</html>