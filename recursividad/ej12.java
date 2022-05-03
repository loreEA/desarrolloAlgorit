import java.util.*;
public class ej12 {
    public static void main(String[] args) {
        int longitud = cargarLong();
        char[] caracter = new char[longitud];
        char aBuscar;
        Scanner entrada = new Scanner(System.in);
        cargarArreglo(caracter);
        System.out.println("Porfavor cargué el caractér a buscar en el arreglo.");
        aBuscar = entrada.next().charAt(0);
        System.out.println(caracterABuscar(caracter, aBuscar, 0));
    }
    public static int cargarLong() {
        Scanner sc = new Scanner(System.in);
        int longit;
        do{
            System.out.println("Porfavor cargué la longitud del arreglo. Tiene que ser mayor a 0");
            longit = sc.nextInt();
            if(longit<1){
                System.out.println("ERROR. El valor que ingresó es menor o igual a 0");
            }
            
        }while(longit<1);
        return longit;
    }
    public static void cargarArreglo(char[] carac){
        int i, longit= carac.length;
        Scanner scann = new Scanner(System.in);
        for (i = 0; i < longit; i++) {
            System.out.println("Porfavor ingrese el caracter en la posición "+i);
            carac[i] = scann.next().charAt(0);
        }
    }
    public static boolean caracterABuscar(char[] carac, char aBuscar, int i){
        boolean seEncontro;
        if (i+1 == carac.length && carac[i] != aBuscar) {
            seEncontro = false;
        } else {
            if (carac[i]!=aBuscar) {
                seEncontro = caracterABuscar(carac, aBuscar, i = i+1);
            } else {
                seEncontro = true;
            }
        }
        return seEncontro;
    }

}
