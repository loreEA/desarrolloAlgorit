import java.util.Scanner;
public class TestAvion {
    public static void main(String[] args) {
        Avion unAvion, unAvion2;
        Scanner entrada = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("                                   INGRESAR LOS DATOS DE DOS AVIONES");
        System.out.println("-----------------------------------------------------------------------------------------------");
        unAvion = cargarAvion();
        unAvion2 = cargarAvion();

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

    

}
