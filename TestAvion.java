import java.util.Scanner;
public class TestAvion {
    public static void main(String[] args) {
        int cantAsient;
        double promVeloc, kmRecorridos;
        String modeloAv, identificad;
        Avion unAvion;
        boolean esMayor;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese por favor el identificador del avion");
        identificad = entrada.nextLine();
        unAvion = new Avion(identificad);
        System.out.println("Por favor ingrese el modelo del avion "+unAvion.getIdentificador());
        modeloAv = entrada.nextLine();
        System.out.println("Por favor ingrese la cantidad de asientos del modelo de Avion "+unAvion.getIdentificador());
        cantAsient = entrada.nextInt();
        System.out.println("Por favor ingrese la cantidad de km recorridos del avion "+unAvion.getIdentificador());
        kmRecorridos = entrada.nextDouble();
        System.out.println("Por favor ingrese el promedio de velocidad del avion "+unAvion.getIdentificador());
        promVeloc = entrada.nextDouble();
        unAvion = new Avion(identificad,modeloAv,cantAsient,kmRecorridos,promVeloc);
        System.out.println(unAvion.getModelo());
        System.out.println(unAvion.getCantidAsientos());
        System.out.println(unAvion.getKilomRecorrid());
        System.out.println(unAvion.getVelocidadProm());
        System.out.println("Ingrese el promedio de la velocidad de otro avion y verificaremos si es mayor al del avion "+unAvion.getModelo());
        promVeloc = entrada.nextDouble();
        esMayor = unAvion.esMayorEnVeloc(promVeloc);
        if(esMayor){
            System.out.println("Es mayor");
        }
        else{
            System.out.println("No es mayor");
        }
    }
}
