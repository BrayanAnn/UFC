package colecoes;
import java.util.List;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import entidades.Contato;


public class Lista3 {
	Contato contato = new Contato();
	Map<String, Contato> lista = new HashMap<String ,Contato> ();
	public void addContato(String e, Contato contato) {
		lista.put(e,contato);
	}

	public void removeContato(Contato contato) {
		lista.remove(contato);
	}

	public String retornaContato( Contato contato) {
		if(lista.containsKey(contato)) {
			return "Contato" + contato.getNome() + "encontrado";
		}else {
			return "Contato" + contato.getNome() +  "não encontrado";
		}
	}
	
	public void listaContatos(Contato contato1) {
		System.out.printf("\n\nLISTA HashMap ");
		System.out.printf("\nTamanho da lista de contatos " + lista.size());
		for(Contato contato: lista.values()) {
			 System.out.printf("\nNome:" + contato.getNome());
			 System.out.printf("\nTelefone:" + contato.getTelefone() + "\n --------------");
		}
	}
}
