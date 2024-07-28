package problema;
import lista.clsEquipoRDList;
import lista.clsPartidoRDList;
import auxiliar.clsGenerator;

public class clsSoccerTournament {
	protected String nombreTorneo;
	protected int cantEquipos;
	protected int cantFechas;
	protected int cantJugadores;
	
	protected clsEquipoRDList listaEquipos;
	protected clsPartidoRDList listaFechas;
	
	
	protected clsGenerator objGenerator;
	
	public clsSoccerTournament(String nombreTorneo, int cantEquipos, int cantJugadores){
		
		this.setNombreTorneo(nombreTorneo);
		this.setCantEquipos(cantEquipos);
		this.setCantJugadores(cantJugadores);
		
		this.listaEquipos = new clsEquipoRDList(cantEquipos);
		this.listaFechas = null; // a completar!
		
		this.objGenerator = new clsGenerator();
		
	}
	
	
	public void generaEquipos(){
		clsEquipo objEquipo; clsTecnico objTecnico; clsJugador objJugador;
		String apellido, nombre, celular, mail, direccion, titulo, posicion;
		boolean esTitular;
		int i,j, dni, antiguedad;
		
		for (i=0; i<this.getCantEquipos(); i++){
			objEquipo = new clsEquipo("Equipo " + i, this.getCantJugadores());
			
			apellido = this.objGenerator.generaApellido();
			nombre = this.objGenerator.generaNombre();
			dni = this.objGenerator.generaDNI();
			celular = this.objGenerator.generaCelular();
			mail = this.objGenerator.generaMail();
			direccion = " direcDT " + i;
			titulo = " profesor ";
			antiguedad = i;
			
			objTecnico = new clsTecnico(apellido, nombre, dni, celular, mail, direccion, titulo, antiguedad);
			
			objEquipo.setDT(objTecnico);
			
			j=0;			
			while (j<this.getCantJugadores()){

				apellido = this.objGenerator.generaApellido();
				nombre = this.objGenerator.generaNombre();
				dni = this.objGenerator.generaDNI();
				celular = this.objGenerator.generaCelular();
				mail = this.objGenerator.generaMail();
				direccion = " direcJug " + i;
				posicion = this.objGenerator.generaPosicion();
				esTitular = false;				
				
				objJugador = new clsJugador(apellido, nombre, dni, celular, mail, direccion, posicion, esTitular);
				
				if (!objEquipo.estaJugador(objJugador)){
					objEquipo.addJugador(objJugador); // los jugadores del equipo si o sin tienen diferentes DNIs
					j++;
				}				
			}
			
			this.listaEquipos.add(objEquipo); // equipo insertado
			// aca faltaria chequear que el equipo insertado no este antes en la lista. completar!!!
			
			
		}
	}
	
	public void muestraEquipos(){
		clsEquipo objEquipo;
		
		for (int i=0; i<this.getCantEquipos(); i++){
			objEquipo = (clsEquipo)this.listaEquipos.get(i);			
			objEquipo.muestraEquipo();			
		}
	}
	
	public String getNombreTorneo(){
		return this.nombreTorneo;
	}
	
	public void setNombreTorneo(String nombreTorneo){
		this.nombreTorneo = nombreTorneo;
	}

	public int getCantJugadores(){
		return this.cantJugadores;
	}
	
	public void setCantJugadores(int cantJugadores){
		this.cantJugadores = cantJugadores;
	}
	
	public int getCantEquipos(){
		return this.cantEquipos;
	}
	
	public void setCantEquipos(int cantEquipos){
		this.cantEquipos = cantEquipos;
	}
	
	public int getCantFechas(){
		return this.cantFechas;
	}
	
	public void setCantFechas(int cantFechas){
		this.cantFechas = cantFechas;
	}
	
}
