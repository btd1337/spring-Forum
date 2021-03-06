package br.com.itexto.springforum.controladores;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.itexto.springforum.model.Usuario;

public class AutenticacaoController {
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@RequestParam("login") String login, @RequestParam("senha") String senha, HttpSession sessao){
		Usuario usuario = daoUsuario.getUsuario(login, senha);
		if(usuario == null){
			return "loginFalho";
		}else{
			usuario.setUltimoLogin(new Date());
			daoUsuario.persistir(usuario);
			sessao.setAttribute("usuario", usuario);
			return "redirect:/";
		}
	}
}
