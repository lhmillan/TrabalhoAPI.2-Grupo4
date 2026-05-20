package br.com.serratec.trab_grup2.dto;

import java.time.LocalDate;

public class LancamentoVendasResponseDTO { //request
    private LocalDate dataVenda;
    private Double valorVenda;
    private String nomeVendedor;
    
    public LancamentoVendasResponseDTO(LocalDate dataVenda, Double valorVenda, String nomeVendedor) {
		this.dataVenda = dataVenda;
		this.valorVenda = valorVenda;
		this.nomeVendedor = nomeVendedor;
	}

	public LocalDate getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }

}
