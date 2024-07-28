import javax.swing.*;
import java.awt.event.*;

public class MiPrimerVentana extends JFrame implements ActionListener{
	private JButton boton;
	
	public MiPrimerVentana() {
		this.boton = new JButton("ACEPTAR");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().add(this.boton);
		setSize(300,300);
		boton.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		this.cambiarTexto();
	}
	
	public void cambiarTexto() {
		this.boton.setText("FUNCIONA");
	}
}
