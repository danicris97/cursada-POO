package Contenedores;

import java.util.ArrayList;
import Metales.*;

public class Carreta {
	private ArrayList<Contenedor> carreta;
	
	public Carreta() {
		this.carreta = new ArrayList<Contenedor>();
	}
	
	public void servirMetal(Oro metal) {
		if(metal.pesoOk()) {
			this.carreta.add(new BolsaCuero(metal));
			System.out.println("SE COLOCO EN UNA BOLSA DE CUERO");
		}else {
			this.carreta.add(new BolsaTela(metal));
			System.out.println("SE COLOCO EN UNA BOLSA DE TELA");
		}
	}
	
	public void servirMetal(Plata metal) {
		if(metal.pesoOk()) {
			this.carreta.add(new BaldeMetal(metal));
			System.out.println("SE COLOCO EN UN BALDE DE METAL");
		}else {
			this.carreta.add(new BaldeMadera(metal));
			System.out.println("SE COLOCO EN UN BALDE DE MADERA");
		}
	}
	
	public void servirMetal(Mitril metal) {
		if(metal.pesoOk()) {
			this.carreta.add(new CajaCristal(metal));
			System.out.println("SE COLOCO EN UNA CAJA DE CRISTAL");
		}else {
			this.carreta.add(new CajaVidrio(metal));
			System.out.println("SE COLOCO EN UNA CAJA DE VIDRIO");
		}
	}
	
	public int cantidadExelenteEstado() {
		int contador=0;
		
		for(int i=0;i<this.carreta.size();i++) {
			if(this.carreta.get(i).exelenteEstado())
				contador++;
		}
		
		return contador;
	}
}
