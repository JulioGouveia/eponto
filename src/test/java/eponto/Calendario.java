package eponto;

import java.util.ArrayList;
import java.util.Calendar;

import br.com.eponto.modelo.Funcionario;
import br.com.eponto.modelo.HoraAtual;

public class Calendario {

	public static void main(String[] args) {
		
		Calendar instance = Calendar.getInstance();
		instance.getTime();
		
		HoraAtual hora = new HoraAtual();
		hora.setHora(instance);
		
		ArrayList<HoraAtual> arrayList = new ArrayList<HoraAtual>();
		arrayList.add(hora);
		
		Funcionario f1 = new Funcionario();
		f1.setCpfFunc("1615616151");
		f1.setIdFunc(1);
		f1.setNomeFunc("julio gouveia");
		f1.setHoraAtual(arrayList);
		
		System.out.println(f1.getHoraAtual().get(0).getHora().getTime() + f1.getNomeFunc());
	}
	
}
