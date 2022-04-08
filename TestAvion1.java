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

}
