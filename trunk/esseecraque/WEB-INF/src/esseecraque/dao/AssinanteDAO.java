package esseecraque.dao;

import java.util.List;

import esseecraque.bean.Assinante;

public interface AssinanteDAO {

	
	public abstract void salvar(Assinante assinante);
	
	public abstract void atualizar(Assinante assinante);
	
	public abstract List buscarAssinante(int idAssinante);
	
	public abstract List loginAssinante(String email, String senha);
		
}
