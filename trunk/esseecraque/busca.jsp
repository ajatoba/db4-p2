     
<link href="/eec/_css/estilo.css" rel="stylesheet" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<script>
function submitBusca(){
	document.busca.submit();
}
</script>
<div id="lists">

	 <dt class="fundo_abas">
	    <!--TABELA DE BUSCA-->
	
		<form action="listAssinantes.do?act=search" method="POST" name="busca" target="_parent">
		<table width="300" border="0" cellspacing="3" cellpadding="3">
		  <tr>
		    <td width="64" class="txt_busca_avancada">Nome :</td>
		  </tr>
		  <tr>
		    <td width="236"><input type="text" name="nome" class="form_busca_avancada" id="textfield" /></td>
		  </tr>
		  <tr>
		    <td class="txt_busca_avancada">Posição : </td>
		  </tr>
		  <tr>
		    <td>		    
		    <select name="posicao" styleClass="form_campo_posicao">
		    	<option>Selecione</option>
		    	<option value="GOL">Goleiro</option>
		    	<option value="ZAG">Zagueiro</option>
		    	<option value="LAT">Lateral</option>
		    	<option value="MEI">Meia</option>
		    	<option value="ATA">Atacante</option>
    		</select>
		    
		    </td>
		  </tr>
		  <tr>
		    <td class="txt_busca_avancada">Cidade :</td>
		  </tr>
		  <tr>
		    <td><input type="text" name="cidade" class="form_busca_avancada" id="textfield8" /></td>
		  </tr>
		  <tr>    
		    <td>
		    <input  type="image" src="/eec/_imgs/btn_busca.jpg" name="button" id="button" value="Submit" onclick="javascript: submitBusca();" /></td>
		  </tr>
		</table>
		</form>
	          
	          <!--FIM TABELA DE BUSCA-->
	        </dt>
	        
	        
</div>
