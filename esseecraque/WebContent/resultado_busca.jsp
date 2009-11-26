<%@ taglib uri="/WEB-INF/TLD/struts-bean.tld" prefix="bean" %>   
<%@ taglib uri="/WEB-INF/TLD/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/TLD/struts-logic.tld" prefix="logic" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>      
<title><bean:message key="titulo.paginas"/></title>
<link href="/eec/_css/estilo.css" rel="stylesheet" type="text/css">
<link href="/eec/_css/slide_busca.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="/eec/js/jquery-1.2.6-packed.js"></script>
<script type="text/javascript" src="/eec/js/slide.noconflict.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1"> 
</head>
<script>


function abaBusca(id){

document.getElementById("btnRes1").className = 'openRes';
document.getElementById("btnRes2").className = 'openRes';
document.getElementById("btnRes3").className = 'openRes';

document.getElementById("btnRes"+ id).className = 'closeRes';

}

</script>
<body>
<!-- INCLUDE HOME -->

<jsp:include page="topo.jsp" />

<!-- INCLUDE HOME -->

<div id="meio_fundo">
	<div id="meio">
		<div id="esquerda">
			<dt class="box_busca">
				<div class="sep_busca"></div>
				<div class="txt_busca"><input name="busca" type="text" class="txt_buscar" /></div>
				<div class="btn_busca"><img src="/eec/_imgs/btnbusca.jpg" class="linkado"/></div>
			</dt>
			<dt class="player"><img src="/eec/_imgs/player.jpg" /></dt>
			<dt class="desc_player">
				<div class="dir_desc">
					<div class="data_pl">09/06/2009 10:26</div>
					<div class="desc_pl">Edson dos Santos em pedala e da show de bola</div>
					<div class="data_pl">Compartilhar o vídeo (copie e cole a URL)</div>
					<div class="fundo_desc">http://www.orkut.com/watch?=4fsfafdge</div>
				</div>
				<div class="meio_desc">
					<div><img src="/eec/_imgs/votar.jpg" class="linkado"/></div>
					<div><img src="/eec/_imgs/ver_perfil.jpg" class="mgn5 linkado"/></div>
				</div>
				<div class="esq_desc">
					<div>Disponível para contratação</div>
				</div>
			</dt>
			<dt id="resultado_busca">
				<div class="topo_rbusca"></div>
				<div class="btns_rbusca">
					<div id="btnRes1" class="closeRes" onclick="abaBusca(1);"></div>
					<div id="btnRes2" class="openRes" onclick="abaBusca(2);"></div>
					<div id="btnRes3" class="openRes" onclick="abaBusca(3);"></div>
				</div>
				<div class="down_rbusca">
				
<!-- Início Resultado Busca -->	
					

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
	
		<table border="0" cellpadding="0" cellspacing="0">
			<logic:notEmpty name="videos_busca">
				<logic:iterate id="resulBusca" name="videos_busca">				
						<tr>
							<td>
								<a href="player.do?act=playerVideo&idVideo=<bean:write name='resulBusca' property='id' />&secao=liberada" >
									<img src="<bean:write name='resulBusca' property='pathImage' />" width="100" height="73" border="0" alt="<bean:write name='resulBusca' property='title' />"/>
								</a>
							</td>
						</tr>
					
					</logic:iterate>					
					
				</logic:notEmpty>
				
				<logic:empty name="videos_busca">  
                	<tr>
	                	<td>
	                	Nenhum vídeo encontrado.
	                	</td>
                	</tr>
                	
                </logic:empty>

		</table>
		
	</div>
</div><!-- /image-gallery -->
	<a class="prev" href="javascript:stepcarousel.stepBy('image-gallery', -2)">Prev</a>
	<a class="next" href="javascript:stepcarousel.stepBy('image-gallery', 2)">Next</a>
</div><!-- /image-gallery-wrapper -->

<!-- Fim resultado busca -->					
				</div>
							
			</dt>
			<dt class="banner2"><img src="/eec/_imgs/bannergrande.jpg" class="linkado"/><img src="/eec/_imgs/txt_pub.jpg" /></dt>
		</div>
		<div id="direita">
			<!-- INCLUDE DOS VÍDEOS LATERAIS -->

<jsp:include page="buscaAvancada.jsp" />

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
