package lista;

import problema.clsPartido;
import base.clsRDList;

public class clsPartidoRDList extends clsRDList{

	public clsPartidoRDList(int maxSize){
		super(maxSize);		
	}
	
	// son iguales si es la misma fecha con local y visitante
	public boolean isEqual(Object objetoLista, Object objetoBuscar){
		boolean response=false;
		
		if (objetoLista!=null && objetoBuscar!=null){
			
			clsPartido obj1, obj2;
			obj1 = (clsPartido) objetoLista;
			obj2 = (clsPartido) objetoBuscar;
						
			if (obj1.getFecha()==obj2.getFecha() && obj1.getLocal()==obj2.getLocal() && obj1.getVisitante()==obj2.getVisitante()){
				response = true;
			}				
		
		}	
		
		return response;
	}
}
