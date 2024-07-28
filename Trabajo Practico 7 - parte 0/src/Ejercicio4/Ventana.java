package Ejercicio4;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame{
	private JButton botonRojo;
	private JButton botonVerde;
	private JPanel botones;
	private JPanel colores;
	
	public Ventana() {
		super("Ventana color");
		armarPanelColores();
		armarPanelBotones();
		
		setLayout(new GridLayout());
		getContentPane().add(botones);
		getContentPane().add(colores);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(200,120);
	}
	
	public void armarPanelColores() {
		colores = new JPanel();
		colores.setBackground(Color.BLACK);
	}
	
	public void armarPanelBotones() {
		botones = new JPanel();
		botonRojo = new JButton("ROJO");
		botonVerde = new JButton("VERDE");
		botonRojo.addActionListener(new OyenteRojo());
		botonVerde.addActionListener(new OyenteVerde());
		botones.add(botonRojo);
		botones.add(botonVerde);
		
	}
	
	private class OyenteRojo implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			colores.setBackground(Color.RED);
		}
		
	}
	
	private class OyenteVerde implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			colores.setBackground(Color.GREEN);
		}
		
	}
}
