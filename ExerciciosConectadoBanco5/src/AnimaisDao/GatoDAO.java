package AnimaisDao;

public class GatoDAO extends AnimalDAO {

	public GatoDAO(String nome, String cor, int qtdPatas) {
		super(nome, cor, qtdPatas);
		this.setRetornaSom("Miau");
	}

	
}
