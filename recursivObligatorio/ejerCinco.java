import java.util.Scanner;
public class ejerCinco {
    public static void main(String[] args) {
        int numero[] = cargarArreglo();
        double[] promCant = new double[2];
        double numeros = cantNumMayorProm(numero,0,promCant);
        if (numeros>0) {
            System.out.println("La cantidad de números que son mayores al promedio del arreglo de enteros es "+numeros);
        } else {
            System.out.println("No exíste ningún número mayor al promedio");
        }
       
    }
    //Este método cargá el arreglo
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
    //Este método carga y retorna la longitud del arreglo
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
    /*Este método calcula la suma de todos los elementos y despues calcula el promedio y verifica si algún elemento
    del arreglo es mayor al del promedio*/
    public static double cantNumMayorProm(int[] num,int i,double[] k){
        if(i<num.length){
            k[0] = k[0] + num[i];
            k[1] = cantNumMayorProm(num, i+1, k);
            if (num[i]>k[0]) {
                k[1] = k[1] + 1;
            }
        }
        else{
            k[1] = 0;
            k[0] = k[0]/num.length;
        }
        return k[1];
    }
}
