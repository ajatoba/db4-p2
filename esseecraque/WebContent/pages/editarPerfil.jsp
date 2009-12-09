<%@ taglib uri="/WEB-INF/TLD/struts-bean.tld" prefix="bean" %>   
<%@ taglib uri="/WEB-INF/TLD/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/TLD/struts-logic.tld" prefix="logic" %>
<%@page import="java.text.SimpleDateFormat" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@page import="esseecraque.bean.Assinante"%>
<%@page import="java.util.List"%>
<%@page import="esseecraque.bean.Clube"%>
<%@page import="java.util.Iterator"%>
<%@page import="esseecraque.bean.Torneio"%>
<%@page import="java.util.Set"%><html:html>
<head>      
<title><bean:message key="titulo.paginas"/></title>
<link href="/eec/_css/estilo.css" rel="stylesheet" type="text/css">

<link href="/eec/_css/minha_conta_RETIREI.css" rel="stylesheet" type="text/css">

<link href="/eec/_css/cadastro.css" rel="stylesheet" type="text/css">
<link href="/eec/_css/slide.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="/eec/js/jquery-1.2.6-packed.js"></script>
<script type="text/javascript" src="/eec/js/slide.noconflict.js"></script>

<% 
Assinante a = (Assinante)session.getAttribute("Assinante");

Set<Clube> clubes = a.getClubes();
Iterator it = null;
if(clubes != null && clubes.size() >0){
	it = clubes.iterator();
}
Clube c = null;

Set<Torneio> torneios = a.getTorneios();
Iterator itTorneios = null;
if(torneios != null && torneios.size() >0){
	itTorneios = torneios.iterator();
}
Torneio t = null;
%>

<script language="Javascript">

function addInput(divPai,nomeElemento,numeroDeFilhos,sizeInput) {		
		var DivElementoPai = document.getElementById(divPai);
		// somo mais 1 para que o elemento comece com name=elemento[1]
		// pois por padrão já existe um elemento com name=elemento[0]
		var elementos = DivElementoPai.childNodes.length+1;
		var elementInput 		= document.getElementById(nomeElemento+'[0]');
		var cidadeClubeInput 	= document.getElementById('cidade_clube[0]');
		var anoInicioClubeInput = document.getElementById('ano_inicio_clube[0]');
		var anoFimClubeInput 	= document.getElementById('ano_fim_clube[0]');

		if(elementInput.value != ""){
						
			if (DivElementoPai.childNodes.length < numeroDeFilhos){ 	            
				var NovoDiv = document.createElement('div');

				var valorElementoImput 			= elementInput.value;
				var valorCidadeClubeInput 		= cidadeClubeInput.value;
				var valorAnoInicioClubeInput 	= anoInicioClubeInput.value;
				var valorAnoFimClubeInput 		= anoFimClubeInput.value;
				
				elementInput.value = "";					
				NovoDiv.setAttribute("id",nomeElemento+elementos);
				NovoDiv.setAttribute("valign","top");					
				NovoDiv.innerHTML  = "<input type=\"text\" readonly=\"true\" name=\"nome_clube\"       id=\"nome_clube\"       value=\""+ valorElementoImput+"\" size=\"20\"> ";
				NovoDiv.innerHTML += "<input type=\"text\" readonly=\"true\" name=\"cidade_clube\"     id=\"cidade_clube\"     value=\""+ valorCidadeClubeInput + "\"     size=\"15\"> ";
				NovoDiv.innerHTML += "<input class=\"form_campo_altura\" type=\"text\" readonly=\"true\" name=\"ano_inicio_clube\" id=\"ano_inicio_clube\" value=\""+ valorAnoInicioClubeInput + "\"  size=\"5\"> a ";
				NovoDiv.innerHTML += "<input class=\"form_campo_altura\" type=\"text\" readonly=\"true\" name=\"ano_fim_clube\"    id=\"ano_fim_clube\"    value=\""+ valorAnoFimClubeInput + "\"     size=\"5\"> ";
				NovoDiv.innerHTML += "<input type=\"button\" value=\"X\" onClick=\"delElemento('"+divPai+ "','"+nomeElemento+elementos+"')\"\><br> ";					

				DivElementoPai.appendChild(NovoDiv);	

				//LIMPANDO OS CAMPOS
				elementInput.value			="";
				cidadeClubeInput.value		="";
				anoInicioClubeInput.value	="";
				anoFimClubeInput.value		="";	            
         }
     }
 }

