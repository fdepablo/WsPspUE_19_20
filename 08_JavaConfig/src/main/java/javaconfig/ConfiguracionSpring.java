package javaconfig;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import modelo.entidad.Direccion;
import modelo.entidad.Persona;

//Esta anotacion le dice a spring que esta clase va a tener
//beans para dar de alta en nuestro contexto de spring
@Configuration
public class ConfiguracionSpring {
	
	//esta anotacion hace que spring ejecute este metodo
	//para dar de alta el objeto en el contexto de spring
	//y se dará de alta con el estado con el que se cree
	//estado = valor de los atributos
	//La clase con la que se dara de alta sera el tipo
	//de referencia que devolvamos
	//el id con el que se dara de alta sera el nombre
	//del metodo
	@Bean(name = "direccionBean")
	//<bean id="direccionBean" class="modelo.entidad.Direccion"/>
	@Scope("prototype")
	public Direccion direccionBean() {
		Direccion direccion = new Direccion();
		direccion.setCiudad("Barcelona");
		return direccion;
	}
	
	//podemos inyectar la dependencia por inner bean
	@Bean
	@Scope("prototype")
	public Persona personaInnerBean() {
		Persona persona = new Persona();
		persona.setNombre("Mongomery");
		Direccion d = new Direccion();
		d.setCiudad("Valencia");
		persona.setDireccion(d);
		return persona;
	}
	
	//Autowired, 
	//Spring automaticamente intentara hacer un autowired
	//a los parametros de entrada del metodo
	//si solo hay una no hay problema no hay que hacer nada
	//public Persona personaBean(Direccion d) {
	//si tenemos varias podemos recurrir 
	
	@Bean
	@Scope("prototype")
	public Persona personaBean(@Qualifier("direccionBean") Direccion d) {
		Persona persona = new Persona();
		persona.setNombre("Bart");
		persona.setDireccion(d);
		return persona;
	}
}
