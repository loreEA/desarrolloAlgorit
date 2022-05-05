public class Automovil {
    //Atributos
    private String patente;
    private int dni;
    private String marca;
    private String modelo;
    private int cantAccident;
    private String tipoSeguro;
    private double montoAsegurado;
    private boolean seguroConFranq;
    //Constructores
    public Automovil(String unaPatente){
        patente = unaPatente;
        dni = 0;
        marca = "";
        modelo = "";
        cantAccident = 0;
        tipoSeguro = "";
        montoAsegurado = 0;
        seguroConFranq = false;
    }
    public Automovil(String unaPatente, int unDni, String unaMarca, String unModelo, int cantAccidentes, String unTipSeguro, double unMontoAseg, boolean unSegFranquicia){
        patente = unaPatente;
        dni = unDni;
        marca = unaMarca;
        modelo = unModelo;
        cantAccident = cantAccidentes;
        tipoSeguro = unTipSeguro;
        montoAsegurado = unMontoAseg;
        seguroConFranq = unSegFranquicia;
    }
    //Métodos Observadores
    public String getPatente(){
        return patente;
    }
    public int getDni(){
        return dni;
    }
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public int getCantAccident(){
        return cantAccident;
    }
    public String getTipoSeguro(){
        return tipoSeguro;
    }
    public double getMontAseg(){
        return montoAsegurado;
    }
    public boolean getSeguroFranquicia(){
        return seguroConFranq;
    }
    public String toString(){
        return "";
    }
    //Métodos Modificadores
    public void setMarca(String unaMarca){
        marca = unaMarca;
    }
    public void setModelo(String unModelo){
        modelo = unModelo;
    }
    public void setCantAccident(int cantAccidentes){
        cantAccident = cantAccidentes;
    }
    public void setTipoSeguro(String unTipSeguro){
        tipoSeguro = unTipSeguro;
    }
    public void setMontAseg(double unMontoAseg){
        montoAsegurado = unMontoAseg;
    }
    public void setSeguroFranquicia(boolean unSegFranquicia){
        seguroConFranq = unSegFranquicia;
    }
    //Propias del Tipo
    public  boolean equals(Automovil otroAuto){
        return this.patente == otroAuto.patente;
    }

}
