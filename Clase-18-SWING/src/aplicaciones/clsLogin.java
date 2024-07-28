package aplicaciones;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class clsLogin extends JFrame implements ActionListener{
	
	protected JTextField tfield1; 
	protected JPasswordField tfield2;
	protected JButton button1, button2;
	protected JLabel lbl1, lbl2;
	protected JPanel panel;
	
	
	protected ResultSet rs;
	protected String dbName;
	protected clsCRUDUsers objCRUD;
	protected clsSession objSession;
	
	public clsLogin(String dbName){
		super ("POO - Login");
		this.setSize(400,130);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.panel = new JPanel();
		this.panel.setLayout(new GridLayout(3,2));
		
		populateRow1();
		populateRow2();
		populateRow3();
		
		setDBName(dbName);
		connect2DB();
		
		add(this.panel);
		
	}

	private void setDBName(String dbName){
		this.dbName = dbName;
	}
	
	private String getDBName(){
		return this.dbName;
	}
	
	
	private void populateRow1(){
		
		this.lbl1=new JLabel();  
	    this.lbl1.setText("Mail:");
		
		this.tfield1=new JTextField();  
	    this.tfield1.setText("");
	    
	    this.panel.add(this.lbl1);
	    this.panel.add(this.tfield1);
	}

	
	private void populateRow2(){
		
		this.lbl2=new JLabel();  
	    this.lbl2.setText("Password:");
		
		this.tfield2=new JPasswordField(20);  
	 	    
	    this.panel.add(this.lbl2);
	    this.panel.add(this.tfield2);
	}

	private void populateRow3(){
		this.button1=new JButton("Login");
		this.button1.addActionListener(this); 
		
		this.button2=new JButton("Exit");
		this.button2.addActionListener(this); 

	    this.panel.add(this.button1);
	    this.panel.add(this.button2);
	
		
	}
	
	
	public void connect2DB(){
			this.objCRUD = new clsCRUDUsers(this.dbName);
			this.rs = null;
	}
	
	
	public void actionPerformed(ActionEvent e){
		clsMenu objMenu;
		String name="";
		String email, password, apenom, descripcion;
		int id, roleID;
		Object obj = e.getSource();
				
		if (obj instanceof JButton) {
			name =  ((JButton) e.getSource()).getLabel().toString();
			
			if (name.equals("Login")){
				// login								
				email = this.tfield1.getText().toString();
				password = this.tfield2.getText().toString();
					
				if (!email.equals("") && !password.equals("")){
					
					try {

						this.rs = objCRUD.login(email, password);
						
						if (this.rs!=null){
							while(this.rs.next()){
								// SELECT id, email, apenom, fchalta, password, descripcion 
								id = this.rs.getInt("id");
								apenom = this.rs.getString("apenom");
								descripcion = this.rs.getString("descripcion"); // rol								
								roleID = this.rs.getInt("roleID");
								
								System.out.println("Exito! " + id +  "  " + apenom +  " " + descripcion);
								
								objSession = new clsSession(id, apenom, roleID, descripcion, getDBName());
								objMenu = new clsMenu(objSession);
								
								objMenu.setAlwaysOnTop(true);
								objMenu.setResizable(true);
								objMenu.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);								
								objMenu.setVisible(true);
								
								this.dispose(); // cerrar
							}							
							
						} else {
							System.out.println("Error. Email o password incorrecto");
						}					
						
					} catch (SQLException e2) {  
			            System.out.println(e2.getErrorCode() + " " + e2.getMessage());  
			        }			            
					
				}
				
			}
			
			
			if (e.getSource()==this.button2){
				System.exit(0);
			}			
			
		}	

	}
	
	
	
}
