public class terEjRecursiv {
    public static void main(String[] args) {
        int[] numeros1={30,26,23,22,20,18,14,11,10,7,5,2}, numeros2={9,8,3,1}, numeros3;
        int longitud3 = numeros1.length + numeros2.length;
        numeros3 = new int[longitud3];
        ordenarMayorAMenor(numeros1, numeros2, numeros3, 0, 0, 0);
        for (int i = 0; i < numeros3.length; i++) {
            System.out.print(numeros3[i]+" ");
        }
        System.out.println();
    }
    public static void ordenarMayorAMenor(int[] array1,int[] array2,int[] array3,int pos1,int pos2,int pos3) {
        if (pos1<array1.length && pos2<array2.length) {
            if (array1[pos1] > array2[pos2]) {
                array3[pos3] = array1[pos1];
                ordenarMayorAMenor(array1, array2, array3, pos1+1, pos2, pos3+1);
            } else {
                array3[pos3] = array2[pos2];
                ordenarMayorAMenor(array1, array2, array3, pos1, pos2+1, pos3+1);
            }
        } else {
            if (pos1 == array1.length) {
                cargarRestArreglo(array2,array3,pos2,pos3);
            } else {
                cargarRestArreglo(array1,array3,pos1,pos3);
            }
        }
    }
    public static void cargarRestArreglo(int[] array,int[] array3,int pos,int posicion){
        for (int i = pos; i < array.length; i++) {
            array3[posicion] = array[pos];
            posicion++;
            
        }
    }
}
