package br.com.itexto.springforum.controladores;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OlaMundoController {
	
	@RequestMapping("/ola")
	public String olaMundo(Model model) {
		model.addAttribute("data", new Date());
		return "mundo";
	}
}
