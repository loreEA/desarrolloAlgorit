public class cuartEjer {
    public static void main(String[] args) {
        int[] numeros = {5,8,9,1,3,2};
        metSeleccion(numeros);
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+" ");
        }
        System.out.println();
    }/* 
    public static void metBurbuja(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if (array[j]>array[j+1]) {
                    intercambiar(j, j+1, array);
                }  
            }
        }
    }
    public static void metBurbuja2(int[] array) {
        int i=0;
        boolean ordenado = false;
        while (i<array.length && !ordenado) {
            ordenado = true;
            for (int j = 0; j < array.length-i-1; j++) {
                if (array[j]>array[j+1]) {
                    ordenado = false;
                    intercambiar(j, j+1, array);
                } 
            }
        }
    }*/
    public static void metSeleccion(int[] array) {
        int posMenor;
        for (int i = 0; i < array.length; i++) {
            posMenor = buscarMenor(i,array);
            if (array[posMenor]<array[i]) {
                intercambiar(i, posMenor, array);
            }
        }
    }
    public static int buscarMenor(int desde,int[] arreglo) {
        int i=0,menor,posMenor;
        menor = arreglo[desde];
        posMenor = desde;
        for (i = desde; i < arreglo.length; i++) {
            if (arreglo[i]<menor) {
                menor = arreglo[i];
                posMenor = i;
            }
        }
        return posMenor;
    }
    public static void intercambiar(int pos1,int pos2,int[] array) {
        int aux;
        aux = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = aux;
    }

}
