
public class ExprimidoraH2021 {
	public Cultivo[] cultivo;
	private int indice;
	
	public ExprimidoraH2021() {
		this.cultivo = new Cultivo[10];
		this.indice = 0;
	}
	
	public void ingresaCultivo(Cultivo cultivo) {
		this.cultivo[this.indice]=cultivo;
		this.indice++;
	}
	
	public double exprimir() {
		double acomulador=0;
		
		for(int i=0;i<this.indice;i++) {
			acomulador += this.cultivo[i].posibleJugo();
		}
		
		this.indice=0;
		
		return acomulador;
	}
}
