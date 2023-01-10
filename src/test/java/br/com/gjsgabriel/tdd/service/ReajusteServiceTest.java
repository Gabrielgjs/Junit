package br.com.gjsgabriel.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.gjsgabriel.tdd.modelo.Desempenho;
import br.com.gjsgabriel.tdd.modelo.Funcionario;

public class ReajusteServiceTest {

	private ReajusteService service;
	private Funcionario funcionario;
	
	@BeforeEach
	public void inicializar() {
		this.service = new ReajusteService();
		this.funcionario = new Funcionario("John", LocalDate.now(), new BigDecimal("1000"));
	}
	
	@AfterEach
	public void finalizar() {
		System.out.println("Finalizar");
	}
	
	@Test
	public void reajusteDeveSerDe3PorCentoQuandoDesempenhoForADesejar() {
		
		service.reajustar(funcionario, Desempenho.A_DESEJAR);
		assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
	}
	
	@Test
	public void reajusteDeveSerDe15PorCentoQuandoDesempenhoForBom() {
		
		service.reajustar(funcionario, Desempenho.BOM);
		assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
	}
	
	
	@Test
	public void reajusteDeveSerDe20PorCentoQuandoDesempenhoForOtimo() {
		
		service.reajustar(funcionario, Desempenho.OTIMO);
		assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
	}
}
