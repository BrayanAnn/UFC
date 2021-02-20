package program;


public class Consumidor extends Thread {
    private int idConsumidor;
    private Buffer pilha;
 
    public Consumidor(int id, Buffer p) {
        idConsumidor = id;
        pilha = p;
    }
 
    public void run() {
        for (int i = 1; i <= 10; i++) {//numeros a serem consumidos
            this.pilha.retirar(idConsumidor);
        }
        System.out.println("Consumidor #" + idConsumidor + " concluido!");
    }
}