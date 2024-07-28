package recursos;

import java.awt.event.ActionListener;

import javax.swing.JButton;

public abstract class Componente extends JButton implements ActionListener {
	protected Juego juego;
	public Componente(Juego juego){
		this.juego = juego;
		addActionListener(this);
	}
}
