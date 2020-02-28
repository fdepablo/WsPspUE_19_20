package es.ue.modelo.entidad;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Videojuego {

	private int id;
	private String titulo;
	private double nota;
	private double precio;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Videojuego [id=" + id + ", titulo=" + titulo + ", nota=" + nota + ", precio=" + precio + "]";
	}
	
	
}
