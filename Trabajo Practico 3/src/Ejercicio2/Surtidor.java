package Ejercicio2;

public class Surtidor {
	private int cargaMax;
	private int ultraDiesel;
	private int euroDiesel;
	private int naftaSuper;
	private int naftaInfinia;
	
	public Surtidor() {
		this.cargaMax = 20000;
		this.ultraDiesel = this.cargaMax;
		this.euroDiesel = this.cargaMax;
		this.naftaSuper = this.cargaMax;
		this.naftaInfinia = this.cargaMax;
	}
	
	public void llenarDepositoUDiesel() {
		this.ultraDiesel = this.cargaMax;
	}
	
	public void llenarDepositoEDiesel() {
		this.euroDiesel = this.cargaMax;
	}
	
	public void llenarDepositoNSuper() {
		this.naftaSuper = this.cargaMax;
	}
	
	public void llenarDepositoInfinia() {
		this.naftaInfinia = this.cargaMax;
	}
	
	public void cargarUDiesel(int litros) {
		if(litros<=this.getCantUDiesel()) 
			this.ultraDiesel -= litros;
		else if(this.ultraDiesel!=0) {
			this.ultraDiesel -= litros;
			litros = Math.abs(this.ultraDiesel);
			this.ultraDiesel = 0;
			System.out.println("SURTIDOR ULTRADIESEL VACIO NO SE COMPLETO LA CARGA");
		}else
			System.out.println("SURTIDOR ULTRADIESEL VACIO NECESITA RECARGA");
	}
	
	public void cargarEDiesel(int litros) {
		if(litros<=this.getCantEDiesel()) 
			this.euroDiesel -= litros;
		else if(this.euroDiesel!=0){
			this.euroDiesel -= litros;
			litros = Math.abs(this.euroDiesel);
			this.euroDiesel = 0;
			System.out.println("SURTIDOR EURODIESEL VACIO NO SE COMPLETO LA CARGA");
		}else
			System.out.println("SURTIDOR EURODIESEL VACIO NECESITA RECARGA");
	}
	
	public void cargarNSuper(int litros) {
		if(litros<=this.getCantNSuper()) 
			this.naftaSuper -= litros;
		else if(this.naftaSuper!=0) {
			this.naftaSuper -= litros;
			litros = Math.abs(this.naftaSuper);
			this.naftaSuper = 0;
			System.out.println("SURTIDO NAFTASUPER VACIO NO SE COMPLETO LA CARGA");
		}else
			System.out.println("SURTIDOR NAFTASUPER VACIO NECESITA RECARGA");
	}
	
	public void cargarInfinia(int litros) {
		if(litros<=this.getCantInfinia()) 
			this.naftaInfinia -= litros;
		else if(this.naftaInfinia!=0){
			this.naftaInfinia -= litros;
			litros = Math.abs(this.naftaInfinia);
			this.naftaInfinia = 0;
			System.out.println("SURTIDOR INFINIA VACIO NO SE COMPLETO LA CARGA");
		}else
			System.out.println("SURTIDOR ULTRADIESEL VACIO NECESITA RECARGA");
	}
	
	public int getCantUDiesel() {
		return this.ultraDiesel;
	}
	
	public int getCantEDiesel() {
		return this.euroDiesel;
	}
	
	public int getCantNSuper() {
		return this.naftaSuper;
	}
	
	public int getCantInfinia() {
		return this.naftaInfinia;
	}
	
}
