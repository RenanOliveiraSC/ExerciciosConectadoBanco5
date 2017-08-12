package Teste;

public class TesteAnimais {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro("BoB", "Brnaco", 4);
		Gato gato = new Gato("Mel", "Amarelo", 4);
		PorquinhodaIndia porquinhodaIndia = new PorquinhodaIndia("Pork", "Marrom", 4);
		
		System.out.println("************     Bichonhos de Estimação     **************"+
		                   "\nChame: "+cachorro.getNome()+"\nEscute: "+cachorro.getRetornaSom()+
		                   "\nChame: "+gato.getNome()+"\nEscute: "+gato.getRetornaSom()+
		                   "\nChame: "+porquinhodaIndia.getNome()+"\nEscute: "+porquinhodaIndia.getRetornaSom());
	}
}
