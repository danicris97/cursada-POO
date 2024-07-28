package base;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;  

public class clsHelloWorld extends JFrame{ 
	
	private JTextField tfield1;
	private JButton button1;
	private JLabel lbl1;
	
	private int iter;
	
	public clsHelloWorld(){
		super ("POO - Swing");
		
		this.iter = 0;
		
		this.lbl1=new JLabel();  
	    this.lbl1.setBounds(20,20, 360,20);  
		this.lbl1.setText("Hola Mundo");
		add(this.lbl1); // si no se agrega, no se muestra
				
		
		this.tfield1=new JTextField();  
	    this.tfield1.setBounds(20,50, 360,20);  
		this.tfield1.setText("Escribi algo...");
		
		this.tfield1.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                //JTextField textField = (JTextField) e.getSource();
                
                String texto = tfield1.getText();
                
                if (texto.equals("")){
                	button1.setEnabled(false);
                }else {
                	tfield1.setText(texto.toUpperCase());
                	button1.setEnabled(true);
                }                            
                
            }
        });
				
		add(this.tfield1); // si no se agrega, no se muestra
		
		
		this.button1=new JButton("Click aqui");//create button  
		this.button1.setBounds(20,80,360, 40); 	// posicion y tamano          
		
		this.button1.addActionListener(new ActionListener(){  
			 public void actionPerformed(ActionEvent e){
				 if (iter==0){
					 button1.setText("Me cliqueaste 1 vez" );
					 iter++;
				 }else {
					 button1.setText("Me cliqueaste " + iter + " veces"); 
				 }
				 
				 iter++;
				 
			        
			 }  
		}); 
				
		add(this.button1);
			    
		
		this.setSize(400,500);		
		this.setLayout(null);  
		this.setVisible(true);  
	}
}