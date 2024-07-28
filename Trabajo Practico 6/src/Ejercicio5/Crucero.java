package Ejercicio5;

public class Crucero extends Vehiculo implements TransporteMaritimo{
	private int desplazamiento;
	
	public Crucero(String nombre, int maxPasajeros, int maxVelocidad, int desplazamiento) {
		super(nombre,maxPasajeros,maxVelocidad);
		this.setDesplazamiento(desplazamiento);
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
	public int getDesplazamiento() {return this.desplazamiento;}
	public void setDesplazamiento(int desplazamiento) {this.desplazamiento = desplazamiento;}

	@Override
	public void zarpar() {
		// TODO Auto-generated method stub
		
	}
	
}
