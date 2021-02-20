package program;


public class Produtor extends Thread {
    private int idProdutor;
    private Buffer pilha;
 
    public Produtor(int id, Buffer p) {
        idProdutor = id;
        pilha = p;
    }
 
    public void run() {
        for (int i = 1; i <= 10; i++) {//numeros a serem produzidos
            this.pilha.inserir(idProdutor, i);
        }
        System.out.println("Produtor #" + idProdutor + " concluido!");
    }
}
