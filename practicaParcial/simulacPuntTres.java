import java.util.*;
public class simulacPuntTres {
    /*Este algoritmo, según una cadena de caracteres, mostrará la cantidad de palabras
    que tienen mas de tres vocales diferentes*/
    public static void main(String[] args) {
        String oracion = cargarFrase();
        int cantidad = palabConTresVocalDif(oracion);
        if(cantidad>0){
            System.out.println("Se encontraron "+cantidad+" palabra/s con más de 3 vocales.");
        }
        else{
            System.out.println("No se encontró ninguna palabra con más de 3 vocales.");
        }
    }
    //Este método cargará y retornará una frase
    public static String cargarFrase() {
        String frase;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Cargar una frase. No ingrese un caracter sino una oración.");
            frase = sc.nextLine();
            if(frase.length()<2){
                System.out.println("Error. Ingreso un caracter y no una oración.");
            }
        }while(frase.length()<2);
        return frase;
    }
    /*Este método buscará en cada una de las palabras, de una frase ingresada, por al menos 
    3 vocales diferentes*/
    public static int palabConTresVocalDif(String frase) {
        int palabTresVocal = 0;
        int i = 0, pos = 0, cont = 0;
        String fraseCopiad = frase + " ", palabra = "";
        boolean existe;
        while(i<frase.length()){
            pos = fraseCopiad.indexOf(" ");
            palabra = generarPalabra(fraseCopiad, 0, pos);
            existe = existenTresDifVocal(palabra);
            if(existe){
                palabTresVocal++;
            }
            fraseCopiad = fraseCopiad.substring(0,pos+1);
            cont = cont + pos;
            i = i + cont;
        }
        return palabTresVocal;
    }
    /*Este método retornará una palabra que se genera desde la primer posicion de una frase
    hasta la última posición donde se encontró el caracter 32 (espacio)*/
    public static String generarPalabra(String oracion, int posIni, int posFinal){
        return oracion.substring(posIni, posFinal);
    }
    /*Este método buscará en una palabra la cantidad de veces que aparecen diferentes vocales*/
    public static boolean existenTresDifVocal(String palabra) {
        String vocales = "aeiouAEIOU";
        int contador = 0;
        boolean existe = false;
        for(int i = 0; i<vocales.length(); i++){
            if(palabra.indexOf(vocales.charAt(i))>-1){
                contador++;
            }
        }
        if(contador>3){
            existe = true;
        }
        return existe;
    }
}
