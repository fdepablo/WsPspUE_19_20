package es.ue.controlador;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import es.ue.modelo.entidad.Videojuego;
import es.ue.modelo.negocio.GestorVideojuego;

@RestController
public class ControladorVideojuego {

	@Autowired
	private GestorVideojuego gv;
	
	@PostMapping(path="videojuegos",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Videojuego> alta(
			@RequestBody Videojuego videojuego){
		int respuesta = gv.alta(videojuego);
		if(respuesta == 1) {
			return new ResponseEntity<Videojuego>(HttpStatus.BAD_REQUEST);
		}else {
			return new ResponseEntity<Videojuego>(videojuego,HttpStatus.CREATED);
		}
	}
	
	@GetMapping(path="videojuegos",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Videojuego>> listar(){
		List<Videojuego> lista = gv.listar();
		return new ResponseEntity<List<Videojuego>>(lista,HttpStatus.OK);
	}
	
	@GetMapping(path="videojuegos/{id_videojuego}",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Videojuego> obtener(@PathVariable("id_videojuego") int id){
		Videojuego v = gv.buscarPorId(id);
		return new ResponseEntity<Videojuego>(v,HttpStatus.OK);
	}
	
	@PutMapping(path="videojuegos/{id_videojuego}",
			produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Videojuego> modificar(
			@PathVariable("id_videojuego") int id,
			@RequestBody Videojuego v){
		v.setId(id);
		gv.modificar(v);
		return new ResponseEntity<Videojuego>(v,HttpStatus.OK);
	}
	
	@DeleteMapping(path = "videojuegos/{id_videojuego}")
	public ResponseEntity<Integer> borrar(@PathVariable("id_videojuego") int id){
		gv.borrar(id);
		return new ResponseEntity<Integer>(id,HttpStatus.OK);
	}
}
