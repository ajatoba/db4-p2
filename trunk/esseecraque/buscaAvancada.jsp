<script>
function submitBusca(){
	document.busca.submit();
}
</script>
<div id="lists"><a href="az.jsp" border="0"><img src="/eec/_imgs/btn_jogadores.jpg" class="linkado"/><img src="/eec/_imgs/btn_posicoes.jpg" class="linkado"/><img src="/eec/_imgs/btn_categorias.jpg" class="linkado"/></a>
  
  
      <div>
        <dt class="fundo_abas">
               <!--TABELA DE BUSCA-->

<form action="listAssinantes.do?act=search" method="POST" name="busca">
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
    <td><input type="text" name="posicao" class="form_busca_avancada" id="textfield2" /></td>
  </tr>
  <tr>
    <td class="txt_busca_avancada">Cidade :</td>
  </tr>
  <tr>
    <td><input type="text" name="cidade" class="form_busca_avancada" id="textfield8" /></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td><input type="button" name="button" id="button" value="Submit" onclick="javascript:submitBusca();" /></td>
  </tr>
</table>
</form>
          
          <!--FIM TABELA DE BUSCA-->
        </dt>
      </div>
  
</div>
