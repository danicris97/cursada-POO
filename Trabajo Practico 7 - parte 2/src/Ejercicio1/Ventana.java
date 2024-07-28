package Ejercicio1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame{
	private JPanel botones;
	private JPanel contador;
	private JButton contadorBoton;
	private int cont;
	private JButton botonSuma;
	private JButton botonResta;
	
	public Ventana() {
		super("Contador.exe");
		armarPanelBotones();
		armarPanelContador();
		
		getContentPane().add(botones,BorderLayout.SOUTH);
		getContentPane().add(contador, BorderLayout.NORTH);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(250,115);
	}
	
	public void armarPanelBotones() {
		botonSuma = new JButton("+");
		botonResta = new JButton("-");
		
		botonSuma.addActionListener(new OyenteSuma());
		botonResta.addActionListener(new OyenteResta());
		
		botones = new JPanel();
		botones.add(botonResta);
		botones.add(botonSuma);
	}
	
	private void armarPanelContador() {
		contadorBoton = new JButton("0");
		contadorBoton.disable();
		cont = 0;
		contador = new JPanel();
		contador.add(contadorBoton);
	}
	
	private class OyenteSuma implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			cont++;
			contadorBoton.setText("" + cont);
		}
	}
	
	public class OyenteResta implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			cont--;
			contadorBoton.setText("" + cont);
		}
	}
}
