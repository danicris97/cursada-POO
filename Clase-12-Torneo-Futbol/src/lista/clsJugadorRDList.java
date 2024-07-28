package lista;

import problema.clsJugador;
import base.clsRDList;

public class clsJugadorRDList extends clsRDList{

	public clsJugadorRDList(int maxSize){
		super(maxSize);		
	}
	
	public boolean isEqual(Object objetoLista, Object objetoBuscar){
		boolean response=false;
		
		if (objetoLista!=null && objetoBuscar!=null){
			
			clsJugador obj1, obj2;
			obj1 = (clsJugador) objetoLista;
			obj2 = (clsJugador) objetoBuscar;
						
			if (obj1.getDNI()==obj2.getDNI()){
				response = true;
			}				
		}	
		
		return response;
	}
	
}
