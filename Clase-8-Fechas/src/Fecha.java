
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Fecha{
    private Calendar fecha;
    
    public Fecha(){
        this.fecha = Calendar.getInstance(); // fecha del sistema;
    }
    
    public int getDia(){
        return this.fecha.get(Calendar.DAY_OF_MONTH);
    }
    
    public int getMes(){
        return this.fecha.get(Calendar.MONTH)+1;
    }
    
    public int getAnio(){
        return this.fecha.get(Calendar.YEAR);
    }
    
    public void setFecha(int dia, int mes, int anio){
        this.fecha.set(anio, mes-1, dia);
    }
    
    public String toString(){
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        return f.format(this.fecha.getTime());
    }
    
}