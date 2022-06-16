import java.util.*;
public class segEj {
    public static void main(String[] args) {
        int[] numeros = {30,26,23,22,20,18,14,11,10,7,5,2};
        mostrarArreglo(numeros);
        int numero = cargarNum();
        boolean existeNum = buscarNumero(numeros, numero, 0);
        System.out.println("                     ¿SE ENCONTRO?");
        System.out.println("¿Existe el número ingresado en el arreglo?"+ ((existeNum) ? " Si" : " No"));
    }
    public static void mostrarArreglo(int[] num){
        System.out.println("                    MOSTRAR ARREGLO");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }
    public static int cargarNum(){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("                    CARGAR NUMERO");
        System.out.println("Cargué un número que este en el arreglo");
        num = sc.nextInt();
        sc.close();
        return num; 
    }
    public static boolean buscarNumero(int[] num, int numBuscar, int i) {
        boolean existe;
        if (i==num.length) {
            existe = false;
        } else {
            if (num[i] != numBuscar) {
                existe = buscarNumero(num, numBuscar, i+1);
            } else {
                existe = true;
            }
        }
        return existe;
    }
}
