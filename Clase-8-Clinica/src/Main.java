
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		clsPaciente objPaciente1;
		
		objPaciente1 = new clsPaciente("juan",40000000,"siempre viva 123", "4365890");
		System.out.println(objPaciente1.toString());
		
		clsAmbulatorio objAmbulatorio1;
		objAmbulatorio1 = new clsAmbulatorio("pedro",40000010,"calle sin nombre","43652157","NO PAGO");
		System.out.println(objAmbulatorio1.toString());
		
		clsInternado objInternado1;
		objInternado1 = new clsInternado("diego",13256024,"duraznos 326","1232154");
		System.out.println(objInternado1.toString());
		
		clsGenerator r = new clsGenerator();
		objInternado1.setFechaAlta(r.generaFecha());
		System.out.println(objInternado1.toString());
	}

}
