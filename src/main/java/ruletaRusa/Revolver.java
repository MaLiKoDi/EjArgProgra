package ruletaRusa;

import java.lang.reflect.Array;
import java.util.List;

public class Revolver {
	
	private int pos;
	private int posAgua;
	private String[] tambor = {"Vacio", "Vacio", "Vacio", "Vacio", "Vacio", "Vacio"};
	private String agua = "Agua";
	
	public Revolver() {
		
	}
	
	
	public void llenarRevolver() {
		
		int pos = (int)(Math.random()*5);
		int posAgua = (int)(Math.random()*5);
		this.tambor[posAgua] = agua;
		
		//System.out.println("posicion inicial: "+pos+ " posicion del agua: " +posAgua);/*Boorrar*/
	}
	public boolean mojar(int posicion) {
		
		if (tambor[posicion].equals(agua)) {
			return true;
		}else {
		
		return false;
	}}
	public int siguienteChorro() {
		//pos ++;//se usa el revolver sin girar el tambor
		int pos = (int)(Math.random()*5);//se usa el revolver girando el tambor cada vez para mas emocion
		
		if (pos > 5 ) {
			pos=0;
		}
		return pos;
	}
	public int getPos() {
		return pos;
	}
	public void setPos(int pos) {
		this.pos = pos;
	}
	public int getAgua() {
		return posAgua;
	}
	public void setAgua(int agua) {
		this.posAgua = agua;
	}
	@Override
	public String toString() {
		return "Revolver [posicion= " + pos + ", agua= " + posAgua + "]";
	}
	
	

}
