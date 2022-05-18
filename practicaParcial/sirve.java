import java.util.*;
public class sirve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scann = new Scanner(System.in);
        int dni = 0, edad = 0, i;
        String nombre = "", apellido="", ciudadOrigen="";
        double peso=0, altura=0, longitudMax=0;
        System.out.println("Cargué el dni del competidor ");
            dni = sc.nextInt();
        System.out.println("Cargué el nombre del Competidor");
                    nombre = scann.nextLine();
                    System.out.println("Cargué el apellido del Competidor");
                    apellido = scann.nextLine();
                    System.out.println("Cargué la edad del Competidor");
                    edad = sc.nextInt();
                    System.out.println("Cargué la ciudad de origen del Competidor");
                    ciudadOrigen = scann.nextLine();
                    System.out.println("Cargué el peso del Competidor");
                    peso = sc.nextDouble();
                    System.out.println("Cargué la altura del Competidor");
                    altura = sc.nextDouble();
                    System.out.println("Cargué la longitud máx llegada por el competidor");
                    longitudMax = sc.nextDouble();
    }
}
