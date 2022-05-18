import java.util.*;
import java.util.Random;
public class simPuntoCuatro {
    public static void main(String[] args) {
        double[][] medicionesLluv = new double[4][12];
        cargarMatriz(medicionesLluv);
        double[] promAnual = genArrPromAnual(medicionesLluv), sumaMesesImp = sumMesesImp(medicionesLluv);
        boolean existeMedicionCero = buscarMedicionCero(medicionesLluv);
        double sumMedicionMarzo = sumMedicMarzo(medicionesLluv);
        for (int i = 0; i < promAnual.length; i++) {
            System.out.println(promAnual[i]);
        }
        for (int j = 0; j < sumaMesesImp.length; j++) {
            System.out.println(sumaMesesImp[j]);
        }
        System.out.println(existeMedicionCero);
        System.out.println(sumMedicionMarzo);

    }
    public static void cargarMatriz(double[][] medicionesLluv){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < medicionesLluv.length; i++) {
            for (int j = 0; j < medicionesLluv[0].length; j++) {
                System.out.println("Ingrese un valor");
                medicionesLluv[i][j] = sc.nextDouble();
            }
        }
    }
    public static double[] genArrPromAnual(double[][] mediciones){
        double[] promAnual = new double[mediciones[0].length];
        double acumMes = 0;
        int i, j;
        for (i = 0; i < mediciones.length; i++) {
            for (j = 0; j < mediciones[0].length; j++) {
                acumMes = acumMes + mediciones[i][j];
            }
            promAnual[i] = acumMes/j;
        }
        return promAnual;
    }
    public static boolean buscarMedicionCero(double[][] medLluvia) {
        boolean existe = false;
        int i=0, j=0;
        double obtMedicion;
        while(j<medLluvia[0].length && !existe){
            while(i<medLluvia.length && !existe){
                obtMedicion = medLluvia[i][j];
                if (obtMedicion == 0) {
                    existe = true;
                }
                else{
                    i++;
                }
            }
            j++;
        }
        return existe;
    }
    public static double sumMedicMarzo(double[][] medicionLluv) {
        double sum = 0;
        for (int i = 0; i < (medicionLluv.length-1); i++) {
            sum = sum + medicionLluv[i][2];
        }
        return sum;
    }
    public static double[] sumMesesImp(double[][] medicionesLluvia){
        int i = 0,j =0;
        double[] sumaMesesImp = new double[medicionesLluvia[0].length];
        while(j<medicionesLluvia[0].length){
            if (j%2 == 0) {
                for (i = 0; i < medicionesLluvia.length; i++) {
                    sumaMesesImp[j] = sumaMesesImp[j] + medicionesLluvia[i][j];
                }
            } else {
                j++;
            }
        }
        return sumaMesesImp;
    }
}
