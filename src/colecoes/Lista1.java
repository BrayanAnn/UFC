package colecoes;


import java.util.List;
import java.util.ArrayList;
import entidades.Contato;


public class Lista1 {
	Contato contato = new Contato();
	List <Contato> lista = new ArrayList<Contato> ();
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
			return "Contato" + contato.getNome() +  "não encontrado";
		}
	}
	
	public void listaContatos(Contato contato1) {
		System.out.printf("LISTA ArrayList ");
		System.out.printf("\nTamanho da lista de contatos " + lista.size());
		for(Contato contato: lista) {
			 System.out.printf("\nNome:" + contato.getNome());
			 System.out.printf("\nTelefone:" + contato.getTelefone()+ "\n --------------");
		}
	}
}
