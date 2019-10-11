package herencia;

public abstract class Pez extends Animal {

	@Override
	public void zampar(Object comida) {
		if (comida instanceof Plancton) {
			if (comida instanceof Plancton) {
				System.out.println("Soy un pez\ny me voy a comer un plancton que pasaba por aquí.\nmmmmmmm");
				Plancton p = (Plancton) comida;
				this.setPeso(this.getPeso() + (p.getPeso() / 2));
				System.out.println("Mi nuevo peso " + this.getPeso());
			}
		} else {
			System.out.println("Uuuuuggh qui asco");
		}
	}

	@Override
	public String toString() {
		return "Pez [getPeso()=" + getPeso() + ", getNombre()=" + getNombre() + ", getEdad()=" + getEdad() + "]";
	}
}
