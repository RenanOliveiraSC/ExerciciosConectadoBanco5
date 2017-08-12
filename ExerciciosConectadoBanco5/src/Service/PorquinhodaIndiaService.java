package Service;

public class PorquinhodaIndiaService extends AnimalService {

	public PorquinhodaIndiaService(String nome, String cor, int qtdPatas) {
		super(nome, cor, qtdPatas);
		this.setRetornaSom("Nhôi");
	}


}
