import java.util.Scanner;
public class ej8 {
    public static void main(String[] args) {
        String oracion, nuevaCad;
        boolean verificador;
        int ini = 0, fin;
        oracion = cargarOracion();
        nuevaCad = quitarEspacios(oracion);
        nuevaCad = nuevaCad.trim();
        fin = nuevaCad.length();
        verificador = esPalindromo(nuevaCad,ini,fin-1);
        System.out.println("        ¿ES PALÍNDROMO?");
        System.out.println(verificador);
    }
    public static String cargarOracion(){
        String orac;
        Scanner sc = new Scanner(System.in);
        System.out.println("                                CARGAR ORACIÓN");
        System.out.println("Porfavor cargar una oración. En caso de que la oración tenga tilde, ignorarla.");
        orac = sc.nextLine();
        while(orac.length()<1){
            System.out.println("Error. Porfavor cargué una oración.");
            orac = sc.nextLine();
        }
        return orac;
    }
    public static String quitarEspacios(String orac){
        String nuevaOrac = "", palabra, cadena = orac.toLowerCase()+" ";
        int pos;
        int cont = 0, j;
        while(cont< orac.length()){
            pos = cadena.indexOf(" ");
            palabra = "";
            for(j=0; j<pos; j++){
                palabra = palabra + cadena.charAt(j);
            }
            nuevaOrac = nuevaOrac + palabra;
            cadena = cadena.substring(pos+1);
            cont = cont + (j+1);
        }
        return nuevaOrac;
    }
    public static boolean esPalindromo(String orac, int inicio, int fin){
        boolean verificador;
        int medio = orac.length()/2;
        if(inicio == medio && fin == medio){
            verificador = true;
        }
        else{
            if(orac.charAt(inicio)==orac.charAt(fin)){
                inicio = inicio+1;
                fin = fin - 1;
                verificador = esPalindromo(orac, inicio, fin);
            }
            else{
                verificador = false;
            }
        }
        return verificador;
    }
}

