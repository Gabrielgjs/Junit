package br.com.gjsgabriel.tdd.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.gjsgabriel.tdd.modelo.Funcionario;

public class BonusService {

	public BigDecimal calcularBonus(Funcionario funcionario) {
		BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));
		
		if (valor.compareTo(new BigDecimal("1000")) > 0) {
			throw new IllegalArgumentException("Funcionário maio que R$1000 não recebe bonus");
		}
		
		return valor.setScale(2, RoundingMode.HALF_UP);
	}

}
