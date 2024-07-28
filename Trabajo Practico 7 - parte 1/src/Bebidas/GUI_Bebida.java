package Bebidas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI_Bebida extends JFrame{
	private JLabel imagen;
	private JLabel etiqueta;
	private JLabel contador;
	private int c;
	private JButton botonCafe;
	private JButton botonJugo;
	private JPanel botones;
	private JPanel imagenes;
	private JPanel circulos;
	private JPanel contadores;
	
	public GUI_Bebida() {
		super("Bebidas.exe");
		//setLayout(new GridLayout());
		armarEtiqueta();
		armarPanelImagen();
		armarPanelBotones();
		armarPanelCirculos();
		armarPanelContador();
		
		getContentPane().add(this.botones,BorderLayout.SOUTH);
		getContentPane().add(this.imagenes,BorderLayout.WEST);
		getContentPane().add(this.circulos,BorderLayout.CENTER);
		getContentPane().add(this.contador,BorderLayout.EAST);
		getContentPane().add(this.etiqueta,BorderLayout.NORTH);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600,350);
	}
	
	public void armarPanelCirculos() {
		circulos = new JPanel() {
			public void paintComponent(Graphics g) {
				g.setColor(Color.WHITE);
				g.fillOval(70, 70, 100, 100);
			}
		};
	}
	
	public void armarPanelContador() {
		c=0;
		contador = new JLabel();
		contador.setText("0");
		
		contadores = new JPanel();
		contadores.add(contador);
	}
	
	public void armarEtiqueta() {
		etiqueta = new JLabel();
		etiqueta.setText("CAFE");
	}
	
	public void armarPanelImagen() {
		imagenes = new JPanel();
		imagen = new JLabel();
		imagen.setIcon(new ImageIcon(this.getClass().getResource("cafe.gif")));
		imagenes.add(imagen);
	}
	
	public void armarPanelBotones() {
		botonCafe = new JButton("CAFE");
		botonJugo = new JButton("JUGO");
		botonCafe.addActionListener(new OyenteCafe());
		botonJugo.addActionListener(new OyenteJugo());
	
		botones = new JPanel();
		botones.add(botonCafe);
		botones.add(botonJugo);
		botones.setBackground(Color.BLUE);
	}
	
	private class OyenteCafe implements ActionListener{
		public void actionPerformed(ActionEvent evento) {
			imagen.setIcon(new ImageIcon(this.getClass().getResource("cafe.gif")));
			etiqueta.setText("CAFE");
			botones.setBackground(Color.BLUE);
			circulos.getGraphics().setColor(Color.BLACK);
			c++;
			contador.setText("" + c);
		}
	}
	
	private class OyenteJugo implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			imagen.setIcon(new ImageIcon(this.getClass().getResource("Jugo.gif")));
			etiqueta.setText("JUGO");
			botones.setBackground(Color.ORANGE);
			circulos.getGraphics().setColor(Color.WHITE);
			c++;
			contador.setText("" + c);
		}
		
	}
}
