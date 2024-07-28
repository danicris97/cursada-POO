package Ejercicio3;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
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
	private JComboBox listaUnidadMedidaA;
	private JComboBox listaUnidadMedidaB;
	
	public VentanaConversor() {
		super("Conversor.exe");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300,125);
		
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
		panelSuperior.setLayout(new GridLayout(2,3));
		
		metros = new JLabel("Convertir");
		textoMetros = new JTextField();
		
		kilometros = new JLabel("Resultado");
		textoKilometros =  new JTextField();
		
		armarBotonCombo();
		
		panelSuperior.add(metros);
		panelSuperior.add(textoMetros);
		panelSuperior.add(listaUnidadMedidaA);
		
		panelSuperior.add(kilometros);
		panelSuperior.add(textoKilometros);
		panelSuperior.add(listaUnidadMedidaB);
	}
	
	public void armarBotonCombo() {
		String[] medidas = {"mm","cm","m","km","gm"};
		listaUnidadMedidaA = new JComboBox<String>(medidas);
		listaUnidadMedidaA.setSelectedIndex(0);
		
		listaUnidadMedidaB = new JComboBox<String>(medidas);
		listaUnidadMedidaB.setSelectedIndex(1);
	}
	
	private class OyenteBotonConver implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			String unidadPartida = (String)listaUnidadMedidaA.getSelectedItem();
			String unidadLlegada = (String)listaUnidadMedidaB.getSelectedItem();
			
			double medida = Double.parseDouble(textoMetros.getText());
			textoKilometros.setText("" + (medida/1000));
		}
	}
}
