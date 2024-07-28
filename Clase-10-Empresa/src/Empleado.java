import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Empleado {
	protected String nombre;
	protected Integer dni;
	protected String domicilio;
	protected Calendar fechaIngreso;
	protected int aniosAntiguedad;
	protected Integer numeroContacto;
	protected double salario;
	protected Empleado empleado;
	
	public Empleado(String nombre, Integer dni, String domicilio, Calendar fechaIngreso, Integer numeroContacto, double salario, Empleado empleado) {
		this.setNombre(nombre);
		this.setDNI(dni);
		this.setDomicilio(domicilio);
		this.setFechaIngreso(fechaIngreso);
		this.setAniosAntiguedad();
		this.setNumeroContacto(numeroContacto);
		this.setSalario(salario);
		this.setEmpleado(empleado);
	}
	
	//GETERS Y SETTERS
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setDNI(Integer dni) {
		this.dni = dni;
	}
	
	public Integer getDNI() {
		return this.dni;
	}
	
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	public String getDomicilio() {
		return this.domicilio;
	}
	
	public void setFechaIngreso(Calendar fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
	public Calendar getFechaIngreso() {
		return this.fechaIngreso;
	}
	
	public int getAnioIngreso() {
		return this.getFechaIngreso().get(Calendar.YEAR);
	}
	
	public void setAniosAntiguedad() {
		this.aniosAntiguedad = Math.abs(Calendar.getInstance().get(Calendar.YEAR) - this.getAnioIngreso());
	}
	
	public int getAniosAntiguedad() {
		return this.aniosAntiguedad;
	}
	
	public void setNumeroContacto(Integer numeroContacto) {
		this.numeroContacto = numeroContacto;
	}
	
	public Integer getNumeroContacto() {
		return this.numeroContacto;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	
	public Empleado getEmpleado() {
		return this.empleado;
	}
	
	//TO STRING
	public String getFechaFormateada() {
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
		return f.format(this.getFechaIngreso().getTime());
	}
	
	public String toString() {
		String cadena = "NOMBRE: " + this.getNombre() + "\n";
		cadena += "DNI: " + this.getDNI() + "\n";
		cadena += "DOMICILIO: " + this.getDomicilio() + "\n";
		cadena += "FECHA DE INGRESO: " + this.getFechaFormateada() + "\n";
		cadena += "AÑOS DE ANTIGUEDAD: " + this.getAniosAntiguedad() + "\n";
		cadena += "NUMERO DE CONTACTO: " + this.getNumeroContacto() + "\n";
		cadena += "SALARIO: $%.2f" + this.getSalario() + "\n";
		cadena += "EMPLEADO A CARGO: " + this.getEmpleado().getNombre() + "\n";
		
		return cadena;
	}
}
