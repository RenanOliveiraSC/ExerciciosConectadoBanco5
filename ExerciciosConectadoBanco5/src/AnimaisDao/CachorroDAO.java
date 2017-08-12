package AnimaisDao;

public class CachorroDAO extends AnimalDAO {

	public CachorroDAO(String nome, String cor, int qtdPatas) {
		super(nome, cor, qtdPatas);
		this.setRetornaSom("AuAu");
	}

}