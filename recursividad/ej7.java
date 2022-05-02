import java.util.Scanner;
public class ej7 {
    public static void main(String[] args){
        int fil = 0, col=0, i = 0, j = 0;
        int[][] numero;
        int[] sumaFil;
        Scanner sc = new Scanner(System.in);
        System.out.println("                                CARGAR FILAS Y COL");
        System.out.println("Porfavor ingrese la cantidad de filas de la matriz. Tiene que ser mayor a 0");
        fil = sc.nextInt();
        System.out.println("Porfavor ingrese la cantidad de columnas de la matriz. Tiene que ser mayor a 0");
        col = sc.nextInt();
        if(fil>0 && col>0){
            numero = new int[fil][col];
            cargarMatriz(numero);
            sumaFil = new int[numero.length];
            sumDeCadaFil(numero, sumaFil,i,j);
            mostrarArreglo(sumaFil);
        }
        else{
            System.out.println("Error. Ingreso mal los valores");
        }
    }
    /*Este módulo, según una cant. de filas y columnas, cargaremos una matriz númerica*/
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
    /**/
    public static void sumDeCadaFil(int[][] num,int[] sumaFil,int fil, int col){
        if(col==num[0].length){
            fil = fil+1;
            col = 0;
        }
        if(fil<num.length){
            sumaFil[fil] = sumaFil[fil] + num[fil][col];
            sumDeCadaFil(num, sumaFil, fil, col = col + 1);
            
        }
    }
    public static void mostrarArreglo(int[] suma){
        System.out.println("                   MOSTRAR SUMA DE CADA FILA");
        for(int i=0; i<suma.length; i++){
            System.out.println("Fila "+i+":"+suma[i]);
        }
    }
}
