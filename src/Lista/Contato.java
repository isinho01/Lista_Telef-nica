package Lista;

public class Contato {
// Classe para armazenar um contato.
	private String Nome;
	private String Telefone;
	
	public Contato() {
		this.Nome = "";
		this.Telefone = "";
	}

	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}

	public String getTelefone() {
		return Telefone;
	}
	public void setTelefone(String telefone) {
		Telefone = telefone;
	}

	
	
}
