import java.util.*;
public class ejerUno {
    /*Este algoritmo desea verificar que si un número ingresado tiene dos números consecutivos */
    public static void main(String[] args) {
        int numero = cargarNumero();
        boolean existeNumConsecutiv = existenDosNumConsecutiv(numero/10, numero%10);
        if (existeNumConsecutiv) {
            System.out.println("Se encontraron dos números que eran consecutivos");
        } else {
            System.out.println("No se encontró ningún número consecutivo.");
        }
    }
    //Este método cargará y retornará un número mayor a 0
    public static int cargarNumero() {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("     CARGAR NÚMERO");
        do {
            System.out.println("Cargué un número");
            num = sc.nextInt();
            if (num<0) {
                System.out.println("Error. Cargo un valor inválido.");
            }
        } while (num<0);
        return num;
    }
    /*Este método comprobará si el resto de un número es igual al último dígito extraído 
    del mismo número*/
    public static boolean existenDosNumConsecutiv(int num, int mod) {
        boolean existe, esCeroNueve= (num !=9 || mod !=0), verificar = (num%10 !=9);
        if (num<10 && num+1!=mod && esCeroNueve && verificar) {
            existe = false;
        } else {
            if ((num%10)+1 != mod && esCeroNueve && verificar) {
                mod = num%10;
                existe = existenDosNumConsecutiv(num/10, mod);
            } else {
                existe = true;
            }
        }
        return existe;
    }
}
 