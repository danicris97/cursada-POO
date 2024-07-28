package Ejercicio3;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class JugadorReserva extends Jugador{
	
	public JugadorReserva(String nombre, String apellido, int edad, String idJugador, Calendar fchInicio) {
		super(nombre,apellido,edad,idJugador,fchInicio);
	}
	
	public double importeNomina(Calendar hasta) {
		if(this.fchInicio.after(hasta)) {
			int diferenciaYears = this.fchInicio.get(Calendar.YEAR) - hasta.get(Calendar.YEAR);
			int diferenciaMonth = (diferenciaYears * 12) + (this.fchInicio.get(Calendar.MONTH) - hasta.get(Calendar.MONTH));
		
			return 15000*diferenciaMonth;
		}else {
			System.out.println("ERROR: LA FECHA INGRESADA ES ANTERIOR A LA FECHA DE INICIO DEL JUGADOR");
			return 0;
		}
	}
	
	 private String fechaFormateada(Calendar fecha){
		 SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
	     return f.format(fecha.getTime());
	 }
	
	public String toString() {
		return super.toString() + "\nFECHA DE INICIO: " + this.fechaFormateada(this.fchInicio);
	}
}
