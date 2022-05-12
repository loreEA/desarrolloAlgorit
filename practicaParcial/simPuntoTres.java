import java.util.*;
public class simPuntoTres {
    /*Este método mostrará por pantalla la cantidad de palabras que tienen 
    al menos una letra igual pegada */
    public static void main(String[] args) {
        String oracion = cargarFrase();
        int cantidad = cantPalabLetrasPeg(oracion);
        if (cantidad>0) {
            System.out.println("Son "+cantidad+" la cantidad de palabras con letras iguales pegadas.");
        } else {
            System.out.println("No existe ninguna palabra con letras iguales pegadas.");
        }
        
    }
    //Este método cargará y retornará una frase
    public static String cargarFrase() {
        String frase;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Cargar una frase. No ingrese una letra solamente");
            frase = sc.nextLine();
            if(frase.length()<2){
                System.out.println("Error. Ingreso un caracter");
            }
        }while(frase.length()<2);
        return frase;
    }
    /* */
    public static int cantPalabLetrasPeg(String frase) {
        int i = 0, cont = 0, palabConLetras=0, pos;
        boolean existe;
        String fraseCopiad = frase + " ", palabra;
        while(i<frase.length()){
            pos = fraseCopiad.indexOf(" ");
            palabra = generarPalabra(fraseCopiad, 0, pos);
            existe = existeLetraPegada(palabra);
            if (existe) 
                palabConLetras++;
            fraseCopiad = fraseCopiad.substring(0, pos+1);
            cont = cont + pos;
            i = i + cont;
        }
        return palabConLetras;
    }
    //
    public static String generarPalabra(String frase, int posIni, int posFinal){
        return frase.substring(posIni, posFinal);
    }
    //
    public static boolean existeLetraPegada(String palabra){
        int i = 0, j=0;
        boolean existe = false;
        while (i<palabra.length() && !existe) {
            if(i != palabra.length()-1){
                if(palabra.charAt(i) == palabra.charAt(i+1)){
                    existe = true;
                }
            }    
            i = i+1; 
        }
        return existe;
    }
}
