<%@ taglib uri="/WEB-INF/TLD/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/TLD/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/TLD/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>


<div id="lists"><img src="_imgs/btn_jogadores.jpg" class="linkado"/><img src="_imgs/btn_posicoes.jpg" class="linkado"/><img src="_imgs/btn_categorias.jpg" class="linkado"/>
  
  
      <div>
        <dt class="fundo_abas">
          <dt class="conteudo_abas">
          <!--TABELA DE BUSCA-->
          <table width="300" border="0" cellspacing="3" cellpadding="3">
  <tr>
    <td width="64" class="txt_busca_avancada">Nome :</td>
    <td width="236"><input type="text" name="textfield" class="form_busca_avancada" id="textfield" /></td>
  </tr>
  <tr>
    <td class="txt_busca_avancada">Posição : </td>
    <td><input type="text" name="textfield2" class="form_busca_avancada" id="textfield2" /></td>
  </tr>
  <tr>
    <td class="txt_busca_avancada">Idade :</td>
    <td><input name="textfield3" type="text" class="form_busca_avancada_02" id="textfield3" size="5" /> 
      até 
      <input name="textfield9" type="text" class="form_busca_avancada_02" id="textfield9" size="5" /></td>
  </tr>
  <tr>
    <td class="txt_busca_avancada">Altura : </td>
    <td><input type="text" name="textfield4" class="form_busca_avancada" id="textfield4" /></td>
  </tr>
  <tr>
    <td class="txt_busca_avancada">Peso :</td>
    <td><input type="text" name="textfield5" class="form_busca_avancada" id="textfield5" /></td>
  </tr>
  <tr>
    <td class="txt_busca_avancada">Clube :</td>
    <td><input type="text" name="textfield6" class="form_busca_avancada" id="textfield6" /></td>
  </tr>
  <tr>
    <td class="txt_busca_avancada">Título :</td>
    <td><input type="text" name="textfield7" class="form_busca_avancada" id="textfield7" /></td>
  </tr>
  <tr>
    <td class="txt_busca_avancada">Cidade :</td>
    <td><input type="text" name="textfield8" class="form_busca_avancada" id="textfield8" /></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td><input type="submit" name="button" id="button" value="Submit" /></td>
  </tr>
</table>
          
          <!--FIM TABELA DE BUSCA-->
          </dt>
        </dt>
      </div>
  
</div>
