public class Articulo{
    //Atributos
    private int codigo;
    private String nombre;
    private double precioCosto;
    private double precioVenta;
    private char categoria;
    private boolean inventariado;
    //Constructores
    public Articulo(int unCodigo){
        codigo = unCodigo;
        nombre ="";
        precioCosto = 0;
        precioVenta = 0;
        categoria = 00;
        inventariado = false;
    }
    public Articulo(int unCodigo,String unNombre,double precioCost,double precioVent,char categ,boolean unInventariado){
        codigo = unCodigo;
        nombre = unNombre;
        precioCosto = precioCost;
        precioVenta = precioVent;
        categoria = categ;
        inventariado = unInventariado;
    }
    //Metodos observadores
    public int getCodigo(){
        return codigo;
    }
    public String getNombre(){
        return nombre;
    }
    public double getPrecioCost(){
        return precioCosto;
    }
    public double getPrecioVent(){
        return precioVenta;
    }
    public char getCategoria(){
        return categoria;
    }
    public boolean getInventariado(){
        return inventariado;
    }
    public String toString(){
        return "El articulo "+codigo+" tiene los siguientes datos: \nNombre: "+nombre+"\nPrecio Costo: "+precioCosto+"\nPrecio Venta: "+precioVenta+"\nCategoria: "+categoria+"\nInventariado: "+inventariado;
    }
    //Metodos modificadores
    public void setNombre(String unNombre){
        nombre = unNombre;
    }
    public void setPrecioCosto(double unCosto){
        precioCosto = unCosto;
    }
    public void setPrecioVenta(double unPrecioVenta){
        precioVenta = unPrecioVenta;
    }
    public void setCategoria(char unaCategoria){
        categoria = unaCategoria;
    }
    public void setInventariado(boolean unInventariado){
        inventariado = unInventariado;
    }
    //Propias del tipo
    public boolean equals(Articulo otroArticulo){
        return this.codigo == otroArticulo.getCodigo();
    }
}