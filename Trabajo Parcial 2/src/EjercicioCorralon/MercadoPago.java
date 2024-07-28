package EjercicioCorralon;

public class MercadoPago implements FormaDePago{

	public double pagar(double monto) {
		return monto - ((monto/100)*7);
	}

}
