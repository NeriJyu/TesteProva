import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testAdicao() {
		int n1 = 5;
		int n2 = 4;
		
		Calculadora c = new Calculadora();
		
		int resultadoEsperado = 9;
		int resultadoObtido = c.somar(n1, n2);
		
		assertEquals(resultadoEsperado, resultadoObtido);
	}
	
	@Test
	void testSubtracao() {
		
		int n1 = 15;
		int n2 = 5;
		
		Calculadora c = new Calculadora();
		
		int resultadoEsperado = 10;
		int resultadoObtido = c.subtracao(n1, n2);
		
		assertEquals(resultadoEsperado, resultadoObtido);
		
	}

	void testMultiplicacao () {
		int n1 = 10;
		int n2 = 5;
		
		Calculadora c = new Calculadora();
		
		int resultadoEsperado = 50;
		int resultadoObtido = c.multiplicacao(n1, n2);
		
		assertEquals(resultadoEsperado, resultadoObtido);

	}
	
	
	@Test
	void testDivisao() {
	int n1 = 10;
	int n2 = 2;
		
	Calculadora c = new Calculadora();
	
	int resultadoEsperado = 5;
	int resultadoObtido = c.divisao(n1, n2);
	
	assertEquals(resultadoEsperado, resultadoObtido);
	
	
	
	}
	
}
