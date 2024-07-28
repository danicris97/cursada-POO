package Ejemplo;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelImagen extends Panel{
	
	public void paintComponent(Graphics g) {
		Image imagen = new ImageIcon("imagenes/conejo.jpg").getImage();
		g.drawImage(imagen, 3, 4, this);
	}
}
