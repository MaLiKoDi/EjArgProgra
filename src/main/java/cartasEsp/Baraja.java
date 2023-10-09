package cartasEsp;


import java.util.Collections;
import java.util.LinkedList;
import java.util.NoSuchElementException;







public class Baraja {

	LinkedList<Carta> mazo = new LinkedList<Carta>();
	LinkedList<Carta> mazoMonton = new LinkedList<Carta>();
	int[] numCarta = { 1, 2, 3, 4, 5, 6, 7, 10, 11, 12 };
	String[] paloCarta = { "Oro", "Espada", "Basto", "Copa" };
	Carta c;

	
	
	
	public Baraja(Carta c) {
		super();
		this.c = c;
	}

	public Baraja() {

		for (int i = 1; i <= 40; i++) {
			if (i <= 10) {
				c = new Carta(paloCarta[0], numCarta[i - 1]);

			} else if (i >= 10 && i <= 20) {
				c = new Carta(paloCarta[1], numCarta[i - 11]);
			} else if (i >= 20 && i <= 30) {
				c = new Carta(paloCarta[2], numCarta[i - 21]);
			} else {
				// System.out.println(i);
				c = new Carta(paloCarta[3], numCarta[i - 31]);
			}

			this.mazo.add(c);

		}
	}

	/* barajar()/mezclar():cambia de posición todas las cartas aleatoriamente. */
	public void mezclar() {
		Collections.shuffle(mazo);
	}

	/*
	 * •siguienteCarta():devuelve la siguiente carta que está en la baraja, cuando
	 * no haya más o se haya llegado al final,se indica al usuario que no hay más
	 * cartas.
	 */
	/*
	 * Exception in thread "main" java.util.NoSuchElementException at
	 * java.base/java.util.LinkedList.removeFirst(LinkedList.java:274) at
	 * java.base/java.util.LinkedList.remove(LinkedList.java:689) at
	 * cartasEsp.Baraja.siguienteCarta(Baraja.java:43) at
	 * ruletaRusa.App.main(App.java:156)
	 */
	public Carta siguienteCarta() {
		Carta card;
		try {

			card = mazo.remove();
			mazoMonton.add(card);
		} catch (NoSuchElementException e) {
			System.out.println("No hay mas cartas en el mazo");
			return null;
		}
		return card;
	}

	/*
	 * •cartasDisponibles():indica el número de cartas que aún se puede repartir.
	 */

	public void cartasDisponibles() {

		System.out.println(mazo.size());
	}

	/*
	 * •darCartas():dado un número de cartas que nos pidan,le devolveremos ese
	 * número de cartas. En caso de que haya menos cartas que las pedidas,no
	 * devolveremos nada,pero debemos indicárselo al usuario.
	 */

	public Carta[] darCartas(int cant) {
		Carta mano[] = new Carta[cant];
		if (cant > mazo.size()) {
			System.out.println("No hay suficientes cartas para repartir");
		} else {
			for (int i = 0; i < cant; i++) {
				mano[i] = siguienteCarta();

			}
			for (Carta c : mano) {
				System.out.println(c);
			}
		}
		return mano;

	}

	/*
	 * •cartasMonton():mostramos aquellas cartas que ya han salido,si no ha salido
	 * ninguna indicár se lo al usuario
	 */

	public void cartasMonton() {
		if (mazoMonton.size()==0) {
			System.out.println("No se repartio ninguna carta aun");
		}else {
		System.out.println(mazoMonton);
	
		}
	}
	/*
	 * •mostrarBaraja():muestra todas las cartas hasta el final. Es decir, si se
	 * saca una carta y luego se llama al método, este no mostrará esa primera
	 * carta.
	 */
	public void mostrarBaraja() {
		System.out.println(mazo);
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Mazo=" + mazo;
	}

}
