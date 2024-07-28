package Ejercicio4;

public class EstudianteInformatica extends AbsEstudiante{
	
	public EstudianteInformatica(String vnombre, char vsexo, long vdni, long vlu, String vfacultad, String vcarrera, int vanioIngreso, Notas notas) {
		super(vnombre,vsexo,vdni,vlu,vfacultad,vcarrera,vanioIngreso,notas.getNota(0),notas.getNota(1),notas.getNota(2),notas.getNota(3),notas.getNota(4));
	}
	
	public boolean estaLibre() {
		if(!this.estaRegular()&&this.estaAusente())
			return true;
		else
			return false;
	}
	
	public boolean estaAusente() {
		if(this.getP1()==-1||this.getRP1()==-1||this.getP2()==-1||this.getRP2()==-1||this.getTPFinal()==-1)
			return true;
		else
			return false;
	}
	
	public void muestraEstudiante() {
		String cadena = "NOMBRE: " + this.getNombre() + "\nSEXO: " + this.getSexo() + "\nDNI: " + this.getDni() + "\nLU: " + this.getLu()
		+ "\nFACULTAD: " + this.getFacultad() + "\nCARRERA: " + this.getCarrera() + "\nAÑO INGRESO: " + this.getAnioIngreso();
		
		System.out.println(cadena);
	}
}
