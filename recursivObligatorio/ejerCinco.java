import java.util.Scanner;
public class ejerCinco {
    public static void main(String[] args) {
        int numero[] = cargarArreglo();
        double prom = promedioArrEnteros(numero);
        int numeros = numMayoresPromedio(numero, prom, 0);
        if (numeros>0) {
            System.out.println("La cantidad de números que son mayores al promedio del arreglo de enteros es "+numeros);
        } else {
            System.out.println("No exíste ningún número mayor al promedio");
        }
       
    }
    public static int[] cargarArreglo() {
        int longitud;
        Scanner sc = new Scanner(System.in);
        
        int num[] = new int[cargarLong()];
        for (int i = 0; i < num.length; i++) {
            System.out.println("Cargué un número en la posición "+i);
            num[i] = sc.nextInt();
        }
        return num;
    }
    public static int cargarLong() {
        Scanner scann = new Scanner(System.in);
        int longit;
        do {
            System.out.println("Cargué cuántos números ingresará en el arreglo.");
            longit = scann.nextInt();
            if (longit<1) {
                System.out.println("Error. No ingreso ninguna cantidad.");
            }
        } while (longit<1);
        return longit;
    }
    public static double promedioArrEnteros(int[] num) {
        double promedio = 0;
        int suma = 0, i;
        for (i = 0; i < num.length; i++) {
            suma = suma + num[i];
        }
        promedio = suma/i;
        return promedio;
    }
    public static int numMayoresPromedio(int[] num, double promed, int i) {
        int numerMayorProm;
        if (i<num.length) {
            if (num[i]>promed) {
                numerMayorProm = numMayoresPromedio(num, promed, i = i+1)+1;
            } else {
               numerMayorProm = numMayoresPromedio(num, promed, i = i+1);
            }
        }else{
            numerMayorProm = 0;
        }
        return numerMayorProm;
    }
}
