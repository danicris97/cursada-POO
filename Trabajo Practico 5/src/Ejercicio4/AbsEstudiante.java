package Ejercicio4;

public abstract class AbsEstudiante extends Estudiante{
	protected int P1,RP1,P2,RP2,TPFinal;
	
	public AbsEstudiante (String vnombre, char vsexo, long vdni, long vlu, String vfacultad, String vcarrera, int vanioIngreso, int P1, int RP1
			,int P2, int RP2, int TPFinal){
		super(vnombre,vsexo,vdni,vlu,vfacultad,vcarrera,vanioIngreso);
		this.setP1(RP1);
		this.setP2(RP2);
		this.setRP1(RP1);
		this.setRP2(RP2);
		this.setTPFinal(TPFinal);
	}
	
	public void setP1(int P1) {this.P1 = P1;}
	public void setRP1(int RP1) {this.RP1 = RP1;}
	public void setP2(int P2) {this.P2 = P2;}
	public void setRP2(int RP2) {this.RP2 = RP2;}
	public void setTPFinal(int TPFinal) {this.TPFinal = TPFinal;}
	
	public int getP1() {return this.P1;}
	public int getRP1() {return this.RP1;}
	public int getP2() {return this.P2;}
	public int getRP2() {return this.RP2;}
	public int getTPFinal() {return this.TPFinal;}
	
	public boolean estaRegular() {
		if((this.getP1()>=60 || this.getRP1()>=60)&&(this.getP2()>=60 || this.getRP2()>=60)&&this.getTPFinal()>=6)
			return true;
		else
			return false;
	}
	
	public abstract boolean estaLibre();
	public abstract boolean estaAusente();
	public abstract void muestraEstudiante();
	
}
