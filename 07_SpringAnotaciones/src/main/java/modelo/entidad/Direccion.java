package modelo.entidad;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*
 * Para dar de alta los objetos por anotaciones podemos
 * escoger 4 anotaciones, que realmente heredan 3 de la
 * misma
 * 
 * @Component
 * Con esta anotacion decimos a spring que queremos crear un bean
 * a partir de esta clase, es la mas estandar
 * 
 * A raiz de esta, heredan otras 3, que son puramente semanticas
 * @Controller
 * @Service
 * @Repository
 */
@Component(value = "direccionBean")//le cambiamos el id
//esta anotacion seria equivalente a hacer lo siguiente en xml
//por defecto el id es elnombre de la clase en LowerCamelCase
@Scope("prototype")
//<bean id="direccion" class="modelo.entidad.Direccion" scope="prototype"/>
public class Direccion {
	private String tipoVia;
	private String nombreVia;
	private String ciudad = "madrid";
	
	public String getTipoVia() {
		return tipoVia;
	}
	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}
	public String getNombreVia() {
		return nombreVia;
	}
	public void setNombreVia(String nombreVia) {
		this.nombreVia = nombreVia;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	@Override
	public String toString() {
		return "Direccion [tipoVia=" + tipoVia + ", nombreVia=" + nombreVia + ", ciudad=" + ciudad + "]";
	}
	
	
}
