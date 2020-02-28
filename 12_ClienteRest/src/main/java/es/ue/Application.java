package es.ue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import es.ue.modelo.entidad.Videojuego;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		System.out.println("Acceder a un videojuego");
		RestTemplate restTemplate = new RestTemplate();
		Videojuego videojuego = restTemplate.getForObject("http://localhost:8080/videojuegos/1", Videojuego.class);
		System.out.println(videojuego);

		System.out.println("TODOS LOS VIDEOJUEGOS");
		// Creas un ResponseEntity de un array de Videojuegos y usas el método
		// getForEntity(url, class del array de videojuegos)
		ResponseEntity<Videojuego[]> respuesta = restTemplate.getForEntity("http://127.0.0.1:8080/videojuegos",
				Videojuego[].class);

		Videojuego[] lista = respuesta.getBody();
		for (Videojuego v : lista) {
			System.out.println(v);
		}
		
		//POST
		Videojuego v = new Videojuego();
		
	}

}
