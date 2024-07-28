package Ejercicio1;

public class Tarjeta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TCredito JPTarjeta=new TCredito("666","JPerez","BcoPatagonia",2000,10000);//Instancias de la clase TCredito
		TCredito DMTarjeta=new TCredito("777","DMara","BcoGalicia",5000,100000);//Intancia de la clase TCredito
		JPTarjeta.muestraDatos();//Muestra nombre y numero de tarjeta de un cliente
		DMTarjeta.muestraDatos();
		
		if(JPTarjeta.puedoComprar(16000))
			JPTarjeta.pagarTarjeta(16000);
		else
			System.out.println("NO HAY SALDO SUFICIENTE");
		
		JPTarjeta.aumentarBalance(20000);
		
		if(JPTarjeta.puedoComprar(3500))
			JPTarjeta.pagarTarjeta(3500);
		else
			System.out.println("NO HAY SALDO SUFICIENTE");
		
		JPTarjeta.muestraDatos();
	}
}
