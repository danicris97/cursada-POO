package Ejercicio1;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaEtiqueta extends JFrame{
	private JPanel panelCafe;
	private JLabel etiqueta;
	
	public VentanaEtiqueta() {
		super("Cafe.exe");
		this.panelCafe = new JPanel();
		armarPanelCafe();
		this.etiqueta = new JLabel("CAFE");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().add(BorderLayout.CENTER,this.panelCafe);
		getContentPane().add(BorderLayout.NORTH,this.etiqueta);
		setSize(300,300);
	}
	
	public void armarPanelCafe() {
		JLabel etiquetaCafe = new JLabel();
		etiquetaCafe.setIcon(new ImageIcon(this.getClass().getResource("cafe.gif")));
		this.panelCafe.add(etiquetaCafe);
	}
}
