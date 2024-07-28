package aplicaciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class clsMenu extends JFrame implements ActionListener{
	
	private JMenuBar mnuBar;    
	private JMenu mAction,mUser;    
	private JMenuItem itemLogout,itemGrid,itemForm;  

	// info del usuario logueado
	protected clsSession objSession;
	
	public clsMenu(clsSession objSession){
		
		super ("Bienvenido " + objSession.getApenom() + " !");
		this.populateMenu();
		
		this.objSession = objSession;
	}
	
	
	
	private  void populateMenu(){

		this.itemLogout = new JMenuItem("Exit");
		this.itemLogout.addActionListener(this);
		
		this.itemGrid = new JMenuItem("All Users");
		this.itemGrid.addActionListener(this);
		
		this.itemForm = new JMenuItem("My Info");
		this.itemForm.addActionListener(this);
		
		this.mAction = new JMenu("Actions");
		this.mUser = new JMenu("Users");
		
		this.mAction.add(this.itemLogout);
		this.mUser.add(this.itemForm);
		this.mUser.add(this.itemGrid);
		
		this.mnuBar = new JMenuBar();
		
		this.mnuBar.add(this.mAction);
		this.mnuBar.add(this.mUser);
				
		this.setJMenuBar(this.mnuBar);		
	}
	
	public void actionPerformed(ActionEvent e){
		String mensaje="Elegiste opcion ";
		clsGrid objGrid;
		clsForm objForm;
		
		if (e.getSource()==this.itemLogout){
			mensaje = mensaje +  ((JMenuItem) e.getSource()).getLabel().toString();
			
			System.exit(0);			
		}
		
		if (e.getSource()==this.itemForm){
			mensaje = mensaje +  ((JMenuItem) e.getSource()).getLabel().toString();
			
			objForm = new clsForm(this.objSession);			
			objForm.setAlwaysOnTop(true);
			objForm.setResizable(true);
			objForm.setVisible(true);
			
		}

		if (e.getSource()==this.itemGrid){
			mensaje = mensaje +  ((JMenuItem) e.getSource()).getLabel().toString();
			
			objGrid = new clsGrid(this.objSession);			
			objGrid.setAlwaysOnTop(true);
			objGrid.setResizable(true);
			objGrid.setVisible(true);								
			
		}
		
		System.out.println("Opcion "+ mensaje);
		
	}	
}
