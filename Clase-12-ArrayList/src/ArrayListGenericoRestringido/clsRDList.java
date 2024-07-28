package ArrayListGenericoRestringido;

import ArrayListGenerico.clsRList;
// lista con tamaño restringido y con elementos diferentes

public abstract class clsRDList extends clsRList{
	
	clsRDList(int maxSize){
		super(maxSize);		
	}
	
	public boolean isInside(Object objeto){
		boolean response=false;
		int position =0;
		Object element;
		
		while (position<this.size() && !response){
			element = this.get(position);
			if (this.isEqual(element, objeto)){
				response = true;
			}else {
				position++;
			}
		}		
		
		return response;
			
	}
	
	
	public abstract boolean isEqual(Object objetoLista, Object objetoBuscar);
	
	
	// agrego siempre que haya lugar
	public void add(Object objeto){
		if ((this.size()<this.getMaxSize()) && (!this.isInside(objeto))){
			this.myList.add(objeto);
		}else {
			if (this.size()>=this.getMaxSize()){
				System.out.println("Error add. Se alcanzo el limite");
			}else {
				System.out.println("Error add. El elemento ya se encuentra en lista");
			}			
		}		
	}
	
	
	// reemplazo siempre que el nuevo valor no este en lista
	public void replaceAt(Object objeto, int position){		
		if (position>=0 && position<this.size()){
						
			if (!this.isInside(objeto)){
				this.myList.set(position, objeto);
			}else {
				System.out.println("Error replace. El nuevo elemento ya se encuentra en lista");
			}			
			
		}else {
			System.out.println("Error replace. Posicion invalida " + position);
		}		
	}	
	
}
