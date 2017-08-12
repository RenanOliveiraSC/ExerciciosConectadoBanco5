package Service;

public class TesteAnimais {

	public static void main(String[] args) {
		CachorroService cachorro = new CachorroService("BoB", "Brnaco", 4);
		GatoService gato = new GatoService("Mel", "Amarelo", 4);
		PorquinhodaIndiaService porquinhodaIndia = new PorquinhodaIndiaService("Pork", "Marrom", 4);
		
		System.out.println("************     Bichonhos de Estimação     **************"+
		                   "\nChame: "+cachorro.getNome()+"\nEscute: "+cachorro.getRetornaSom()+
		                   "\nChame: "+gato.getNome()+"\nEscute: "+gato.getRetornaSom()+
		                   "\nChame: "+porquinhodaIndia.getNome()+"\nEscute: "+porquinhodaIndia.getRetornaSom());
	}
}
