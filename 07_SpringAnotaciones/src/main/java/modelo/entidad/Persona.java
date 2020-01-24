package modelo.entidad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//Para poder ser gestionado por spring deben de tener un constructor
//privado y sus atributos deben de ser propeidades, es decir, getters y 
//setters
@Component
@Scope("prototype")
public class Persona {
	private String nombre = "Dijimon";
	private int edad;
	private double peso;
	@Autowired
	@Qualifier("direccionBean")
	private Direccion direccion;
	
	public Persona() {
		super();
	}
	public Persona(String nombre, int edad, double peso, Direccion direccion) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.direccion = direccion;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", direccion=" + direccion + "]";
	}

	
	
}
