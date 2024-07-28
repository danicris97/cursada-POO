package lista;

import problema.clsEquipo;
import base.clsRDList;

public class clsEquipoRDList extends clsRDList{

	public clsEquipoRDList(int maxSize){
		super(maxSize);		
	}
	
	// esta incompleto. Deberia comparar DT y jugadores
	public boolean isEqual(Object objetoLista, Object objetoBuscar){
		boolean response=false;
		
		if (objetoLista!=null && objetoBuscar!=null){
			
			clsEquipo obj1, obj2;
			obj1 = (clsEquipo) objetoLista;
			obj2 = (clsEquipo) objetoBuscar;
						
			if (obj1.getNombre()==obj2.getNombre()){
				response = true;
			}				
		}	
		
		return response;
	}
	
}

