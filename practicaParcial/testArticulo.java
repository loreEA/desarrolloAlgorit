import java.util.*;
public class testArticulo {
    public static void main(String[] args) {
        int longitud = cargarLongitud();
        Articulo[] articulos = new Articulo[longitud];
        cargarArreglo(articulos);
    }
    public static int cargarLongitud(){
        Scanner scann = new Scanner(System.in);
        int longitud;
        do { 
            System.out.println("Porfavor cargué la longitud del arreglo: ");
            longitud = scann.nextInt();
            if(longitud<1){
                System.out.println("Error. La longitud es menor o igual a 0.");
            }
        } while (longitud<1);
        return longitud;
    }
    public static void cargarArreglo(Articulo[] articulos){
        Scanner sc = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        int i=0, longitud = articulos.length, codigoArt;
        double precioCost, precioVent;
        String nombreArt, categoria = "ABCabc";
        char categoriaArt;
        boolean inventariadoArt;
        do {
            System.out.println("Porfavor cargué el código del artículo "+(i+1));
            codigoArt = sc.nextInt();
            if(seEncontroCodigo(articulos, codigoArt,i)){
                System.out.println("Error. Ya se ingreso ese código");
            }
            else{
                do {
                    System.out.println("Porfavor cargar el nombre del artículo "+(i+1));
                    nombreArt = scan.nextLine();
                    if(nombreArt.length()<2){
                        System.out.println("Error. NO ingreso un nombre sino un caracter");
                    }
                } while (nombreArt.length()<2);
                
                do {
                    System.out.println("Porfavor cargar el precio de costo del artículo "+(i+1));
                    precioCost = sc.nextDouble();
                    if(precioCost<1){
                        System.out.println("Error. Vuelva a ingresar el precio del costo.");
                    }
                } while (precioCost<1);
                do {
                    System.out.println("Porfavor cargar el precio de venta del artículo "+(i+1));
                    precioVent= sc.nextDouble();
                } while(precioVent<1);
                do {
                    System.out.println("Porfavor cargar un caracter que represente la categoría del artículo "+(i+1));
                    System.out.println("Los tipos de categoría y sus caracteres para representarlos: 'A', 'B' o 'C'");
                    categoriaArt = scan.next().charAt(0);
                    if(categoria.indexOf(categoriaArt)<0){
                        System.out.println("Error. No existe la posibilidad con el caracter que encontro");
                    }
                } while (categoria.indexOf(categoriaArt)<0);
                System.out.println("Porfavor cargar si esta inventariado con true(verdadero) o false(falso)");
                inventariadoArt = sc.nextBoolean();
                articulos[i] = new Articulo(codigoArt,nombreArt,precioCost,precioVent,categoriaArt,inventariadoArt);
                i++;
            }
        } while (i<longitud);
    }
    public static boolean seEncontroCodigo(Articulo articulos[], int codigo, int artCargados){
        boolean seEncontro=false;
        int i =  0;
        while (!seEncontro && i<artCargados) {
            if(articulos[i].getCodigo()==codigo){
                seEncontro = true;
            }
            else{
                i++;
            }
        }
        return seEncontro;
    }
}
