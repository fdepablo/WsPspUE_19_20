package _01_hilos;

public class MainHiloRunnable {

	public static void main(String[] args) {
		HiloRunnable hr1 = new HiloRunnable(5);
		HiloRunnable hr2 = new HiloRunnable(5);
		
		//Necesito crear los objetos capaces de arrancar hilos
		Thread t1 = new Thread(hr1);
		Thread t2 = new Thread(hr2);
		t1.setName("Hilo runnable 1");
		t2.setName("Hilo runnable 2");
		
		t1.start();
		t2.start();
		
		System.out.println("Fin del hilo principal");
	}

}
