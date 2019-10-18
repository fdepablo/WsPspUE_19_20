package _01_hilos;

import java.util.concurrent.ThreadLocalRandom;

//La otra manera de crear hilos en java, es mediante la interfaz
//runnable
public class HiloRunnable implements Runnable {

	private int numero;
	
	public HiloRunnable(int numero) {
		this.numero = numero;
	}
	
	@Override
	public void run() {
		System.out.println("Arrancando hilo: " + Thread.currentThread().getName());
		for (int i = 0; i < numero; i++) {
			System.out.println(i + " " + Thread.currentThread().getName() 
					+ " calculando numero...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}//Duerme el hilo de ejecucion durante 2000 milisegundos
			int numero = ThreadLocalRandom.current().nextInt(1, 101);
			System.out.println(i + " " + Thread.currentThread().getName() 
					+ " El numero calculado es: " + numero);
		}
		
		System.out.println("Parando hilo: " + Thread.currentThread().getName());
	}

}
