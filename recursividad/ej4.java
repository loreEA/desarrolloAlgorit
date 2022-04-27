import java.util.Scanner;
public class ej4 {
    public static void main(String[] args){
        int numero;
        boolean sonIguales;
        Scanner sc = new Scanner(System.in);
        System.out.println("CARGAR UN NÚMERO");
        System.out.println("Porfavor ingrese un número");
        numero = sc.nextInt();
        sonIguales= sonIguals(numero/10, numero%10);/*Aquí enseguida extraemos el último dígito para directamente comparar en el método */
        System.out.println("VERIFICADOR");
        System.out.println("¿Los dígitos del número son iguales? "+sonIguales);
        sc.close();
    }
    public static boolean sonIguals(int n, int m){
        boolean aux;
        if(n<10 && n==m){ /*Esto verifica que estemos parados en el primer dígito y lo comparamos para ver si es igual al último dígito extraído */
            aux = true;
        }
        else{
            if(n%10 == m){ /*Este extrae y verifica que el último dígito del nuevo número sea igual al último dígito extraído */
                m = n%10;
                aux = sonIguals(n/10, m);
            }
            else{
                aux = false;
            }
        }
        return aux;
    }
}
