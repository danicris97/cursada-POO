package recursos;

import java.awt.event.ActionEvent;

public class Cuadro extends Componente {
	private int valor;
	
	public Cuadro(Juego juego){
		super(juego);
	}
	
	public void incrementar(){
		this.valor ++;
		
	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (this.valor != 0) {
			setText(""+this.valor);
		}
		this.juego.decrementar();
		setEnabled(false);
		
		
	}
}
