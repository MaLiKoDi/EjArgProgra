package ruletaRusa;

public class Jugador {

	private int id;
	private String jugador = "Jugador ";
	private boolean mojado = false;
	
	
	
	 
	public Jugador(int id) {
		super();
		this.id = id;
		this.jugador = jugador + id ;
		this.mojado = mojado;
	}

	public boolean disparo(Revolver r) {
		//System.out.println(r.toString());
		boolean bandera = r.mojar(r.siguienteChorro());
		if (bandera) {
			this.mojado=true;
			
		}
		
		return bandera;
		
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getJugador() {
		return jugador;
	}

	public void setJugador(String jugador) {
		this.jugador = jugador;
	}

	public boolean isMojado() {
		return mojado;
	}

	public void setMojado(boolean mojado) {
		this.mojado = mojado;
	}
	
	
}
