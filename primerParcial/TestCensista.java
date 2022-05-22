import java.util.Scanner;
public class TestCensista {
    /*Este algoritmo, dado un arreglo del tipo Censista, mostrará por pantalla si alguno
    de los censistas no censó nada. */
    public static void main(String[] args) {
        int longitud = cargarLongitud();
        Censista[] censistas = new Censista[longitud];
        //boolean noCensoNada = noCenso(censistas);
        //System.out.println("¿El censista censo a alguna persona o vivienda?"+noCensoNada);
    }
    public static int cargarLongitud() {
        int longit;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cargar la cantidad de Censistas que ingresará.");
        longit = sc.nextInt();
        while(longit<1);{
            System.out.println("Error, ingresó menos de un censista. Vuelva a cargar");
            longit = sc.nextInt();
        }
        sc.close();
        return longit;
    }
    /*
    public static void cargarArreglo(Censista[] censistas) {
        Scanner scann = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        int dni;
        boolean distinto = false;
        for (int i = 0; i < censistas.length; i++) {
            System.out.println("Cargué el DNI del competidor");
            dni = scann.nextInt();
            distinto = esDistinto(censistas, dni, i);
            while(!distinto){
                System.out.println("¡Error! Ya cargó ese DNI en particular. Vuelva a cargarlo");
                dni = scann.nextInt();
                distinto = esDistinto(censistas, dni, i);
            }
            do {
                System.out.println("Cargué el nombre del Competidor");
                nombre = sc.nextLine();
                System.out.println("Cargué el apellido del mismo.");
                apellido = sc.nextLine();
                System.out.println("Cargué la ciudad de origen.");
                ciudadOrigen = sc.nextLine();
                requis1 = seIngCorrectText(nombre,apellido,ciudadOrigen);
                if(!requis1){
                    System.out.println("Error. Ingreso una letra, no una palabra u oración.");
                }
            } while (!requis1);
            do {
                System.out.println("Cargué la edad del Competidor");
                edad = scann.nextInt();
                System.out.println("Cargué el peso del mismo");
                peso = scann.nextDouble();
                System.out.println("Cargué la altura en centrímetros.");
                altura = scann.nextDouble();
                System.out.println("Y cargué la longitud máxima alcanzada por el competidor");
                longitudMax= scann.nextDouble();
                requis2 = seIngCorrectNum(edad,peso,altura,longitudMax);
                if (!requis2) {
                   System.out.println("Error. Ingreso un número menor o igual 1.");
                }
            } while (!requis2);
            competidores[i] = new Competidor(dni,nombre,apellido,edad,ciudadOrigen,peso,altura,longitudMax);
        
        }
    }
    public static boolean esDistinto(Censista[] cens, int dni,int i){
        int j=0;
        boolean esDistint = true;
        while(j<i && esDistint){
            if(cens[j].getDni() == dni){
                esDistint = false;
            }
            j++;
        }
        return esDistint;
    }
    public static boolean seIngCorrectText(String nom,String ape,String ciudad){
        return nom.length()>1 && ape.length()>1 && ciudad.length()>1;
    }
    public static boolean seIngCorrectNum(int edad,double pe,double alt,double longMax){
        return edad>1 && pe>1 && alt>1 && longMax>1;
    }
    public static boolean noCenso(Censista[] censistas){
        int i = 0;
        boolean existe = false;
        while (i<censistas.length && !existe) {
            if (censistas[i].getCantCensada() <= 0) {
                existe = true;
            } else {
                i++;
            }
        }
        return existe;
    }
    */
}