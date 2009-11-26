package esseecraque.dao;

import esseecraque.bean.Voto;

public interface VotoDAO {

	public abstract void salvar(Voto voto);
	
	public abstract Voto buscarVoto(Long idVideo);
	
}
