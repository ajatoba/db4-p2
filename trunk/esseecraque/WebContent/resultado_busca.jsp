<%@ taglib uri="/WEB-INF/TLD/struts-bean.tld" prefix="bean" %>   
<%@ taglib uri="/WEB-INF/TLD/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/TLD/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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
			<div id="result_busca">
			<div id="top_result_busca">
			<div id="tit_result_busca"></div>
			</div>
			
		
				


	

	
		<table border="0" cellpadding="0" cellspacing="0">
			<logic:notEmpty name="videos_busca">
				<tr>
				
				<logic:iterate id="resulBusca" name="videos_busca" indexId="i">							
							<td>
								<a href="player.do?act=playerVideo&idVideo=<bean:write name='resulBusca' property='id' />&secao=liberada" >
									<img src="<bean:write name='resulBusca' property='pathImage' />" width="100" height="73" border="0" alt="<bean:write name='resulBusca' property='title' />"/>
								</a>
							</td>					
				</logic:iterate>					
				</tr>
			</logic:notEmpty>
				
			<logic:empty name="videos_busca">  
                	<tr>
	                	<td>
	                	Nenhum v�deo encontrado.
	                	</td>
                	</tr>
               	
            </logic:empty>
		</table>
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
