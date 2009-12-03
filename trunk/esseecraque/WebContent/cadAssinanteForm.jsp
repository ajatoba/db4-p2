<%@ taglib uri="WEB-INF/TLD/struts-bean.tld" prefix="bean" %>   
<%@ taglib uri="WEB-INF/TLD/struts-html.tld" prefix="html" %>
<%@ taglib uri="WEB-INF/TLD/struts-logic.tld" prefix="logic" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>      
<title><bean:message key="titulo.paginas"/></title>
<link href="/eec/_css/estilo.css" rel="stylesheet" type="text/css">
<link href="/eec/_css/slide.css" rel="stylesheet" type="text/css">
<link href="/eec/_css/cadastro.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="/eec/js/jquery-1.2.6-packed.js"></script>
<script type="text/javascript" src="/eec/js/slide.noconflict.js"></script>

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
				NovoDiv.innerHTML  = "<input type=\"text\" readonly=\"true\" name=\"nome_clube\"       id=\"nome_clube\"       value=\" "+ valorElementoImput+" \" size=\"45\"> ";
				NovoDiv.innerHTML += "<input type=\"text\" readonly=\"true\" name=\"cidade_clube\"     id=\"cidade_clube\"     value=\" "+ valorCidadeClubeInput + " \"     size=\"45\"> ";
				NovoDiv.innerHTML += "<input type=\"text\" readonly=\"true\" name=\"ano_inicio_clube\" id=\"ano_inicio_clube\" value=\" "+ valorAnoInicioClubeInput + "\"  size=\"5\"> a ";
				NovoDiv.innerHTML += "<input type=\"text\" readonly=\"true\" name=\"ano_fim_clube\"    id=\"ano_fim_clube\"    value=\" "+ valorAnoFimClubeInput + " \"     size=\"5\"> ";
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
			NovoDiv.innerHTML  = "<input type=\"text\" readonly=\"true\" name=\"nome_torneio\"       id=\"nome_torneio\"     value=\" "+ valorElementoImput+" \" 			size=\"45\"> ";
			NovoDiv.innerHTML += "<input type=\"text\" readonly=\"true\" name=\"cidade_torneio\"     id=\"cidade_torneio\"   value=\" "+ valorCidadeTorneioInput + " \"     size=\"45\"> ";
			NovoDiv.innerHTML += "<input type=\"text\" readonly=\"true\" name=\"clube_torneio\"      id=\"clube_torneio\"    value=\" "+ valorClubeTorneioInput + "\"  		size=\"45\"> ";
			NovoDiv.innerHTML += "<input type=\"text\" readonly=\"true\" name=\"ano_torneio\"    	 id=\"ano_torneio\"      value=\" "+ valorAnoTorneioInput + " \"     	size=\"5\"> ";
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

<!-- INCLUDE HOME -->

<jsp:include page="topo.jsp" />

<!-- INCLUDE HOME -->

<div id="meio_fundo">
	<div id="meio">
		<div id="esquerda">
		<dt class="box_busca">
				<form action="busca.do?act=busca" method="post">
					<div class="sep_busca"></div>
					<div class="txt_busca">
						<input type="text" name="busca" Class="txt_buscar" />
					</div>
					<div class="btn_busca">
						<input type="image" src="/eec/_imgs/btnbusca.jpg" name="Submit" Class="linkado" />
					</div>
				</form>
			</dt>
<dt id="cadastro" >
<table border="0" cellpadding="0" cellspacing="0" align="center">
	<tr>
		<td>
			<span class="txtMsg">		
			<logic:present name="mensagem_erro">
	  			<img src="/eec/_imgs/iconeErro.jpg" /> <bean:message key="msg.add.assinante.erro"/><br/>
	  			<font color="red"><bean:write name="mensagem_erro"/></font>
	  		</logic:present>
			</span>
		</td>
	</tr>
</table>
<html:form action="cadAssinante.do?act=add" focus="email" onsubmit="return validateAssinanteForm(this)">   
<table border="0" cellpadding="3" cellspacing="3">
<tr>   
    <td valign="middle" class="form_nome">E-mail:</td>   
    <td valign="middle"><html:text property="email" styleClass="form_campo_nome" /></td>
	<td valign="middle" class="valida_form"><html:errors property="erro.vcEmailAssinante"  /></td>   
</tr>   
<tr>   
    <td valign="middle" class="form_nome">Senha:</td>   
    <td valign="middle"><html:password property="password" styleClass="form_campo_nome" /></td>
	<td valign="middle" class="valida_form"><html:errors  property="erro.vcPasswordAssinante" /></td>   
