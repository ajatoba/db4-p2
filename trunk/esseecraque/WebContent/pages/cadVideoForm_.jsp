<%@ taglib uri="/WEB-INF/TLD/struts-bean.tld" prefix="bean" %>   
<%@ taglib uri="/WEB-INF/TLD/struts-html.tld" prefix="html" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>      
<title><bean:message key="titulo.paginas"/></title>
<link href="/eec/_css/estilo.css" rel="stylesheet" type="text/css">
<link href="/eec/_css/slide.css" rel="stylesheet" type="text/css">
<link href="/eec/_css/cadastro.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="/eec/js/jquery-1.2.6-packed.js"></script>
<script type="text/javascript" src="/eec/js/slide.noconflict.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1"> 
</head>
<body>
<!--INCLUDE DO MENU-->
<jsp:include page="/topo.jsp" />

<!--FIM INCLUDE DO MENU-->


<div id="meio_fundo">
	<div id="meio">
		<div id="esquerda">
			<div id="pub_video">
<div id="top_pub_video">
<div id="tit_pub_video"></div>
</div>
			<dt class="form_upload">

<html:form action="cadVideo.do?act=add">  

<table>

<tr>   
    <td class="form_nome">Titulo:</td>   
    <td><html:text property="title"/></td>   
</tr>   
<tr>   
    <td class="form_nome">Descricao:</td>   
    <td><html:textarea cols="20" rows="5" property="description"/></td>   
</tr>
<tr>   
    <td class="form_nome">Tags:</td>   
    <td><html:text property="tagVideo"/></td>   
</tr>

<tr>   
    <td colspan="2">
    <html:submit>
    	<bean:message key="botao.submit"/>
	</html:submit>
    
    </td>
</tr>

</table>
<!-- 
STATUS HIDDEN 
-->
<html:hidden property="status" value="0"/>
</html:form>
            
            </dt>
			
		
			<dt class="banner2"><img src="/eec/_imgs/bannergrande.jpg" class="linkado"/><img src="/eec/_imgs/txt_pub.jpg" /></dt>
		</div>
		<div id="direita">
	dsadas
		</div>
	</div>
</div>

<jsp:include page="/rodape.jsp" />


</body>   
</html>