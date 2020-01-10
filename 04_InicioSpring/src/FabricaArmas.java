
public class FabricaArmas {
	public static Arma crear(String nombreArma) {
		Arma arma = null;
		
		switch (nombreArma) {
		case "espada":
			arma = new Espada();
			return arma;
		case "arco":
			arma = new Arco();
			return arma;
		default:
			return arma;
		}
	}
}
