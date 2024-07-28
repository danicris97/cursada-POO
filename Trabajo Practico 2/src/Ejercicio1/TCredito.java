package Ejercicio1;

public class TCredito {
	private String numero;
	private String nombre;
	private String banco;
	private double balance;
	private double limite;
	
	public TCredito(String vnumero, String vnombre, String vbanco, double vbalance, double vlimite) {
		this.numero=vnumero;
		this.nombre=vnombre;
		this.banco=vbanco;
		this.balance=vbalance;
		this.limite=vlimite;
	}
	
	public String getNumero() {return this.numero;}
	public String getNombre() {return this.nombre;}
	public String getBanco() {return this.banco;}
	public double getBalance() {return this.balance;}
	public double getLimite() {return this.limite;}
	
	public void aumentarBalance(double importe) {
		this.balance += importe;
	}
	
	public boolean puedoComprar(double vprecio){
		if (vprecio>this.limite)
			return false;
		else {
			//this.balance+=vprecio;
			return true;
		}
	}
	
	public void pagarTarjeta(double vmonto){
		this.balance-=vmonto; 
	}
	
	public void muestraDatos(){
		System.out.println("numero = "+ getNumero());
		System.out.println("nombre = "+ getNombre());
		System.out.println("banco = " + getBanco());
		System.out.println("balance = " + getBalance());
		System.out.println("limite = " + getLimite());
	}
}
