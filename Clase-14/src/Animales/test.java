package Animales;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Felino objGato = new Gato();
		Felino objTigre = new Tigre();
		Leon objLeon = new Leon();
		
		//Animal animal = new Animal(); ESTO NO SE PUEDE ANIMAL ES UNA CLASE ABSTRACTA
		Animal objHipopotamo = new Hipopotamo();
		Canino objLobo = new Lobo();
		Perro objPerro = new Perro();
		
		Animal listaAnimales[] = new Animal[6];
		listaAnimales[0]=objGato;
		listaAnimales[1]=objTigre;
		listaAnimales[2]=objLeon;
		listaAnimales[3]=objHipopotamo;
		listaAnimales[4]=objLobo;
		listaAnimales[5]=objPerro;
		
		for(int i=0;i<listaAnimales.length;i++) {
			listaAnimales[i].hacerRuido();
		}
	}

}
