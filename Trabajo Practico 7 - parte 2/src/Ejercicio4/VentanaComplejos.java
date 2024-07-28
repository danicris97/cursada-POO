package Ejercicio4;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaComplejos extends JFrame{
	private JPanel panelSuperior;
	private JPanel panelInferior;
	private JButton botonSuma;
	private JButton botonResta;
	private JButton botonMultiplicar;
	private JLabel complejoA;
	private JLabel complejoB;
	private JLabel resultado;
	private JLabel i;
	private JLabel ii;
	private JTextField textoAE;
	private JTextField textoAI;
	private JTextField textoBE;
	private JTextField textoBI;
	private JTextField textoResultado;
	
	public VentanaComplejos() {
		super("Complejos.exe");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,140);
		
		armarPanelSuperior();
		armarPanelInferior();
		
		getContentPane().add(panelInferior,BorderLayout.SOUTH);
		getContentPane().add(panelSuperior,BorderLayout.NORTH);
	}
	
	public void armarPanelSuperior() {
		panelSuperior = new JPanel();
		panelSuperior.setLayout(new GridLayout(3,4));
		
		complejoA = new JLabel("Numero Complejo A: ");
		textoAE = new JTextField();
		textoAI = new JTextField();
		i =  new JLabel("i");
		
		complejoB = new JLabel("Numero Complejo B: ");
		textoBE = new JTextField();
		textoBI = new JTextField();
		ii =  new JLabel("i");
		
		resultado =  new JLabel("Resultado = ");
		textoResultado = new JTextField();
		textoResultado.disable();
		
		panelSuperior.add(complejoA);
		panelSuperior.add(textoAE);
		panelSuperior.add(textoAI);
		panelSuperior.add(i);
		
		panelSuperior.add(complejoB);
		panelSuperior.add(textoBE);
		panelSuperior.add(textoBI);
		panelSuperior.add(ii);
		
		panelSuperior.add(resultado);
		panelSuperior.add(textoResultado);
	}
	
	public void armarPanelInferior() {
		botonSuma = new JButton("SUMA");
		botonSuma.addActionListener(new OyenteSuma());
		botonResta = new JButton("RESTA");
		botonResta.addActionListener(new OyenteResta());
		botonMultiplicar =  new JButton("MULTIPLICAR");
		botonMultiplicar.addActionListener(new OyenteMultiplicar());
		
		panelInferior = new JPanel();
		//panelInferior.setLayout(new FlowLayout());
		panelInferior.add(botonSuma);
		panelInferior.add(botonResta);
		panelInferior.add(botonMultiplicar);
	}
	
	public class OyenteSuma implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	
	public class OyenteResta implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	
	public class OyenteMultiplicar implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	
}
