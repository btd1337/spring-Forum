package br.com.itexto.springforum.model.dao;

import java.util.List;

public interface DAOAssunto {

	// retorna a lista de assuntos com paginação
	public List<Assunto> list(int offset, int max);
	
	// persiste o assunto
	public void persistir(Assunto objeto);
	
	// exclui o assunto
	public void excluir(Assunto objeto);
	
	// retorna um assunto por seu identifacador 
	public Assunto get(Long id);
	
}
