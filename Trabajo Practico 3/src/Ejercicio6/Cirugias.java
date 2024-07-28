package Ejercicio6;

import Ejercicio5.Fecha;
import java.util.ArrayList;

public class Cirugias {
	private ArrayList<Cirugia> cirugias;
	private int cantidad;
	
	public Cirugias() {
		this.cirugias = new ArrayList<Cirugia>();
		this.cantidad = 0;
	}
	
	public void insertarCirugia(Cirugia cirugia) {
		this.cirugias.add(cirugia);
		this.cantidad++;
	}
	
	public void eliminarCirugia(String osocial) {
		for(int i=0;i<this.cantidad;i++) {
			if(this.cirugias.get(i).getPaciente().getObraSocial().getDenominacion().equals(osocial)) {
				this.cirugias.remove(i);
			}
		}
		this.cantidad = this.cirugias.size();
	}
	
	public double promedioDuracion() {
		double acomulador=0;
		
		for(int i=0;i<this.cantidad;i++)
			acomulador += this.cirugias.get(i).getMinutosDuracion();
		
		return acomulador/this.cantidad;
	}
	
	public double promedioDuracion(Fecha desde, Fecha hasta) {
		double acomulador=0;
		int contador=0;
		
		for(int i=0;i<this.cantidad;i++) {
			if(this.cirugias.get(i).getFechaRealizacion().getFechaCalendar().after(desde.getFechaCalendar())) {
				if(this.cirugias.get(i).getFechaRealizacion().getFechaCalendar().before(hasta.getFechaCalendar())) {
					acomulador+= this.cirugias.get(i).getMinutosDuracion();
					contador++;
				}
			}
		}
		
		return (acomulador/contador);
	}
	
	public double promedioDuracion(int edad) {
		double acomulador=0;
		int contador=0;
		
		for(int i=0;i<this.cantidad;i++) {
			if(this.cirugias.get(i).getPaciente().edad()==edad) {
				acomulador+= this.cirugias.get(i).getMinutosDuracion();
				contador++;
			}
		}
		
		return (acomulador/contador);
	}
	
	public Cirugias cirugiasPrestador(String nombre) {
		Cirugias listaXPrestador=null;
		
		for(int i=0;i<this.cantidad;i++) {
			if(this.cirugias.get(i).getPrestador().getNombre().equals(nombre))
				listaXPrestador.cirugias.add(this.cirugias.get(i));
		}
		
		return listaXPrestador;
	}
	
	public Cirugias cirugiasOS(String os) {
		Cirugias listaXOS=null;
		
		for(int i=0;i<this.cantidad;i++) {
			if(this.cirugias.get(i).getPaciente().getObraSocial().getDenominacion().equals(os))
				listaXOS.cirugias.add(this.cirugias.get(i));
		}
		
		
		return listaXOS;
	}
	
	public Cirugias cirugiasPcte(Paciente p) {
		Cirugias listaXPaciente=null;
		
		for(int i=0;i<this.cantidad;i++) {
			if(this.cirugias.get(i).getPaciente().equals(p))
				listaXPaciente.cirugias.add(this.cirugias.get(i));
		}
		
		return listaXPaciente;
	}
}
