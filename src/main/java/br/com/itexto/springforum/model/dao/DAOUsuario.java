package br.com.itexto.springforum.model.dao;

import java.util.List;

import br.com.itexto.springforum.model.Usuario;

public interface DAOUsuario extends DAOBase<Usuario> {
	// busca usuário por login e senha
	public Usuario getUsuario(String login, String senha);
	
	// busca usuário por login
	public Usuario getUsuario(String login);
	
	// retorna a lista de usuários com páginação
	public List<Usuario> list(int offset, int max);
}
