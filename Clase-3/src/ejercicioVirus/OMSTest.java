package ejercicioVirus;

import java.util.Scanner;

public class OMSTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Virus v = new Virus();
		System.out.println(v.toString());
		Scanner ingreso = new Scanner(System.in);
		int contador=0;
		
		while(v.esNocivo()) {
			System.out.println("INGRESE EL VALOR NEUTRALIZANTE: ");
			v.neutralizar(ingreso.nextInt());
			contador++;
		}
		
		System.out.println(v.toString());
		System.out.println("CANTIDAD DE INTENTOS: " + contador);
	}

}
