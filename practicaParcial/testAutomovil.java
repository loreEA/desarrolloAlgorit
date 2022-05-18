import java.util.*;
public class testAutomovil {
    public static void main(String[] args) {
        int longitud = cargarLongitud();
        Automovil[] automoviles = new Automovil[longitud];
        cargarArreglo(automoviles);
    }
    public static int cargarLongitud() {
        int longit;
        Scanner sc= new Scanner(System.in);
        do{
            System.out.println("Cargué la cantidad de Automóviles que quiere ingresar.");
            longit = sc.nextInt();
            if (longit<1) {
                System.out.println("Error. Ingreso una cantidad no ");
            }
            
        }while(longit<1);
        return longit;
    }
    public static void cargarArreglo(Automovil[] automovils){
        Scanner scann = new Scanner(System.in);
        Scanner sc= new Scanner(System.in);
        int dni = 0, cantAccident = 0;
        double montoAsegurado = 0;
        boolean distinto = false, requis1= false, requis2 = false, seguro;
        String patente = "", marca = "", modelo = "", tipoSeguro = "";
        for (int i = 0; i < automovils.length; i++) {
            System.out.println("Cargué el DNI del competidor");
            dni = scann.nextInt();
            distinto = esDistinto(automovils, dni, i);
            while(!distinto){
                System.out.println("¡Error! Ya cargó ese DNI en particular. Vuelva a cargarlo");
                dni = scann.nextInt();
                distinto = esDistinto(automovils, dni, i);
            }
            do{
                System.out.println("Cargué la patente del automóvil.");
                patente = sc.nextLine();
                System.out.println("Cargué la marca del auto.");
                marca = sc.nextLine();
                System.out.println("Cargué el modelo del automóvil.");
                modelo = sc.nextLine();
                System.out.println("Cargué el tipo de seguro del automóvil.");
                tipoSeguro = sc.nextLine();
                requis1 = seIngCorrectText(patente,marca,modelo,tipoSeguro);
                if(!requis1){
                    System.out.println("Error. Ingreso una letra.");
                }
            }while(!requis1);
            do {
                System.out.println("Cargué la cantidad de accidentes del auto.");
                cantAccident = scann.nextInt();
                System.out.println("Cargué el monto del seguro del automóvil.");
                montoAsegurado = scann.nextDouble();
                requis2 = seIngCorrectNum(cantAccident,montoAsegurado);
                if (!requis2) {
                   System.out.println("Error. Ingreso un número menor o igual 1.");
                }
            } while (!requis2);
            System.out.println("Ingresé true(verdadero) o false(falso) en caso de tener seguro.");
            seguro = scann.nextBoolean();
            automovils[i] = new Automovil(patente,dni,marca,modelo,cantAccident,tipoSeguro,montoAsegurado,seguro);
        }
    }
    public static boolean esDistinto(Automovil[] automovils, int dni,int i){
        int j=0;
        boolean esDistint = true;
        while(j<i && esDistint){
            if(automovils[j].getDni() == dni){
                esDistint = false;
            }
            j++;
        }
        return esDistint;
    }
    public static boolean seIngCorrectText(String patent,String marc,String model, String tipSeguro){
        return patent.length()>1 && marc.length()>1 && model.length()>1 && tipSeguro.length()>1;
    }
    public static boolean seIngCorrectNum(int cantAccident,double montAseg){
        return cantAccident>1 && montAseg>1;
    }
    
}
