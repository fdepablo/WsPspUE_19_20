package videojuego;

public class MainVideojuego {

	public static void main(String[] args) {
		Guerrero g1 = new Guerrero();
		g1.setNombre("Bob Esponja");
		Espada espada = new Espada();
		espada.setTipo("Bastarda");
		g1.setArma(espada);
		
		g1.atacar();

	}

}
