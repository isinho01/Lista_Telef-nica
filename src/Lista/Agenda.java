package Lista;

public class Agenda {
 //Classe principal que serve para armazenar a lista de seus contatos
	private Contato [] contato;
	private int Quantidade_contatos;
	 private int tamanho =10;
	public Agenda () {
		this.contato = new Contato[tamanho];
		this.Quantidade_contatos = 0;
		// varrendo toda a matriz para que deixe tudo nulo.
		for (int i=0; i<tamanho;i++) {
			contato [ i ]= null;
		}
	}
	public boolean inserir(String Nome, String Telefone) {
		// varredura no array para inserir um novo contato
		for (int i =0; i<tamanho; i++) {
			if (contato [i] == null) {
				contato [i] = new Contato ();
				contato [i].setNome(Nome);
				 contato[i].setTelefone(Telefone);
				 Quantidade_contatos += 1;
				 return true;
			}
		}
		return false;
	}
	public Contato buscar (String Nome) {
		for (int i =0; i<tamanho; i++) {
			if (contato [i] != null) {
				if (contato [i].getNome().equals(Nome)) {
					return contato [i];
				}
			}
			
		}
		return null;
				
	}
	public boolean Remover(String Nome) {
		for (int i =0; i<tamanho; i++) {
			if (contato [i].getNome().equals(Nome)) {
				contato [i] = null;
				Quantidade_contatos -=1;
				return true;
			}
		}
		return false;
		
	}
	public int getQuantidade_contatos() {
		return Quantidade_contatos;
	}
	public int getTamanho () {
		return tamanho;
	}
}
