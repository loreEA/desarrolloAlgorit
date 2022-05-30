import java.util.*;
public class ejercicioTres {
    public static void main(String[] args) {
        String palabra, palabrJeringoza, vocales = "aeiouAEIOU";
        Scanner sc = new Scanner(System.in);
        System.out.println("Cargué una frase");
        palabra = sc.nextLine();
        palabrJeringoza = jeringozaRecursivo(palabra, 0, vocales);
        System.out.println(palabrJeringoza);
    }
    public static String jeringozaRecursivo(String palabra, int pos, String vocales){
        String palabraEnJeringoza="";
        if(pos<palabra.length()){ //Si no nos pasamos de la longitud
            if(vocales.indexOf(palabra.charAt(pos)) > -1){ //Si el charAt(pos) esta dentro de las vocales
                palabraEnJeringoza = jeringozaRecursivo(palabra, (pos+1), vocales)+'p'+palabra.charAt(pos);
            } else{ //Como no es vocal, solo agregamos la letra en pos y llamo recursivamente
                palabraEnJeringoza = jeringozaRecursivo(palabra, (pos+1), vocales)+palabra.charAt(pos); 
            }
        } else{ //Si nos pasamos, cortamos la recursividad
            palabraEnJeringoza="";
        }
        return palabraEnJeringoza;
    }
}
