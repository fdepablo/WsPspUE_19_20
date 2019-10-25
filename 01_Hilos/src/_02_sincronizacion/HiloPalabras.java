package _02_sincronizacion;
public class HiloPalabras implements Runnable {

	private String palabra, palabra2;
	private DosPalabras dosPalabras;

	public HiloPalabras(String palabra, String palabra2, DosPalabras dp) {
		this.palabra = palabra;
		this.palabra2 = palabra2;
		this.dosPalabras = dp;
	}

	@Override
	public void run() {
		dosPalabras.imprimir(palabra, palabra2);
	}
}