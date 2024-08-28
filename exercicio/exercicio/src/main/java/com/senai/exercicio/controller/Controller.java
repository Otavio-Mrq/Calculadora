package com.senai.exercicio.controller;

import com.senai.exercicio.DTO.CalculadoraDTO;
import com.senai.exercicio.DTO.ResultadoDTO;
import com.senai.exercicio.services.contas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculo")
public class Controller {
    
    @Autowired
    contas contas;
    
    @PostMapping("/somar")
    public ResponseEntity<ResultadoDTO> soma(@RequestBody CalculadoraDTO dados){
        
        ResultadoDTO retorno = contas.somar(dados);
        
        return ResponseEntity.ok().body(retorno);
    }
    
    @PostMapping("/subtrair")
    public ResponseEntity<ResultadoDTO> subtrai(@RequestBody CalculadoraDTO dados){
        
        ResultadoDTO retorno = contas.subtrair(dados);
        
        return ResponseEntity.ok().body(retorno);
    }
    
    @PostMapping("/dividir")
    public ResponseEntity<ResultadoDTO> divide(@RequestBody CalculadoraDTO dados){
        
        ResultadoDTO retorno = contas.divisao(dados);
        
        return ResponseEntity.ok().body(retorno);
    }
            
    @PostMapping("/multiplicar")
    public ResponseEntity<ResultadoDTO> multiplica(@RequestBody CalculadoraDTO dados){
        
        ResultadoDTO retorno = contas.multiplicar(dados);
        
        return ResponseEntity.ok().body(retorno);
    }
}
