package EjercicioCorralon;

public class Baldosa extends PiezaCeramica{
	private int peso;
	
	public Baldosa(int codigo, double precioBase, int peso) {
		super(codigo, precioBase);
		this.peso = peso;
	}

	public double getPrecioFinal() {
		return this.getPrecioBase()+(peso*0.014);
	}

}
