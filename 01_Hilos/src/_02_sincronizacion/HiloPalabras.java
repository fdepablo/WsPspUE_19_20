package _02_sincronizacion;
public class HiloPalabras implements Runnable {

	private String palabra, palabra2;
	private DosPalabras palabras;

	public HiloPalabras(String palabra, String palabra2, DosPalabras palabras) {
		this.palabra = palabra;
		this.palabra2 = palabra2;
		this.palabras = palabras;
	}

	@Override
	public void run() {
		palabras.imprimir(palabra, palabra2);
	}
}