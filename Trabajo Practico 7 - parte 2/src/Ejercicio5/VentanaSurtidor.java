package Ejercicio5;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class VentanaSurtidor extends JFrame{
	private JPanel ladoIzquierdo;
	private JPanel ladoDerecho;
	private JLabel etiquetaIzq;
	private JLabel etiquetaDer;
	private ButtonGroup grupo;
	private JRadioButton[] botones;
	private JTextField cantidad;
	private JButton comprar;
	private JButton recargar;
	private JLabel[] nombres;
	private JTextField[] cantidades;
	
	public VentanaSurtidor() {
		super("Surtidor");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(250,400);
		setLayout(new GridLayout(1,2));
		
		armarLadoIzquierdo();
		armarLadoDerecho();
		
		getContentPane().add(ladoIzquierdo);
		getContentPane().add(ladoDerecho);
	}
	
	public void armarLadoIzquierdo() {
		ladoIzquierdo = new JPanel();
		ladoIzquierdo.setLayout(new GridLayout(8,1));
		
		etiquetaIzq = new JLabel("Tipo");
		ladoIzquierdo.add(etiquetaIzq);
		
		String[] nombre = {"UltraDiesel","EuroDiesel","Super","Infinia"};
		grupo = new ButtonGroup();
		botones = new JRadioButton[4];
		for(int i=0;i<4;i++) {
			botones[i] = new JRadioButton(nombre[i]);
			grupo.add(botones[i]);
			ladoIzquierdo.add(botones[i]);
		}
		
		cantidad = new JTextField();
		comprar = new JButton("COMPRAR");
		recargar = new JButton("RECARGAR");
		
		ladoIzquierdo.add(cantidad);
		ladoIzquierdo.add(comprar);
		ladoIzquierdo.add(recargar);
	}
	
	public void armarLadoDerecho() {
		ladoDerecho =  new JPanel();
		ladoDerecho.setLayout(new GridLayout(9,1));
		
		nombres = new JLabel[4];
		cantidades = new JTextField[4];
		etiquetaDer =  new JLabel("Estado Actual");
		String[] nombre = {"UltraDiesel","EuroDiesel","Super","Infinia"};
		
		for(int i=0;i<4;i++) {
			nombres[i] = new JLabel(nombre[i]);
			ladoDerecho.add(nombres[i]);
			cantidades[i] =  new JTextField("20000");
			cantidades[i].disable();
			ladoDerecho.add(cantidades[i]);
		}
		
	}
	
}
