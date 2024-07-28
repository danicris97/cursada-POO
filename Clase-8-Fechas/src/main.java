public class main {
    
    public static void main(String[] args){
        Fecha fecha = new Fecha();
        fecha.setFecha(13,11,2020); // abril 
        System.out.println(fecha);
        System.out.println(fecha.getDia());
        System.out.println(fecha.getMes()); // los meses desde el 0
        System.out.println(fecha.getAnio());
    }
}