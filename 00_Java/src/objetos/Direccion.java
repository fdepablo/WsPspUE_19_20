package objetos;

public class Direccion {
	
	public String nombreVia;
	public int numero;
	public String tipoVia;
	public String cp;

	@Override
	public String toString() {
		return "Direccion [nombreVia=" + nombreVia + ", numero=" + numero + ", tipoVia=" + tipoVia + ", cp=" + cp + "]";
	}
}
