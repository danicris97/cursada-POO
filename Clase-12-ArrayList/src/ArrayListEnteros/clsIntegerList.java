package ArrayListEnteros;

import java.util.ArrayList;

public class clsIntegerList {

	protected ArrayList<Integer> myList;
	private static int maxValue = 2147483647;
	
	public clsIntegerList(){
		this.myList = new ArrayList<Integer>();
	}
	
	public void add(int value){
		this.myList.add(value);
	}

	public void delete(int position){
		if (position>=0 && position<this.size()){
			this.myList.remove(position);			
		}else {
			System.out.println("Error delete. Posicion invalida " + position);
		}
	}
	
	public void replaceAt(int newvalue, int position){
		if (position>=0 && position<this.size()){
			this.myList.set(position, newvalue);
		}else {
			System.out.println("Error replace. Posicion invalida " + position);
		}		
	}
	
	public int get(int position){
		if (position>=0 && position<this.size()){
			return this.myList.get(position);
		}else {
			System.out.println("Error get. Posicion invalida " + position);
			return this.maxValue;
		}
	}
	
	public int size(){
		return this.myList.size();
	}
	
	@Override
	public String toString() {
		return this.myList.toString();
	}

}
