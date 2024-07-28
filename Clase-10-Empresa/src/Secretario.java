import java.util.Calendar;

public class Secretario extends Empleado{
	private String despacho;
	private Integer numeroFax;
	
	public Secretario(String nombre, Integer dni, String domicilio, Calendar fechaIngreso, Integer numeroContacto, double salario, Empleado empleado, Integer numeroFax, String despacho) {
		super(nombre,dni,domicilio,fechaIngreso,numeroContacto,salario,empleado);
		this.setNumeroFax(numeroFax);
		this.setDespacho(despacho);
	}
	
	public void setNumeroFax(Integer numeroFax) {
		this.numeroFax = numeroFax;
	}
	
	public Integer getNumeroFax() {
		return this.numeroFax;
	}
	
	public void setDespacho(String despacho) {
		this.despacho = despacho;
	}
	
	public String getDespacho() {
		return this.despacho;
	}
	
	public void setSalario(double salario) {
		this.salario = salario + ((salario*0.1)*(this.getAniosAntiguedad()/3));
	}
	
	public String toString() {
		String cadena = super.toString();
		cadena += "NUMERO DE FAX: " + this.getNumeroFax() + "\n";
		
		return cadena;
	}
}
