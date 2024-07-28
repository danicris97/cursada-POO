package problema;
import lista.clsJugadorRDList;

public class clsEquipo {
	protected String nombre;
	protected clsTecnico objTecnico;	
	protected clsJugadorRDList listaBF; // lista de 10 jugadores
	protected int cantJugTotal;
	
	public clsEquipo(String nombre, int cantJugTotal){
		this.setTotal(cantJugTotal);
		this.setNombre(nombre);
		
		this.listaBF = new clsJugadorRDList(cantJugTotal);
	}
	
	public void setTotal(int cantJugTotal){	
		this.cantJugTotal = cantJugTotal;
	}
	
	public int getTotal(){
		return this.cantJugTotal;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public void setDT(clsTecnico objTecnico){
		this.objTecnico = objTecnico;
	}
	
	public clsTecnico getDT(){
		return this.objTecnico;
	}
	
	
	public boolean estaJugador(clsJugador objJugador){
		boolean response = false;
		
		if (this.listaBF.isInside(objJugador)){
			response = true;
		}
		
		return response;
	}
	
	public void addJugador(clsJugador objJugador){
		this.listaBF.add(objJugador);
	}
	
	
	// aca mostrare la info del equipo
	public void muestraEquipo(){
		clsJugador objJugador;
		
		System.out.println(this.getNombre());
		System.out.println("DT "+ this.getDT().getApellido() + "," + this.getDT().getNombre());
		System.out.println("Lista de buena fe");
		
		for(int i=0; i<this.listaBF.size(); i++){
			objJugador = (clsJugador)this.listaBF.get(i);
			System.out.println("   " + " Jugador: " + objJugador.getApellido() + ", " + objJugador.getNombre() + " DNI " + objJugador.getDNI());
		}
		
	}
}
