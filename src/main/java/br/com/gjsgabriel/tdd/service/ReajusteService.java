package br.com.gjsgabriel.tdd.service;

import java.math.BigDecimal;

import br.com.gjsgabriel.tdd.modelo.Desempenho;
import br.com.gjsgabriel.tdd.modelo.Funcionario;

public class ReajusteService {

	public void reajustar(Funcionario funcionario, Desempenho desempenho) {
		if(desempenho == Desempenho.A_DESEJAR) {
			BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal("0.03"));
			funcionario.reajustarSalario(reajuste);
		}
		
		
	}

}