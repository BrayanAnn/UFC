package program	;

public class main {
	public static void main(String[] args) {
		Buffer bufferProdCons = new Buffer();
		int qtdProdutor = 3;
		int qtdConsumidor = 3;
		
		for(int i=1; i<=qtdProdutor; i++) {
			Produtor produtor = new Produtor(i, bufferProdCons);
			produtor.start();
		}
		for(int y=1; y<=qtdConsumidor; y++) {
			Consumidor consumidor = new Consumidor(y, bufferProdCons);
			consumidor.start();
		}
		
	}
}
