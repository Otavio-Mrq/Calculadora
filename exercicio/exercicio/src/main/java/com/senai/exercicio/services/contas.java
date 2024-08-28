package com.senai.exercicio.services;

import com.senai.exercicio.DTO.CalculadoraDTO;
import com.senai.exercicio.DTO.ResultadoDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class contas {
    
    public ResultadoDTO somar(CalculadoraDTO dados){
        
        double resultado = dados.getNumero1()+dados.getNumero2();
        
        ResultadoDTO retorno = new ResultadoDTO();
        retorno.setResultado(resultado);
        
        return retorno;
    }
    
    public ResultadoDTO subtrair(CalculadoraDTO dados){
        
        double resultado = dados.getNumero1()-dados.getNumero2();
        
        ResultadoDTO retorno = new ResultadoDTO();
        retorno.setResultado(resultado);
        
        return retorno;
    }
    
    public ResultadoDTO multiplicar(CalculadoraDTO dados){
        
        double resultado = dados.getNumero1()*dados.getNumero2();
        
        ResultadoDTO retorno = new ResultadoDTO();
        retorno.setResultado(resultado);
        
        return retorno;
    }
    
    public ResultadoDTO divisao(CalculadoraDTO dados){
        
        double resultado = dados.getNumero1()/dados.getNumero2();
        
        ResultadoDTO retorno = new ResultadoDTO();
        retorno.setResultado(resultado);
        
        return retorno;
    }
}
