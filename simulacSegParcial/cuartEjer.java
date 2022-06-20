public class cuartEjer {
    public static void main(String[] args) {
        int[] numeros = {5,8,9,1,3,2};
        metBurbuja2(numeros);
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
    }*/
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
    }
    public static void intercambiar(int pos1,int pos2,int[] array) {
        int aux;
        aux = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = aux;
    }
}
