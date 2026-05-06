package com.mycompany.bloque2;

public class Fecha {
    private int dia;
    private int mes;
    private int ano;
    
    public Fecha(int dia, int mes, int ano){
        this.dia=dia;
        this.mes=mes;
        this.ano=ano;
    }
    
    public int getDia(){
        return dia;
    }
    
    public int getMes(){
        return mes;
    }
    
    public int getAno(){
        return ano;
    }
    
    @Override
    public String toString(){
        StringBuilder salida=new StringBuilder();
        salida.append(getDia()).append("/").append(getMes()).append("/").append(getAno());
        return salida.toString();
    }
}
