package EjercicioSwing;

//MODIFICADO VELAZQUEZ CRISTIAN DANIEL

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.*;  

public class clsFormText2 extends JFrame implements ActionListener{ 
		
	private JLabel lblText, lblResultado;
	private JTextField tfTexto;
	private JButton btnLimpiar, btnCerrar;
	private Container contenedor;
	
	private ButtonGroup bgOpciones;
	private String[] opciones= {"Cambiar color texto a rojo", "Aumentar tamaño texto", "Intercambiar", "Corregir signos de puntuación"};
	
	private ArrayList<JCheckBox> chkOpciones;
	
	
	public clsFormText2(){
		super ("POO 2021- Parcial 2");		
		
		this.setSize(280,350);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLayout(new FlowLayout());
		this.contenedor = getContentPane();

		populateTField();
		populateChecks();
		populateButtons();
		
	}
	
	
	// se invoca en constructor
	private void populateTField(){		
		
		this.lblText=new JLabel();  
	    this.lblText.setText("Ingrese Texto:");
				
	    this.contenedor.add(this.lblText);
	    
	    
		this.tfTexto=new JTextField(25);  
	    this.tfTexto.setText("");
				
	    this.contenedor.add(this.tfTexto);
	    
	    
	    this.lblResultado=new JLabel();  
	    this.lblResultado.setText("Resultado:");
				
	    this.contenedor.add(this.lblResultado);    
	    
	}
	
	
	// se invoca en constructor
	private void populateChecks(){		
		 
		 this.chkOpciones = new ArrayList<JCheckBox>();
		 JCheckBox unCheck;
		
		 for (int i=0; i<this.opciones.length;i++){
			unCheck = new JCheckBox(this.opciones[i]);
			unCheck.addActionListener(this);
			
			this.chkOpciones.add(unCheck);			
			this.contenedor.add(unCheck);			
			
		 }
	}	
	

	// se invoca en constructor
	private void populateButtons(){		
		this.btnLimpiar=new JButton("Limpiar");
		this.btnLimpiar.addActionListener(this);
		this.contenedor.add(this.btnLimpiar);
		
		
		this.btnCerrar=new JButton("Cerrar");
		this.btnCerrar.addActionListener(this);
		this.contenedor.add(this.btnCerrar);
		 
		 
	}	
	
	
	
	// centralizo el control de las interacciones
	public void actionPerformed(ActionEvent e){
		String texto, leyenda, auxiliar;
		Object obj = e.getSource();
		
		if (obj instanceof JButton) {
			leyenda = ((JButton) obj).getLabel().toString();
			
			if(leyenda.equals("Limpiar")) {
				this.tfTexto.setText("");
				this.lblResultado.setText("Resultado:");
				this.lblResultado.setFont(this.lblResultado.getFont().deriveFont(12f));
				this.lblResultado.setForeground(Color.BLACK);
			}else if(leyenda.equals("Cerrar"))
				System.exit(0);
			
			System.out.println(leyenda);
		}	
		
		if(obj instanceof JCheckBox) {
			leyenda = ((JCheckBox) obj).getLabel().toString();
			
			this.lblResultado.setText(this.tfTexto.getText());
			
			switch (leyenda){
				case "Cambiar color texto a rojo":  this.lblResultado.setForeground(Color.RED);
													break;
				case "Aumentar tamaño texto": 		this.lblResultado.setFont(this.lblResultado.getFont().deriveFont(20f));
													break;
				//case "Intercambiar":  
				//						break;
				//case "Corregir signos de puntuación": ;
				//									  break;
				//case default: break;
			}
			
			System.out.println(leyenda);
		}
		
	}	
	
	
}