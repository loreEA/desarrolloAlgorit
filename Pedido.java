public class Pedido {
    //Atributos de la clase
    private int codigo;
    private String[] producto;
    private double[] costo;
    private String direccion;
    private String nombre;
    private int telefono;
    //Constructores 
    public Pedido(int unCodigo){
        codigo = unCodigo;
        producto = new String[0];
        costo = new double[0];
        direccion = "";
        nombre = "";
        telefono = 0;
    }
    public Pedido(int unCodigo,String[] unProducto,double[] unCosto,String unaDirecc,String unNombre,int unTelef){
        codigo = unCodigo;
        producto = unProducto;
        costo = unCosto;
        direccion = unaDirecc;
        nombre = unNombre;
        telefono = unTelef;
    }
    //Métodos Observadores
    /*Estos métodos obtendrán un valor o todo un arreglo completo del tipo texto, entero o real, 
    dependiendo de lo que contengan cada uno de los atributos*/
    public int getCodigo(){
        return codigo;
    }
    public String[] getProducto(){
        return producto;
    }
    public double[] getCosto(){
        return costo;
    }
    public String getDireccion(){
        return direccion;
    }
    public String getNombre(){
        return nombre;
    }
    public int getTelefono(){
        return telefono;
    }
    public boolean equals(int unCodigo){
        return this.codigo == unCodigo;
    }
    //Metodos Modificadores
    //Estos métodos modicarán, según el tipo de valor, a ciertos atributos. Excepto el código
    public void setProducto(String[] unProducto){
        producto = unProducto;
    }
    public void setCosto(double[] unCosto){
        costo = unCosto;
    }
    public void setDireccion(String unaDireccion){
        direccion = unaDireccion;
    }
    public void setNombre(String unNombre){
        nombre = unNombre;
    }
    public void setTelefeno(int unTelefono){
        telefono = unTelefono;
    }
    //Propias del tipo
    //Este método sirve para calcular el costo total de todos los productos encargados por el usuario
    public double calcularCostoTotal(){
        double costoTotal=0;
        for(int i=0; i<costo.length; i++){
            costoTotal = costoTotal+costo[i];
        }
        return costoTotal;
    }
}
