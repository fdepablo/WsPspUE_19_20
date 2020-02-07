package es.ue;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import es.ue.modelo.entidad.Pelicula;
import es.ue.modelo.persistencia.DaoPelicula;

@SpringBootApplication
//Esta anotacion engloba 3 granden anotaciones Spring
//1- @Configuration
//Dentro de esta clase podemos dar de alta objetos con @Bean
//2- @ComponentScan
//Con esta anotacion le decimos que busque en este paquete
//es.ue anotaciones de beans de spring
//3-@EnabledAutoConfiguration
//Esta anotacion le decimos a spring que me arranque todos
//los objetos que el estime oportuno para que la aplicacion
//funcion. Por ejemplo, se le decimos que queremos arrancar 
//un proyecto MySql, nos dara de alta el objeto DataSource
//entre otros
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		System.out.println("Primer proyecto Spring boot");
		
		Pelicula p = context.getBean("pelicula", Pelicula.class);
		System.out.println(p);
		p.setDirector("Leonardo di caprio");
		p.setTitulo("Titanic");
		p.setGenero("amor");
		
		DaoPelicula daoPelicula = context.getBean("daoPelicula",DaoPelicula.class);
		daoPelicula.save(p);
		
		Pelicula p2 = daoPelicula.findById(1).get();
		System.out.println(p2);
		
		List<Pelicula> lista = daoPelicula.findByTitulo("Titanic");
		System.out.println(lista);
	}

}
