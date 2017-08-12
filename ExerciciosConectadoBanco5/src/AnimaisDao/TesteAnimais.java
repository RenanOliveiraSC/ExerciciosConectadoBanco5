package AnimaisDao;

public class TesteAnimais {

	public static void main(String[] args) {
		CachorroDAO cachorro = new CachorroDAO("BoB", "Brnaco", 4);
		GatoDAO gato = new GatoDAO("Mel", "Amarelo", 4);
		PorquinhodaIndiaDAO porquinhodaIndia = new PorquinhodaIndiaDAO("Pork", "Marrom", 4);
		
		System.out.println("************     Bichonhos de Estimação     **************"+
		                   "\nChame: "+cachorro.getNome()+"\nEscute: "+cachorro.getRetornaSom()+
		                   "\nChame: "+gato.getNome()+"\nEscute: "+gato.getRetornaSom()+
		                   "\nChame: "+porquinhodaIndia.getNome()+"\nEscute: "+porquinhodaIndia.getRetornaSom());
	}
}
