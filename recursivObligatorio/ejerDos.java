import java.util.*;;
public class ejerDos {
    /*Este algoritmo cargará y verificara si la matriz dada es de identidad */
    public static void main(String[] args) {
        int filas, columnas;
        int[][] matrizNum;
        boolean matrizCuadrada, existe;
        Scanner sc= new Scanner(System.in);
        System.out.println("                CARGAR FILAS");
        System.out.println("Ingrese la cantidad de filas que tendrá la matriz:");
        filas = sc.nextInt();
        System.out.println("                CARGAR COLUMNAS");
        System.out.println("Ingrese la cantidad de columns que tendrá la matriz.");
        columnas = sc.nextInt();
        matrizCuadrada = esCuadrada(filas,columnas);
        if (matrizCuadrada) {
            matrizNum = new int[filas][columnas];
            cargarMatriz(matrizNum);
            existe = esDeIdentidad(matrizNum, 0, 0);
            System.out.println("Esta matriz ¿es de Identidad?: "+existe);
        } else {
            System.out.println("Error, la cantidad de filas y columnas es diferente.");
        }
    }
    /*Este método verificará que la cantidad de filas sea igual al columnas
     (para saber si la matriz será cuadrada)*/
    public static boolean esCuadrada(int fil, int col) {
        return fil == col;
    }
    //Este método cargará la matriz pasado por parametro 
    public static void cargarMatriz(int[][] matriz) {
        int fil = matriz.length, col = matriz[0].length;
        Scanner scann = new Scanner(System.in);
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Ingresé el número que ingresará en la posición: "+j+" de la fila "+i);
                matriz[i][j] = scann.nextInt();
            }
        }
    }
    public static boolean esDeIdentidad(int[][] matriz, int fil, int col) {
        boolean identidad;
        if (col == matriz[0].length) {
            fil = fil+1;
            col = 0;
        }
        if (fil<matriz.length) {
            if (fil == col && matriz[fil][col] == 1) {
                identidad = esDeIdentidad(matriz, fil, col = col+1);
            } else if(fil !=col && matriz[fil][col] == 0){
                identidad = esDeIdentidad(matriz, fil, col = col+1);
            }
            else{
                identidad = false;
            }
        } 
        else{
            identidad = true;
        }
        return identidad;
    }
}
