package Ejemplo;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class PanelCirculoAleatorio extends Panel{
	
	public void paintComponent(Graphics g) {
		g.fillRect(0, 0, this.getWidth(),this.getHeight());
		Random azar = new Random();
		int red = (int)(azar.nextDouble()*255);
		int green = (int)(azar.nextDouble()*255);
		int blue = (int)(azar.nextDouble()*255);
		Color colorAleatorio = new Color(red,green,blue);
		g.setColor(colorAleatorio);
		g.fillOval(70, 70, 100, 100);
	}
}
