package recursos;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Juego extends JFrame implements ActionListener {
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
				this.tablero[i][j] = new Bomba();
				this.tablero[i][j].addActionListener(this);//El Juego va a estar atento a lo que pase con este componente
				minas--;
			}
		}
		for (int i = 0; i < this.tam; i++) { //llenamos los espacios con Cuadros
			for (int j = 0; j < this.tam; j++){
				if (getComponente(i, j) == null) {
					this.tablero[i][j] = new Cuadro();
					this.tablero[i][j].addActionListener(this);//El Juego va a estar atento a lo que pase con este componente
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
				c.removeActionListener(this);
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

	@Override
	public void actionPerformed(ActionEvent arg0) {
		//Cuando ocurre un evento hay que ver en quién se disparó.
		if (arg0.getSource() instanceof Bomba) {
			Bomba aux = (Bomba)arg0.getSource();
			aux.setIcon(new ImageIcon("images/bombexplotionicon.png"));
			System.out.println("bomba");
			this.gameOver();
			this.setLaBomba(aux);
		}else {
			if (arg0.getSource() instanceof Cuadro) {
				Cuadro aux = (Cuadro)arg0.getSource();
				if (aux.getValor() != 0) {
					aux.setText(""+aux.getValor());
				}
				this.decrementar();
				aux.setEnabled(false);
			}
		}
		
	}
	
	
}
