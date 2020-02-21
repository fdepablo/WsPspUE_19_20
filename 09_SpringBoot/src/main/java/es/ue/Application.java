package es.ue;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import es.ue.modelo.entidad.Pelicula;
import es.ue.modelo.persistencia.DaoPelicula;

@SpringBootApplication
/*
 * Esta anotación englova 3 grandes anotaciones Spring 1.- @Configuation Dentro
 * de esta clase podemos dar de alta con beans 2.- incluye @ComponentScan Con
 * eta anotación le decimos que busque en este paquete anotacion es de Beans de
 * Spring 3.- @EnabledAutoConfiguration Esta anotación le decimos a Spring que
 * me arranque todos los objetos que él estime oportuno para que la aplicación
 * funcione. Por ejemplo si le decimos que queremos arrancar un proyecto MySQL,
 * nos dará de alta el objeto DataSource entre otros
 */
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		System.out.println("Primer proyecto spring boot");

		Pelicula p = context.getBean("pelicula", Pelicula.class);
		p.setDirector("Leonardo di Caprio");
		p.setTitulo("Titanic");
		p.setGenero("Amor");
//		System.out.println(p);

		DaoPelicula dao = context.getBean("daoPelicula", DaoPelicula.class);
//		dao.save(p);

//		Pelicula p2 = dao.findById(1).get();
//		System.out.println(p2);
		
		List<Pelicula> lista = dao.findByTituloIgnoreCase("titanic");
		System.out.println("Lista titulo: " + lista);
		
		((ConfigurableApplicationContext) context).close();
	}
}
