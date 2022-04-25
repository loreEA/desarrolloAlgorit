public class Pedido {
    //Atributos de la clase
    private String codigo;
    private String[] producto;
    private double[] costo;
    private String direccion;
    private String nombre;
    private String telefono;
    //Constructores 
    public Pedido(String unCodigo){
        codigo = unCodigo;
        producto = new String[0];
        costo = new double[0];
        direccion = "";
        nombre = "";
        telefono = "";
    }
    public Pedido(String unCodigo,String[] unProducto,double[] unCosto,String unaDirecc,String unNombre,String unTelef){
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
    public String getCodigo(){
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
    public String getTelefono(){
        return telefono;
    }
    public String toString(){
        return "El pedido "+codigo+" será entregado a "+nombre
        +", con dirección en "+direccion+", su telefono es "+telefono
        +", los productos que compro fueron "+concatenarProductos()+" y el costo total fue : "+calcularCostoTotal();
    }
    public boolean equals(Pedido unPedido){
        return this.codigo.equalsIgnoreCase(unPedido.codigo);
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
    public void setTelefono(String unTelefono){
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
    //Este método sirve para concatenar todos los productos que haya ingresado el usuario
    public String concatenarProductos(){
        int i, longitud =this.producto.length;
        String producConcat="";
        for(i=0;i<longitud;i++){
            producConcat = this.producto[i]+", "+producConcat;
        }
        return producConcat = producConcat.substring(0, producConcat.length()-1);
    }
}