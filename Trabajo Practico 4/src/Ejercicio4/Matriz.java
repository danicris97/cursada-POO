package Ejercicio4;

public class Matriz {
	private double[][] m;
	private int filas;
	private int columnas;
	
	public Matriz(int filas, int columnas) {
		this.m = new double[filas][columnas];
		this.filas = filas;
		this.columnas = columnas;
	}
	
	public void setElem(int i, int j, double elem) {
		if(this.existePos(i,j))
			this.m[i][j]=elem;
		else
			System.out.println("ERROR: POSICION INVALIDA");
	}
	
	public double getElem(int i, int j) {
		if(this.existePos(i,j))
			return m[i][j];
		else {
			System.out.println("ERROR: POSICION INVALIDA");
			return 0;
		}
	}
	
	public void copy(Matriz n){
		if((n.getCantFilas() == this.getCantFilas())&&(n.getCantColumnas() == this.getCantColumnas())) {
			for(int i=0;i<filas;i++) {
				for(int j=0;j<columnas;j++)
					this.setElem(i,j,n.getElem(i,j));
			}
		}else {
			System.out.println("ERROR: LAS MATRICES SON DE DISTINTO TAMANIO");
		}
	}
	
	public boolean existePos(int i, int j) {
		if(i<this.filas && i>=0 && j<this.columnas && j>=0)
			return true;
		else
			return false;
	}
	
	public int getCantFilas() {
		return this.filas;
	}
	
	public int getCantColumnas() {
		return this.columnas;
	}
	
	public Matriz clone() {
		return this;
	}
	
	public boolean equals(Matriz n) {
		boolean bandera=true;
		int i=0,j=0;
		
		if((n.getCantFilas()==this.getCantFilas())&&(n.getCantColumnas()==this.getCantColumnas())) {
			while((i<this.filas)&&(bandera)) {
				while((j<this.columnas)) {
					if(n.getElem(i,j)!=this.getElem(i,j))
						bandera=false;
				}
			}
		}
		
		
		return bandera;
	}
	
	public boolean esCuadrada() {
		if(this.filas==this.columnas)
			return true;
		else
			return false;
	}
	
	public boolean esIdentidad() {
		boolean bandera=true;
		int i=0,j;
		
		if(this.esCuadrada()) {
			while(i<this.filas && bandera==true) {
				j=0;
				while(j<this.columnas) {
					if(i==j) {
						if(this.getElem(i,j)!=1) 
							bandera=false;
					}else if(this.getElem(i,j)!=0)
						bandera=false;
					j++;
				}
				i++;
			}
		}else
			bandera=false;
		
		return bandera;
	}
	
	public boolean esTriangularSup() {
		boolean bandera=true;
		int i,j=0;
		
		if(this.esCuadrada()) {
			while(j<this.columnas && bandera==true) {
				i=j+1;
				while(i<this.filas) {
					if(this.getElem(i,j)!=0) {
						bandera=false;
					}
					i++;
				}
				j++;
			}
		}else
			bandera=false;
		
		return bandera;
	}
	
	public boolean esTriangularInf() {
		boolean bandera=true;
		int i=0,j;
		
		if(this.esCuadrada()) {
			while(i<this.filas && bandera==true) {
				j=i+1;
				while(j<this.columnas) {
					if(this.getElem(i,j)!=0) {
						bandera=false;
					}
					j++;
				}
				i++;
			}
		}else
			bandera=false;
		
		return bandera;
	}
	
	public boolean esSimetrica() {
		boolean bandera=true;
		int i,j=0;
		
		if(this.esCuadrada()) {
			while(j<this.columnas && bandera==true) {
				i=j+1;
				while(i<this.filas) {
					if(this.getElem(i,j)!=this.getElem(j,i)) {
						bandera=false;
					}
					i++;
				}
				j++;
			}
		}else
			bandera=false;
		
		return bandera;
	}
	
