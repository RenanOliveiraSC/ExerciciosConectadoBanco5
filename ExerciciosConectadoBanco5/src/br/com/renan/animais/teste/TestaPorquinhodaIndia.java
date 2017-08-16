package br.com.renan.animais.teste;

import java.sql.SQLException;
import java.util.List;

import br.com.renan.animais.model.Cachorro;
import br.com.renan.animais.model.PorquinhodaIndia;
import br.com.renan.animais.service.CachorroService;
import br.com.renan.animais.service.PorquinhodaIndiaService;

public class TestaPorquinhodaIndia {

	public static void main(String[] args) throws SQLException {
		// Instância da classe Service
		PorquinhodaIndiaService porquinhodaIndiaService = new PorquinhodaIndiaService();
		
		List<PorquinhodaIndia> lPorquinhodaIndia = porquinhodaIndiaService.listarPorquinhosDaIndia();
		for (PorquinhodaIndia pork : lPorquinhodaIndia) {
			imprimirPorquinhodaIndia(pork);
		}

		PorquinhodaIndia porquinhodaIndia = new PorquinhodaIndia("Pig", "Amarelo", 4, "Porco");
		porquinhodaIndiaService.inserir(porquinhodaIndia);

		// Alterar o nome de um porquinhodaIndia
		// porquinhodaIndiaService.alterar(codigo, "Peppa");

		// Remover um porquinhodaIndia
		// porquinhodaIndiaService.excluir(codigo);

		System.out.println();

		System.out.println("*******Lista Atualizada**********");
		
		List<PorquinhodaIndia> lPorquinhodaIndia2 = porquinhodaIndiaService.listarPorquinhosDaIndia();
		for (PorquinhodaIndia pork : lPorquinhodaIndia2) {
			imprimirPorquinhodaIndia(pork);
		}
		
	}

	private static void imprimirPorquinhodaIndia(PorquinhodaIndia pork) {
		// TODO Auto-generated method stub
		
	}
}