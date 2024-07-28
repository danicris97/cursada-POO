package Ejemplo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ventana v = new Ventana(new PanelDibujo());
		//v.setVisible(true);
		Ventana v2 = new Ventana(new PanelImagen());
		//v2.setVisible(true);
		Ventana v3 = new Ventana(new PanelCirculoAleatorio());
		v3.setVisible(true);
		Ventana v4 = new Ventana(new PanelCirculoAleatorioGradiante());
		v4.setVisible(true);
	}

}
