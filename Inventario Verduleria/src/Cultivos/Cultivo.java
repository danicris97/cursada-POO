package Cultivos;

import java.util.Date;

public class Cultivo {
	protected Date fchRecoleccion;
	protected String localidad;
	protected String huerto;
	
	public Cultivo(Date fchRecoleccion, String localidad, String huerto) {
		this.fchRecoleccion = fchRecoleccion;
		this.localidad = localidad;
		this.huerto = huerto;
	}
	
	public Date getFchRecoleccion() {
		return this.fchRecoleccion;
	}
	
	public String getLocalidad() {
		return this.localidad;
	}
	
	public String getHuerto() {
		return this.huerto;
	}
	
	public String toString() {
		String cadena="FECHA DE RECOLECCION: " + this.fchRecoleccion + "\n";
		cadena+="LOCALIDAD: " + this.localidad + "\n";
		cadena+="HUERTO: " + this.huerto + "\n";
		
		return cadena;
	}
}
