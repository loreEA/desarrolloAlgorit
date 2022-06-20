public class terEj {
    public static void main(String[] args) {
        int[] numeros1={30,26,23,22,20,18,14,11,10,7,5,2}, numeros2={9,8,3,1}, numeros3;
        numeros3 = nuevoArray(numeros1,numeros2);
        for (int i = 0; i < numeros3.length; i++) {
            System.out.print(numeros3[i]+" ");
        }
        System.out.println();
    }
    public static int[] nuevoArray(int[] array1,int[] array2) {
        int arreg1=0, arreg2=0, arreg3 = 0;
        int[] array3 = new int[(array1.length)+(array2.length)];
        while ((arreg1<array1.length)&&(arreg2<array2.length)) {
            if (array1[arreg1]>=array2[arreg2]) {
                array3[arreg3] = array1[arreg1];
                arreg1++;
                arreg3++;
            } else {
                array3[arreg3] = array2[arreg2];
                arreg2++;
                arreg3++;
            }
        }
        cargarRestArreglo(array1, array2, array3, arreg1, arreg2, arreg3);
        return array3;
    }
    public static void cargarRestArreglo(int[] array,int[] array2,int[] array3,int pos1,int pos2,int pos3){
        if (pos1>=array.length) {
            while (pos2<array2.length) {
                array3[pos3] = array2[pos2];
                pos3++;
                pos2++;
            }
        } 
        else{
            while (pos1<array.length) {
                array3[pos3] = array[pos1];
                pos3++;
                pos1++;
            }
        }
    }
}
