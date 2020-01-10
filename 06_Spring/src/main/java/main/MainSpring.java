package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import modelo.entidad.Persona;

public class MainSpring {

	public static ApplicationContext context;
	
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("beans.xml");
		
		Persona p1 = new Persona();
		p1.setNombre("pepe");
		
		Persona p2 = (Persona)context.getBean("persona1");
		System.out.println(p2);
		
		p1 = null;
		p2 = null;
		
		Persona p3 = context.getBean("persona1",Persona.class);
		System.out.println(p3);
		p3.setPeso(70);
		Persona p4 = context.getBean("persona1",Persona.class);
		System.out.println(p4);
	}

}
