import java.util.*;
public class ejerSeis {
    /*Este algoritmo, según un caracter y un número entero ingresado, 
    mostrará una pirámide de caracteres*/
    public static void main(String[] args){
        char caracAImprim;
        Scanner scann = new Scanner(System.in);
        System.out.println("                            CARGAR CARACTER");
        System.out.println("Porfavor cargué un caracter.");
        caracAImprim = scann.next().charAt(0);  
        int numCarg = cargarNum(), fil = 0, col = 0;
        System.out.println("                            MOSTRAR PIRAMIDE");
        mostrarPiramide(caracAImprim, numCarg, fil, col);
    }
    //Este módulo cargará y retornará un número entero estrictamente mayor a 1
    public static int cargarNum() {
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("                             CARGAR NÚMERO");
        do {
            System.out.println("Porfavor cargué un número. Ingrese un valor mayor o igual a 2.");
            numero = sc.nextInt();
            if (numero<2) {
                System.out.println("¡Error! Datos invalidos.");
            }
        } while (numero<2);
        return numero;
    }
    /*Este módulo mostrará una pirámide con un caracter especificamente ingresado
    y se mostrará de acuerdo a las cantidad de veces que el usuario haya, también, ingresado.*/
    public static void mostrarPiramide(char caracter, int num, int fila, int columna){
        if (columna<0) {
            fila = fila+1;
            columna = fila;
            System.out.println("");
        }
        if (fila<num) {
            System.out.print(caracter+" ");
            mostrarPiramide(caracter, num, fila, columna = columna-1);
        }
    }
}
