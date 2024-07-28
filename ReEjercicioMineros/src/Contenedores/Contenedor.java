package Contenedores;

import Metales.MetalPrecioso;

public class Contenedor {
	protected MetalPrecioso metal;
	
	public Contenedor(MetalPrecioso metal) {
		this.metal = metal;
	}
	
	public boolean exelenteEstado() {
		return this.metal.pesoOk();
	}
}
