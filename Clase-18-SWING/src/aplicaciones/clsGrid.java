package aplicaciones;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

//https://stackoverflow.com/questions/27815400/retrieving-data-from-jdbc-database-into-jtable/43772751
public class clsGrid extends JFrame implements ActionListener{
	protected JTable jtabla;
	protected DefaultTableModel modelo;
	protected Container contenedor;
	protected JButton button1;
	protected JScrollPane sp1;
	
	// info del usuario logueado
	protected clsSession objSession;
	protected ResultSet rs;
	protected clsCRUDUsers objCRUD;	
	
	public clsGrid(clsSession objSession){
		
		super ("POO - Grid");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		
		this.setLayout(new FlowLayout());
		this.contenedor = getContentPane();
		
		this.objSession = objSession;		
		connect2DB();
		populateTable();
		
		populateButton();
		
	}
	
	public void connect2DB(){
		this.objCRUD = new clsCRUDUsers(this.objSession.getDBName());
		this.rs = null;
	}	

	
	private void populateButton(){
		this.button1=new JButton("Close");
		this.button1.addActionListener(this);
		
		this.contenedor.add(this.button1);
		
	}
	
	
	// SELECT users.id, users.email, users.apenom, users.fchalta, users.password, userRole.descripcion
	private void populateTable(){
		int id, counter;
		String email, apenom, password, descripcion, fchAlta;
				
		this.jtabla = new JTable();
		this.modelo = new DefaultTableModel(new String[]{"ID", "Apellido y Nombre", "Email", "F.Alta", "Rol"}, 0);
		
		counter =0;
				
		try {

			this.rs = this.objCRUD.getUsers();
			
			if (this.rs!=null){
				while(this.rs.next()){
					// 
					id = this.rs.getInt("id");
					apenom = this.rs.getString("apenom");
					email = this.rs.getString("email");
					fchAlta = this.rs.getString("fchalta");
					descripcion = this.rs.getString("descripcion"); // rol								
					
					this.modelo.addRow(new Object[]{id, apenom, email, fchAlta, descripcion});
					counter ++;
				}
				
				this.jtabla.setModel(this.modelo);
				this.sp1 = new JScrollPane(this.jtabla);				
				this.contenedor.add(this.sp1);
				
				System.out.println("Exito. Se cargaron " + counter + " usuarios");
				
			} else {
				System.out.println("Error. No hay info de usuarios");
			}					
			
		} catch (SQLException e) {  
            System.out.println(e.getErrorCode() + " " + e.getMessage());  
        }	
		
	}
	
	public void actionPerformed(ActionEvent e){
		String mensaje="Elegiste opcion ";
		
		if (e.getSource()==this.button1){
			this.dispose(); // cerrar
		}
			
		System.out.println("Opcion "+ mensaje);
		
	}	
	
}
