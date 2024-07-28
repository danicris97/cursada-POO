package Ejercicio6;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lista l = new Lista(5);
		
		l.cargaElemento(25);
		l.cargaElemento(12);
		l.cargaElemento(7);
		l.cargaElemento(8);
		l.cargaElemento(13);
		
		l.buscaElemento(4);
		l.OrdenaMenorMayor();
		
		System.out.println(l.toString());
	}

}
