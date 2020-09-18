package colecoes;
import java.util.Set;
import java.util.HashSet;
import entidades.Contato;


public class Lista2 {
	Contato contato = new Contato();
	Set<Contato> lista = new HashSet<Contato> ();
	public void addContato(Contato contato) {
		lista.add(contato);
	}

	public void removeContato(Contato contato) {
		lista.remove(contato);
	}

	public String retornaContato(Contato contato) {
		if(lista.contains(contato)) {
			return "Contato" + contato.getNome() + "encontrado";
		}else {
			return "Contato" + contato.getNome() +  "n�o encontrado";
		}
	}
	
	public void listaContatos(Contato contato1) {
		System.out.printf("\n\nLISTA HashSet ");
		System.out.printf("\nTamanho da lista de contatos " + lista.size());
		for(Contato contato: lista) {
			 System.out.printf("\nNome:" + contato.getNome());
			 System.out.printf("\nTelefone:" + contato.getTelefone() + "\n --------------");
		}
	}
}