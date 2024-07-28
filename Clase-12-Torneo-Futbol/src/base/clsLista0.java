package base;

import java.util.ArrayList;

public class clsLista0 {
		
	protected ArrayList<Object> myList;
	
	public clsLista0(){
		this.myList= new ArrayList<Object>();
	}
	
	public void add(Object objeto){
		this.myList.add(objeto);
	}

	public void delete(int position){
		if (position>=0 && position<this.size()){
			this.myList.remove(position);			
		}else {
			System.out.println("Error delete. Posicion invalida " + position);
		}
	}
	
	public void replaceAt(Object objeto, int position){
		if (position>=0 && position<this.size()){
			this.myList.set(position, objeto);
		}else {
			System.out.println("Error replace. Posicion invalida " + position);
		}		
	}
	
	public Object get(int position){
		if (position>=0 && position<this.size()){
			return this.myList.get(position);
		}else {
			System.out.println("Error get. Posicion invalida " + position);
			return null;
		}
	}
	
	public int size(){
		return this.myList.size();
	}
	
	
	public ArrayList<Object> getList(){
		return this.myList;
	}	
	
}
