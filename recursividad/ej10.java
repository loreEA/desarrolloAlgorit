import java.util.Scanner;
public class ej10 {
    public static void main(String[] args){
        String orac = "", frase = formarFrase(orac);
        System.out.println(frase);
    }
    public static char cargarCaracter(){
        char carac;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Porfavor cargué un caracter");
        carac = sc.next().charAt(0);
        return carac;
    }
    public static String formarFrase(String frase){
        char caracter = cargarCaracter();
        if(caracter != '.'){
            frase = caracter + formarFrase(frase);
        }
        return frase;
    }
}
