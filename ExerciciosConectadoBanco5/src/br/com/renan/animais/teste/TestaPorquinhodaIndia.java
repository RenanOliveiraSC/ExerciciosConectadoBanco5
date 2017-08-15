package br.com.renan.animais.teste;

import java.util.List;

import br.com.renan.animais.model.PorquinhodaIndia;
import br.com.renan.animais.service.PorquinhodaIndiaService;

public class TestaPorquinhodaIndia {

	public static void main(String[] args) throws Exception {
		PorquinhodaIndiaService PorquinhodaIndiaService = new PorquinhodaIndiaService();

		List<PorquinhodaIndia> lPorquinhodaIndia = PorquinhodaIndiaService.listar();
		for (PorquinhodaIndia PorquinhodaIndia : lPorquinhodaIndia) {
			System.out.println(PorquinhodaIndia.getNome());
			
		}
	}
}

