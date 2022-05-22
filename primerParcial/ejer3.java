import java.util.*;
public class ejer3 {
    public static void main(String[] args) {
        int fil = cargarFil(), col = cargarCol(), piso;
        int[][] edificioViviend = new int[fil][col];
        double prom;
        cargarArreglo(edificioViviend);
        piso = buscarPosicion(fil);
        prom = calcPromPiso(edificioViviend, piso);
        System.out.println(prom);
    }
    public static int cargarFil(){
        int fil;
        Scanner sc= new Scanner(System.in);
        do{
            System.out.println("Cargué la cantidad de pisos que tiene el edificio.");
            fil = sc.nextInt();
            if (fil<1) {
                System.out.println("Error. No cargo ningún piso.");
            }
        }while(fil<1);
        return fil;
    }
    public static int cargarCol(){
        int col;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Cargué la cantidad de departamentos que tiene el edificio.");
            col = scan.nextInt();
            if (col<1) {
                System.out.println("Error. No cargo ningún departamento.");
            }
        } while (col<1);
        return col;
    }
    public static void cargarArreglo(int[][] edificio){
        Scanner scann = new Scanner(System.in);
        for (int i = 0; i < edificio.length; i++) {
            for (int j = 0; j < edificio[0].length; j++) {
                System.out.println("Porfavor cargué un número en la fila "+i+" y la columna "+j);
                edificio[i][j] = scann.nextInt();
            }
        }
    }
    public static int buscarPosicion(int fil){
        int pos;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Ingrese el número del piso en el cual quiere calcular el promedio");
            pos = sc.nextInt();
            if (pos<0 && pos>fil) {
                System.out.println("Error. Ingreso un piso inexistente");
            }
        } while (pos<0 && pos>fil);
        return pos;
    }
	public static double calcPromPiso(int[][] edificio, int piso){
		double promedio = 0;
		int suma=0;
		int i;
		for(i=0; i<edificio[0].length; i++){
			suma = suma + edificio[piso][i];
		}
		promedio = suma/i;
		return promedio;
	}
}
