package ArrayListGenerico;

import ArrayGenerico.clsLista0;
// lista con tamaño restringido


public class clsRList extends clsLista0{
	protected int maxSize;
	
	public clsRList(int maxSize){
		super();
		this.setMaxSize(maxSize);
		
	}
	
	public int getMaxSize(){
		return this.maxSize;
	}
	
	public void setMaxSize(int maxSize){
		this.maxSize = maxSize;
	}
	
	// agrego siempre que haya lugar
	public void add(Object objeto){
		if (this.size()<this.getMaxSize()){
			this.myList.add(objeto);
		}else {
			System.out.println("Error add. Se alcanzo el limite");
		}
		
		
	}

}
