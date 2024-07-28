package test;
import base.*;


import java.util.Random;
import java.util.ArrayList;

public class clsTest3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] options = {"instanciar", "agregar", "eliminar", "reemplazar", "devolver", "cardinal", "salir"};
		int size = 7;
		int option= -1;
		Random valueAtRandom = new Random();		
		int value =-1; int minInteger = -100; int maxInteger = 100; int position = -1;
		int iterations = 0; int maximum =50; String cadena="";
		
		ArrayList<Object> objAuxiliar = new ArrayList<Object>();	
		int maxSize=2;
		clsRList objLista = new clsRList(maxSize); // instancia para comenzar
		
        do {
        	option = valueAtRandom.nextInt(size);
        	
        	switch (option) {
	            case 0:
	            	objLista = new clsRList(maxSize);
	            	System.out.println("option:: " + options[option]);
	                break;
	                
	            case 1:
	            	value = minInteger + valueAtRandom.nextInt(maxInteger - minInteger +1); // intervalo cerrado
	            	objLista.add(new Integer(value));
	            	
	            	System.out.println("option:: " + options[option] + " value " + value);
	            	break;
	            	
	            case 2:
	            	position = valueAtRandom.nextInt(maxInteger / 3);	            	
	            	objLista.delete(position);
	            	
	            	System.out.println("option:: " + options[option] + " position " + position + " size " + objLista.size());
	            	break;
	            	
	            case 3:
	            	position = valueAtRandom.nextInt(maxInteger / 3);
	            	value = minInteger + valueAtRandom.nextInt(maxInteger - minInteger +1); // intervalo cerrado            	
	            	objLista.replaceAt(new Integer(value), position);
	            	
	            	System.out.println("option:: " + options[option] + " position  " + position + " newvalue " + value + " size " + objLista.size() );
	                break;
	            
	            case 4:
	            	cadena="";
	            	position = valueAtRandom.nextInt(maxInteger / 3);
	            	
	            	
	            	if (objLista.get(position)!=null){
	            		cadena = objLista.get(position).toString();
	            	}else {
	            		cadena = "null";
	            	}
	            	
	            	System.out.println("option:: " + options[option] + " position  " + position + " value " + cadena + " size " + objLista.size());
	                break;
	                
	            case 5:	            	
	            	System.out.println("option:: "+ options[option] + " size " + objLista.size());
	            	break;
	            	
	            case 6:	            	           	
	            	System.out.println("option:: "+ options[option]);
	                break;     
	            	            
        	}
        	
        	iterations++;        	
        	
        	
        } while (option != 6 && iterations<maximum);
		
		System.out.println("Hasta la vista baby " + " option " + option + " iters " + iterations);
		
		objAuxiliar = objLista.getList();
		System.out.print("[ ");
		for(Object numero:objAuxiliar){
			System.out.print(numero.toString());
		      System.out.print(", ");
		}
		System.out.print("]");
				

	}
	
}
