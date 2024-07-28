package ejercicioVirus;

import java.util.Random;

public class Virus {
	public String nombre;
	private int adn;
	private boolean nocivo;
	
	public Virus() {
		this.adn = this.generaNumero();
		this.nombre = "DESCONOCIDO";
		this.nocivo = true;
	}
	
	public Virus(String nombre) {
		this.adn = this.generaNumero();
		this.nombre = nombre;
		this.nocivo = true;
	}
	
	private int generaNumero() {
		return new Random().nextInt(11); //GENERA UN NUMERO ENTERO ENTRE [0,10]
	}
	
	public boolean esNocivo() {
		return this.nocivo;
	}
	
	public void neutralizar(int adnNeutralizante) {
		if(adnNeutralizante == this.adn)
			this.nocivo = false;
		else
			System.out.println("EL NEUTRALIZANTE NO FUE EFECTIVO");
	}
	
	public String toString() {
		String cadena;
		
		cadena = "NOMBRE: " + this.nombre + "\n";
		cadena += "ES NOCIVO: " + this.nocivo;
		//cadena += "\n" + "ADN: " + this.adn;
		
		return cadena;
	}
}
