package Ejercicio4;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matriz m = new Matriz(2,2);
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++)
				m.setElem(i,j,i+j);
		}
		
		Matriz n = new Matriz(2,2);
		n.mostrar();
		
	}

}
