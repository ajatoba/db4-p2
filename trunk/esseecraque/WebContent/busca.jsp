

<script>
function submitBusca(){
	document.busca.submit();
}
</script>

<div id="box_busca">
<div id="top_busca"></div>
<div id="form">

		<table width="100%" border="0" cellspacing="3" cellpadding="3">
		<form action="/esseecraque/listAssinantes.do?act=search" method="POST" name="busca" target="_parent">
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
		    <select name="posicao" class="form_campo_posicao">
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
		    <div style=" margin-left:230px;"><input  type="image" src="/eec/_imgs/btn_buscar.jpg" name="button" id="button" value="Submit" onclick="javascript: submitBusca();" /></div></td>
		  </tr></form>
		</table>
		
</div>

</div>
