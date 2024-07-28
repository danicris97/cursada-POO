package Ejericio1bis;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaEtiqueta extends JFrame{
	private PanelImagen panelCafe;
	private JLabel etiqueta;
		
	public VentanaEtiqueta() {
		super("Cafe.exe");
		this.panelCafe = new PanelImagen();
		this.etiqueta = new JLabel("CAFE");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().add(BorderLayout.CENTER,this.panelCafe);
		getContentPane().add(BorderLayout.NORTH,this.etiqueta);
		setSize(300,300);
	}
	
}
