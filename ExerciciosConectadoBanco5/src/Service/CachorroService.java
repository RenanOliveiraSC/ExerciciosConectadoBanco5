package Service;

public class CachorroService extends AnimalService {

	public CachorroService(String nome, String cor, int qtdPatas) {
		super(nome, cor, qtdPatas);
		this.setRetornaSom("AuAu");
	}

}