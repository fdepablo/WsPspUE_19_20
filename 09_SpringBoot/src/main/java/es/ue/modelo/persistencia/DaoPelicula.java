package es.ue.modelo.persistencia;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.ue.modelo.entidad.Pelicula;

@Repository
public interface DaoPelicula extends JpaRepository<Pelicula, Integer>{
	
	public List<Pelicula> findByTitulo(String titulo);
	public List<Pelicula> findByTituloAndGenero(String titulo,String genero);
	public List<Pelicula> findByTituloOrGenero(String titulo,String genero);
	public List<Pelicula> findByTituloContaining(String titulo);
	public List<Pelicula> findByTituloIgnoreCase(String titulo);
	public List<Pelicula> findByTituloContainingIgnoreCase(String titulo);
	public List<Pelicula> findByTituloAndGeneroOrderByTitulo(String titulo,String genero);
	
}
