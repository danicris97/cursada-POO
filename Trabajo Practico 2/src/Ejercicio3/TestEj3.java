package Ejercicio3;

public class TestEj3 {
		public static void main(String[] args) {
			System.out.println("serie aritmetica con incr por defecto ");
			ProgresionArit ProgUno=new ProgresionArit();
			ProgUno.imprProgresion(10);
			System.out.println("serie aritmetica con incr de 7 ");
			ProgresionArit ProgDos=new ProgresionArit(7);
			ProgDos.imprProgresion(10);}
}