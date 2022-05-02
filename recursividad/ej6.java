import java.util.Scanner;
public class ej6 {
    public static void main(String[] args){
        int[] numeros;
        int longitud, numeroMayor, i=0;
        longitud = cargarLong();
        numeros = new int[longitud];
        cargarArreglo(numeros);
        numeroMayor = buscarNumMayor(numeros, numeros[0], i);
        System.out.println("            EL NÚMERO MAS GRANDE ES: ");
        System.out.println(numeroMayor);
    }
    /*Este módulo cargará, verificará y retornará la longitud que tendrá un arreglo*/
    public static int cargarLong(){
        int longit;
        Scanner sc = new Scanner(System.in);
        System.out.println("                     CARGAR LONGITUD");
        System.out.println("Porfavor cargué la cantidad de números que quiere ingresar");
        longit = sc.nextInt(); 
        while(longit<1){
            System.out.println("Error. Cargué nuevamente la cantidad de números que quiere ingresar");
            longit = sc.nextInt(); 
        }
        return longit;
    }
    /*Este módulo cargará (no retornará) un arreglo, del tipo entero, con numéros enteros*/
    public static void cargarArreglo(int[] num){
        int i, longitud = num.length;
        Scanner scann = new Scanner(System.in);
        System.out.println("                 CARGAR ARREGLO");
        for(i=0; i<longitud; i++){
            System.out.println("Porfavor ingresé el primer número en la posición "+i);
            num[i] = scann.nextInt();
        }
    }
    public static int buscarNumMayor(int[] num,int mayor,int i){
        int numMayor;
        if(i+1 == num.length && mayor>num[i]){
            numMayor = mayor;
        }
        else{
            if(mayor>num[i]){
                numMayor = buscarNumMayor(num, mayor, i = i+1);
            }
            else{
                mayor = num[i];
                numMayor = buscarNumMayor(num, mayor, i = i+1);
            }
        }
        return numMayor;
    }
}