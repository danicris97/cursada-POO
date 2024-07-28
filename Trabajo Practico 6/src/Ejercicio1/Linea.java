package Ejercicio1;

public class Linea implements Relacion{
	private double x1,y1,x2,y2;
	
	public Linea(double x1, double y1, double x2, double y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
 	}
	
	public double getLongitud() {return Math.sqrt(Math.pow((this.x2-this.x1),2) + Math.pow((this.y2-this.y1),2));}
	
	private boolean EsLinea(Object otro) {
		if(otro.getClass().isInstance(this))
			return true;
		else
			return false;
	}
	
	public boolean esMasGrande(Object otro) {
		if(this.EsLinea(otro)) {
			if(this.getLongitud()>((Linea) otro).getLongitud())
				return true;
			else
				return false;
		}else {
			System.out.println("ERROR: INGRESASTE CUALQUIER VERDURA");
			return false;
		}
	}
	
	public boolean esMasChico(Object otro) {
		if(this.EsLinea(otro)) {
			if(this.getLongitud()<((Linea)otro).getLongitud())
				return true;
			else
				return false;
		}else {
			System.out.println("ERROR: INGRESASTE CUALQUIER VERDURA");
			return false;
		}
	}
	
	public boolean esIgual(Object otro) {
		if(this.EsLinea(otro)) {
			if(this.getLongitud() == ((Linea)otro).getLongitud())
				return true;
			else
				return false;
		}else {
			System.out.println("ERROR: INGRESASTE CUALQUIER VERDURA");
			return false;
		}
	}
	
}
