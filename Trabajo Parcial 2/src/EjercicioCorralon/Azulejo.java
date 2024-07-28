package EjercicioCorralon;

public class Azulejo extends PiezaCeramica{
	private int medida;
	
	public Azulejo(int codigo, double precioBase, int medida) {
		super(codigo, precioBase);
		this.medida = medida;
	}

	public double getPrecioFinal() {
		return this.getPrecioBase() + (medida*1.05);
	}
	
}
