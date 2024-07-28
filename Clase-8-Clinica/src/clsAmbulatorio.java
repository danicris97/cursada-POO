
public class clsAmbulatorio extends clsPaciente{
	protected String observaciones;
	
	public clsAmbulatorio(String nombre, Integer dni, String domicilio, String telefono, String observaciones) {
		super(nombre,dni,domicilio,telefono);
		this.setObservaciones(observaciones);
	}
	
	//GETTERS Y SETTERS
	public String getObservaciones() {
		return this.observaciones;
	}
	
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	public String toString() {
		String cadena = super.toString();
		cadena += "OBSERVACIONES: " + this.getObservaciones() + "\n";
		
		return cadena;
	}
}
