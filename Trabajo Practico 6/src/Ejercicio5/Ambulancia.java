package Ejercicio5;

public class Ambulancia extends Vehiculo implements TransporteTerrestre, Emergencia {
	private int numeroRuedas;
	
	public Ambulancia(String nombre, int maxPasajeros, int maxVelocidad, int numeroRuedas) {
		super(nombre,maxPasajeros,maxVelocidad);
		this.setNumeroRuedas(numeroRuedas);
	}

	@Override
	public String getNombre() {return this.nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}

	@Override
	public int getMaxPasajeros() {return this.maxPasajeros;}
	public void setMaxPasajeros(int maxp) {this.maxPasajeros = maxp;}

	@Override
	public int getMaxVelocidad() {return this.maxVelocidad;}
	public void setMaxVelocidad(int maxv) {this.maxVelocidad = maxv;}

	@Override
	public int getNumeroRuedas() {return this.numeroRuedas;}
	public void setNumeroRuedas(int numeroRuedas) {this.numeroRuedas = numeroRuedas;}

	@Override
	public void manejar() {
		// TODO Auto-generated method stub
		
	}
	
	public void sonarSirena() {
		
	}
}
