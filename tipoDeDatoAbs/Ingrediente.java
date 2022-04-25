public class Ingrediente {
    //Atributos
    private String nombre;
    private int cantidad;
    private String unidadMedida;
    //Constructor
    public Ingrediente(String unNombre, int cant, String unaUnidMedid){
        nombre = unNombre;
        cantidad = cant;
        unidadMedida = unaUnidMedid;
    }
    //Métodos observadores
    public String getNombre(){
        return this.nombre;
    }
    public int getCantidad(){
        return this.cantidad;
    }
    public String getUnidad(){
        return this.unidadMedida;
    }
    public String toString(){
        return "Datos del ingrediente: (nombre)"+nombre+", (cantidad)"+cantidad+", (unidad de medida)"+unidadMedida;
    }
    public boolean equals(Ingrediente otroIngred){
        return this.nombre == otroIngred.nombre;
    }
    //Metodos modificadores
    public void setNombre(String unNombre){
        nombre = unNombre;
    }
    public void setCantidad(int cant){
        cantidad = cant;
    }
    public void setUnidad(String unaUnidMedid){
        unidadMedida = unaUnidMedid;
    }
}