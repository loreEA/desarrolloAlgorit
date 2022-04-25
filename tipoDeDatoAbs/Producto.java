public class Producto {
    //Atributos
    private int codigo;
    private String descripcion;
    private double precio;
    private double stock;
    //Constructores
    public Producto(int cod){
        codigo = cod;
        descripcion = "";
        precio= 0;
        stock = 0;
    }
    public Producto(int cod, String descrip, double prec, double stoc){
        codigo = cod;
        descripcion = descrip;
        precio = prec;
        stock = stoc;
    }
    //Métodos Observadores
    public int getCodigo(){
        return codigo;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public double getPrecio(){
        return precio;
    }
    public double getStock(){
        return stock;
    }
    public String toString(){
        return "Datos del producto "+codigo+": "+descripcion+", "+precio+", "+stock+".";
    }
    public boolean equals(Producto product){
        return this.codigo == product.codigo;
    }
    //Métodos Modificadores
    public void setCodigo(int cod){
        codigo = cod;
    }
    public void setDescripcion(String descrip){
        descripcion = descrip;
    }
    public void setPrecio(double prec){
        precio = prec;
    }
    public void setStock(double stoc){
        stock = stoc;
    }
    //Propias del tipo
    public double calcularCosto(double cantidad){
        return this.precio*cantidad;
    }
    public void restCantStock(double cantidad){
        stock = stock - cantidad;
    }
}