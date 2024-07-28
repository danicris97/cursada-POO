import java.util.Random;

import java.util.Calendar;
import java.text.SimpleDateFormat;

// link para generar fechas: https://stackoverflow.com/questions/3985392/generate-random-date-of-birth
// https://www.javatpoint.com/java-util-calendar


public class clsGenerator {
	private String cadena="";
	private Integer numero =0;
	Calendar fecha;
	
	private Integer infDNI= 2000000;
	private Integer supDNI = 95000000;

	private int infAnio = 1970;
	private int supAnio=2021; 
	
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
		
		this.numero = random.nextInt(this.supDNI - this.infDNI);		
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
		 this.fecha.set(yyyy, mm-1, dd);
		//this.fecha.set(...,...,...);	
		
		return this.fecha;
	
	}

}