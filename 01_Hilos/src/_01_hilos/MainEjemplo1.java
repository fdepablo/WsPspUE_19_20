package _01_hilos;

import java.util.concurrent.ThreadLocalRandom;

public class MainEjemplo1 {
	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			System.out.println("calculando numero...");
			Thread.sleep(2000);//Duerme el hilo de ejecucion durante 2000 milisegundos
			int numero = ThreadLocalRandom.current().nextInt(1, 101);
			System.out.println("El numero calculado es: " + numero);
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println("calculando numero...");
			Thread.sleep(2000);//Duerme el hilo de ejecucion durante 2000 milisegundos
			int numero = ThreadLocalRandom.current().nextInt(1, 101);
			System.out.println("El numero calculado es: " + numero);
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println("calculando numero...");
			Thread.sleep(2000);//Duerme el hilo de ejecucion durante 2000 milisegundos
			int numero = ThreadLocalRandom.current().nextInt(1, 101);
			System.out.println("El numero calculado es: " + numero);
		}
		System.out.println("Fin del hilo");
	}
}
