package ArrayListGenericoRestringido;

import ArrayListGenerico.clsRDList;
// subclase que implementa metodo abstracto isEqual

public class clsIntegerRDList extends clsRDList{

	clsIntegerRDList(int maxSize){
		super(maxSize);		
	}
	
	public boolean isEqual(Object objetoLista, Object objetoBuscar){
		boolean response=false;
		
		if (objetoLista!=null && objetoBuscar!=null){
			int value1 = ((Integer) objetoLista).intValue();
			int value2 = ((Integer) objetoBuscar).intValue();
			
			if (value1==value2){
				response = true;
			}				
		}	
		
		return response;
	}
	
}