</tr>
<tr>   
    <td valign="middle" class="form_nome">Confirmar Senha:</td>   
    <td valign="middle"><html:password property="confPassword" styleClass="form_campo_nome" /></td>
	<td valign="middle" class="valida_form"><html:errors  property="erro.vcConfPasswordAssinante" /></td>   
</tr>
<tr>   
    <td valign="middle" class="form_nome">Nome:</td>   
    <td valign="middle"><html:text property="nome" styleClass="form_campo_nome" /></td>
	<td valign="middle" class="valida_form"><html:errors  property="erro.vcNomeAssinante" /></td>   
</tr>
<tr>   
    <td valign="middle" class="form_nome">Data de Nascimento:</td>   
    <td valign="middle"><html:text property="diaNascimento" styleClass="form_campo_nome" />/
    <html:select property="mesNascimento" styleClass="form_campo_posicao">    	
		<html:option  value="1">Jan</html:option>
		<html:option  value="2">Fev</html:option>
		<html:option  value="3">Mar</html:option>
		<html:option  value="4">Abr</html:option>
		<html:option  value="5">Mai</html:option>
		<html:option  value="6">Jun</html:option>
		<html:option  value="7">Jul</html:option>
		<html:option  value="8">Ago</html:option>
		<html:option  value="9">Set</html:option>
		<html:option  value="10">Out</html:option>
		<html:option  value="11">Nov</html:option>
		<html:option  value="12">Dez</html:option>
	</html:select>
		/
	<html:select property="anoNascimento" styleClass="form_campo_posicao">    	
		<html:option  value="1977">1977</html:option>
		<html:option  value="1978">1978</html:option>
		<html:option  value="1979">1979</html:option>
		<html:option  value="1980">1980</html:option>
		<html:option  value="1981">1981</html:option>
		<html:option  value="1982">1982</html:option>
		<html:option  value="1983">1983</html:option>
		<html:option  value="1984">1984</html:option>
		<html:option  value="1985">1985</html:option>
		<html:option  value="1986">1986</html:option>
		<html:option  value="1987">1987</html:option>
		<html:option  value="1988">1988</html:option>
		<html:option  value="1989">1989</html:option>
		<html:option  value="1990">1990</html:option>
		<html:option  value="1991">1991</html:option>
		<html:option  value="1992">1992</html:option>
		<html:option  value="1993">1993</html:option>
		<html:option  value="1994">1994</html:option>
		<html:option  value="1995">1995</html:option>
		<html:option  value="1996">1996</html:option>
		<html:option  value="1997">1997</html:option>
		<html:option  value="1998">1998</html:option>
		<html:option  value="1999">1999</html:option>
		<html:option  value="2000">2000</html:option>
		<html:option  value="2001">2001</html:option>
		<html:option  value="2002">2002</html:option>
		<html:option  value="2003">2003</html:option>
		<html:option  value="2004">2004</html:option>
		<html:option  value="2005">2005</html:option>
		<html:option  value="2006">2006</html:option>
		<html:option  value="2007">2007</html:option>
	</html:select>
	</td>
	<td valign="middle" class="valida_form"></td>   
</tr>
<tr>   
    <td valign="middle" class="form_nome">CPF:</td>   
    <td valign="middle"><html:text property="cpf" styleClass="form_campo_nome" /></td>
	<td valign="middle" class="valida_form"><html:errors  property="erro.vcCPFAssinante" /></td>   
</tr>
<tr>   
    <td valign="middle" class="form_nome">Endereço:</td>   
    <td valign="middle"><html:text property="endereco" styleClass="form_campo_nome" /></td>
	<td valign="middle" class="valida_form"><html:errors  property="erro.vcEnderecoAssinante" /></td>   
</tr>
<tr>   
    <td valign="middle" class="form_nome">Cidade:</td>   
    <td valign="middle"><html:text property="cidade" styleClass="form_campo_nome" /></td>
	<td valign="middle" class="valida_form"><html:errors  property="erro.vcCidadeAssinante" /></td>   
