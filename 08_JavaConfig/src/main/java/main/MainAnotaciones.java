package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javaconfig.ConfiguracionSpring;
import modelo.entidad.Persona;

public class MainAnotaciones {
	public static void main(String[] args) {
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(
						ConfiguracionSpring.class);
		
		Persona p = context.getBean("personaInnerBean", Persona.class);
		System.out.println(p);
		
		p = context.getBean("personaBean", Persona.class);
		System.out.println(p);
	}
}
