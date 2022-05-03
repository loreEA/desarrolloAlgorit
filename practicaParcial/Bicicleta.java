public class Bicicleta {
    //Atributos
    private int numSerie;
    private String marca;
    private int cantCambios;
    private char tipoDeBici;
    private double precioVenta;
    private boolean segDeFabrica;
    //Constructores
    public Bicicleta(int numero){
        numSerie = numero;
        marca = "";
        cantCambios = 0;
        tipoDeBici = 00;
        precioVenta = 0;
        segDeFabrica = false;
    }
    public Bicicleta(int num,String marc,int cambios,char tipo,double precio,boolean seguro){
        numSerie = num;
        marca = marc;
        cantCambios = cambios;
        tipoDeBici = tipo;
        precioVenta = precio;
        segDeFabrica = seguro;
    }
    //MÉTODOS OBSERVADORES
    public int getNumSerie(){
        return numSerie;
    }
    public String getMarca(){
        return marca;
    }
    public int getCantCambios(){
        return cantCambios;
    }
    public char getTipo(){
        return tipoDeBici;
    }
    public double getPrecio(){
        return precioVenta;
    }
    public boolean getSeguro(){
        return segDeFabrica;
    }
    //MÉTODOS MODIFICADORES
    public void setMarca(String marc){
        marca = marc;
    }
    public void setCantCambios(int cambios){
        cantCambios = cambios;
    }
    public void setTipo(char tipo){
        tipoDeBici = tipo;
    }
    public void setPrecio(double precio){
        precioVenta = precio;
    }
    public void setSeguro(boolean seguro){
        segDeFabrica = seguro;
    }
    //PROPIAS DEL TIPO
    public boolean equals(Bicicleta otraBici){
        return this.numSerie == otraBici.getNumSerie();
    }
}
