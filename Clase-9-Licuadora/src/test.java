
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Naranja objNaranja1 = new Naranja(153);
		Naranja objNaranja2 = new Naranja(170);
		Manzana objManzana1 = new Manzana(250);
		Jengibre objJengibre = new Jengibre(360);
		
		ExprimidoraH2021 objExprimidora = new ExprimidoraH2021();
		
		objExprimidora.ingresaCultivo(objNaranja1);
		objExprimidora.ingresaCultivo(objNaranja2);
		objExprimidora.ingresaCultivo(objJengibre);
		objExprimidora.ingresaCultivo(objManzana1);
		
		System.out.println("JUGO: " + objExprimidora.exprimir());
	}

}