function addTorneios(divPai,nomeElemento,numeroDeFilhos,sizeInput) {		
	var DivElementoPai = document.getElementById(divPai);
	// somo mais 1 para que o elemento comece com name=elemento[1]
	// pois por padrão já existe um elemento com name=elemento[0]
	var elementos = DivElementoPai.childNodes.length+1;
	var elementInput 		= document.getElementById(nomeElemento+'[0]');
	var clubeTorneioInput 	= document.getElementById('clube_torneio[0]');
	var cidadeTorneioInput 	= document.getElementById('cidade_torneio[0]');
	var anoTorneioInput 	= document.getElementById('ano_torneio[0]');

	
	if(elementInput.value != ""){
					
		if (DivElementoPai.childNodes.length < numeroDeFilhos){ 	            
			var NovoDiv = document.createElement('div');

			var valorElementoImput 			= elementInput.value;
			var valorClubeTorneioInput 		= clubeTorneioInput.value;
			var valorCidadeTorneioInput 	= cidadeTorneioInput.value;
			var valorAnoTorneioInput 		= anoTorneioInput.value;
			
			elementInput.value = "";					
			NovoDiv.setAttribute("id",nomeElemento+elementos);
			NovoDiv.setAttribute("valign","top");					
			NovoDiv.innerHTML  = "<input type=\"text\" readonly=\"true\" name=\"nome_torneio\"       id=\"nome_torneio\"     value=\""+ valorElementoImput+"\" 			size=\"25\"> ";
			NovoDiv.innerHTML += "<input type=\"text\" readonly=\"true\" name=\"cidade_torneio\"     id=\"cidade_torneio\"   value=\""+ valorCidadeTorneioInput + "\"     size=\"15\"> ";
			NovoDiv.innerHTML += "<input type=\"text\" readonly=\"true\" name=\"clube_torneio\"      id=\"clube_torneio\"    value=\""+ valorClubeTorneioInput + "\"  		size=\"25\"> ";
			NovoDiv.innerHTML += "<input class=\"form_campo_altura\" type=\"text\" readonly=\"true\" name=\"ano_torneio\"    	 id=\"ano_torneio\"      value=\""+ valorAnoTorneioInput + "\"     	size=\"5\"> ";
			NovoDiv.innerHTML += "<input type=\"button\" value=\"X\" onClick=\"delElemento('"+divPai+ "','"+nomeElemento+elementos+"')\"\><br> ";					

			DivElementoPai.appendChild(NovoDiv);	

			//LIMPANDO OS CAMPOS
			elementInput.value			="";
			cidadeTorneioInput.value	="";
			clubeTorneioInput.value		="";
			anoTorneioInput.value		="";	            
     }
 }
}


 function delElemento(divPai,divNum){
     var d = document.getElementById(divPai);
     var oldElem = document.getElementById(divNum);
     	
     if (confirm('Tem certeza que quer apagar: \n'+"\""+oldElem.firstChild.value+"\" ?")) {
         //remove o elemento 
         d.removeChild(oldElem);
     }
 }

</script>

<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1"> 
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
<!-- INÍCIO FORM DE EDIÇÃO DO ASSINANTE -->
<dt id="dados_conta">
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
<html:form action="editPerfil.do?act=editPerfil">
<table border="0" cellpadding="3" cellspacing="3">
<tr>   
    <td width="74" valign="top" class="form_nome">Altura:</td>   
    <td width="408" valign="top" ><html:text name="Assinante"  property="height" styleClass="form_campo_altura" /></td>
	<td width="44" valign="top" class="valida_form"></td>   
</tr>   
<tr>   
    <td valign="top" class="form_nome">Peso:</td>   
    <td valign="top"><html:text name="Assinante" property="weight" styleClass="form_campo_altura" /></td>
	<td valign="top" class="valida_form"></td>   
</tr>
<tr>   
    <td valign="top" class="form_nome">Posição:</td>   
    <td valign="top">
    <html:select name="Assinante" property="position" styleClass="form_campo_posicao">
    	<html:option value="GOL">Goleiro</html:option>
    	<html:option value="ZAG">Zagueiro</html:option>
    	<html:option value="LAT">Lateral</html:option>
    	<html:option value="MEI">Meia</html:option>
    	<html:option value="ATA">Atacante</html:option>
    </html:select>
    </td>
	<td valign="top" class="valida_form"></td>   
</tr>

