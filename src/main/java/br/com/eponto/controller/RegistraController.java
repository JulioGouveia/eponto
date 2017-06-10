package br.com.eponto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/registra")
public class RegistraController {

	@RequestMapping(method = RequestMethod.GET)
	public String formRegistra(){
		return "form-registra";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String registraHora() {

		return "redirect:/registra";
	}

}
