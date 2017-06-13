package br.com.eponto.controller;

import java.util.Arrays;
import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.eponto.modelo.Funcionario;
import br.com.eponto.modelo.HoraAtual;

@Controller
@RequestMapping("/registra")
public class RegistraController {

	@Autowired
	private RegistraDao dao;
	
	@RequestMapping(method = RequestMethod.GET)
	public String formRegistra(){
		return "form-registra";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String registraHora(HoraAtual hora) {
				
		Calendar instance = Calendar.getInstance();
		hora.setHora(instance);
		
		Funcionario f1 = new Funcionario();
		f1.setCpfFunc("1615616151");
		f1.setIdFunc(1);
		f1.setNomeFunc("julio gouveia");
		f1.setHoraAtual(Arrays.asList(hora));
		
		dao.cadastra(f1);
		
		System.out.println(f1.getHoraAtual().get(0).getHora().getTime());
		return "redirect:/registra";
	}

}
