import java.util.Calendar;
import java.text.SimpleDateFormat;

public class clsPaciente {
	protected String nombre;
	protected Integer dni;
	protected String domicilio;
	protected String telefono;
	protected Calendar fecha;
	
	public clsPaciente(String nombre, Integer dni, String domicilio, String telefono) {
		this.setNombre(nombre);
		this.setDNI(dni);
		this.setDomicilio(domicilio);
		this.setTelefono(telefono);
		this.fecha = Calendar.getInstance();//OBTIENE FECHA ACTUAL
	}
	//GETTERS Y SETTERS
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Integer getDNI() {
		return this.dni;
	}
	
	public void setDNI(Integer dni) {
		this.dni = dni;
	}
	
	public String getDomicilio() {
		return this.domicilio;
	}
	
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	public String getTelefono() {
		return this.telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public Calendar getFecha() {
		return this.fecha;
	}
	
	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}
	
	public String getFechaFormateada() {
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
		return f.format(this.getFecha().getTime());
	}
	
	public String toString() {
		String cadena = "NOMBRE: " + this.getNombre() + "\n";
		cadena+="DNI: " + this.getDNI() + "\n";
		cadena+="DOMICILIO: " + this.getDomicilio() + "\n";
		cadena+="TELEFONO: " + this.getTelefono() + "\n";
		cadena+="FECHA DE INGRESO: " + this.getFechaFormateada() + "\n";
		
		return cadena;
	}
}
