public class Asignatura {
    //Atributos
    private int codigo;
    private String nombre;
    private String[] temas;
    private Fecha inicio;
    //Constructores
    public Asignatura(int cod){
        codigo = cod;
        nombre = "";
        temas = new String[0];
        inicio = new Fecha(0, 0, 0);
    }
    
}
