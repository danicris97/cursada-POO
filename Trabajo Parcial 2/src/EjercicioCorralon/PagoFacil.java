package EjercicioCorralon;

public class PagoFacil implements FormaDePago{
	
	public double pagar(double monto) {
		return monto + ((monto/100)*10);
	}

}
