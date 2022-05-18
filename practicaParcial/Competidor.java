public class Competidor {
    //Atributos
    private int dni;
    private String nombre;
    private String apellido;
    private int edad;
    private String ciudOrigen;
    private double peso;
    private double altura;
    private double longitudMax;
    //Constructores
    public Competidor(int unDni){
        dni = unDni;
        nombre = "";
        apellido="";
        edad = 0;
        ciudOrigen = "";
        peso = 0;
        altura = 0;
        longitudMax = 0;
    }
    public Competidor(int unDni,String nom,String apell,int unaEdad,String ciudad,double unPeso,double unaAlt,double longMax){
        dni = unDni;
        nombre = nom;
        apellido = apell;
        edad = unaEdad;
        ciudOrigen = ciudad;
        peso = unPeso;
        altura = unaAlt;
        longitudMax = longMax;
    }
    //Métodos Observadores
    public int getDni(){
        return dni;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public int getEdad(){
        return edad;
    }
    public String getCiudadOrig(){
        return ciudOrigen;
    }
    public double getPeso(){
        return peso;
    }
    public double getAltura(){
        return altura;
    }
    public double getLongMax(){
        return longitudMax;
    }
    public String toString(){
        return "Datos del competidor "+dni+": "+nombre+", "+apellido+", "+edad+", "+ciudOrigen+
        ", "+peso+", "+altura+", "+longitudMax+".";
    }
    //Métodos Modificadores
    public void setNombre(String nom){
        nombre = nom;
    }
    public void setApellido(String apell){
        apellido = apell;
    }
    public void setEdad(int unaEdad){
        edad = unaEdad;
    }
    public void setCiudOrigen(String ciudad){
        ciudOrigen = ciudad;
    }
    public void setPeso(double unPeso){
        peso = unPeso;
    }
    public void setAltura(double unaAlt){
        altura = unaAlt;
    }
    public void setLongMax(double longMax){
        longitudMax = longMax;
    }
    //Propias del tipo
    public boolean equals(Competidor otroCompet){
        return this.dni == otroCompet.dni;
    }
    public double calcularIndMasaCorp(double peso, double altura){
        double imc;
        imc = peso/(Math.pow(calcularCentrimAMetros(altura), 2));
        return imc;
    }
    private double calcularCentrimAMetros(double alt){
        return alt/100;
    }
}
