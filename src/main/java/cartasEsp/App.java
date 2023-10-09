package cartasEsp;

public class App {

	public static void main(String[] args) {

		Baraja b;
		b = new Baraja();
		b.mezclar();
		b.cartasDisponibles();
		System.out.println(b.toString());
		Carta c = b.siguienteCarta();
		System.out.println(c);
		System.out.println(b.toString());

		b.cartasDisponibles();

		b.darCartas(41);
		b.mostrarBaraja();
		System.out.println(b.toString());
		b.cartasDisponibles();
		b.cartasMonton();

		Baraja a = new Baraja(c);

		a.cartasMonton();
		b.mostrarBaraja();
		b.cartasDisponibles();

		/* BORRAR */
		/*
		 * c = b.siguienteCarta(); System.out.println(c);
		 * System.out.println(b.toString()); c = b.siguienteCarta();
		 * System.out.println(c); System.out.println(b.toString()); c =
		 * b.siguienteCarta(); System.out.println(c); System.out.println(b.toString());
		 * c = b.siguienteCarta(); System.out.println(c);
		 * System.out.println(b.toString()); c = b.siguienteCarta();
		 * System.out.println(c); System.out.println(b.toString()); c =
		 * b.siguienteCarta(); System.out.println(c); System.out.println(b.toString());
		 * c = b.siguienteCarta(); System.out.println(c);
		 * System.out.println(b.toString()); c = b.siguienteCarta();
		 * System.out.println(c); System.out.println(b.toString()); c =
		 * b.siguienteCarta(); System.out.println(c); System.out.println(b.toString());
		 * c = b.siguienteCarta(); System.out.println(c);
		 * System.out.println(b.toString()); c = b.siguienteCarta();
		 * System.out.println(c); System.out.println(b.toString()); c =
		 * b.siguienteCarta(); System.out.println(c); System.out.println(b.toString());
		 * c = b.siguienteCarta(); System.out.println(c);
		 * System.out.println(b.toString()); c = b.siguienteCarta();
		 * System.out.println(c); System.out.println(b.toString()); c =
		 * b.siguienteCarta(); System.out.println(c); System.out.println(b.toString());
		 * c = b.siguienteCarta(); System.out.println(c);
		 * System.out.println(b.toString()); c = b.siguienteCarta();
		 * System.out.println(c); System.out.println(b.toString()); c =
		 * b.siguienteCarta(); System.out.println(c); System.out.println(b.toString());
		 * c = b.siguienteCarta(); System.out.println(c);
		 * System.out.println(b.toString()); c = b.siguienteCarta();
		 * System.out.println(c); System.out.println(b.toString()); c =
		 * b.siguienteCarta(); System.out.println(c); System.out.println(b.toString());
		 * c = b.siguienteCarta(); System.out.println(c);
		 * System.out.println(b.toString()); c = b.siguienteCarta();
		 * System.out.println(c); System.out.println(b.toString()); c =
		 * b.siguienteCarta(); System.out.println(c); System.out.println(b.toString());
		 * c = b.siguienteCarta(); System.out.println(c);
		 * System.out.println(b.toString()); c = b.siguienteCarta();
		 * System.out.println(c); System.out.println(b.toString()); c =
		 * b.siguienteCarta(); System.out.println(c); System.out.println(b.toString());
		 * c = b.siguienteCarta(); System.out.println(c);
		 * System.out.println(b.toString()); c = b.siguienteCarta();
		 * System.out.println(c); System.out.println(b.toString()); c =
		 * b.siguienteCarta(); System.out.println(c); System.out.println(b.toString());
		 * c = b.siguienteCarta(); System.out.println(c);
		 * System.out.println(b.toString()); c = b.siguienteCarta();
		 * System.out.println(c); System.out.println(b.toString()); c =
		 * b.siguienteCarta(); System.out.println(c); System.out.println(b.toString());
		 * c = b.siguienteCarta(); System.out.println(c);
		 * System.out.println(b.toString()); c = b.siguienteCarta();
		 * System.out.println(c); System.out.println(b.toString()); c =
		 * b.siguienteCarta(); System.out.println(c); System.out.println(b.toString());
		 * c = b.siguienteCarta(); System.out.println(c);
		 * System.out.println(b.toString()); c = b.siguienteCarta();
		 * System.out.println(c); System.out.println(b.toString()); c =
		 * b.siguienteCarta(); System.out.println(c); System.out.println(b.toString());
		 * c = b.siguienteCarta(); System.out.println(c);
		 * System.out.println(b.toString()); c = b.siguienteCarta();
		 * System.out.println(c); System.out.println(b.toString()); c =
		 * b.siguienteCarta(); System.out.println(c); System.out.println(b.toString());
		 * c = b.siguienteCarta(); System.out.println(c);
		 * System.out.println(b.toString()); c = b.siguienteCarta();
		 * System.out.println(c); System.out.println(b.toString()); c =
		 * b.siguienteCarta(); System.out.println(c); System.out.println(b.toString());
		 * c = b.siguienteCarta(); System.out.println(c);
		 * System.out.println(b.toString()); c = b.siguienteCarta();
		 * System.out.println(c); System.out.println(b.toString()); c =
		 * b.siguienteCarta(); System.out.println(c); System.out.println(b.toString());
		 * c = b.siguienteCarta(); System.out.println(c);
		 * System.out.println(b.toString());
		 */
	}
}
