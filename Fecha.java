public class Fecha{
    //Atributos
    private int dia;
    private int mes;
    private int anio;
    //Constructores
    public Fecha(int unDia, int unMes, int unAnio){
        dia = unDia;
        mes = unMes;
        anio = unAnio;
    }
    //Metodos Observadores
    public int getDia(){
        return dia;
    }
    public int getMes(){
        return mes;
    }
    public int getAnio(){
        return anio;
    }
    //Metodos Modificadores
    public void setFecha(int unDia){
        dia = unDia;
    }
    
}