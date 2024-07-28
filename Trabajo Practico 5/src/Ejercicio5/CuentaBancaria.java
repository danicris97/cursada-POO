package Ejercicio5;

public class CuentaBancaria {
	private int numero;
	private String titular;
	private double saldo;
	private int maxExtr, cantExtr;
	
	public CuentaBancaria(int numero, String titular, int maxExtr) {
		this.setNumero(numero);
		this.setTitular(titular);
		this.setMaxExtraccion(maxExtr);
		this.saldo = 0;
		this.cantExtr = 0;
	}
	
	public void setNumero(int numero) {this.numero = numero;}
	public void setTitular(String titular) {this.titular = titular;}
	public void setMaxExtraccion(int maxExtr) {this.maxExtr = maxExtr;}
	
	public int getNumero() {return this.numero;}
	public String getTitular() {return this.titular;}
	public double getSaldo() {return this.saldo;}
	public int getMaxExtraccion() {return this.maxExtr;}
	public int getCantExtraccion() {return this.cantExtr;}
	
	public void depositar(double deposito) {this.saldo += deposito;}
	
	public boolean extraer(double monto) {
		if(this.getSaldo()<monto) {
			return false;
		}else {if(this.getCantExtraccion()<this.getMaxExtraccion()) {
					this.saldo -= monto;
					this.cantExtr++;
					return true;
				}else {
					System.out.println("LLEGO AL LIMITE MAXIMO DE EXTRACCIONES");
					return false;
				}
		}
	}
	
	public void mostrarDatos() {
		String cadena = "NUMERO DE CUENTA: " + this.getNumero() + "\nTITULAR: " + this.getTitular() + "\nSALDO: " + this.getSaldo();
		System.out.println(cadena);
	}
}
