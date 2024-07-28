package aplicaciones;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class clsForm extends JFrame implements ActionListener{
	
	protected clsSession objSession;	
	protected JTextField tfield1; 
	protected JPasswordField tfield2, tfield3;
	protected JButton button1, button2;
	protected JLabel lbl1, lbl2, lbl3;
	protected JPanel panel;
	
	
	public clsForm(clsSession objSession){
		super ("POO - Form");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,180);
		
		this.objSession = objSession;
		
		this.panel = new JPanel();
		this.panel.setLayout(new GridLayout(4,2));
		
		populateRow1();
		populateRow2();
		populateRow3();
		
		add(this.panel);		
	}
	

	private void populateRow1(){
		
		this.lbl1=new JLabel();  
	    this.lbl1.setText("Apellido y Nombre:");
		
		this.tfield1=new JTextField();  
	    this.tfield1.setText("");
	    
	    this.panel.add(this.lbl1);
	    this.panel.add(this.tfield1);
	}

	
	private void populateRow2(){
		
		this.lbl2=new JLabel();  
	    this.lbl2.setText("Nueva Password:");
		
		this.tfield2=new JPasswordField(20);
				
	    this.panel.add(this.lbl2);
	    this.panel.add(this.tfield2);
	    
		this.lbl3=new JLabel();  
	    this.lbl3.setText("Repita Nueva Password:");
		
		this.tfield3=new JPasswordField(20);
				
	    this.panel.add(this.lbl3);
	    this.panel.add(this.tfield3);
	    
	}

	private void populateRow3(){
		this.button1=new JButton("Update");
		this.button1.addActionListener(this); 
		
		this.button2=new JButton("Close");
		this.button2.addActionListener(this); 

	    this.panel.add(this.button1);
	    this.panel.add(this.button2);
			
	}
	
	
	// this.SQL ="UPDATE users SET apenom=?, password=?, roleID=? WHERE id = ?";
	public void actionPerformed(ActionEvent e){
		String mensaje="Elegiste opcion ";
		String password1, password2;
		int result;
		String apenom;
		
		clsCRUDUsers objCRUD = new clsCRUDUsers(this.objSession.getDBName());
		
		
		if (e.getSource()==this.button1){
			// update
			
			if (!this.tfield1.equals("")){
				password1 = this.tfield2.getText().toString();
				password2 = this.tfield3.getText().toString();
				
				if (!password1.equals("") &&  !password1.equals("") && password1.equals(password1)){
					
					apenom = this.tfield1.getText().toString();						
					
					System.out.println("apenom " + apenom + " password " + password1 + " roleID " + objSession.getRoleID() + " ID " +  this.objSession.getID());
					
					result = objCRUD.updateUser(apenom, password1, objSession.getRoleID(), this.objSession.getID());
					
					if (result>0){
						System.out.println("Exito. Se actualizaron los datos correctamente");
						
					} else {
						System.out.println("Error. No se pudo actualizar datos personales");
					}					
					
				} else {
					System.out.println("Error. Las contraseñas no deben ser vacias y deben coincidir");
				}
				
			}else {
				System.out.println("Error. No ingreso Apellido y Nombre.");
			}
			
			
		}
		
		
		if (e.getSource()==this.button2){
			this.dispose(); // cerrar
		}
			
		System.out.println("Opcion "+ mensaje);
		
	}	
	
	
}