</tr>
<tr>   
    <td valign="middle" class="form_nome">Estado:</td>   
    <td valign="middle">
    <html:select property="estado" styleClass="form_campo_posicao">    	
		<html:option  value="Acre">Acre</html:option>
		<html:option  value="Alagoas">Alagoas</html:option>
		<html:option  value="Amapá">Amapá</html:option>
		<html:option  value="Amazonas">Amazonas</html:option>
		<html:option  value="Bahia">Bahia</html:option>
		<html:option  value="Ceará">Ceará</html:option> 
		<html:option  value="Distrito Federal">Distrito Federal</html:option> 
		<html:option  value="Espírito Santos">Espírito Santos</html:option>
		<html:option  value="Goias">Goias</html:option>
		<html:option  value="Maranhão">Maranhão</html:option>
		<html:option  value="Mato Grosso">Mato Grosso</html:option>
		<html:option  value="Mato Grosso do Sul">Mato Grosso do Sul</html:option>
		<html:option  value="Minas Gerais">Minas Gerais</html:option> 
		<html:option  value="Pará">Pará</html:option>
		<html:option  value="Paraíba">Paraíba</html:option> 
		<html:option  value="Paraná">Paraná</html:option>
		<html:option  value="Pernambuco">Pernambuco</html:option>
		<html:option  value="Piauí">Piauí</html:option>
		<html:option  value="Rio de Janeiro">Rio de Janeiro</html:option>
		<html:option  value="Rio Grande do Norte">Rio Grande do Norte</html:option>
		<html:option  value="Rio Grande do Sul">Rio Grande do Sul</html:option>
		<html:option  value="Rondônia">Rondônia</html:option>
		<html:option  value="Roraima">Roraima</html:option>
		<html:option  value="Santa Catarina">Santa Catarina</html:option>
		<html:option  value="São Paulo">São Paulo</html:option>
		<html:option  value="Sergipe">Sergipe</html:option> 
		<html:option  value="Tocantins">Tocantins</html:option>
	</html:select>
    </td>
	<td valign="middle" class="valida_form"><html:errors  property="erro.vcEstadoAssinante" /></td>   
</tr>
<tr>   
    <td valign="middle" class="form_nome">Telefone (DD-XXXX-XXXX):</td>   
    <td valign="middle"><html:text property="phoneNumber" styleClass="form_campo_nome" /></td>
	<td valign="middle" class="valida_form"></td>   
</tr>
<tr>   
    <td width="74" valign="top" class="form_nome">Altura:</td>   
    <td width="408" valign="top" ><html:text property="height" styleClass="form_campo_altura" /></td>
	<td width="44" valign="top" class="valida_form"></td>   
</tr>   
<tr>   
    <td valign="top" class="form_nome">Peso:</td>   
    <td valign="top"><html:text property="weight" styleClass="form_campo_altura" /></td>
	<td valign="top" class="valida_form"></td>   
</tr>
<tr>   
    <td valign="top" class="form_nome">Posição:</td>   
    <td valign="top">
    <html:select property="position" styleClass="form_campo_posicao">
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
    <td valign="middle" class="form_nome">URL do assinante:</td>   
    <td valign="middle">http://www.esseecraque.com.br/<html:text property="username" styleClass="form_campo_path" /></td>
	<td valign="middle" class="valida_form"><html:errors  property="erro.vcUsername" /></td>   
</tr>

<tr>
	<td colspan="3">
		 <table>
		 	<tr align="center">
		 		<td valign="top">Clubes em que Joguei:</td>
		 	</tr>
		 	<tr> 		
		 		<td valign="top">
		 			<table>
		 				<tr>
		 					<td>Clube:</td>
		 					<td><input name="clube[0]" id="clube[0]" size="45" type="text"></td>
		 				</tr>
		 				<tr>
		 					<td>Cidade:</td>
		 					<td><input name="cidade_clube[0]" id="cidade_clube[0]" size="45" type="text"></td>
		 				</tr>
		 				<tr>
		 					<td>Período:</td>
		 					<td><input name="ano_inicio_clube[0]" id="ano_inicio_clube[0]" size="5" type="text"> a <input name="ano_fim_clube[0]" id="ano_fim_clube[0]" size="5" type="text"></td>
		 				</tr>
		 				<tr>
		 					<TD colspan="2"><input type="button" name="add" value="+" onclick="addInput('divClubes','clube',4,45)" ></TD>
		 				</tr>
		 			</table>						  
		 			
		 			<div id="divClubes"></div>
		 		</td>		
		 	</tr>
		 </table>				
	
	</td>
