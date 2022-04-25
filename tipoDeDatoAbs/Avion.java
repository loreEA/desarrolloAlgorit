public class Avion {
    //Atributos de la clase Avion
    private String identificador;
    private String modelo;
    private int cantAsientos;
    private double kmRecorrid;
    private double velocidProm;

    //Constructores
    public Avion(String unIdentif){
        identificador = unIdentif;
        modelo="";
        cantAsientos = 0;
        kmRecorrid = 0;
        velocidProm = 0;
    }
    public Avion(String unIdentif,String unModelo,int unaCantAsient,double kilRecorrid,double unaVeloc){
        identificador = unIdentif;
        modelo = unModelo;
        cantAsientos = unaCantAsient;
        kmRecorrid= kilRecorrid;
        velocidProm = unaVeloc;
    }
    
    //Métodos observadores
    /*Estos métodos obtendrán un valor del tipo texto, entero o real, dependiendo de lo que contengan 
    cada uno de los atributos*/
    public String getIdentificador(){
        return identificador;
    }
    public String getModelo(){
        return modelo;
    }
    public int getCantidAsientos(){
        return cantAsientos;
    }
    public double getKilomRecorrid(){
        return kmRecorrid;
    }
    public double getVelocidadProm(){
        return velocidProm;
    }
    public String toString(){
        return "El avion "+identificador+" tiene un modelo "+modelo+", cantidad de asientos "
        +cantAsientos+", km recorridos "+kmRecorrid+" y una promedio de velocidad "+velocidProm;
    }
    public boolean equals(Avion unAvion){
        return this.identificador.equalsIgnoreCase(unAvion.identificador);
    }
    //Métodos modificadores
    //Estos métodos modicarán, según el tipo de valor, a ciertos atributos. Excep. al identif y modelo
    public void setCantAsientos(int cantidAsient){
        this.cantAsientos = cantidAsient;
    }
    public void setKilomRecorrid(double kilomRecorrid){
        this.kmRecorrid = kilomRecorrid;
    }
    public void setVelocidadProm(double unaVelocidProm){
        this.velocidProm = unaVelocidProm;
    }
    //Métodos propias del tipo
    //Este método compará los promedios de las velocidades de dos aviones y devolverá un valor logico
    public boolean esMayorEnVeloc(Avion unAvion){
        return this.velocidProm <= unAvion.velocidProm;
    }

}