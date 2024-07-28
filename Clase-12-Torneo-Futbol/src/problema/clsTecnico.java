package problema;

public class clsTecnico extends clsPersona{
	protected int antiguedad;
	protected String titulo;
	
	
	clsTecnico(String apellido, String nombre, int dni, String celular, String mail, String direccion, String titulo, int antiguedad){
		super(apellido, nombre, dni, celular, mail, direccion);
		
		this.setAntiguedad(antiguedad);
		this.setTitulo(titulo);
		
	}
	
	public int getAntiguedad(){
		return this.antiguedad;
	}
	
	public void setAntiguedad(int antiguedad){
		this.antiguedad = antiguedad;
	}
	
	public String getTitulo(){
		return this.titulo;
	}
	
	public void setTitulo(String titulo){
		this.titulo= titulo;
	}

}
