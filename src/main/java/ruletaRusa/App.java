package ruletaRusa;

import java.util.ArrayList;

import cartasEsp.Baraja;
import cartasEsp.Carta;

public class App {
	
	public static void main(String[] args) {
		
		ArrayList<Jugador> jugadores = new ArrayList <Jugador>();
		
		Juego juego1 = new Juego();
		Revolver r = new Revolver();
		Jugador j1 = new Jugador (1);
		Jugador j2 = new Jugador (2);
		Jugador j3 = new Jugador (3);
		Jugador j4 = new Jugador (4);
		
		r.llenarRevolver();
		//r.toString();
		jugadores.add(j1);
		jugadores.add(j2);
		jugadores.add(j3);
		jugadores.add(j4);
		
		juego1.llenarJuego(jugadores, r);
		juego1.ronda();
		
		
		
		
	}

}