	public boolean esRala() {
		int i=0,j,contadorCeros=0;
		
		while(i<this.filas) {
			j=0;
			while(j<this.columnas) {
				if(this.getElem(i,j)==0)
					contadorCeros++;
				j++;
			}
			i++;
		}
		
		if(contadorCeros>(this.filas*this.columnas/2))
			return true;
		else
			return false;
		
	}
	
	public boolean esNula() {
		boolean bandera=true;
		int i=0,j;
		
		while(i<this.filas && bandera==true) {
			j=0;
			while(j<this.columnas && bandera==true) {
				if(this.getElem(i,j)!=0)
					bandera=false;
			}
		}
		
		return bandera;
	}
	
	public int cantElem(double elemento) {
		int frecuencia=0;
		
		for(int i=0;i<this.filas;i++) {
			for(int j=0;j<this.columnas;j++) {
				if(this.getElem(i, j)==elemento)
					frecuencia++;
			}
		}
		
		return frecuencia;
	}
	
	public boolean estaElem(double elemento) {
		boolean bandera=false;
		int i=0,j=0;
		
		while(i<this.filas && bandera==false) {
			j=0;
			while(j<this.columnas && bandera==false) {
				if(this.getElem(i, j)==elemento)
					bandera=true;
			}
			i++;
		}
		
		return bandera;
	}
	
	public double[] vectorMayores() {
		double[] listaMayores = new double[this.filas];
		double mayor;
		
		for(int i=0;i<this.filas;i++) {
			mayor = this.getElem(i,0);
			for(int j=1;j<this.columnas;j++) {
				if(this.getElem(i, j)>mayor)
					mayor = this.getElem(i, j);
			}
			listaMayores[i] = mayor;
		}
		
		return listaMayores;
	}
	
	public Matriz suma(Matriz n) {
		if((n.getCantFilas()==this.getCantFilas())&&(n.getCantColumnas()==this.getCantColumnas())) {
			Matriz suma = new Matriz(n.getCantFilas(),n.getCantColumnas());
			
			for(int i=0;i<this.filas;i++) {
				for(int j=0;j<this.columnas;j++) {
					suma.setElem(i,j,(n.getElem(i,j)+this.getElem(i,j)));
				}
			}
			
			return suma;
		}else {
			System.out.println("ERROR: LAS MATRICES SON DE DISTINTO TAMANIO");
			return null;
		}
	}
	
	public Matriz producto(Matriz n) {
		if(this.getCantColumnas()==n.getCantFilas()) {
			Matriz producto = new Matriz(this.getCantFilas(),n.getCantColumnas());
			
			for(int i=0;i<this.getCantFilas();i++) {
				for(int j=0;j<n.getCantColumnas();j++) {
					for(int k=0;k<this.getCantColumnas();k++) {
						producto.setElem(i, j,(this.getElem(i,k)*(n.getElem(k,j))));
					}
				}
			}
			
			return producto;
		}else {
			System.out.println("ERROR: LA CANTIDAD DE COLUMNAS DE PRIMER MATRIZ NO ES IGUAL A LA CANTIDAD DE COLUMNAS SEGUNDA MATRIZ");
			return null;
		}
	}
	
	public Matriz productoXEscalar(double k) {
		Matriz productoEscalar=new Matriz(this.getCantFilas(),this.getCantColumnas());
		
		for(int i=0;i<this.getCantFilas();i++) {
			for(int j=0;j<this.getCantColumnas();j++)
				productoEscalar.setElem(i,j,(this.getElem(i, j)*k));
		}
		
		return productoEscalar;
	}
	
	public Matriz transpuesta() {
		Matriz transpuesta = new Matriz(this.getCantFilas(),this.getCantColumnas());
		
		for(int i=0;i<this.getCantFilas();i++) {
			for(int j=0;j<this.getCantColumnas();j++)
				transpuesta.setElem(i,j,this.getElem(j,i));
		}
		
		return transpuesta;
	}
	
	public void mostrar() {
		for(int i=0;i<this.getCantFilas();i++) {
			for(int j=0;j<this.getCantColumnas();j++)
				System.out.print(this.getElem(i,j) + " ");
			System.out.println();
		}
	}
}