<tr>
	<td colspan="3">
		 <table>
		 	<tr align="center">
		 		<td valign="top" class="form_nome">Clubes em que Joguei:</td>
		 	</tr>
		 	<tr> 		
		 		<td valign="top">
		 			<table>
		 				<tr>
		 					<td class="form_nome">Clube:</td>
		 					<td><input name="clube[0]" id="clube[0]" size="45" type="text" class="form_campo_nome"></td>
		 				</tr>
		 				<tr>
		 					<td class="form_nome">Cidade:</td>
		 					<td><input name="cidade_clube[0]" id="cidade_clube[0]" size="45" type="text" class="form_campo_nome"></td>
		 				</tr>
		 				<tr>
		 					<td class="form_nome">Período:</td>
		 					<td><input name="ano_inicio_clube[0]" id="ano_inicio_clube[0]" size="5" type="text" class="form_campo_altura" > a <input name="ano_fim_clube[0]" id="ano_fim_clube[0]" size="5" type="text" class="form_campo_altura"></td>
		 				</tr>
		 				<tr>
		 					<TD colspan="2"><input type="button" name="add" value="+" onclick="addInput('divClubes','clube',4,45)" ></TD>
		 				</tr>
		 			</table>						  
		 			
		 			<div id="divClubes">
			 			
			 			<%
			 			if(clubes != null && clubes.size() >0){
				 			while(it.hasNext()){
								c = (Clube)it.next();
							%>
							<div id="clube<%=c.getId()%>">			 			
				 				<input type="text" readonly="true" name="nome_clube" 		id="nome_clube" 		value="<%=c.getName() %>" 		size="20"/>
								<input type="text" readonly="true" name="cidade_clube" 		id="cidade_clube"   	value="<%=c.getCity() %>" 		size="15">
								<input type="text" readonly="true" name="ano_inicio_clube" 	id="ano_inicio_clube" 	value="<%=c.getStartYear() %>" 	size="5" class="form_campo_altura" > a 
								<input type="text" readonly="true" name="ano_fim_clube"    	id="ano_fim_clube"    	value="<%=c.getEndYear() %>"    size="5" class="form_campo_altura" >
								<input type="button" value="X" onClick="delElemento('divClubes','clube<%=c.getId()%>')"/><br>					
				 			</div>
							<%
							}
			 			}
						%>
			 			
		 			
		 			</div>
		 		</td>		
		 	</tr>
		 </table>				
	
	</td>
</tr>
<tr>
	<td colspan="3">
	
		<table>
		 	<tr align="center">
		 		<td valign="top" class="form_nome">Torneios que Participei:</td>
		 	</tr>
		 	<tr> 		
		 		<td valign="top">
		 			<table>
		 				<tr>
		 					<td class="form_nome">Nome do Torneio:</td>
		 					<td><input name="torneio[0]" id="torneio[0]" size="45" type="text" class="form_campo_nome"></td>
		 				</tr>
		 				<tr>
		 					<td class="form_nome">Clube que defendi:</td>
		 					<td><input name="clube_torneio[0]" id="clube_torneio[0]" size="45" type="text" class="form_campo_nome"></td>
		 				</tr>
		 				<tr>
		 					<td class="form_nome">Cidade:</td>
		 					<td><input name="cidade_torneio[0]" id="cidade_torneio[0]" size="45" type="text" class="form_campo_nome"></td>
		 				</tr>
		 				<tr>
		 					<td class="form_nome">Ano:</td>
		 					<td><input name="ano_torneio[0]" id="ano_torneio[0]" size="5" type="text" class="form_campo_altura"></td>
		 				</tr>
		 				<tr>
		 					<TD colspan="2"><input type="button" name="add" value="+" onclick="addTorneios('divTorneios','torneio',4,45)" ></TD>
		 				</tr>
		 			</table>						  
		 			
		 			<div id="divTorneios">
		 			<%
			 			if(torneios != null && torneios.size() >0){
				 			while(itTorneios.hasNext()){
								t = (Torneio)itTorneios.next();
							%>
							<div id="torneio<%=t.getId()%>">			 			
				 				<input type="text" readonly="true" name="nome_torneio" 		id="nome_torneio" 	value="<%=t.getName()%>" 	size="20"/>
								<input type="text" readonly="true" name="cidade_torneio" 	id="cidade_torneio" value="<%=t.getCity()%>" 	size="15">
								<input type="text" readonly="true" name="clube_torneio" 	id="clube_torneio" 	value="<%=t.getTeam()%>" 	size="5" class="form_campo_altura" > a 
								<input type="text" readonly="true" name="ano_torneio"    	id="ano_torneio"    value="<%=t.getYear()%>"    size="5" class="form_campo_altura" >
								<input type="button" value="X" onClick="delElemento('divTorneios','torneio<%=t.getId()%>')"/><br>					
				 			</div>
							<%
							}
			 			}
						%>
		 			</div>
		 		</td>		
		 	</tr>
		 </table>
		
	
	</td>
</tr>
<tr>   
    <td valign="top" class="form_nome">Comentários:</td>   
    <td valign="top"><html:textarea cols="250" rows="20" name="Assinante" property="comment" styleClass="form_campo_altura" /></td>
	<td valign="top" class="valida_form"></td>   
</tr>
<tr>   
    <td valign="top" class="form_nome"><html:checkbox name="Assinante" property="showEmail" styleClass="form_campo_altura" />Publicar Email</td>   
    <td valign="top" class="form_nome"><html:checkbox name="Assinante" property="showAim" styleClass="form_campo_altura" />Publicar AIM</td>
	<td valign="top" class="form_nome"><html:checkbox name="Assinante" property="showCellPhone" styleClass="form_campo_altura" />Publicar Celular</td>   
	<td valign="top" class="form_nome"><html:checkbox name="Assinante" property="showPhone" styleClass="form_campo_altura" />Publicar Telefone</td>
</tr>


</table>

<html:submit styleClass="botao"><bean:message key="botao.submit"/>
</html:submit>  
</html:form>  
</dt>
			<!-- FIM FORM DE EDIÇÃO DE ASSINANTE -->

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
</html:html>