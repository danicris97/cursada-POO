package Ejemplo;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

public class PanelCirculoAleatorioGradiante extends Panel{
	
	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
		g2d.fillRect(0, 0, this.getWidth(),this.getHeight());
		Color colorInicio = getColorAleatorio();
		Color colorFin = getColorAleatorio();
		GradientPaint gradiante = new GradientPaint(70,70,colorInicio,150,150,colorFin);
		g2d.setPaint(gradiante);
		g2d.fillOval(70, 70, 100, 100);
	}
	
	private Color getColorAleatorio() {
		Random azar = new Random();
		int red = (int)(azar.nextDouble()*255);
		int green = (int)(azar.nextDouble()*255);
		int blue = (int)(azar.nextDouble()*255);
		return new Color(red,green,blue);
	}
}