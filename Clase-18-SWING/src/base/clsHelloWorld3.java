package base;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

// https://www.codejava.net/java-se/swing/editable-jtable-example
// https://www.javatpoint.com/java-jtable

public class clsHelloWorld3 extends JFrame{
	
	private JTable jtabla1;
	private String[] columnas;
	private String[][] datos;
	private JScrollPane sp1;
	
	private ListSelectionModel seleccion;
	
	public clsHelloWorld3(){
		super ("POO - Swing3");
		this.setSize(400,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		this.populateTable();
		
		this.setSeleccion();
		
		this.sp1 = new JScrollPane(this.jtabla1);
		
		this.add(this.sp1);
		
	}
	
	private void populateTable(){
		this.columnas = new String[]{"ID", "Nombre", "Salario'"};
		this.datos= new String[][]{{"101","Amit","670000"},    
                 									{"102","Jai","780000"}, 
                 									{"101","Sachin","700000"}};   
		
		this.jtabla1 = new JTable(datos, columnas);
		this.jtabla1.setCellSelectionEnabled(true); // con esto se habilita la seleccion x celda sino queda x fila
	
		
	}
	
	private void setSeleccion(){
		this.seleccion = this.jtabla1.getSelectionModel();		
		this.seleccion.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);		
		this.seleccion.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {  
              String Data = null;  
              int[] row = jtabla1.getSelectedRows();  
              int[] columns = jtabla1.getSelectedColumns();  
              for (int i = 0; i < row.length; i++) {  
                for (int j = 0; j < columns.length; j++) {  
                  Data = (String) jtabla1.getValueAt(row[i], columns[j]);  
                } }  
              System.out.println("El elemento selecconado es: " + Data);    
            }
          });  
	}
	
	
	
}
