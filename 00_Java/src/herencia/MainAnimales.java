package herencia;

import java.util.ArrayList;

public class MainAnimales {

	public static void main(String[] args) {
		Tiburon t = new Tiburon();
		t.setNombre("Calamardo");
		t.setEdad(5);
		t.setNumeroAletas(27);
		t.setPeso(250);

		Trucha n = new Trucha();
		n.setNombre("Nemo");
		n.setEdad(2);
		n.setNumAletas(1);
		n.setPeso(3.5);

		Oso o = new Oso();
		o.setNombre("Yogui");
		o.setEdad(2);
		o.setPeso(427);

		ArrayList<Animal> lista = new ArrayList<Animal>();
		lista.add(t);
		lista.add(n);
		lista.add(o);

		Trucha comida = new Trucha();
		comida.setNombre("Bob");
		comida.setPeso(5);

		System.out.println(lista);

		for (Animal animal : lista) {
			animal.zampar(new ArrayList<>());
		}
		System.out.println(lista);
	}
}
