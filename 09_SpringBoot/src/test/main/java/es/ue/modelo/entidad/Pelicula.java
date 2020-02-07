package es.ue.modelo.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Entity
//esta anotacion le decimos que va a haber una tabla
//que se llama pelicula y con los campos del valor de sus 
//atributos
@Table(name = "peliculas")
//con esta anotacion cambiamos el nombre de la tabla
public class Pelicula {
	@Id
	//Esta anotacion le decimos que este atributo sera la PK
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String titulo = "La guerra de las galaxias";
	@Column(name= "nombre_director")
	private String director;
	private String genero;
	
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
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	@Override
	public String toString() {
		return "Pelicula [id=" + id + ", titulo=" + titulo + ", director=" + director + ", genero=" + genero + "]";
	}
	
	
}
