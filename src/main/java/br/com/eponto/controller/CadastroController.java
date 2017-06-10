package br.com.eponto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.eponto.modelo.Funcionario;

@Controller
@RequestMapping("/cadastra")
public class CadastroController {

	@RequestMapping(method = RequestMethod.GET)
	public String form() {
		return "form-cadastra";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String cadastro(Funcionario func) {
		return "redirect:/";
	}

}
