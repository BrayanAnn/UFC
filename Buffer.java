package program;
import java.util.concurrent.Semaphore;
public class Buffer extends Thread {
 
    private int item;
    private int idProd;
    private Semaphore semaforoFull;
    private Semaphore semaforoEmpty;
    
    public Buffer() {
    	this.semaforoFull = new Semaphore(0);
    	this.semaforoEmpty = new Semaphore(3); //tam max do buffer
    }
    
    public void setIdProd(int idProdutor) {
    	this.idProd = idProdutor;
    }
    
    public int getIdProd() {
    	return idProd;
    }
    
    public void inserir(int idProdutor, int novoItem){
    	try {
    		semaforoEmpty.acquire();
    		this.item = novoItem;
    		this.idProd = idProdutor;
    		System.out.println("PRODUTOR "+this.idProd+" produziu "+ this.item);
    		semaforoFull.release();
    		
    	}
    	catch(InterruptedException ex) {
    		System.out.println("BUFFER: ERRO ao inserir"+ex.getMessage());
    	}
    }
    
    public void retirar(int idConsumidor) {
    	try {
    		semaforoFull.acquire();
    		
    		System.out.println("CONSUMIDOR "+idConsumidor+" consumiu "+ this.item+ " do produtor "+getIdProd());
    		
    		semaforoEmpty.release(); 
    	}catch(InterruptedException ex) {
    		System.out.println("BUFFER: ERRO ao retirar"+ex.getMessage());
    	}
    		
    }
}



