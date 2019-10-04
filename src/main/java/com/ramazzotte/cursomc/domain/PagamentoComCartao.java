package com.ramazzotte.cursomc.domain;

import java.io.Serializable;

import javax.persistence.Entity;

import com.ramazzotte.cursomc.domain.enuns.EstadoPagamento;
@Entity
public class PagamentoComCartao extends Pagamento {
	private static final long serialVersionUID = 1L;
	private Integer numeroDeParcelas;
	
	public PagamentoComCartao() {
		
	}

	public PagamentoComCartao(Integer id, EstadoPagamento estado, Integer numeroDeParcelas, Pedido pedido) {
		super(id, estado, pedido);
		this.numeroDeParcelas = numeroDeParcelas;
	}

	public Integer getNumeroDeParcelas() {
		return numeroDeParcelas;
	}

	public void setNumeroDeParcelas(Integer numeroDeParcelas) {
		this.numeroDeParcelas = numeroDeParcelas;
	}

	
}
