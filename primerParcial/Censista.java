public class Censista{
    //Atributos
    private int dni;
    private int telefono;
    private String provincia;
    private String ciudad;
    private int area;
    private int totalViviendas;
    private int cantCensada;
    //Constructores
    public Censista(int unDni){
        dni = unDni;
        telefono = 0;
        provincia = "";
        ciudad = "";
        area = 0;
        totalViviendas = 0;
        cantCensada = 0;
    }
    public Censista(int unDni,int telef,String provinc,String ciud,int unArea,int totViviend,int cantCensads){
        dni = unDni;
        telefono = telef;
        provincia = provinc;
        ciudad = ciud;
        area = unArea;
        totalViviendas = totViviend;
        cantCensada = cantCensads;
    }
    //Métodos Observadores
    public int getDni(){
        return dni;
    }
    public int getTelefono(){
        return telefono;
    }
    public String getProvincia(){
        return provincia;
    }
    public String getCiudad(){
        return ciudad;
    }
    public int getArea(){
        return area;
    }
    public int getTotalViviendas(){
        return totalViviendas;
    }
    public int getCantCensada(){
        return cantCensada;
    }
    public String toString(){
        return "Datos del censista "+dni+": "+provincia+","+ciudad+","+telefono+","+area+","+totalViviendas+","+cantCensada+".";
    }
    //Métodos Modificadores
    public void setTelefono(int unTelefono){
        telefono = unTelefono;
    }
    public void setProvincia(String unaProvincia){
        provincia = unaProvincia;
    }
    public void setCiudad(String unaCiudad){
        ciudad = unaCiudad;
    } 
    public void setArea(int unArea){
        area = unArea;
    }
    public void setTotalViviend(int unTotalViviends){
        totalViviendas = unTotalViviends;
    }
    public void setCantCensada(int unaCantCensada){
        cantCensada = unaCantCensada;
    }
    //Propias del tipo
    public boolean equals(Censista otroCensista){
        return this.dni == otroCensista.dni;
    }
    public void censo(int cantViviendas){
        cantCensada = cantCensada+cantViviendas;
    }
}