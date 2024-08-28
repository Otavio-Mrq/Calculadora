package com.senai.exercicio.DTO;

import org.springframework.validation.annotation.Validated;

 public class CalculadoraDTO {
    
     
    
    private double numero1;

    private double numero2;
    
    public CalculadoraDTO(){
        
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    
}
