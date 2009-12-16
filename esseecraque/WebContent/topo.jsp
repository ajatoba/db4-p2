<%@ taglib uri="/WEB-INF/TLD/struts-bean.tld" prefix="bean" %>   
<%@ taglib uri="/WEB-INF/TLD/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/TLD/struts-logic.tld" prefix="logic" %>


<link href="/eec/js/lightbox/thickbox.css" rel="stylesheet" type="text/css" />
<script src="/eec/js/lightbox/thickbox.js" type="text/javascript"></script>


<div id="menu"></div>

<div id="topo">

	
	
	<div>
	
		<dt class="logo"><a href="/esseecraque/index.jsp"><img src="/eec/_imgs/logo.jpg" border="0" class="linkado"/></a></dt>
		<dt class="form"><img src="/eec/_imgs/banner_assine.jpg" /></dt>
		<dt class="frm_in">
			
			<!-- ******** SE O USUÁRIO NÃO ESTIVER LOGADO *************** -->
			<logic:notPresent name="Assinante">
			<html:form action="loginAssinante.do?act=login" focus="email">
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
		        	<td><html:image src="/eec/_imgs/seta_logar.jpg" property="Submit" />     	
		        	</td>
				</tr>
				<tr> 
					<td height="55" colspan="3"> 
						<table width="204" height="55" border="0" cellpadding="0" cellspacing="0">
					        <tr>				  
					        	<td width="164"> 
					            	<table width="164" border="0" cellpadding="0" cellspacing="0">
									  <tr> 
										<td width="187" class="txt_logs2" height="22">&nbsp;&nbsp;&nbsp;&nbsp;<a class="thickbox" href="lightbox.jsp?height=180&width=290" >Esqueci minha senha!</a></td>
									  </tr>
									
									</table>
								</td>
			            		<td align="right" valign="bottom">
			            			
			            		</td>
							</tr>
						</table>
					</td>
				</tr>
				
				<tr>			
		        	<td colspan="3"><a href="/esseecraque/cadAssinanteForm.do"><img src="/eec/_imgs/btcadastrar.jpg" border="0" property="Submit" /></a></td>					
				</tr>
			</table>
			
			</html:form>
			</logic:notPresent>
			<!-- ******** ********* *************** -->
			
			<!-- ******** SE O USUÁRIO ESTIVER LOGADO *************** -->
			<logic:present name="Assinante">
			<table width="204" height="133" border="0" cellpadding="0" cellspacing="0">
				<tr> 		
		    	    <td width="204" height="20" class="txt_logs">&nbsp;&nbsp;&nbsp;&nbsp;Olá, <bean:write name="Assinante" property="nome" /></td>
				</tr>
				<tr> 
					<td width="204" height="20" class="txt_logs">&nbsp;&nbsp;&nbsp;&nbsp;Você possui 
					<logic:notEmpty name="qtdVideo">
						<bean:write name="qtdVideo" />
					</logic:notEmpty>
					<logic:empty name="qtdVideo">
						0 
					</logic:empty>
					
					 vídeos</td>
				</tr>
		        <logic:notEmpty name="Assinante" property="username">
		        <tr>
		        	<td width="204" class="txt_logs">&nbsp;&nbsp;&nbsp;&nbsp;>&nbsp;&nbsp; <html:link page="/listMeusVideos.do?act=list" styleClass="menu_topo">Meus vídeos</html:link></td>
		        </tr>	
		        </logic:notEmpty>
		        <!-- 
		        <tr>
		        	<td width="204" class="txt_logs">&nbsp;&nbsp;&nbsp;&nbsp;>&nbsp;&nbsp; <html:link page="/minhaConta.do" styleClass="menu_topo">Minha conta</html:link></td>
		        </tr>
		        -->
		        <tr>
		        	<td width="204" class="txt_logs">&nbsp;&nbsp;&nbsp;&nbsp;>&nbsp;&nbsp; <html:link page="/editarAssinanteForm.do" styleClass="menu_topo">Editar cadastro</html:link></td>
		        </tr>
		        <logic:notEmpty name="Assinante" property="username">
		        <tr>
		        	<td width="204" class="txt_logs">&nbsp;&nbsp;&nbsp;&nbsp;>&nbsp;&nbsp; <html:link page="/editarPerfilForm.do" styleClass="menu_topo">Editar perfil</html:link></td>
		        </tr>
				</logic:notEmpty>
		        <tr>
		        	<td width="204" class="txt_logs">&nbsp;&nbsp;&nbsp;&nbsp;>&nbsp;&nbsp; <html:link page="/assinante.do?act=logout" styleClass="menu_topo">Sair</html:link></td>
		        </tr>
			</table>
			
			<logic:notEmpty name="Assinante" property="username">
			<div style="width:204px;">
				<html:link page="/cadVideoForm.do" styleClass="menu_topo">
					<img src="/eec/_imgs/publicar.jpg" border="0" property="Submit" />
				</html:link>
			</div>  
			</logic:notEmpty>
			<logic:empty name="Assinante" property="username">
			<div style="width:204px;">
				<html:link page="/editarPerfilForm.do" styleClass="menu_topo">
					<img src="/eec/_imgs/assinar.jpg" border="0" property="Submit" />
				</html:link>
			</div>  
			</logic:empty>
			
			</logic:present>
			<!-- ******** ***************** *************** -->
		
		</dt>
		

	</div>
</div>
