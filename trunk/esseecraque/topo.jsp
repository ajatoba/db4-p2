<%@ taglib uri="/WEB-INF/TLD/struts-bean.tld" prefix="bean" %>   
<%@ taglib uri="/WEB-INF/TLD/struts-html.tld" prefix="html" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>      
<link href="<html:rewrite page="/eec/_css/estilo.css" />" rel="stylesheet" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1"> 
</head>

<html:form action="loginAssinante.do?act=login" focus="email">
<div id="menu">
	<dt>
		<span></span>
	</dt>
</div>
<div id="topo">
	<div>
		<dt class="logo"><img src="/eec/_imgs/logo.jpg" class="linkado"/></dt>
		<dt class="form"><img src="/eec/_imgs/banner_assine.jpg" /></dt>
		<dt class="frm_in">
			
      <table width="204" height="133" border="0" cellpadding="0" cellspacing="0">
        <tr> 
				<td height="18" colspan="3"></td>
			  </tr>
			  <tr> 
				
          <td width="56" height="25" class="txt_logs">&nbsp;&nbsp;&nbsp;&nbsp;Login:</td>
				
          <td width="118"><dt class="box_log"><html:text property="email" styleClass="txt_logar" /></dt></td>
				
          <td width="30"><img src="/eec/_imgs/setinha_login.jpg" width="23" height="25" /></td>
			  </tr>
			  <tr> 
				<td height="10"></td>
				<td colspan="2"></td>
			  </tr>
			  <tr> 
				
          <td width="56" height="25" class="txt_logs">&nbsp;&nbsp;&nbsp;&nbsp;Senha:</td>
				<td><dt class="box_log"><html:password property="password" styleClass="txt_logar" /></dt></td>
				
          <td><img src="/eec/_imgs/setinha_login.jpg" width="23" height="25" /></td>
			  </tr>
			  <tr> 
				<td height="55" colspan="3"> <table width="204" height="55" border="0" cellpadding="0" cellspacing="0">
              <tr> 
					  
                <td width="164"> 
                  <table width="164" border="0" cellpadding="0" cellspacing="0">
						  <tr> 
							<td width="187" class="txt_logs2" height="22">&nbsp;&nbsp;&nbsp;&nbsp;Esqueci minha senha!</td>
						  </tr>
						  <tr> 
							<td class="txt_logs2">&nbsp;&nbsp;&nbsp;&nbsp;<html:link page="/cadAssinanteForm.do" styleClass="link_logs2">Ainda n&atilde;o sou cadastrado.</html:link></td>
						  </tr>
						</table></td>
                <td align="right" valign="bottom"><img src="/eec/_imgs/btn_logar.jpg" width="40" height="34" class="linkado" style="border:0px;" /></td>
					</tr>
				  </table></td>
			  </tr>
			</table>
			<div style="width:204px;"><html:image src="/eec/_imgs/publicar.jpg" property="Submit" styleClass="linkado" /></div>
		</dt>
	</div>
</div>

</html:form>

</html>