package es.ue.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorPersona {

	@GetMapping("primerRest")
	public String primerMetodo() {
		return "HolaMundo";
	}
}
