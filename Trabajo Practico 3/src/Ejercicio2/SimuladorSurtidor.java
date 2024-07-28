package Ejercicio2;

import java.util.Scanner;

public class SimuladorSurtidor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("INGRESE LAS N ITERACIONES: ");
		int n;
		Scanner entrada = new Scanner(System.in);
		n = entrada.nextInt();
		
		Surtidor s = new Surtidor();
		
		for(int i=0;i<n;i++) {
			System.out.println("CANTIDAD DE LITROS DISPONIBLES DE ULTRADIESEL: " + s.getCantUDiesel());
			System.out.println("CANTIDAD DE LITROS DISPONIBLES DE EURODIESEL: " + s.getCantEDiesel());
			System.out.println("CANTIDAD DE LITROS DISPONIBLES DE NAFTASUPER: " + s.getCantNSuper());
			System.out.println("CANTIDAD DE LITROS DISPONIBLES DE NAFTAINFINIA: " + s.getCantInfinia());
			
			int opcion =(int) (Math.random()*24)+1;
			int litros =(int) (Math.random()*30000)+1;
			
			switch (opcion) {
				case 1:case 2:case 3:case 4:case 5: System.out.println("INGRESE LA CANTIDAD DE LITROS ULTRADIESEL A CARGAR");
												 	//litros = entrada.nextInt();
												 	s.cargarUDiesel(litros);
													break;
				case 6:case 7:case 8:case 9:case 10: System.out.println("INGRESE LA CANTIDAD DE LITROS EURODIESEL A CARGAR");
													 //litros = entrada.nextInt();
													 s.cargarEDiesel(litros);
													 break;
				case 11:case 12:case 13:case 14: case 15: System.out.println("INGRESE LA CANTIDAD DE LITROS SUPER A CARGAR");
														  //litros = entrada.nextInt();
														  s.cargarNSuper(litros);
														  break;
				case 16:case 17:case 18:case 19: case 20: System.out.println("INGRESA LA CANTIDAD DE LITROS INFINIA A CARGAR");
														  //litros = entrada.nextInt();
														  s.cargarInfinia(litros);
														  break;
				case 21: System.out.println("LLENANDO ULTRADIESEL");
						 s.llenarDepositoUDiesel();
						 break;
				case 22: System.out.println("LLENANDO EURODIESEL");
						 s.llenarDepositoEDiesel();
						 break;
				case 23: System.out.println("LLENANDO NAFTASUPER");
						 s.llenarDepositoNSuper();
						 break;
				case 24: System.out.println("LLENANDO INFINIA");
						 s.llenarDepositoInfinia();
						 break;
				default: break;
			}
		}
		
		System.out.println("CANTIDAD DE LITROS DISPONIBLES DE ULTRADIESEL: " + s.getCantUDiesel());
		System.out.println("CANTIDAD DE LITROS DISPONIBLES DE EURODIESEL: " + s.getCantEDiesel());
		System.out.println("CANTIDAD DE LITROS DISPONIBLES DE NAFTASUPER: " + s.getCantNSuper());
		System.out.println("CANTIDAD DE LITROS DISPONIBLES DE NAFTAINFINIA: " + s.getCantInfinia());
	}

}
