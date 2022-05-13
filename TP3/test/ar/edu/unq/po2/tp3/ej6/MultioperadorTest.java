package ar.edu.unq.po2.tp3.ej6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MultioperadorTest {
	
	Multioperador  multioperador; 
	int [] numeros = {1,2,3,4};
	
	@BeforeEach
	void setUp()  {
		multioperador = new Multioperador();
	}
	
	@Test
	void shouldTestSumaDeArrays() {
		assertEquals(multioperador.sumar(numeros), 10);
	}
	
	@Test
	void shouldTestRestaDeArrays() {
		assertEquals(multioperador.restar(numeros), -10);
	}
	
	@Test
	void shouldTestMultiplicacionDeArrays() {
		assertEquals(multioperador.multiplicar(numeros), 24);
	}
}
