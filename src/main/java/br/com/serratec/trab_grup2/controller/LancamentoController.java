package br.com.serratec.trab_grup2.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.serratec.trab_grup2.model.LancamentoVendas;
import br.com.serratec.trab_grup2.service.LancamentoService;

@RestController
@RequestMapping("/lancamentos")
public class LancamentoController {
	
	@Autowired
	private LancamentoService service;
	
	@GetMapping("{id}")
	public ResponseEntity<LancamentoVendas> listarPorId(@PathVariable Long id){
		Optional<LancamentoVendas> vendas = service.listarPorId(id);
		if(vendas.isPresent()) {
			return ResponseEntity.ok(vendas.get());
		}
		return ResponseEntity.notFound().build();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public LancamentoVendas InserirLancamento(@RequestBody LancamentoVendas vendas) {
		return service.inserirLancamento(vendas);
	}
	
}
