package base;

import java.util.ArrayList;

public interface InterfaceLista {
	
	public void add(Object objeto);
	public void delete(int position);
	public void replaceAt(Object objeto, int position);
	public Object get(int position);
	public int size();
	public ArrayList<Object> getList();
	
}
