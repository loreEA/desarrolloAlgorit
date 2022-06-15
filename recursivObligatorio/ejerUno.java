import java.util.*;
public class ejerUno {
    /*Este algoritmo desea verificar que si un número ingresado tiene dos números consecutivos */
    public static void main(String[] args) {
        int numero = cargarNumero();
        boolean existeNumConsecutiv = existeNumConsecutiv(numero, numero%10);
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
    public static boolean existeNumConsecutiv(int numero, int resto){
        boolean existe;
        if (numero<10 && ((numero!=9 && resto!=0) && (numero+1!=resto))) {
            existe = false;
        } else{
            if (((numero/10)%10+1)!= resto && (((numero/10)%10!=9 && resto!=0))) {
                existe = existeNumConsecutiv(numero/10, numero%10);
            }
            else{
                existe = true;
            }
        }
        return existe;
    }
}
 