package Ejercicio5;

public class Alumno extends Votante{
	protected Integer LU;
	protected boolean regular;
	protected int materiasRendidas;
	
	public Alumno(String nombre, Integer DNI, Integer LU, boolean regular, int materiasRendidas) {
		super(nombre,DNI);
		this.setValorVoto(1);
		this.setLU(LU);
		this.setRegular(regular);
		this.setMateriasRendidas(materiasRendidas);
		this.setPuedeVotar();
	}
	
	public void setPuedeVotar() {
		if(this.getRegular()) {
			if(this.getMateriasRendidas()>1)
				this.puedeVotar = true;
			else
				this.puedeVotar = false;
		}else
			this.puedeVotar = false;
	}
	
	public void setLU(Integer LU) {
		this.LU = LU;
	}
	
	public Integer getLU() {
		return this.LU;
	}
	
	public void setRegular(boolean regular) {
		this.regular = regular;
	}
	
	public boolean getRegular() {
		return this.regular;
	}
	
	public void setMateriasRendidas(int materiasRendidas) {
		this.materiasRendidas = materiasRendidas;
	}
	
	public int getMateriasRendidas() {
		return this.materiasRendidas;
	}
	
	public void emiteVoto() {
		if(!this.getYaVoto()) {
			if(this.getRegular()) {
				if(this.getMateriasRendidas()>2)
					this.yaVoto = true;
				else
					System.out.println("EL SOLICITANTE NO APROBO 2 MATERIAS O MAS");
			}else
				System.out.println("EL SOLICITANTE NO ES ALUMNO REGULAR");
		}else
			System.out.println("EL SOLICITANTE YA VOTO");
	}
	
	public String toString() {
		String cadena = "ALUMNO\n";
		cadena += super.toString();
		cadena += "LU: " + this.getLU();
		if(this.getRegular()) {
			cadena += "ES ALUMNO REGULAR\n";
			cadena += "MATERIAS RENDIDAS: " + this.getMateriasRendidas();
		}else
			cadena += "NO ES ALUMNO REGULAR";
		
		return cadena;
	}
}
