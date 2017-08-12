package AnimaisDao;

public class AnimalDAO {

	
	private String nome;
	private String cor;
	private int qtdPatas;
	private String retornaSom;

	public AnimalDAO(String nome, String cor, int qtdPatas) {
		this.nome = nome;
		this.cor = cor;
		this.qtdPatas = qtdPatas;
	}
	
		public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getQtdPatas() {
		return qtdPatas;
	}

	public void setQtdPatas(int qtdPatas) {
		this.qtdPatas = qtdPatas;
	}

	public String getRetornaSom() {
		return retornaSom;
	}

	public void setRetornaSom(String retornaSom) {
		this.retornaSom = retornaSom;
	}

}
