package problema;

public class clsPartido {
	protected int fecha;
	protected String lugar;
	protected String equipoLocal;
	protected String equipoVisitante;
	
	public clsPartido(int fecha, String lugar, String equipoLocal, String equipoVisitante){
		this.setFecha(fecha);
		this.setLugar(lugar);
		this.setLocal(equipoLocal);
		this.setVisitante(equipoVisitante);
	}
	
	public int getFecha(){
		return this.fecha;
	}
	
	public void setFecha(int fecha){
		this.fecha = fecha;
	}
	
	public String getLugar(){
		return this.lugar;
	}
	
	public void setLugar(String lugar){
		this.lugar = lugar;
	}
	
	public String getLocal(){
		return this.equipoLocal;
	}
	
	public void setLocal(String equipoLocal){
		this.equipoLocal = equipoLocal;
	}
	
	public String getVisitante(){
		return this.equipoVisitante;
	}
	
	public void setVisitante(String equipoVisitante){
		this.equipoVisitante = equipoVisitante;
	}


}
