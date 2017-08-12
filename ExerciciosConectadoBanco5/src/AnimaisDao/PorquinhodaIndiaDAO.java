package AnimaisDao;

public class PorquinhodaIndiaDAO extends AnimalDAO {

	public PorquinhodaIndiaDAO(String nome, String cor, int qtdPatas) {
		super(nome, cor, qtdPatas);
		this.setRetornaSom("Nhôi");
	}


}
