package br.com.gjsgabriel.tdd.service;

import java.math.BigDecimal;

import br.com.gjsgabriel.tdd.modelo.Desempenho;
import br.com.gjsgabriel.tdd.modelo.Funcionario;

public class ReajusteService {

	public void reajustar(Funcionario funcionario, Desempenho desempenho) {
		
			BigDecimal percentual = desempenho.percentualReajuste();
			BigDecimal reajuste = funcionario.getSalario().multiply(percentual);
			funcionario.reajustarSalario(reajuste);
		
	}

}
