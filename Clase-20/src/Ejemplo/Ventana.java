package Ejemplo;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ventana extends JFrame{
	private Panel panel;
	private JLabel etiqueta;
	private JButton boton;
	private JButton boton2;
	//private OyenteDibujo oyenteDibujo;
	//private OyenteEtiqueta oyenteEtiqueta;
	
	public Ventana(Panel panel) {
		this.boton = new JButton("CAMBIAR COLOR");
		this.boton2 = new JButton("CAMBIAR ETIQUETA");
		this.panel = panel;
		this.etiqueta = new JLabel("A VER");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().add(BorderLayout.CENTER, this.panel);
		getContentPane().add(BorderLayout.SOUTH, this.boton);
		getContentPane().add(BorderLayout.EAST, this.boton2);
		getContentPane().add(BorderLayout.NORTH, this.etiqueta);
		this.boton.addActionListener(new OyenteDibujo());
		this.boton2.addActionListener(new OyenteEtiqueta());
		setSize(400,400);
	}
	
	//CLASES INTERNAS
	private class OyenteDibujo implements ActionListener{

		public void actionPerformed(ActionEvent arg0) {
			repaint();
		}
	}
	
	private class OyenteEtiqueta implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			etiqueta.setText("FUNCIONA");
		}
	}
	//FIN CLASES INTERNAS
}
