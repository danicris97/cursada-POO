
public class Coche {
	private String matricula;
	private String marca;
	private String modelo;
	
	public Coche(String matricula, String marca, String modelo) {
		this.setMatricula(matricula);
		this.setMarca(marca);
		this.setModelo(modelo);
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getMatricula() {
		return this.matricula;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public String toString() {
		String cadena = "MATRICULA: " + this.getMatricula() + "\n";
		cadena += "MARCA: " + this.getMarca() + "\n";
		cadena += "MODELO: " + this.getModelo() + "\n";
		
		return cadena;
	}
}
