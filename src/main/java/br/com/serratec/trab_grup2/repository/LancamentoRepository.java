package br.com.serratec.trab_grup2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.serratec.trab_grup2.model.LancamentoVendas;

public interface LancamentoRepository extends JpaRepository<LancamentoVendas, Long> {

}
