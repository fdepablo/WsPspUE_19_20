package herencia;

public abstract class Animal {

	private double peso;
	private String nombre;
	private int edad;

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public abstract void zampar(Object comida);

	@Override
	public String toString() {
		return "Animal [peso=" + peso + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
}
