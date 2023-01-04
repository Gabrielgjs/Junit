package br.com.gjsgabriel.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.gjsgabriel.tdd.modelo.Desempenho;
import br.com.gjsgabriel.tdd.modelo.Funcionario;

public class ReajusteServiceTest {

	@Test
	public void reajusteDeveSerDe3PorCentoQuandoDesempenhoForADesejar() {
		ReajusteService service = new ReajusteService();
		Funcionario funcionario = new Funcionario("John", LocalDate.now(), new BigDecimal("1000"));
		
		service.reajustar(funcionario, Desempenho.A_DESEJAR);
		
		assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
	}
	
	@Test
	public void reajusteDeveSerDe15PorCentoQuandoDesempenhoForBom() {
		ReajusteService service = new ReajusteService();
		Funcionario funcionario = new Funcionario("John", LocalDate.now(), new BigDecimal("1000"));
		
		service.reajustar(funcionario, Desempenho.BOM);
		
		assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
	}
	
	
	@Test
	public void reajusteDeveSerDe20PorCentoQuandoDesempenhoForOtimo() {
		ReajusteService service = new ReajusteService();
		Funcionario funcionario = new Funcionario("John", LocalDate.now(), new BigDecimal("1000"));
		
		service.reajustar(funcionario, Desempenho.OTIMO);
		
		assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
	}
}
