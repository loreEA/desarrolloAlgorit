import java.util.Scanner;
public class ej2 {
    public static void main(String[] args) {
        int n, sumatoria;
        n = cargarNum();
        sumatoria = algo(n);
        System.out.println(sumatoria);

    }
    public static int cargarNum(){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese un número entero.");
        num = sc.nextInt();
        if(num<1){
            do{
                System.out.println("Error. Ingrese un valor valido.");
                num = sc.nextInt();
            }while(num<1);
        }
        sc.close();
        return num;
    }
    public static int algo(int n){
        int aux=0;
        if(n == 1){
            aux = 1;
        }
        else{
            aux = algo(n-1)+1;
        }
        return aux;
    }
}
