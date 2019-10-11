package herencia;

public class Tiburon extends Pez {
	
	private int numeroAletas;

	public int getNumeroAletas() {
		return numeroAletas;
	}

	public void setNumeroAletas(int numeroAletas) {
		this.numeroAletas = numeroAletas;
	}

	@Override
	public void zampar(Object comida) {
		if (comida == this) {
			return;
		}
		if (comida instanceof Pez) {
			Pez p = (Pez) comida;
			System.out.println("Soy el tiburón " + this.getNombre() + " y voy a zampar al pez " + p.getNombre());
			this.setPeso(this.getPeso() + (p.getPeso() / 2));
		} else {
			System.out.println("chuuuuuuu!! Uuugh qui asco");
		}
	}
}
