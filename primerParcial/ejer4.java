import java.util.*;
public class ejer4{
    public static void main(String[] args) {
        String oracion = cargarFrase();
        int cantH = contPalabrConH(oracion);
        System.out.println("La cantidad de veces que h aparece en una palabra de la frase ingresada es: "+cantH);
    }
    public static String cargarFrase() {
        String frase;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Cargar una frase. No ingrese una sola letra, sino una oración.");
            frase = sc.nextLine();
            if (frase.length()<2) {
                System.out.println("Error. Ingreso solamente una letra");
            }
        }while(frase.length()<2);
        sc.close();
        return frase;
    }
    public static int contPalabrConH(String frase) {
        frase = frase.trim();
        String fraseCopiad = frase + " ", palabra;
        int i = 0, pos, contPalabConH = 0, existeH, cont;
        while(i<frase.length()){
            pos = 0;
            palabra = "";
            existeH = 0;
            cont = 0;
            pos = fraseCopiad.indexOf(" ");
            palabra = fraseCopiad.substring(0, pos);
            existeH = contOcurrencH(palabra);
            if (existeH>0) {
                contPalabConH++;
            }
            fraseCopiad = fraseCopiad.substring(pos+1);
            cont = cont + pos+1;
            i = i+cont;
        }
        return contPalabConH;
    }
    public static int contOcurrencH(String palabra) {
        int contarOcurrencH = 0;
        String letras = "hH";
        for (int i = 1; i < palabra.length()-1; i++) {
            if (letras.indexOf(palabra.charAt(i))>-1) {
                contarOcurrencH++;
            }
        }
        return contarOcurrencH;
    }
}