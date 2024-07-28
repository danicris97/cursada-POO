package Ejercicio5;

public class Personal extends Votante{
	public Personal(String nombre, Integer DNI) {
		super(nombre,DNI);
		this.setValorVoto(3);
		this.setPuedeVotar(true);
	}
	
	public String toString() {
		String cadena = "PERSONAL AUXILIAR\n";
		cadena += super.toString();
		
		return cadena;
	}
}
