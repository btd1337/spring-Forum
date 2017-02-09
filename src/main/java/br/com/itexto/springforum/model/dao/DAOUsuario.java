package br.com.itexto.springforum.model.dao;

import java.util.List;

import br.com.itexto.springforum.model.Usuario;

public interface DAOUsuario extends DAOBase<Usuario> {
	// busca usu�rio por login e senha
	public Usuario getUsuario(String login, String senha);
	
	// busca usu�rio por login
	public Usuario getUsuario(String login);
	
	// retorna a lista de usu�rios com p�gina��o
	public List<Usuario> list(int offset, int max);
}
