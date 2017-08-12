package Service;

public class GatoService extends AnimalService {

	public GatoService(String nome, String cor, int qtdPatas) {
		super(nome, cor, qtdPatas);
		this.setRetornaSom("Miau");
	}

	
}
