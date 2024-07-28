package base;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.*;

// https://www.javatpoint.com/java-jradiobutton
//https://censorcosmico.blogspot.com/2010/03/crear-grupo-de-botones-buttongroup.html
// https://stackoverflow.com/questions/30151689/making-array-of-checkbox-and-numberpicker-using-java-in-eclipse


public class clsHelloWorld2 extends JFrame implements ActionListener{
	
	private JLabel lbl1, lbl2; 
	private JComboBox combo1;
	private Container contenedor1;
	
	private String[] languages = {"English", "French", "Spanish", "Japanese" ,"Chinese"};

	private ArrayList<JCheckBox> checks;
	
	private ButtonGroup bgroupL;
    	
	
	
	public clsHelloWorld2(){
		super ("POO - Swing2");
		this.setSize(400,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLayout(new FlowLayout());
		this.contenedor1 = getContentPane();
		
		
		this.lbl1 = new JLabel();
		this.lbl1.setText("Elija idioma:");
		this.contenedor1.add(this.lbl1);
		
		this.combo1 = new JComboBox(this.languages);
		this.contenedor1.add(this.combo1);
		this.combo1.addActionListener(this); // oyente
				
		this.populateChecks();   
		this.populateRadios();  

		this.lbl2 = new JLabel();
		this.lbl2.setText("Resultado:");
		this.contenedor1.add(this.lbl2);

	}
	
	private void populateChecks(){		
		 this.checks = new ArrayList<JCheckBox>();
		 JCheckBox unCheck;
		
		 for (int i=0; i<this.languages.length;i++){
			unCheck = new JCheckBox(this.languages[i]);
			unCheck.addActionListener(this);
			this.checks.add(unCheck);
			
			this.contenedor1.add(unCheck);
			
		 }	
	}
	
	private void populateRadios(){		
		 
		 JRadioButton unRadio;
		 
		 this.bgroupL = new ButtonGroup();
		
		 for (int i=0; i<this.languages.length;i++){
			unRadio = new JRadioButton(this.languages[i]);
			unRadio.addActionListener(this);
			
			this.bgroupL.add(unRadio);		
			this.contenedor1.add(unRadio);
		 }
	}	
		
	
	public void actionPerformed(ActionEvent e){
		int i;		
		String cadena;
		JComboBox combo;
		
		Object obj = e.getSource();
		
		if (obj instanceof JComboBox) {
		    combo = (JComboBox)obj;		    
		    lbl2.setText("Combo " + combo.getSelectedItem().toString());		
		}	
						
		if (obj instanceof JCheckBox) {		
			cadena = lbl2.getText().toString();
			String auxiliar;
			
			if (((JCheckBox) obj).isSelected()){
				if (cadena.startsWith("Checkbox")){
					if (!cadena.contains(((JCheckBox) obj).getLabel().toString())) {
						cadena = cadena + ", " + ((JCheckBox) obj).getLabel().toString();
						lbl2.setText(cadena);
					}
				}else {
					lbl2.setText("Checkbox " + ((JCheckBox) obj).getLabel().toString());
				}				
			}else {
				if(cadena.contains(((JCheckBox) obj).getLabel().toString())) {
					if(cadena.contains(", "))
						cadena = cadena.replace(", " + ((JCheckBox) obj).getLabel().toString(), "");
					else
						cadena = cadena.replace(((JCheckBox) obj).getLabel().toString(), "");
					lbl2.setText(cadena);
				}
			}
		}	

		if (obj instanceof JRadioButton) {		
			
			if (((JRadioButton) obj).isSelected()){				
					lbl2.setText("RadioButton " + ((JRadioButton) obj).getLabel().toString());
								
			}			   				
		}		
		
		
	}	
	
}
