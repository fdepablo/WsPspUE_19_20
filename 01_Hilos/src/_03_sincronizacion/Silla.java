package _03_sincronizacion;
public class Silla {
	//si no pusieramos el metodo como sincronizado, podrían
	//entrar todos los obreros a la vez a descansar y entonces
	//estariamos inclumpiendo la regla de que solo un obrero puede
	//sentarse en esta silla a la vez
	//importante, la sincronizacion es a nivel de objeto
	public synchronized void descansar(Obrero o) {
		System.out.println("******* Soy el obrero " + o.getNombre() + " y me voy a sentar 10 segundos");
		
		try {
			Thread.sleep(10000);//un obrero descansa 10 segundos
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("······· Soy el obrero " + o.getNombre() + " y ya he descansado! A CURRAR!!");
	}
}