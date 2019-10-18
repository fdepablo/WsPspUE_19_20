package _01_hilos;

public class MainHiloThread {
	//En un programa con varios hilos de ejecucion en java, el programa
	//no va a parar cuando se acabe el main, sino cuando se acaben todos
	//los hilos de ejecucion que tengamos
	public static void main(String[] args) {
		HiloThread ht1 = new HiloThread(5);
		HiloThread ht2 = new HiloThread(5);
		ht1.setName("Hilo 1");
		ht2.setName("Hilo 2");
		ht2.setPriority(1);//la prioridad de los hilos va 1 al 10, pero no funciona 100%
		
		//si ejecutamos el run() directamente no habria diferencia
		//de la programacion secuencial, es decir no se arranca
		//ningun hilo
		//System.out.println("Ejecutando run ht1");
		//ht1.run();
		//System.out.println("Ejecutando run ht2");
		//ht2.run();
		
		//la manera de arrancar hilos en java es ejecutando el metodo
		//start() de la clase Thread
		
		System.out.println("Ejecutando start ht1");
		ht1.start();
		System.out.println("Ejecutando start ht2");
		ht2.start();
		
		System.out.println("Fin del hilo principal");
	}
}
