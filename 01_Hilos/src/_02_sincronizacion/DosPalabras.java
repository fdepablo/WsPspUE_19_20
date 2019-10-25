package _02_sincronizacion;
public class DosPalabras {

	//si no decimos nada, todos los hilos pueden entrar a la vez en un metodo
	//por lo tanto cada uno de los tres podria modificar variables y alterar
	//el resultado. En esto caso concreto lo que esta ocurriendo es que los
	//tres hilos imprimen su primera palabra y se quedan dormidos 1 segundo
	//pasado ese tiempo imprimien la segunda palabra.
	//Lo que yo quiero es que hasta que un hilo no imprima las dos palabras
	//no entre el siguiente. Esto lo podemos hacer con la palabra reservada
	//synchronized
	public synchronized void imprimir(String palabra, String palabra2) {
		System.out.println(palabra);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(palabra2);
	}
}

