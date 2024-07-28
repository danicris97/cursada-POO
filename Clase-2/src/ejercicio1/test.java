package ejercicio1;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cadena c = new Cadena(" EN CASA, pero trabajando");
		System.out.println("CANTIDAD DE CARACTERES: " + c.cantidadCaracteres());
		System.out.println("CANTIDAD DE PALABRAS: " + c.cantidadPalabras());
		System.out.println("CADENA: " + c.linea);
		System.out.println("CANTIDAD DE VOCALES: " + c.cantidadVocales());
		System.out.println("CANTIDAD DE CONSONANTES: " + c.cantidadConsonantes());
	}

}
