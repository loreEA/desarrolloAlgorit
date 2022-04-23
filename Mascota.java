public class Mascota {
    //Atributos
    private int codigo;
    private String nombre;
    private double peso;
    private int edad;
    //Constructores
    public Mascota (int cod){
        codigo = cod;
        nombre ="";
        peso = 0;
        edad = 0;
    }
    public Mascota (int cod, String nn, double pe, int ed){
        codigo = cod;
        nombre = nn;
        peso = pe;
        edad = ed;
    }
    //Metodos Observadores
    public int getCodigo (){
        return codigo;
    }
    public String getNombre () {
        return nombre;
    }
    public double getPeso (){
        return peso;
    }
    public int getEdad () {
        return edad;
    }
    public String toString () {
        return "Datos de la mascota: "+codigo+", "+nombre+", "+peso+", "+edad;
    }
    //Metodos Modificadores
    public void setCodigo (int cod){
        codigo =cod;
    }
    public void setNombre (String nn){
        nombre = nn;
    }
    public void setPeso (double pe){
         peso = pe;
     }
    public void setEdad (int ed){
        edad = ed;
    }
    //Propias del tipo
    public boolean equals(Mascota otra){
        return this.codigo == otra.codigo;
    }
}
