package recursos;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JFrame;

public class Juego extends JFrame {
	private Componente[][] tablero;
	private int tam;
	private int cantMinas;
	private Container panel;
	
	private boolean gameOver;
	private int paraGanar;
	private Bomba labomba;
	
	
	public Juego(){
		setTitle("BuscaMinas");
		this.panel = getContentPane();
		setSize(400, 400);
		this.tam = 9;
		this.cantMinas = 10;
		this.gameOver = false;
		this.paraGanar = this.tam * this.tam - this.cantMinas; //despintar todo salvo las 10 bombas.
		
		this.setLayout(new GridLayout(this.tam, this.tam));
		this.tablero = new Componente[this.tam][this.tam];
		armar();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public Componente getComponente(int i, int j){
		return this.tablero[i][j];
	}
	
	private void armar(){
		int minas = this.cantMinas;
		while(minas > 0){ // ponemos las bombas
			int i = (int) (Math.random()*(this.tam));
			int j = (int) (Math.random()*(this.tam));
			if (getComponente(i, j) == null) {
				this.tablero[i][j] = new Bomba(this);
				minas--;
			}
		}
		for (int i = 0; i < this.tam; i++) { //llenamos los espacios con Cuadros
			for (int j = 0; j < this.tam; j++){
				if (getComponente(i, j) == null) {
					this.tablero[i][j] = new Cuadro(this);
				}
			}
		}
		
		//actualizar valores de cuadros.
		for (int i = 0; i < this.tam; i++) {
			for (int j = 0; j < this.tam; j++){
				if (getComponente(i,j) instanceof Bomba){
					for (int x = Math.max(i - 1, 0); x < this.tam && x <= i + 1; x++){
						for (int y = Math.max(j - 1, 0); y < this.tam && y <= j + 1; y++){
							if(getComponente(x, y) instanceof Cuadro){
								((Cuadro)getComponente(x, y)).incrementar();
							}
						}
					}
				}
			}
		}
		
		for (int i = 0; i < this.tam; i++) {
			for (int j = 0; j < this.tam; j++){
				this.panel.add(this.tablero[i][j]);
			}
		}
		
	}
	
	public void gameOver(){
		this.gameOver = true;
	}
	
	public void decrementar(){
		this.paraGanar--;
	}
	
	public void setLaBomba(Bomba bomba){
		this.labomba = bomba;
	}
	
	public void jugar(){
		while (!this.gameOver && this.paraGanar > 0){
			System.out.println("");
		}
		
		for(Componente[] fila: this.tablero){
			for(Componente c:fila){
				c.removeActionListener(c);
				if(c instanceof Bomba && c.isEnabled() && c !=this.labomba){
					((Bomba)c).mostrar();
				}
			}
		}
		
		
		if(this.gameOver){//En lugar de mostrar por consola podemos usar JOptionPane
			System.out.println("Game Over");
		}else{
			System.out.println("Ganaste");
		}
	}
	
	
}
