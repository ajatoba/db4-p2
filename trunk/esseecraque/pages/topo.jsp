<%@ taglib uri="/WEB-INF/TLD/struts-bean.tld" prefix="bean" %>   
<%@ taglib uri="/WEB-INF/TLD/struts-html.tld" prefix="html" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>      
<link href="<html:rewrite page="/_css/estilo.css" />" rel="stylesheet" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1"> 
</head>

<div id="menu">
	<dt>
		
	</dt>
</div>
<div id="topo">
	<div>
		<dt class="logo"><img src="_imgs/logo.jpg" class="linkado"/></dt>
		<dt class="form"><img src="_imgs/banner_assine.jpg" /></dt>
		<dt class="frm_in">
	<table width="204" height="133" border="0" cellpadding="0" cellspacing="0">
		<tr> 		
    	    <td width="204" height="20" class="txt_logs">&nbsp;&nbsp;&nbsp;&nbsp;Olá, <bean:write name="Assinante" property="nome" /></td>
		</tr>
		<tr> 
			<td width="204" height="20" class="txt_logs">&nbsp;&nbsp;&nbsp;&nbsp;Você possui <bean:write name="qtdVideo" /> vídeos</td>
		</tr>
        <tr>
        	<td width="204" class="txt_logs">&nbsp;&nbsp;&nbsp;&nbsp;>&nbsp;&nbsp; <html:link page="/listMeusVideos.do?act=list" styleClass="menu_topo">Meus vídeos</html:link></td>
        </tr>	
        <tr>
        	<td width="204" class="txt_logs">&nbsp;&nbsp;&nbsp;&nbsp;>&nbsp;&nbsp; <html:link page="/minhaConta.do" styleClass="menu_topo">Minha conta</html:link></td>
        </tr>
        <tr>
        	<td width="204" class="txt_logs">&nbsp;&nbsp;&nbsp;&nbsp;>&nbsp;&nbsp; <html:link page="/editarPerfilForm.do" styleClass="menu_topo">Editar perfil</html:link></td>
        </tr>
        <tr>
        	<td width="204" class="txt_logs">&nbsp;&nbsp;&nbsp;&nbsp;>&nbsp;&nbsp; Sair</td>
        </tr>	
        
		<tr> 
			<td height="34" align="right" valign="bottom"><img src="_imgs/btn_logar.jpg" width="40" height="34" class="linkado" style="border:0px;" /></td>
		</tr>
	</table>
	<div style="width:204px;"><html:link page="/cadVideoForm.do" styleClass="linkado"><img src="_imgs/publicar.jpg" border="0" /></html:link></div>
	</dt>
   </div>
</div>

</html>