</tr>
<tr>
	<td colspan="3">
	
		<table>
		 	<tr align="center">
		 		<td valign="top">Torneios que Participei:</td>
		 	</tr>
		 	<tr> 		
		 		<td valign="top">
		 			<table>
		 				<tr>
		 					<td>Nome do Torneio:</td>
		 					<td><input name="torneio[0]" id="torneio[0]" size="45" type="text"></td>
		 				</tr>
		 				<tr>
		 					<td>Clube que defendi:</td>
		 					<td><input name="clube_torneio[0]" id="clube_torneio[0]" size="45" type="text"></td>
		 				</tr>
		 				<tr>
		 					<td>Cidade:</td>
		 					<td><input name="cidade_torneio[0]" id="cidade_torneio[0]" size="45" type="text"></td>
		 				</tr>
		 				<tr>
		 					<td>Ano:</td>
		 					<td><input name="ano_torneio[0]" id="ano_torneio[0]" size="5" type="text"></td>
		 				</tr>
		 				<tr>
		 					<TD colspan="2"><input type="button" name="add" value="+" onclick="addTorneios('divTorneios','torneio',4,45)" ></TD>
		 				</tr>
		 			</table>						  
		 			
		 			<div id="divTorneios"></div>
		 		</td>		
		 	</tr>
		 </table>
		
	
	</td>
</tr>
          
</table>   
<html:submit styleClass="botao"><bean:message key="botao.submit"/>
</html:submit>
   
</html:form>
</dt>
<dt class="desc_player">
			
			</dt>
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
		<div class="panel">
			<a href="#" title="Link 1" >
				<img src="/eec/_imgs/img_videos.jpg" width="100" height="73" border="0" alt="Imagem 1" class="imgs" />
			</a>
		</div>
		<div class="panel">
			<a href="#" title="Link 2" >
				<img src="/eec/_imgs/img_videos.jpg" width="100" height="73" border="0" alt="Imagem 2" class="imgs" />
			</a>
		</div>
		<div class="panel">
			<a href="#" title="Link 3" >
				<img src="/eec/_imgs/img_videos.jpg" width="100" height="73" border="0" alt="Imagem 3" class="imgs" />
			</a>
		</div>
		<div class="panel">
			<a href="#" title="Link 4" >
				<img src="/eec/_imgs/img_videos.jpg" width="100" height="73" border="0" alt="Imagm 4" class="imgs" />
			</a>
		</div>
		<div class="panel">
			<a href="#" title="Link 5" >
				<img src="/eec/_imgs/img_videos.jpg" width="100" height="73" border="0" alt="Imagem 5" class="imgs" />
			</a>
		</div>
		<div class="panel">
			<a href="#" title="Link 6" >
				<img src="/eec/_imgs/img_videos.jpg" width="100" height="73" border="0" alt="Imagem 6" class="imgs" />
			</a>
		</div>
		<div class="panel">
			<a href="#" title="Link 7" >
				<img src="/eec/_imgs/img_videos.jpg" width="100" height="73" border="0" alt="Imagem 7" class="imgs" />
			</a>
		</div>
				<div class="panel">
			<a href="#" title="Link 8" >
				<img src="/eec/_imgs/img_videos.jpg" width="100" height="73" border="0" alt="Imagem 8" class="imgs" />
			</a>
		</div>
		<div class="panel">
			<a href="#" title="Link 9" >
				<img src="/eec/_imgs/img_videos.jpg" width="100" height="73" border="0" alt="Imagem 9" class="imgs" />
			</a>
		</div>
		<div class="panel">
			<a href="#" title="Link 10" >
				<img src="/eec/_imgs/img_videos.jpg" width="100" height="73" border="0" alt="Imagem 10" class="imgs" />
			</a>
		</div>
		<div class="panel">
			<a href="#" title="Link 11" >
				<img src="/eec/_imgs/img_videos.jpg" width="100" height="73" border="0" alt="Imagm 11" class="imgs" />
			</a>
		</div>
		<div class="panel">
			<a href="#" title="Link 12" >
				<img src="/eec/_imgs/img_videos.jpg" width="100" height="73" border="0" alt="Imagem 12" class="imgs" />
			</a>
		</div>
		<div class="panel">
			<a href="#" title="Link 13" >
				<img src="/eec/_imgs/img_videos.jpg" width="100" height="73" border="0" alt="Imagem 13" class="imgs" />
			</a>
		</div>
		<div class="panel">
			<a href="#" title="Link 14" >
				<img src="/eec/_imgs/img_videos.jpg" width="100" height="73" border="0" alt="Imagem 14" class="imgs" />
			</a>
		</div>
		<div class="panel">
			<a href="#" title="Link 15" >
				<img src="/eec/_imgs/img_videos.jpg" width="100" height="73" border="0" alt="Imagem 15" class="imgs" />
			</a>
		</div>
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