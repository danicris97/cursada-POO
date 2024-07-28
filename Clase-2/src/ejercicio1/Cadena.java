package ejercicio1;

public class Cadena {
	public String linea;
	
	public Cadena(String linea) {
		this.linea = linea;
	}
	
	public int cantidadCaracteres() {
		return (this.linea.replace(" ", "").length());//REEMPLAZA VACIOS Y CUENTA
	}
	
	public int cantidadPalabras() {
		int contador=0;
		String aux;
		aux = this.linea.trim(); //ELIMINA ESPACIOS AL FINAL O AL COMIENZO
		
		if(!aux.isEmpty()) {
			contador++;
			for(int i=0;i<aux.length();i++) {
				if(aux.charAt(i)==' ')
					contador++;
			}
		}
		
		return contador;
	}
	
	public int cantidadVocales() {
		int contador=0;
		String aux=this.linea.trim();
		
		if(!aux.isEmpty()) {
			for(int i=0;i<aux.length();i++) {
				if((aux.charAt(i)=='a')||(aux.charAt(i)=='e')||(aux.charAt(i)=='i')||(aux.charAt(i)=='o')||(aux.charAt(i)=='u')) 
					contador++;
				if((aux.charAt(i)=='A')||(aux.charAt(i)=='E')||(aux.charAt(i)=='I')||(aux.charAt(i)=='O')||(aux.charAt(i)=='U')) 
					contador++;
			}
		}
		
		return contador;
	}
	
	public int cantidadConsonantes() {
		int contador=0;
		String aux=this.linea.trim();
		
		if(!aux.isEmpty()) {
			for(int i=0;i<aux.length();i++) {
				if((aux.charAt(i)>=65)&&(aux.charAt(i)<=90)) {
					if((aux.charAt(i)!='A')||(aux.charAt(i)!='E')||(aux.charAt(i)!='I')||(aux.charAt(i)!='O')||(aux.charAt(i)!='U')) {
						contador++;
					}
				}
				else if((aux.charAt(i)>=97)&&(aux.charAt(i)<=122)) {
					if((aux.charAt(i)=='a')||(aux.charAt(i)=='e')||(aux.charAt(i)=='i')||(aux.charAt(i)=='o')||(aux.charAt(i)=='u')) {
						contador++;
					}
				}
			}
		}
		
		return contador;
	}
}