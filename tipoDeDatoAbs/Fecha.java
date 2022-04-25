public class Fecha{
    //Atributos
    private int dia;
    private int mes;
    private int anio;
    //Constructores
    public Fecha(int unDia, int unMes, int unAnio){
        dia = unDia;
        mes = unMes;
        anio = unAnio;
    }
    //Metodos Observadores
    public int getDia(){
        return dia;
    }
    public int getMes(){
        return mes;
    }
    public int getAnio(){
        return anio;
    }
    public boolean equals(Fecha unaFecha){
        return this.dia == unaFecha.dia && this.mes == unaFecha.mes && this.anio == unaFecha.anio;
    }
    public String toString(){
        return dia+"/"+mes+"/"+anio;
    }
    //Metodos Modificadores
    public void setFecha(int unDia){
        if(unDia<1 || unDia>31){
            dia =0;
        }
        else{
            if(unDia<29){
                dia=unDia;
            }
            else{
                switch(unDia){
                    case 29: 
                    if(this.mes==2){
                        if(esBisiesto()){
                            dia = unDia;
                        }
                        else{
                            dia = 0;
                        }
                    }
                    else{
                        dia = unDia;
                    }break;
                    case 30: 
                    if(this.mes==2){
                        dia =0;
                    }
                    else{
                        dia = unDia;
                    }break;
                    case 31:
                    if(this.mes == 2 || this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11){
                        dia = 0;
                    }
                    else{
                        dia = unDia;
                    }break;
                }
            }
        }
    }
    public void setDia(int unDia,int unMes,int unAnio){
        if(unDia<1 || unDia>31){
            dia =0;
        }
        else{
            if(unDia<29){
                dia=unDia;
            }
            else{
                switch(unDia){
                    case 29: 
                    if(unMes==2){
                        if(esBisiesto(unAnio)){
                            dia = unDia;
                        }
                        else{
                            dia = 0;
                        }
                    }
                    else{
                        dia = unDia;
                    }break;
                    case 30: 
                    if(unMes==2){
                        dia =0;
                    }
                    else{
                        dia = unDia;
                    }break;
                    case 31:
                    if(unMes == 2 || unMes == 4 || unMes == 6 || unMes == 9 || unMes == 11){
                        dia = 0;
                    }
                    else{
                        dia = unDia;
                    }break;
                }
            }
        }
    }
    public void setMes(int unMes){
        if(unMes<1 || unMes>12){
            mes= 0;
        }
        else{
            this.mes = unMes;
        }
    }
    public void setAnio(int unAnio){
        if(unAnio<1){
            anio =0;
        }
        else{
            anio = unAnio;
        }
    }
    //Propias del tipo
    private boolean esBisiesto(){
        boolean esBisiest = false;
        if((this.anio % 4 ==0) || (this.anio %100 != 0) || (this.anio%400 == 0)){
            esBisiest = true;
        }
        return esBisiest;
    }
    private boolean esBisiesto(int unAnio){
        boolean esBisiest = false;
        if((unAnio % 4 ==0) || (unAnio %100 != 0) || (unAnio % 400 == 0)){
            esBisiest = true;
        }
        return esBisiest;
    }
    public int cantDiasMes(int unMes){
        int cantDias=0;
        if(unMes == 4 || unMes == 6 || unMes == 9 || unMes == 11){
            cantDias = 30;
        }
        else{
            if(unMes==2){
                if(esBisiesto()){
                    cantDias = 29;
                }
                else{
                    cantDias = 28;
                }
            }
            else{
                cantDias = 31;
            }
        }
        return cantDias;
    }
    public int diasTranscurridos(Fecha unaFecha){
        int sumCantDias=0, mesAnio = unaFecha.getMes(), diasTransMes = unaFecha.getDia();
        for(int i=0; i<mesAnio; i++){
            sumCantDias = sumCantDias + cantDiasMes(i);
        }
        sumCantDias = sumCantDias + diasTransMes;
        return sumCantDias;
    }
    public boolean esFechaAnterior(Fecha unaFecha){
        boolean esAnterior = false;
        if(this.anio < unaFecha.anio){
            esAnterior = true;
        }
        else{
            if(this.anio == unaFecha.anio && this.mes < unaFecha.mes){
                esAnterior = true;
            }
            else{
                if(this.mes == unaFecha.mes && this.dia < unaFecha.dia)
                    esAnterior=true;
            }
        }
        return esAnterior;
    }
    public void calculaFecha(){}
}