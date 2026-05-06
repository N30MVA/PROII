package com.mycompany.ejercicio4;

public class CuentaBancaria {
    private double saldo;
    
    public CuentaBancaria(double saldo){
        if(saldo>0){
            this.saldo=saldo;
        }else{
            System.out.println("Error, el saldo no puede ser negativo");
        }
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(double saldo){
        if(saldo>0){
            this.saldo=saldo;
        }else{
            System.out.println("Error, el saldo no puede ser negativo");
        }
    }
    
    public void ingreso(double cant){
        if(cant==0){
            System.out.println("Antencion, no se va a ingresar nada");
        }else{
            setSaldo(saldo+cant);
        }
    }
    
    public void retirada(double cant){
        if(cant==0){
            System.out.println("Atencion, no se va a sacar nada");
        }else{
            setSaldo(saldo-cant);
        }
    }
    
    public String toString(){
        StringBuilder salida=new StringBuilder();
        salida.append(getSaldo());
        return salida.toString();
    }
}