package ar.edu.unq.po2.tp3;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CounterTest {

	Counter counter; 
	
	@BeforeEach
	void setUp() throws Exception {
		counter = new Counter(); 
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1); 
		counter.addNumber(1);
		counter.addNumber(4);
	}

	@Test
	void testContarPares() {
		 assertEquals(counter.contarPares(), 1);
	}
	
	@Test 
	void testContarMultiplos() {
		assertEquals(counter.contarMultiplos(1), 11);
	}
}