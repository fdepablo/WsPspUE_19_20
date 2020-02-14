package es.ue.modelo.negocio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.ue.modelo.entidad.Videojuego;
import es.ue.modelo.persistencia.DaoVideojuego;

@Service
public class GestorVideojuego {

	@Autowired
	private DaoVideojuego daoVideojuego;
	
	/**
	 * Metodo que persiste un videojugo. El videojuego <b>debe</b>
	 * de tener al menos 4 caracteres en su titulo
	 * @param v El videojuego a dar de alta
	 * @return 1 en caso de que el videojuego tenga menos de 4 caracteres
	 * .0 en caso de que se haya podido persistir
	 */
	public int alta(Videojuego v) {
		//metemos logica de negocio
		if(v.getTitulo().length() <= 3) {
			return 1;
		}
		
		daoVideojuego.save(v);
		return 0;
	}
	
	public List<Videojuego> listar(){
		return daoVideojuego.findAll();
	}
	
	/**
	 * 
	 * @param id a buscar
	 * @return el videojuego o null en caso de que no exista el id
	 */
	public Videojuego buscarPorId(int id) {
		Optional<Videojuego> optional = daoVideojuego.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}else {
			return null;
		}
	}
	
	public void modificar(Videojuego v) {
		daoVideojuego.save(v);
	}
	
	public void borrar(int id) {
		daoVideojuego.deleteById(id);
	}
}
