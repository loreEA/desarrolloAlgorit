public class Ciudad {
    //Atributos
    private String nombre;
    private int poblacion;
    private double latitud;
    private double longitud;
    //Constructor
    public Ciudad(String unNomb,int cantCiudadan,int unaLatitud,int unaLong){
        nombre = unNomb;
        poblacion = cantCiudadan;
        latitud = unaLatitud;
        longitud = unaLong;
    }
    //Métodos Observadores
    /*Cada método observador retornará los valores almacenadas en cada uno de los atributos*/
    public String getNombre(){
        return nombre;
    }
    public int getPoblacion(){
        return poblacion;
    }
    public double getLatitud(){
        return latitud;
    }
    public double getLongitud(){
        return longitud;
    }
    public String toString(){
        return "Datos de la ciudad "+nombre+": "+poblacion+" (población), "+latitud+" (latitud), "+longitud+" (longitud).";
    }
    //Métodos Modificadores
    /*Cada método modificador modificará los valores almacenados por un nuevo dato, del mismo 
    tipo, sin retornar nada.*/
    //A consultar setNombre, setLatitud y setLongitud
    public void setNombre(String unNombre){
        nombre = unNombre;
    }
    public void setPoblacion(int cantCiudadan){
        poblacion = cantCiudadan;
    }
    public void setLatitud(double unaLatitud) {
        latitud = unaLatitud;
    }
    public void setLongitud(double unaLongitud){
        longitud = unaLongitud;
    }
    //Propios del tipo
    //Este método verificará si dos objetos, del mismo tipo, tienen los mismos datos
    public boolean equals(Ciudad otraCiudad){
       return (this.latitud == otraCiudad.latitud) && (this.longitud == otraCiudad.longitud);
    }
    /*Este método verificará y retornará: 
      - menor a 0 cuando cadena que llama al método es primero lexicográficamente.
      - igual a 0 cuando las dos cadenas son lexicográficamente equivalentes.
      - mayor a 0 cuando el parámetro pasado al método compareTo es lexicográficamente el primero.
    */
    public int compareTo(Ciudad otraCiudad){
        return this.nombre.compareTo(otraCiudad.nombre);
    }
    public int compareTo(String nombreCiud){
        return this.nombre.compareTo(nombreCiud);
    }
}
