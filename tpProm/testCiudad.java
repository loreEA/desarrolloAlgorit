public class testCiudad{
    public static void main(String[] args) {
    }
    public static void menu() {
    }
    private static String abreviatCiudad(String ciudad,int i) {
        String abreviatura;
        boolean esVoc;
        if (i<ciudad.length()) {
            esVoc = esVocal(ciudad.charAt(i));
            if (ciudad.charAt(i) == ' ' || esVoc) {
                abreviatura = abreviatCiudad(ciudad, i+1);
            } else {
                abreviatura = ciudad.charAt(i)+ abreviatCiudad(ciudad, i+1);
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
    public static void ordSeleccion(Ciudad[] ciudades,int tipoOrd) {
        int longitud = ciudades.length, i, j, iMin;
        if (tipoOrd==1) {
            for (i = 0; i < longitud - 1; i++) {
                iMin = i;
                for (j = i+1; j < longitud; j++) {
                    if (ciudades[j].compareTo(ciudades[iMin])>-1) {
                       iMin = j;
                       intercambio(ciudades,i,iMin);
                    }
                }
            }
        } else {
            for (i = 0; i < longitud - 1; i++) {
                iMin = i;
                for (j = i+1; j < longitud; j++) {
                    if (ciudades[j].compareTo(ciudades[iMin])<0) {
                       iMin = j;
                       intercambio(ciudades,i,iMin);
                    }
                }
            }
        }  
    }
    public static void ordMergeSort(Ciudad[] ciudades, int tipoOrd) {
        if (tipoOrd==3) {
            
        } else {
            
        }
    }
    public static void intercambio(Ciudad[] ciudades,int i,int j){
        String nombre;
        nombre = ciudades[i].getNombre();
        ciudades[i].setNombre(ciudades[j].getNombre());
        ciudades[j].setNombre(nombre);
    }
    public static boolean letrasConsec(String nombre,int i) {
        boolean existe;
        if (i<nombre.length()-1) {
            if (nombre.charAt(i)!=nombre.charAt(i+1)) {
                existe = letrasConsec(nombre, i+1);
            } else {
                existe = true;
            }
        } else {
            existe = false;
        }
        return existe;
    }
}
