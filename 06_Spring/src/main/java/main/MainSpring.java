package main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import modelo.entidad.Persona;

public class MainSpring {

	public static ApplicationContext context;
	
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("beans.xml");
		
		//Persona p1 = new Persona();
		//p1.setNombre("pepe");
		
		Persona p2 = (Persona)context.getBean("persona1");
		System.out.println(p2);
		
		//p1 = null;
		p2 = null;
		
		Persona p3 = context.getBean("persona1",Persona.class);
		System.out.println(p3);
		p3.setPeso(70);
		Persona p4 = context.getBean("persona1",Persona.class);
		System.out.println(p4);
		
		Persona pBean1 = context.getBean("personaBean",Persona.class);
		
		List<Persona> listaPersonas = context.getBean("listaPersonas",List.class);
		listaPersonas.add(pBean1);
		
		Persona esneip =  context.getBean("esneip",Persona.class);
		System.out.println(esneip);
		
		Persona jagri =  context.getBean("jagri",Persona.class);
		System.out.println(jagri);
		
		Persona sirius =  context.getBean("personaConstructor",Persona.class);
		System.out.println(sirius);
		
		List<Persona> listaPersonas2 = context.getBean("listaPersonas2",List.class);
		for(Persona p : listaPersonas2) {
			System.out.println(p);
		}
	}

}
