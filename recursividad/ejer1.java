import java.util.Scanner;
public class ejer1 {
    public static void main(String[] args) {
        int n, sumatoria;
        n = cargarNum();
        sumatoria = fun(n);
        System.out.println(sumatoria);

    }
    public static int cargarNum(){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Porfavor ingrese un número entero.");
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
    public static int fun(int n){
        int aux=0;
        for(int i=n; i>=0; i--)
        {
            aux = aux + i;
        }
        return aux;
    }
}
