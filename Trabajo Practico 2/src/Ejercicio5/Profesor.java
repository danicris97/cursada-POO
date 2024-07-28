package Ejercicio5;

public class Profesor extends Votante{
	protected boolean cargoRegular;
	
	public Profesor(String nombre, Integer DNI, boolean cargoRegular) {
		super(nombre,DNI);
		this.setValorVoto(3);
		this.setCargoRegular(cargoRegular);
		this.setPuedeVotar(this.getCargoRegular());
	}
	
	public void setCargoRegular(boolean cargoRegular) {
		this.cargoRegular = cargoRegular;
	}
	
	public boolean getCargoRegular() {
		return this.cargoRegular;
	}
	
	public void emiteVoto() {
		if(!this.getYaVoto()) {
			if(this.getPuedeVotar())
				this.yaVoto = true;
			else
				System.out.println("EL SOLICITANTE NO PUEDE VOTAR: EL PROFESOR NO TIENE UN CARGO REGULAR");
		}else
			System.out.println("EL SOLICITANTE YA VOTO");
	}
	
	public String toString() {
		String cadena = "PROFESOR\n";
		cadena += super.toString();
		if(this.getCargoRegular())
			cadena += "TIENE CARGO REGULAR";
		else
			cadena += "NO TIENE CARGO REGULAR";
		
		return cadena;
	}
}
