package _01_hilos;

import java.util.concurrent.ThreadLocalRandom;

//En java tenemos dos maneras de crear hilos, la primera
//seria extendiendo de la clase Thread
public class HiloThread extends Thread{
	
	private int numero;
	
	public HiloThread(int numero) {
		this.numero = numero;
	}

	//este metodo es equivalente al metodo main, sera donde
	//se inicie la ejecución del hilo y el hilo morira cuando
	//se salga del run
	@Override
	public void run() {
		System.out.println("Arrancando hilo: " + Thread.currentThread().getName());
		for (int i = 0; i < numero; i++) {
			System.out.println("calculando numero...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}//Duerme el hilo de ejecucion durante 2000 milisegundos
			int numero = ThreadLocalRandom.current().nextInt(1, 101);
			System.out.println("El numero calculado es: " + numero);
		}
	}

}
