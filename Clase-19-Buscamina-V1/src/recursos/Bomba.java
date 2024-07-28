package recursos;

import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;

public class Bomba extends Componente {
	
	public Bomba(Juego juego){
		super(juego);
		//setIcon(new ImageIcon("images/bombicon.png"));
	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		setIcon(new ImageIcon("images/bombexplotionicon.png"));
		System.out.println("bomba");
		this.juego.gameOver();
		this.juego.setLaBomba(this);
	}
	
	public void mostrar(){
		setIcon(new ImageIcon("images/bombicon.png"));
	}

}
