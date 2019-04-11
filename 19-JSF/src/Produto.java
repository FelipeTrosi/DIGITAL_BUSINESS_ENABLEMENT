
public class Produto {

	private String nome;
	private int id; 
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Produto(String nome, int id) {
		super();
		this.nome = nome;
		this.id = id;
	}
	public Produto() {
		super();
	}

	
	
}
