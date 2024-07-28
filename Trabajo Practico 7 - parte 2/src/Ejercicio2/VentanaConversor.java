package Ejercicio2;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaConversor extends JFrame {
	private JPanel panelBoton;
	private JPanel panelSuperior;
	private JButton boton;
	private JTextField textoMetros;
	private JTextField textoKilometros;
	private JLabel metros;
	private JLabel kilometros;
	
	public VentanaConversor() {
		super("Conversor.exe");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(200,120);
		
		armarPanelBoton();
		armarPanelSuperior();
		
		getContentPane().add(panelBoton,BorderLayout.SOUTH);
		getContentPane().add(panelSuperior,BorderLayout.CENTER);
	}
	
	public void armarPanelBoton() {
		boton = new JButton("CONVERTIR");
		boton.addActionListener(new OyenteBotonConver());
		
		panelBoton = new JPanel();
		panelBoton.add(boton);
	}
	
	public void armarPanelSuperior() {
		panelSuperior = new JPanel();
		panelSuperior.setLayout(new GridLayout(2,2));
		
		metros = new JLabel("Metros");
		textoMetros = new JTextField();
		panelSuperior.add(metros);
		panelSuperior.add(textoMetros);
		
		kilometros = new JLabel("Kilometros");
		textoKilometros =  new JTextField();
		panelSuperior.add(kilometros);
		panelSuperior.add(textoKilometros);
	}
	
	private class OyenteBotonConver implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			double mts = Double.parseDouble(textoMetros.getText());
			textoKilometros.setText("" + (mts/1000));
		}
	}
	
}
