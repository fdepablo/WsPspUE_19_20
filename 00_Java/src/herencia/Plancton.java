package herencia;

public class Plancton extends Animal {

	@Override
	public void zampar(Object comida) {
		if (comida instanceof Plancton) {
			System.out.println("Soy un plancton\ny me voy a comer otro plancton que pasaba por aquí.\nmmmmmmm");
			Plancton p = (Plancton) comida;
			this.setPeso(this.getPeso() + (p.getPeso() / 2));
		} else {
			System.out.println("Uuuuuggh qui asco");
		}
	}
}
