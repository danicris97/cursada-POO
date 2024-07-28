package problema;

public class clsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		clsSoccerTournament objTorneo;
		String nombreTorneo = "Torneo relampago ";
		int cantEquipos = 4;
		int cantJugadores = 10;
		
		objTorneo = new clsSoccerTournament(nombreTorneo, cantEquipos, cantJugadores);
		objTorneo.generaEquipos();
		objTorneo.muestraEquipos();
		
		

	}

}
