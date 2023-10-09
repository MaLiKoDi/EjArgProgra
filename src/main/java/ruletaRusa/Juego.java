package ruletaRusa;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {

	private ArrayList<Jugador> jugadores;
	private Revolver pistolaAgua;

	public void llenarJuego(ArrayList<Jugador> participantes, Revolver r) {

		this.jugadores = participantes;
		this.pistolaAgua = r;

	}

	public void ronda() {
		//pistolaAgua.llenarRevolver();/*boorqr*/
		Scanner sc =new Scanner (System.in);
		boolean bandera = true;
		while (bandera) {
			for (Jugador j : jugadores) {
				System.out.println("El " + j.getJugador() + " va a apretar el gatillo, presiona enter para continuar");
				sc.nextLine();
				if (j.disparo(pistolaAgua)) {
					System.out.println("El juego termino. "+"El " + j.getJugador() + " se mojo. Presiona enter para salir");
					sc.nextLine();
					bandera = false;
					
					break;
				
				}
				System.out.println("Safo, presiona enter para continuar");
				sc.nextLine();
			}

		}
		
	}

}
