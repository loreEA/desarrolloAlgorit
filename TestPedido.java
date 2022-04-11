import java.util.Scanner;
public class TestPedido {
    /*Este algoritmo cargará un pedido y mostrará por pantalla el codigo, la dirección, el costo total
    y el nombre del cliente*/
    public static void main(String[] args) {
        Pedido unPedido;
        double costoTotal;
        unPedido = cargarPedido();
        costoTotal = unPedido.calcularCostoTotal();
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("                                        DATOS PEDIDO");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Código: "+unPedido.getCodigo());
        System.out.println("Dirección: "+unPedido.getDireccion());
        System.out.println("Nombre del Cliente: "+unPedido.getNombre());
        System.out.println("Costo total: "+costoTotal);
    }
    /*Este módulo, dado un objeto del tipo Avion, retornará el objeto cargado con un pedido*/
    public static Pedido cargarPedido(){
        String codigo;
        String[] producto;
        double[] costoProduc = new double[0];
        String direccion, nombre, telefono;
        Scanner sc = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("                                        CARGAR PEDIDO");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Porfavor ingresé el código del pedido.");
        codigo = sc.nextLine();
        System.out.println("Porfavor cargué el nombre del cliente.");
        nombre = entrada.nextLine();
        System.out.println("Por favor cargué la dirección del cliente.");
        direccion = entrada.nextLine();
        System.out.println("Por favor cargué el telefóno del cliente solamente con números.");
        System.out.println("Aclaración: No ingrese carácteres especiales como: +, -, () o .");
        telefono = entrada.nextLine();
        producto = cargarProductos();
        do{
            if(producto.length>0){
                costoProduc = cargarCostos(producto);
            }
            else{
                System.out.println("Error. Por favor ingrese algún producto");
                producto = cargarProductos();
            }}
        while(producto.length<0);
        Pedido pedido = new Pedido(codigo,producto,costoProduc,direccion,nombre,telefono);
        return pedido;
    }
    /*Este módulo, dado un arreglo del tipo Texto, cargará en cada una de las posiciones algún producto*/
    public static String[] cargarProductos() {
        String[] producto, auxiliar= new String[10];
        int i=0;
        boolean continuar= true;
        Scanner scan = new Scanner(System.in);
        Scanner ent = new Scanner(System.in);
        System.out.println("                                      CARGAR PRODUCTOS");
        System.out.println("¿Quiere ingresar algún producto? Ingrese true si quiere. En caso contrario ingrese false");
        System.out.println("Aclaración: Podrá ingresar hasta, máximo, 10 productos.");
        continuar = scan.nextBoolean();
        while(continuar && i<10){
            System.out.println("Ingresar el nombre del "+i+" producto.");
            auxiliar[i] = ent.nextLine();
            if(auxiliar[i]!=""){
                i++;
                System.out.println("¿Quiere ingresar algún producto? Ingrese true si quiere. En caso contrario ingrese false");
                continuar = scan.nextBoolean(); 
            }
            else{
                System.out.println("Error. Ingrese una palabra");
            }
            
        }
        producto = new String[i];
        copiarArreglo(producto, auxiliar);
        return producto;
    }
    //Este módulo copia los valores almacenados en un arreglo auxiliar a un arreglo llamado producto
    public static void copiarArreglo(String[] product, String[] auxiliar){
        int i,longitud = product.length;
        for(i=0; i<longitud; i++){
            product[i] = auxiliar[i];
        }
    }
    //Este módulo, dado un arreglo del tipo Real, cargará en cada posición el costo del producto
    public static double[] cargarCostos(String[] producto) {
        double[] costo = new double[10];
        int i=0, longitud = producto.length, cantidad;
        double costoProduc;
        Scanner entrada = new Scanner(System.in); 
        do{
            System.out.println("                    COSTO DEL PRODUCTO "+producto[i].toUpperCase());
            System.out.println("Por favor ingrese la cantidad que comprará del producto");
            cantidad = entrada.nextInt();
            System.out.println("Por favor ingrese el costo del producto ");
            costoProduc = entrada.nextDouble();
            if(cantidad>0 && costoProduc>0){
                costo[i] = cantidad*costoProduc;
                i++;
            }
            else{
                System.out.println("Error. Vuelva a cargar los datos.");
            }
        }while(i<longitud);
        return costo;
    }
}
