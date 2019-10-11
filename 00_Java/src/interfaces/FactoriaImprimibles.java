package interfaces;

public class FactoriaImprimibles {
	
	public static Imprimible crear(String s) {
		switch (s) {
		case "if":
			return new ImprimirFichero();
		case "ip":
			return new ImprimirPantalla();
		default:
			return null;
		}
	}
}
