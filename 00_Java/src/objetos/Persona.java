package objetos;

public class Persona {

	public String nombre;
	public int edad;
	public double peso;
	
	public Direccion direccion;
	
	private static int numPersonas;

	public Persona(String nombre, int edad, double peso) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		numPersonas++;
	}
	
	public Persona() {
		numPersonas++;
	}
	
	public static int getNumPersonas() {
		return numPersonas;
	}

	public void andar() {
		System.out.println("Soy la persona " + this.nombre + " y voy a andar");
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", direccion=" + direccion + "]";
	}
}
