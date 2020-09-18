package Programa;


import entidades.Contato;
import colecoes.Lista1;
import colecoes.Lista2;
import colecoes.Lista3;

public class Programa {
	
	public static void main(String[] args) {
		Contato c1 = new Contato();
		Contato c2 = new Contato();
		
		c1.setNome("Brayan");
		c1.setTelefone(123);
		c2.setNome("Bruno");
		c2.setTelefone(321);
		
		//ArrayList
		Lista1 lista1 = new Lista1();
		lista1.addContato(c1);
		lista1.addContato(c2);
		lista1.listaContatos(c1);
		
		//HashSet
		Lista2 lista2 = new Lista2();
		lista2.addContato(c1);
		lista2.addContato(c1); //Mesmo colocando um objeto identico a mais o HashSet consegue filtrar e não colocá-lo novamente
		lista2.addContato(c2);
		lista2.listaContatos(c1);
		
		//HashMap
		Lista3 lista3 = new Lista3();
		lista3.addContato("0",c1);
		lista3.addContato("1",c2);
		lista3.listaContatos(c1);
		
		
	}
}
