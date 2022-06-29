public class testCiudad{
    public static void main(String[] args) {
        String ciudad = "Piedra del Aguila",ciudad2;
        ciudad2 = abreviaturaCiudad(ciudad, 0);
        System.out.println(ciudad2);
    }
    public static void menu() {
        
    }
    private static String abreviaturaCiudad(String ciudad,int i) {
        String abreviatura;
        boolean esVoc;
        if (i<ciudad.length()) {
            esVoc = esVocal(ciudad.charAt(i));
            if (ciudad.charAt(i) == ' ' || esVoc) {
                abreviatura = abreviaturaCiudad(ciudad, i+1);
            } else {
                abreviatura = ciudad.charAt(i)+ abreviaturaCiudad(ciudad, i+1);
            }
        } else {
            abreviatura = "";
        } 
        return abreviatura;
    }
    public static boolean esVocal(char letra) {
        String vocales = "aeiouAEIOU";
        return vocales.indexOf(letra)>-1;
    }

}
