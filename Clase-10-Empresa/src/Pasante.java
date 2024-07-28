import java.util.Calendar;

public class Pasante extends Empleado{
	protected Calendar fechaLimite;
	protected boolean esPasante;
	
	public Pasante(String nombre, Integer dni, String domicilio, Calendar fechaIngreso, Integer numeroContacto, double salario, Empleado empleado) {
		super(nombre,dni,domicilio,fechaIngreso,numeroContacto,salario,empleado);
		this.setFechaLimite();
		this.setPasante();
	}
	
	public void setPasante() {
		if(Calendar.getInstance().compareTo(this.fechaLimite)>0) //COMPARA DOS FECHAS >0 el primero es mayor al segundo todavia no paso la fecha
			this.esPasante = true;
		else  						
			this.esPasante = false;	//
	}
	
	public boolean getPasante() {
		return this.esPasante;
	}
	
	public void setFechaLimite() {
		this.fechaLimite = this.getFechaIngreso();
		this.fechaLimite.add(Calendar.DAY_OF_YEAR, 90);
	}
	
	public Calendar getFechaLimite() {
		return this.fechaLimite;
	}
	
	public int diasTrabajando() {
		Calendar aux = Calendar.getInstance();
		aux.setTimeInMillis(this.fechaIngreso.getTime().getTime() - Calendar.getInstance().getTime().getTime());
		
		return aux.get(Calendar.DAY_OF_YEAR);
	}
	
	public String toString() {
		String cadena = super.toString();
		if(this.getPasante())
			cadena += "ES PASANTE\n";
		else
			cadena += "NO ES PASANTE\n";
		
		return cadena;
	}
}
