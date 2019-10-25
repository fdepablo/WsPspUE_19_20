package _02_sincronizacion;
public class DosPalabras {

	public void imprimir(String palabra, String palabra2) {
		System.out.println(palabra);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(palabra2);
	}
}

