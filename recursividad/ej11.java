import java.util.Scanner;
public class ej11 {
    public static void main(String[] args) {
        int fila = cargarFil(), column = cargarCol();
        int[][] numero = new int[fila][column];
        cargarMatriz(numero);
    }
    public static int cargarFil() {
        Scanner sc = new Scanner(System.in);
        int fil;
        System.out.println("Cargar cantidad de filas de la matriz");
        fil = sc.nextInt();
        while(fil<1){
            System.out.println("Error. Cargar nuevamente las filas");
            fil = sc.nextInt();
        }
        return fil;
    }
    public static int cargarCol(){
        Scanner sc = new Scanner(System.in);
        int col;
        System.out.println("Cargar cantidad de columnas de la matriz");
        col = sc.nextInt();
        while(col<1){
            System.out.println("Error. Cargar nuevamente las columnas");
            col = sc.nextInt();
        }
        return col;
    }
    public static void cargarMatriz(int[][] num){
        int i,j,fil = num.length, col = num[0].length;
        Scanner scann = new Scanner(System.in);
        System.out.println("                      CARGAR MATRIZ");
        for(i=0; i<fil; i++){
            for(j=0; j<col; j++){
                System.out.println("Porfavor ingrese un valor en la fila "+i+" y col. "+j);
                num[i][j] = scann.nextInt();
            }
        }
    }
    public static void name() {
        
    }
}
