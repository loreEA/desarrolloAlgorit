import java.util.*;
public class simPuntoDos {
    /*Este algoritmo, dado un arreglo de competidores, mostrará un arreglo con 
    los competidores que tienen un IMC de bajo peso (< 18.5)*/
    public static void main(String[] args) {
        int longitud = cargarLongitud();
        Competidor[] competidores = new Competidor[longitud];
        double[] imcBajoPeso;
        cargarArreglo(competidores);
        imcBajoPeso = imcDeBajoPeso(competidores);
        for (int i = 0; i < imcBajoPeso.length; i++) {
            System.out.println(competidores[i].toString());
        }
    }

    public static int cargarLongitud(){
        int longit;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Cargué la cantidad de competidores que quiere ingresar");
            longit = sc.nextInt();
            if (longit<2) {
                System.out.println("Error. Cargo menos de 2 competidores.");
            }
        }while(longit<2);
        return longit;
    }
    public static void cargarArreglo(Competidor[] competidores) {
        boolean distinto = false, requis1=false, requis2 =false;
        int dni = 0, edad=0;
        double peso=0, altura=0, longitudMax=0;
        String nombre = "", apellido = "", ciudadOrigen = "";
        Scanner scann = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < competidores.length; i++) {
            System.out.println("Cargué el DNI del competidor");
            dni = scann.nextInt();
            distinto = esDistinto(competidores, dni, i);
            while(!distinto){
                System.out.println("¡Error! Ya cargó ese DNI en particular. Vuelva a cargarlo");
                dni = scann.nextInt();
                distinto = esDistinto(competidores, dni, i);
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
    public static boolean esDistinto(Competidor[] comp, int dni,int i){
        int j=0;
        boolean esDistint = true;
        while(j<i && esDistint){
            if(comp[j].getDni() == dni){
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
    public static double[] imcDeBajoPeso(Competidor[] competidores) {
        double[] imcBajoPeso = new double[competidores.length];
        double calIndMasaCorp,altura,peso; 
        for (int i = 0; i < competidores.length; i++) {
            altura = competidores[i].getAltura();
            peso = competidores[i].getPeso();
            calIndMasaCorp = competidores[i].calcularIndMasaCorp(peso,altura);
            if(calIndMasaCorp<18.5){
                imcBajoPeso[i] = calIndMasaCorp;
            }
        }
        return imcBajoPeso;
    }
}
