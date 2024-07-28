package auxiliar;

import java.util.Locale;
import java.util.Random;

import java.util.Calendar;
import java.text.SimpleDateFormat;


public class clsGenerator {
	private String cadena="";
	private Integer numero =0;			
	Calendar fecha;
	
	private static Integer infDNI= 25000000;
	private static Integer supDNI = 25000999;

	private static int infAnio = 1970;
	private static int supAnio=2021; 
	
	private static String[] apellidos = {"Gonzalez", "Lopez", "Romero", "Garcia", "Aban", "Rodriguez", "Martinez", "Torres", "Gomez", "Flores"};
	private static String[] nombres = {"Andres", "Alejandro", "Bruno", "Carlos", "Diego", "Fernando", "Luis", "Martin", "Gumersindo", "Nestor"};
	private static String[] proveedores = {"gmail.com", "yahoo.com.ar", "outlook.com.ar"};
	
	private static String[] posiciones = {"Arquero", "Defensor", "Delantero"};
	
	public static String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static String lower = upper.toLowerCase(Locale.ROOT);
	public static String digitos = "0123456789";
	
	private static int tamCorreo=10; // para el correo


	public clsGenerator(){
		this.cadena="";
		this.numero =0;
		this.fecha = Calendar.getInstance(); 
	}
	
	
	public String generaPosicion(){
		Random random = new Random();
		this.cadena="";
		int posicion;
		
		posicion = random.nextInt(this.posiciones.length);
		this.cadena = this.posiciones[posicion];
	
		return this.cadena;
	}

	
	public String generaNombre(){
		Random random = new Random();
		this.cadena="";
		int posicion;
		
		posicion = random.nextInt(this.nombres.length);
		this.cadena = this.nombres[posicion];
	
		return this.cadena;
	}

	public String generaApellido(){
		Random random = new Random();
		this.cadena="";
		int posicion;
		
		posicion = random.nextInt(this.apellidos.length);
		this.cadena = this.apellidos[posicion];
	
		return this.cadena;
	}
	
	
	public String generaMail(){
		Random random = new Random();
		this.cadena="";
		int posicion;
		
		for (int i=1; i<=this.tamCorreo; i++){
			if (i==1){
				posicion = random.nextInt(this.lower.length());
				cadena = cadena + this.upper.charAt(posicion);
				
			}else {
				posicion = random.nextInt(2);
				
				if (posicion==0){
					posicion = random.nextInt(this.lower.length());
					this.cadena = this.cadena + this.upper.charAt(posicion);
				}else {
					posicion = random.nextInt(this.digitos.length());
					this.cadena = this.cadena + this.digitos.charAt(posicion);
				}
			}
		}
		
		posicion = random.nextInt(this.proveedores.length);
		this.cadena = this.cadena + "@" + this.proveedores[posicion];
		
		
		return this.cadena;
	}
	
	public String generaCelular(){
		Random random = new Random();

		this.cadena="";
		String codigoArea ="+549387";
		int digitos = 7;
		int digito = 0;
		
		this.cadena = this.cadena + codigoArea;
		for (int d=1; d<=digitos; d++){
			if (d==1){
				digito = 4 + random.nextInt(2);
			}else {
				digito = random.nextInt(10);
			}
			
			this.cadena = this.cadena + digito;
		}		
		return this.cadena;
	}
	
	public Integer generaDNI(){
		Random random = new Random();
		
		this.numero = 	this.infDNI + random.nextInt(this.supDNI-this.infDNI+1);		
		return this.numero;
	}
	

	 private boolean isLeapYear(int year) {
	    Calendar calendar = Calendar.getInstance();
	    calendar.set(Calendar.YEAR, year);
	    int noOfDays = calendar.getActualMaximum(Calendar.DAY_OF_YEAR);

	    if (noOfDays > 365) {
	        return true;
	    }

	    return false;
	 }	
	
	
	public Calendar generaFecha(){
		Random random = new Random();
		
		 int yyyy = this.infAnio + random.nextInt(this.supAnio-this.infAnio);
		 
		 int mm = 1 + random.nextInt(12);
		 
		 int dd = 0; 

		 switch(mm) {
		      case 2:
		 
		    	 if (isLeapYear(yyyy)) {
		          dd = 1 + random.nextInt(29);
		        } else {
		          dd = 1 + random.nextInt(28);
		        }
		        break;

		      case 1:
		      case 3:
		      case 5:
		      case 7:
		      case 8:
		      case 10:
		      case 12:
		        dd = 1 + random.nextInt(31);
		        break;

		      default:
		        dd = 1 + random.nextInt(30);
		      break;
		 } 
		 
		 
		 fecha = Calendar.getInstance();		 
		 //this.fecha.set(anio, mes-1, dia);
		this.fecha.set(yyyy,mm-1,dd);	
		
		return this.fecha;
	
	}

}
