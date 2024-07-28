package Ejemplo;

public abstract class Robot {
	protected String nombre;
	protected boolean encendido;
	protected Coordenada posicion;
	protected ComportamientoDeVigilancia compVigilancia; //A PESAR DE SER UNA INTERFACE TAMBIEN ES UN TIPO POLIMORFICO DE OBJETO
	protected ComportamientoVuelo compVuelo; //LO MISMO
	
	public Robot(String nombre) {
		this.nombre = nombre;
		this.encendido = true;
		this.posicion = new Coordenada(0,0);
		//this.compVuelo = new VueloSupersonico();
	}
	
	public void encender() {
		if(this.encendido == false)
			this.encendido = true;
		else 
			System.out.println("YA ESTA ENCENDIDO");
	}
	
	public void apagar() {
		if(this.encendido == true)
			this.encendido = false;
		else
			System.out.println("YA ESTA APAGADO");
	}
	
	public boolean estaEncendido() {
		return this.encendido;
	}
	
	public void setComportamientoVigilancia(ComportamientoDeVigilancia compVigilancia) {
		this.compVigilancia = compVigilancia;
	}
	
	public void setComportamientoVuelo(ComportamientoVuelo compVuelo) {
		this.compVuelo = compVuelo;
	}
	
	public void realizarVuelo() {
		
	}
	
	public void realizarVigilancia() {
		
	}
	
	public abstract void trabajar();
	
	public void irAPosicion(Coordenada pos) {
		this.posicion = pos;
	}
	
	public String toString() {
		return "NOMBRE: " + this.nombre + "\nENCENDIDO: " + this.encendido + "\nPOSICION: "+ "(" + this.posicion.getX() + "," + this.posicion.getY() + ")";
	}
	
	
}
