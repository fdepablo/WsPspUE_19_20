package interfaces;

public class MainInterfaces {
	public static void main(String[] args) {
		String palabra = "Felix de pablo";
		Imprimible ip = FactoriaImprimibles.crear(args[0]);
		ip.imprimir(palabra);
	}
}
