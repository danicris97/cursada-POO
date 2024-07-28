package Ejercicio5;

public class Votante {
	protected String nombre;
	protected Integer DNI;
	protected int valorVoto;
	protected boolean yaVoto;
	protected boolean puedeVotar;
	
	public Votante(String nombre, Integer DNI) {
		this.setNombre(nombre);
		this.setDNI(DNI);
		this.yaVoto = false;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setDNI(Integer DNI) {
		this.DNI = DNI;
	}
	
	public void setPuedeVotar(boolean puedeVotar) {
		this.puedeVotar = puedeVotar;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public Integer getDNI() {
		return this.DNI;
	}
	
	public boolean getYaVoto() {
		return this.yaVoto;
	}
	
	public boolean getPuedeVotar() {
		return this.puedeVotar;
	}
	
	public void setValorVoto(int valorVoto) {
		this.valorVoto = valorVoto;
	}
	
	public int getValorVoto() {
		return this.valorVoto;
	}
	
	public void emiteVoto() {
		if(!this.getYaVoto()) {
			if(this.getPuedeVotar())
				this.yaVoto = true;
			else
				System.out.println("EL SOLICITANTE NO PUEDE VOTAR");
		}else
			System.out.println("EL SOLICITANTE YA VOTO");
	}
	
	public String toString() {
		String cadena = "NOMBRE: " + this.getNombre();
		cadena += "DNI: " + this.getDNI();
		
		return cadena;
	}
}
