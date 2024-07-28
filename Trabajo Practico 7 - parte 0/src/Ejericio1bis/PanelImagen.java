package Ejericio1bis;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelImagen extends JPanel{
	
	public void paintComponent(Graphics g) {
		Image imagen = new ImageIcon("imagenes/cafe.gif").getImage();
		g.drawImage(imagen, 3, 4, this);
	}
}
