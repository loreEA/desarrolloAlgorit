public class Ciudad {
    //Atributos
    private String nombre;
    private int poblacion;
    private float latitud;
    private float longitud;
    //Constructor
    public Ciudad(String unNomb,int cantCiudadan,float unaLatitud,float unaLong){
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
    public float getLatitud(){
        return latitud;
    }
    public float getLongitud(){
        return longitud;
    }
    public String toString(){
        return "Datos de la ciudad "+nombre+": "+poblacion+" (población), "+latitud+" (latitud), "+longitud+" (longitud).";
    }
    //Métodos Modificadores
    /*Cada método modificador modificará los valores almacenados por un nuevo dato, del mismo 
    tipo, sin retornar nada.*/
    public void setNombre(String unNombre){
        nombre = unNombre;
    }
    public void setPoblacion(int cantCiudadan){
        poblacion = cantCiudadan;
    }
    public void setLatitud(float unaLatitud) {
        latitud = unaLatitud;
    }
    public void setLongitud(float unaLongitud){
        longitud = unaLongitud;
    }
    //Propios del tipo
    //Este método verificará si dos objetos, del mismo tipo, tienen los mismos datos
    public boolean equals(Ciudad otraCiudad){
       return this.nombre == otraCiudad.nombre;
    }
    /*Este método verificará y retornará: 
      - menor a 0 cuando cadena que llama al método es primero lexicográficamente.
      - igual a 0 cuando las dos cadenas son lexicográficamente equivalentes.
      - mayor a 0 cuando el parámetro pasado al método compareTo es lexicográficamente el primero.
    */
    public int compareTo(Ciudad otraCiudad){
        return this.nombre.compareTo(otraCiudad.nombre);
    }
    
}
