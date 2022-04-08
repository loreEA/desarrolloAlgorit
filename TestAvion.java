import java.util.Scanner;
public class TestAvion {
    /*Este algoritmo, según dos objeto del tipo Avion, creará y mostrára un menú con diferentes
    opciones para que el usuario juegue con las operaciones declaradas en la clase Avion*/
    public static void main(String[] args) {
        Avion unAvion, unAvion2;
        Scanner entrada = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("                                      CARGAR PRIMER AVION");
        System.out.println("-----------------------------------------------------------------------------------------------");
        unAvion = cargarAvion();
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("                                     CARGAR SEGUNDO AVION");
        System.out.println("-----------------------------------------------------------------------------------------------");
        unAvion2 = cargarAvion();
        menu(unAvion, unAvion2);

    }
    /*Este método creára un objeto del tipo Avion y lo retornará*/
    public static Avion cargarAvion(){
        Scanner sc = new Scanner(System.in);
        String id, modelo;
        Avion avion;
        int cantidAsient;
        double kmRecorrid, promedVeloc;
        System.out.println("Ingrese por favor el identificador del avion");
        id = sc.nextLine();
        avion = new Avion(id);
        System.out.println("Por favor ingrese el modelo del avion "+avion.getIdentificador());
        modelo = sc.nextLine();
        System.out.println("Por favor ingrese la cantidad de asientos del modelo de Avion "+avion.getIdentificador());
        cantidAsient = sc.nextInt();
        System.out.println("Por favor ingrese la cantidad de km recorridos del avion "+avion.getIdentificador());
        kmRecorrid = sc.nextDouble();
        System.out.println("Por favor ingrese el promedio de velocidad del avion "+avion.getIdentificador());
        promedVeloc = sc.nextDouble();
        avion = new Avion(id,modelo,cantidAsient,kmRecorrid,promedVeloc);
        return avion;
    }

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
                case 1: mostrarAvion(primerAvion);break;
                case 2: mostrarAvion(segundAvion);break;
                case 3: modificarAvion(primerAvion);break;
                case 4: modificarAvion(segundAvion);break;
            }
        } while (opcion>0 && opcion<5);
    }

    public static void mostrarAvion(Avion unAvion) {
        System.out.println("El identificador del Avión es: "+unAvion.getIdentificador());
        System.out.println("El modelo del Avión "+unAvion.getIdentificador()+" es: "+unAvion.getModelo());
        System.out.println("La cantidad de asientos de "+unAvion.getIdentificador()+" es: "+unAvion.getCantidAsientos());
        System.out.println("La cantidad de km recorridos del Avión "+unAvion.getIdentificador()+" es: "+unAvion.getKilomRecorrid());
        System.out.println("La velocidad promedio del Avión "+unAvion.getModelo()+" es: "+unAvion.getVelocidadProm());
    }

    public static void modificarAvion(Avion unAvion){
        int cantAsients;
        double promedioVeloc, kilomRecorridos;
        Scanner scann = new Scanner(System.in);
        System.out.println("Ingresar cuántos asientos tiene ahora el Avión "+unAvion.getIdentificador());
        cantAsients = scann.nextInt();
        System.out.println("Ingresar cuántos km tiene recorrido ahora el Avión "+unAvion.getIdentificador());
        kilomRecorridos = scann.nextDouble();
        System.out.println("Ingresar el promedio de velocidad que tiene el Avión en la actualidad ");
        promedioVeloc = scann.nextDouble();
        unAvion.setCantAsientos(cantAsients);
        unAvion.setKilomRecorrid(kilomRecorridos);
        unAvion.setVelocidadProm(promedioVeloc);
    }
}
