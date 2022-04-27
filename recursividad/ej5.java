import java.util.Scanner;
public class ej5 {
    public static void main(String[] args) {
        int cantMultipTres = cantMultipDeTres();
        if(cantMultipTres>0){
            System.out.println("La cantidad de números que son multiplos de 3 son: "+cantMultipTres);
        }
        else{
            System.out.println("No se ingreso ningún número multiplo de 3");
        }
    }
    public static int cargarNum(){
        int num;
        Scanner sc= new Scanner(System.in);
        System.out.println("Porfavor cargué un número");
        num = sc.nextInt();
        return num;
    }

    public static int cantMultipDeTres(){
        int aux, n = cargarNum();
        if(n!=0){
            if(n%3==0){
                aux = cantMultipDeTres()+1;
            }
            else{
                aux = cantMultipDeTres()+0;
            }   
        }
        else{
            aux = 0;
        }
        return aux;
    }

    
}
