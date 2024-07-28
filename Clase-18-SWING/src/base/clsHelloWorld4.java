package base;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

// https://www.javatpoint.com/java-jmenuitem-and-jmenu
// https://www.geeksforgeeks.org/java-swing-jmenubar/

public class clsHelloWorld4 extends JFrame implements ActionListener {

	private JMenuBar mnuBar;    
	private JMenu mFile,mEdit,mHelp;    
	private JMenuItem itemCut,itemCopy,itemPaste,itemSelectAll;  
	
	public clsHelloWorld4(){
		
		super ("POO - Swing4");
		this.setSize(400,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.populateMenu();
		
	}
	
	private void populateMenu(){
		
		this.itemCut = new JMenuItem("Cut");
		this.itemCut.addActionListener(this);
		
		this.itemCopy = new JMenuItem("Copy");
		this.itemCopy.addActionListener(this);
		
		this.itemPaste = new JMenuItem("Paste");
		this.itemPaste.addActionListener(this);
		
		this.itemSelectAll = new JMenuItem("Select All");
		this.itemSelectAll.addActionListener(this);
		
		this.mFile = new JMenu("File");
		this.mEdit = new JMenu("Edit");
		this.mHelp = new JMenu("Help");
		
		this.mEdit.add(this.itemCut);
		this.mEdit.add(this.itemCopy);
		this.mEdit.add(this.itemPaste);
		this.mEdit.add(this.itemSelectAll);
		
		this.mnuBar = new JMenuBar();
		
		this.mnuBar.add(this.mFile);
		this.mnuBar.add(this.mEdit);
		this.mnuBar.add(this.mHelp);
		
		this.setJMenuBar(this.mnuBar);		
		
	}
	
	public void actionPerformed(ActionEvent e){
		String mensaje="Elegiste opcion ";
		
		if (e.getSource()==this.itemCut){
			mensaje = mensaje +  ((JMenuItem) e.getSource()).getLabel().toString();
			
		}
		
		if (e.getSource()==this.itemPaste){
			mensaje = mensaje +  ((JMenuItem) e.getSource()).getLabel().toString();
		}
		
		if (e.getSource()==this.itemCopy){
			mensaje = mensaje +  ((JMenuItem) e.getSource()).getLabel().toString();
		}
		
		if (e.getSource()==this.itemSelectAll){
			mensaje = mensaje +  ((JMenuItem) e.getSource()).getLabel().toString();
		}
		
		System.out.println(mensaje);
		
	}
	
	
}
