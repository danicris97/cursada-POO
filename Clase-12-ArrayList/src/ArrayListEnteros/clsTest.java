package ArrayListEnteros;

import java.util.Random;

public class clsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] options = {"instanciar", "agregar", "eliminar", "reemplazar", "devolver", "cardinal", "salir"};
		int size = 7;
		int option= -1;
		Random valueAtRandom = new Random();		
		int value =-1; int minInteger = -100; int maxInteger = 100; int position = -1;
		int iterations = 0; int maximum =50;
		
		clsIntegerList objLista = new clsIntegerList(); // instancia para comenzar
		
        do {
        	option = valueAtRandom.nextInt(size);
        	
        	switch (option) {
	            case 0:
	            	objLista = new clsIntegerList();
	            	System.out.println("option:: " + options[option]);
	                break;
	                
	            case 1:
	            	value = minInteger + valueAtRandom.nextInt(maxInteger - minInteger +1); // intervalo cerrado
	            	objLista.add(value);
	            	
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
	            	objLista.replaceAt(value, position);
	            	
	            	System.out.println("option:: " + options[option] + " position  " + position + " newvalue " + value + " size " + objLista.size() );
	                break;
	            
	            case 4:
	            	position = valueAtRandom.nextInt(maxInteger / 3);
	            	
	            	System.out.println("option:: " + options[option] + " position  " + position + " value " + objLista.get(position) + " size " + objLista.size());
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
		
		System.out.println("Hasta la vista baby " + " option " + option + " iters " + iterations + " list " + objLista.toString());

	}

}
