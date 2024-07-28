import java.util.Calendar;

public class Vendedor extends Empleado{
	private Coche coche;
	private Integer telefonoMovil;
	private boolean tieneCoche;
	
	public Vendedor(String nombre, Integer dni, String domicilio, Calendar fechaIngreso, Integer numeroContacto, double salario, Empleado empleado, Coche coche, Integer telefonoMovil) {
		super(nombre,dni,domicilio,fechaIngreso,numeroContacto,salario,empleado);
		this.setTelefonoMovil(telefonoMovil);
		this.setTieneCoche(true);
		this.setCoche(coche);
	}
	
	public Vendedor(String nombre, Integer dni, String domicilio, Calendar fechaIngreso, Integer numeroContacto, double salario, Empleado empleado, Integer telefonoMovil) {
		super(nombre,dni,domicilio,fechaIngreso,numeroContacto,salario,empleado);
		this.setTelefonoMovil(telefonoMovil);
		this.setTieneCoche(false);
		this.setCoche(null);
	}
	
	public void setTelefonoMovil(Integer telefonoMovil) {
		this.telefonoMovil = telefonoMovil;
	}
	
	public Integer getTelefonoMovil() {
		return this.telefonoMovil;
	}
	
	public void setCoche(Coche coche) {
		this.coche = coche;
	}
	
	public Coche getCoche() {
		return this.coche;
	}
	
	public void setTieneCoche(boolean tieneCoche) {
		this.tieneCoche = tieneCoche;
	}
	
	public boolean getTieneCoche() {
		return this.tieneCoche;
	}
	
	public void setSalario(double salario) {
		this.salario = (salario + ((salario*0.05)*this.getAniosAntiguedad()));
	}
	
	public String toString() {
		String cadena = super.toString();
		cadena += "TELEFONO MOVIL: " + this.getTelefonoMovil() + "\n";
		if(this.getTieneCoche()) {
			cadena += "TIENE COCHE\n";
			cadena += "DATOS DEL COCHE:\n";
			cadena += this.getCoche().toString();
		}else {
			cadena += "NO TIENE COCHE\n";
		}
		
		return cadena;
	}
}
