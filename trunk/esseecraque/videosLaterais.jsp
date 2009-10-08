<%@ taglib uri="/WEB-INF/TLD/struts-bean.tld" prefix="bean" %>   
<%@ taglib uri="/WEB-INF/TLD/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/TLD/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>      
<link href="<html:rewrite page="/_css/estilo.css" />" rel="stylesheet" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1"> 
</head>

			<div id="lists">
				<img src="_imgs/btn_videos.jpg" class="linkado"/><img src="_imgs/btn_usuarios.jpg" class="linkado"/><img src="_imgs/btn_canais.jpg" class="linkado"/>

				
				<display:table name="VideosLaterais" id="lv" pagesize="5" requestURI="welcome.do?act=carregaHome">
				    <display:column>
				    	<div class="atrasOut" onmouseover="this.className='atrasIn';" onmouseout="this.className='atrasOut';">
							<dt class="frente">
								<div class="voto0"><img src="<bean:write name='lv' property='pathImage' />" /></div>
								<div class="data"><bean:write name="lv" property="dataUpload" format="{0,date,dd-MM-yyyy}" /></div>
								<div class="desc"><bean:write name="lv" property="title" /></div>
							</dt>
						</div>
				    </display:column>
				</display:table>
				
			</div>

</html>