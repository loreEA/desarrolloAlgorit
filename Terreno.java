public class Terreno {
    //Atributos
    private int codigo;
    private double base;
    private double altura;
    private int manzana;
    //Constructores
    public Terreno (int cod) //base y altura es 0 
    {
        codigo = cod;
        base =0;
        altura = 0;
        manzana = 0;
    }
    public Terreno (int cod, double ba, double al, int man){
        codigo = cod;
        base = ba;
        altura = al;
        manzana = man;
    }
    //Metodos observadores
    public int getCodigo () {
        return codigo;
    }
    public double getBase (){
        return base;
    }
    public double getAltura (){
        return altura;
    }
    public int getManzana () {
        return manzana;
    }
    public String toString () {
        return "Datos del Terreno: "+codigo+","+base+","+altura+","+manzana;
    }
    public boolean equals (Terreno ter) {
        return this.codigo == ter.codigo;
    }
    //Metodos Modificadores
    public void setCodigo (int cod){
        codigo = cod;
    }
    public void setBase (double ba){
        base = ba;
    }
    public void setAltura (double al){
        altura = al;
    }
    //Propias del tipo
    public double perimetro (){}
    public double superficie () {}
    public double valor(double precio){} //ingresa el precio por metro cuadrado
}
