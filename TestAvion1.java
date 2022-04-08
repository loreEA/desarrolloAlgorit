import java.util.Scanner;
public class TestAvion1 {
    /*Este algoritmo, según un arreglo del tipo Avion, crearemos, cargaremos y mostraremos un menú
    que le permita al usuario trabajar con alguna de las siguientes operaciones:
    - Mostrar el avión que tiene mayor velocidad.
    - Mostrar la cantidad de asientos que tiene un cierto avión.
    - Mostrar cuantos aviones de un cierto modelo tiene la empresa.
    - Mostrar el promedio de km recorrido por todos los aviones. */    
    public static void main(String[] args) {
        Avion[] avion;
        int longitud;
        longitud = cargarLongitud();
        avion = new Avion[longitud];
        cargarArreglo(avion);

    }
    //Este módulo cargará y devolverá la longitud que tendrá el arreglo del tipo Avion
    public static int cargarLongitud(){
        Scanner sc = new Scanner(System.in);
        int longitud;
        do{
            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("                                        CARGAR LONGITUD");
            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("Por favor ingrese la cantidad de aviones que quiere ingresar");
            longitud = sc.nextInt();
            if(longitud<1){
                System.out.println("Error. El valor ingresado no corresponde");
                System.out.println("Intente nuevamente ingresar la cantidad de aviones");
                longitud = sc.nextInt();
            }
        } while(longitud<1);
        return longitud;
    }
    //Este módulo, según un arreglo del tipo Avion, cargará dicho arreglo pero no lo retornará.
    public static void cargarArreglo(Avion[] avion){
        String identif, modelo;
        int cantAsientos, i, longitud = avion.length;
        double kmRecorrid, promedVeloc;
        Scanner entrada = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("                                        CARGAR ARREGLO");
        System.out.println("-----------------------------------------------------------------------------------------------");  
        for(i=0;i<longitud;i++){
            System.out.println("Ingrese por favor el identificador del avion");
            identif = entrada.nextLine();
            avion[i] = new Avion(identif);
            System.out.println("Por favor ingrese el modelo del avion "+avion[i].getIdentificador());
            modelo = entrada.nextLine();
            System.out.println("Por favor ingrese la cantidad de asientos del modelo de Avion "+avion[i].getIdentificador());
            cantAsientos = entrada.nextInt();
            System.out.println("Por favor ingrese la cantidad de km recorridos del avion "+avion[i].getIdentificador());
            kmRecorrid = entrada.nextDouble();
            System.out.println("Por favor ingrese el promedio de velocidad del avion "+avion[i].getIdentificador());
            promedVeloc = entrada.nextDouble();
            avion[i] = new Avion(identif,modelo,cantAsientos,kmRecorrid,promedVeloc);
        }
    }
    /*Este método, dado dos objetos del tipo Avion, mostrara cierta información según la operación que 
    escoga al usuario*/
    public static void menu(Avion primerAvion, Avion segundAvion) {
        int opcion;
        Scanner scan = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("                                        MENU");
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("Porfavor ingrese algún valor entero según las siguientes opciones:");
        System.out.println("1: Mostrar todos los datos del primer avión");
        System.out.println("2: Mostrar todos los datos del segundo avión");
        System.out.println("3: Modificar la cantidad de asientos, km recorridos y promedio de velocidad del primer avión");
        System.out.println("4: Modificar la cantidad de asientos, km recorridos y promedio de velocidad del segundo avión");
        System.out.println("Cualquier otro valor: Salida del programa");
        do {
            System.out.println("                                    OPCIÓN");
            opcion = scan.nextInt();
            switch(opcion){
                case 1: ; break;
            }
        } while (opcion>0 && opcion<5);
    }

}
