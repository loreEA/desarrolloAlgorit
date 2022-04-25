public class Socio{
    //Atributos
    private int codigo;
    private String nombreApellid;
    private int edad;
    private int cantTornGan;
    private double mayorPuntObt;
    //Constructor 
    public Socio(int elCodigo){
        codigo = elCodigo;
        nombreApellid = "";
        edad = 0;
        cantTornGan = 0;
        mayorPuntObt = 0;
    }
    public Socio(int elCodigo, String unNombApe, int ed, int cantidad, double mayorPunt){
        codigo = elCodigo;
        nombreApellid = unNombApe;
        edad = ed;
        cantTornGan = cantidad;
        mayorPuntObt = mayorPunt;
    }
    //Métodos Observadores
    public int getCodigo(){
        return codigo;
    }
    public String getNombreApellid(){
        return nombreApellid;
    }
    public int getEdad(){
        return edad;
    }
    public int getCantTornGan(){
        return cantTornGan;
    }
    public double getMayorPuntObt(){
        return mayorPuntObt;
    }
    public String toString(){
        return "El socio "+codigo+" tiene los siguientes datos: "+nombreApellid+", "+edad+", "+cantTornGan+", "+mayorPuntObt;
    }
    public boolean equals(Socio soc){
        return this.codigo == soc.codigo;
    }
    //Métodos Modificadores
    public void setNombreApellid(String unNombreApellid){
        nombreApellid = unNombreApellid;
    }
    public void setEdad(int ed){
        edad = ed;
    }
    public void setCantTornGan(int cantidad){
        cantTornGan = cantidad;
    }
    public void setMayorPuntObt(double mayorPunt){
        mayorPuntObt = mayorPunt;
    }
    public boolean tieneMasTornGanados(Socio soc){
        return this.getCantTornGan() > soc.getCantTornGan();
    }
}
