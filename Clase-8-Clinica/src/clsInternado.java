import java.text.SimpleDateFormat;
import java.util.Calendar;

public class clsInternado extends clsPaciente{
	protected Calendar fechaAlta;
	
	public clsInternado(String nombre, Integer dni, String domicilio, String telefono) {
		super(nombre,dni,domicilio,telefono);
		this.fechaAlta = null;
	}
	
	public void setFechaAlta(Calendar fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	
	public Calendar getFechaAlta() {
		return this.fechaAlta;
	}
	
	public String getFechaAltaFormateada() {
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
		return f.format(this.getFechaAlta().getTime());
	}
	
	public String toString() {
		String cadena = super.toString();
		
		if(this.getFechaAlta()!=null)
			cadena += "FECHA DE ALTA: " + this.getFechaAltaFormateada() + "\n";
		else
			cadena += "FECHA DE ALTA: - \n";
		
		return cadena;
	}
}
