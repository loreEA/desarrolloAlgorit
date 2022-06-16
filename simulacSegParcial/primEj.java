import java.util.*;
public class primEj {
    public static void main(String[] args) {
        int num = cargarNum();
        String numBinario = aBinario(num, "");
        System.out.println(numBinario);
    }
    public static int cargarNum() {
        int numero;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Cargué un número entero positivo.");
            numero = sc.nextInt();
            if (numero<1) {
                System.out.println("Error. El valor fue ingresado de manera erronéa.");
            }
        } while (numero<1);
        sc.close();
        return numero;
    }
    public static String aBinario(int num, String aBinar){
        if (num<=1) {
            aBinar = num + "";
        } else {
            aBinar = aBinario(num/2, aBinar) + num%2;
        }
        return aBinar;
    }
}
