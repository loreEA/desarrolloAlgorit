import java.util.*;
public class Ejercicio1a {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int numero;
        boolean respuesta;
        System.out.println("Ingrese un numero");
        numero = entrada.nextInt();
        respuesta = numeroSeguido (numero);
        System.out.println("Respuesta: "+respuesta);
    }
    
    public static boolean numeroSeguido (int numero){
        boolean numSeg = false;
            if(numero >= 10){
                numSeg = numeroSeguido(numero/10);
                if (numero < 100 && (numero%10 == 0) && (numero /10 ==9)){
                    numSeg = true;
                }else if (numero < 100 &&numero % 10-1 == numero /10 ){
                    numSeg = true;
                }else if (numero >=100){
                    //numSeg = numeroSeguido(numero/10);
                    if(numero % 10  == ((numero/10)%10)+1 ){
                        numSeg = true;
                    }else if (numero %10 ==0 && ((numero%10)%10)==9){
                        numSeg = true;
                    }
                }
            }
        
        return numSeg;
    }
    
}
