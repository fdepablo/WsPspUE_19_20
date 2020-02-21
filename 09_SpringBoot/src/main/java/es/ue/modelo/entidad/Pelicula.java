package es.ue.modelo.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Entity
//Esta anotación le decimos que va a haber una tabla en nuestra base de datos que se llama pelicula
//y con los campos del valor de sus atributos
@Table(name = "peliculas")
//Con esta anotación le podemos cambiar el nombre de la tabla
public class Pelicula {

	@Id
	// Con esta anotación le decimos que este atributo será la PK
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String titulo = "Stas Warra";
	@Column(name = "nombre_director")
	private String director;

	public void setId(int id) {
		this.id = id;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	private String genero;

	public int getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getDirector() {
		return director;
	}

	public String getGenero() {
		return genero;
	}

	@Override
	public String toString() {
		return "Pelicula [id=" + id + ", titulo=" + titulo + ", director=" + director + ", genero=" + genero + "]";
	}
}
