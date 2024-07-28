package Robot;

import java.util.ArrayList;
import Cajas.*;

public class CintaMagnetica {
	protected ArrayList<Caja> cajas;
	
	public CintaMagnetica(){
		this.cajas = new ArrayList<Caja>();
	}
	
	public void agregarCajaPizza(Caja caja) {
		this.cajas.add(caja);
	}
	
	public Caja getCaja(int index) {
		return this.cajas.get(index);
	}
}
