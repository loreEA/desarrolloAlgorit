import java.util.*;
public class ejerTres {
    public static void main(String[] args) {
        String palabra = cargarPalabra(), vocales = "aeiouAEIOU", palabraJeringoza = formarTextJeringoza(palabra.toLowerCase(), 0, vocales);
        System.out.println("                     NUEVA FRASE");
        System.out.println(palabraJeringoza);

    }
    public static String cargarPalabra() {
        String palab;
        Scanner sc = new Scanner(System.in);
        System.out.println("                    CARGAR FRASE");
        do {
            System.out.println("Cargué una palabra. No ingrese solamente una letra.");
            palab = sc.nextLine();
            if (palab.length()<2) {
                System.out.println("Error. El texto ingresado no es una palabra");
            }
        } while (palab.length()<2);
        return palab;
    }
    public static String formarTextJeringoza(String palabra,int i,String vocales){
        String palabJeringoza;
        if (i<palabra.length()) {
            if (vocales.indexOf(palabra.charAt(i))>-1) {
                palabJeringoza = palabra.charAt(i) + "p" +palabra.charAt(i) + formarTextJeringoza(palabra, i = i+1, vocales);
            } else {
                palabJeringoza = palabra.charAt(i) + formarTextJeringoza(palabra, i = i+1, vocales);
            }
        } else {
            palabJeringoza = "";
        }
        return palabJeringoza;
    }
}
