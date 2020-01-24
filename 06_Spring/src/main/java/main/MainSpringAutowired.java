package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import modelo.entidad.Persona;

public class MainSpringAutowired {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beansAutowired.xml");
		
		Persona p = context.getBean("persona", Persona.class);
		System.out.println(p);
	}
}
