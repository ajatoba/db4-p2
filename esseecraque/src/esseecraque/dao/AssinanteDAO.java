package esseecraque.dao;

import java.util.List;

import esseecraque.bean.Assinante;

public interface AssinanteDAO {

	
	public abstract void salvar(Assinante assinante);
	
	public abstract void atualizar(Assinante assinante);
	
	public abstract List buscarAssinante(int idAssinante);
	
	public abstract Assinante loginAssinante(String email, String senha);
	
	public abstract List buscarAssinanteLetra(String letra);
	
	public abstract Assinante remindPassword(String email);
	
	public abstract int deleteClubesAssinante(Assinante assinante);
	
	public abstract int deleteTorneiosAssinante(Assinante assinante);
}
