package br.com.impacta.lab.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atividades")
public class CondicionalController {

	@GetMapping("/condicional")
	public ResponseEntity<String> simularValores(@RequestParam(name="idade") int idade) {
		/*
		 * Elabore um algoritmo para dizer a partir da idade se a 
		 * pessoa tem mais ou menos do que 18 anos.
		 *  
		 *  Retornar os seguintes textos:
		 *  
		 *  
		 *  Para maiores de dezoito anos -> Possui mais de 18 anos
		 *  
		 *  Para menores de dezoito anos -> Possui menos de 18 anos
		 *  
		 */
		
		String resultado = null;

    if(idade == 18)
    {
      resultado = "Possui 18 anos";
    }
    else if(idade > 18)
    {
      resultado = "Possui mais de 18 anos";
    }
    else if(idade <18)
    {
      resultado = "Possui menos de 18 anos";
    }
    else
    {
        resultado = "Não foi possivel realizar a funcionalidade.";
    }

		return ResponseEntity.ok(resultado);
	}
	
}
