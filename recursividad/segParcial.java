public class segParcial {
    public static void main(String[] args) {
        int[][] matriz = {{3,0,-2},{-4,-3,-2},{-3,6,-2}};
        //int num = 101, total;
        //total = sumPar(num,0);
        //String oracion ="lorena ester",vocalRev = concatReves(oracion, 0, "");
        //System.out.println(total);
        //System.out.println(vocalRev);
        int num = columnaNegativa(matriz, 0, 0);
        System.out.println(num);
    }
    public static int columnaNegativa(int[][] matriz,int fil,int col) {
        int pos;
        if (col<matriz[0].length) {
            if (fil == matriz.length) {
                pos = col;
            } else {
                if (matriz[fil][col]>-1) {
                    pos = columnaNegativa(matriz,0,col+1);
                } else {
                    pos = columnaNegativa(matriz,fil+1,col);
                }
            }
        } else {
            pos = -1;
        }
        return pos;
    }
    /* 
    public static int filaBinaria(int[][] matriz,int fil,int col) {
        int pos;
        boolean existe;
        if (fil<matriz.length) {
            if (col == matriz[0].length) {
                pos = fil;
            } else {
                existe = esBinario(matriz[fil][col]);
                if (!existe) {
                    pos = filaBinaria(matriz,fil+1,0);
                } else {
                    pos = filaBinaria(matriz,fil,col+1);
                }
            }
        } else {
            pos = -1;
        }
        return pos;
    }
    public static boolean esBinario(int num) {
        boolean existe;
        if (num<=0) {
            existe = true;
        } else {
            if ((num%10)== 1 || (num%10)== 0) {
                existe = esBinario(num/10);
            } else {
                existe = false;
            }
        }
        return existe;
    }*/
    /*public static int sumPar(int numero,int cont) {
        if (numero<1) {
            cont = numero;
        } else {
            if ((numero%10)%2 == 0) {
                cont = sumPar(numero/10, cont) + numero%10; 
            } else {
                cont = sumPar(numero/10, cont) + 0; 
            }
        }
        return cont;
    }
    public static String concatReves(String oracion,int i,String vocalRev) {
        if (i<oracion.length()) {
            if (esVocal(oracion.charAt(i))>-1) {
                vocalRev = concatReves(oracion,i+1,vocalRev)+ oracion.charAt(i);
            } else {
                vocalRev = concatReves(oracion,i+1,vocalRev);
            }
        } else {
            vocalRev = "";
        }
        return vocalRev;
    }
    public static int esVocal(char caracter) {
        String vocal = "aeiouAEIOU";
        return vocal.indexOf(caracter);
    }*/
}
