package br.com.serratec.trab_grup2.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.serratec.trab_grup2.model.LancamentoVendas;
import br.com.serratec.trab_grup2.repository.LancamentoRepository;

@Service
public class LancamentoService {

    @Autowired
    private LancamentoRepository repository;

    public LancamentoVendas inserirLancamento(LancamentoVendas lancamento) {
        return repository.save(lancamento);
    }

    public Optional<LancamentoVendas> listarPorId(Long id) {
        return repository.findById(id);
    }
}
