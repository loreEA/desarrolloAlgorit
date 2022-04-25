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
        menu(avion);

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
                sc.nextLine();
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
            System.out.println("Ingrese por favor el identificador del Avión");
            identif = entrada.nextLine();
            avion[i] = new Avion(identif);
            System.out.println("Por favor ingrese el modelo del avión "+avion[i].getIdentificador());
            modelo = entrada.nextLine();
            System.out.println("Por favor ingrese la cantidad de asientos del modelo de Avión "+avion[i].getIdentificador());
            cantAsientos = entrada.nextInt();
            System.out.println("Por favor ingrese la cantidad de km recorridos del Avión "+avion[i].getIdentificador());
            kmRecorrid = entrada.nextDouble();
            System.out.println("Por favor ingrese el promedio de velocidad del Avión "+avion[i].getIdentificador());
            promedVeloc = entrada.nextDouble();
            entrada.nextLine();
            avion[i] = new Avion(identif,modelo,cantAsientos,kmRecorrid,promedVeloc);
        }
    }
    /*Este método, dado un array del tipo Avion, mostrará cierta información según la operación que 
    escoga al usuario*/
    public static void menu(Avion[] avion) {
        int opcion, pos, cantidad;
        String buscarModel;
        double[] promKmAvion;
        Scanner scan = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("                                        MENU");
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("Porfavor ingrese algún valor entero según las siguientes opciones:");
        System.out.println("1: Mostrar el avión que tiene mayor velocidad.");
        System.out.println("2: Mostrar la cantidad de asientos que tiene un cierto avión.");
        System.out.println("3: Mostrar cuantos aviones de un cierto modelo tiene la empresa.");
        System.out.println("4: Mostrar el promedio de km recorrido por todos los aviones.");
        System.out.println("Cualquier otro valor: Salida del programa");
        do {
            System.out.println("                                    OPCIÓN");
            opcion = scan.nextInt();
            scan.nextLine();
            switch(opcion){
                case 1: 
                    pos = avionConMayorVeloc(avion);
                    System.out.println("La mayor velocidad lo tiene el avión "+avion[pos].getIdentificador()+". La velocidad es de "+avion[pos].getVelocidadProm());
                    break;
                case 2: ; 
                    System.out.println("Porfavor ingrese la posición del avión que desea buscar");
                    System.out.println("Aclaración: Las posiciones van desde 0 hasta "+(avion.length-1));
                    pos = scan.nextInt();
                    if(pos>-1 && pos<avion.length){
                        System.out.println("La cantidad de asientos del avión "+avion[pos].getIdentificador()+" es: "+avion[pos].getCantidAsientos());
                    } else{
                        System.out.println("La posición ingresada fue errónea.");
                    }
                    scan.nextLine();
                    break;
                case 3: 
                    System.out.println("Por favor ingrese el modelo a buscar");
                    buscarModel = scan.nextLine();
                    cantidad = cantidOcurrencModelo(avion,buscarModel);
                    if(cantidad>0){
                        System.out.println("La cantidad de asientos de ese modelo en particular es de: "+cantidad);
                    }
                    else{
                        System.out.println("El modelo de avión no existe o fue mal ingresado.");
                    }
                    break;
                case 4: 
                    promKmAvion = promKilomAviones(avion);
                    mostrarPromKm(promKmAvion,avion);
                    break;
            }
        } while (opcion>0 && opcion<5);
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("                                         FIN PROGRAMA");
        System.out.println("-----------------------------------------------------------------------------------------------");
    }
    //Este módulo buscará y retornará la posición del avion que tiene mayor velocidad
    public static int avionConMayorVeloc(Avion[] avion){
        int i, longitud = avion.length, pos=0;
        double velocidad, esMayor=0;
        for(i=0; i<longitud; i++){
            velocidad = avion[i].getVelocidadProm();
            if(velocidad>=esMayor){
                esMayor = velocidad;
                pos = i;
            }
        }
        return pos;
    }
    //Este módulo buscará y retornará la cantidad de aviones que tiene un cierto tipo de modelo
    public static int cantidOcurrencModelo(Avion[] avion, String model){
        int i, cantOcurr=0, longitud = avion.length;
        String obtenerModelo;
        for(i=0;i<longitud;i++){
            obtenerModelo = avion[i].getModelo();
            if(model.equals(obtenerModelo)){
                cantOcurr++;
            }
        }
        return cantOcurr;
    }
    //Este módulo cargára el promedio de km que recorre cada uno los aviones ingresados en un arreglo del tipo real
    public static double[] promKilomAviones(Avion[] avion){
        int i, longitud = avion.length;
        double[] promKmRecorrid = new double[avion.length];
        for(i=0;i<longitud;i++){
            promKmRecorrid[i] = avion[i].getKilomRecorrid(); 
        }
        return promKmRecorrid;
    }
    //Este módulo mostrára por pantalla cada uno de los valores almacenados en un arreglo del tipo real
    public static void mostrarPromKm(double[] promKmRecorrid, Avion[] avion){
        int i, longitud = promKmRecorrid.length;
        for(i=0; i<longitud;i++){
            System.out.println("El avión "+avion[i].getModelo()+" tiene, de promedio de velocidad, "+promKmRecorrid[i]);
        }
    }
}
