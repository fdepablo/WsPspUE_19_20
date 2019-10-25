package _02_sincronizacion;

public class MainSincronizado {

	
	public static void main(String[] args) {
		DosPalabras dosPalabras = new DosPalabras();
		/*
		HiloPalabras hp1 = new HiloPalabras("Hola","que tal?" , dosPalabras);
		HiloPalabras hp2 = new HiloPalabras("Bien", "y tu?", dosPalabras);
		HiloPalabras hp3 = new HiloPalabras("tambien bien", "gracias", dosPalabras);
		*/
		HiloPalabras hp1 = new HiloPalabras("Hola","que tal?" , dosPalabras);
		HiloPalabras hp2 = new HiloPalabras("Bien", "y tu?", new DosPalabras());
		HiloPalabras hp3 = new HiloPalabras("tambien bien", "gracias", new DosPalabras());
		
		
		Thread h1 = new Thread(hp1);
		Thread h2 = new Thread(hp2);
		Thread h3 = new Thread(hp3);
		
		h1.start();
		h2.start();
		h3.start();
		
		//System.out.println("Acabado el hilo principal");
	}

}
