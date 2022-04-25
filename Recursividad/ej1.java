public class ej1 {
    public static void main(String[] args) {
        int n=5, valorRetorn;
        valorRetorn = func(n);
        System.out.println(valorRetorn);
    }
    public static int func(int n) {
        int aux;
        if(n==0){
            aux = 0;
        }
        else{
            aux = n + func(n-1);
        }
        return aux;
    }
}
