package ejercicio2;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complejo c1 = new Complejo(4,8);
		Complejo c2 = new Complejo(2,-3);
		Complejo resultado = new Complejo(0,0);
		
		System.out.println(c1.mostrarComplejo());
		System.out.println(c2.mostrarComplejo());
		System.out.println(resultado.mostrarComplejo());
		resultado = c1.sumaCompejo(c2);
		System.out.println("SUMA: "+resultado.mostrarComplejo());
	}

}
