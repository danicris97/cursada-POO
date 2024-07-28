import Contenedores.*;
import Metales.*;

public class Minero {

	public static void main(String[] args) {
		Carreta c = new Carreta();
		
		c.servirMetal(new Oro());
		c.servirMetal(new Oro());
		c.servirMetal(new Oro());
		
		c.servirMetal(new Plata());
		c.servirMetal(new Plata());
		c.servirMetal(new Plata());
		
		c.servirMetal(new Mitril());
		c.servirMetal(new Mitril());
		c.servirMetal(new Mitril());
		
		System.out.println("CANTIDAD DE CONTENEDORES EN EXELENTE ESTADO: " + c.cantidadExelenteEstado());
	}

}
