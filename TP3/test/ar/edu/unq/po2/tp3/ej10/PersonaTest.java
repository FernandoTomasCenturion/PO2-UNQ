package ar.edu.unq.po2.tp3.ej10;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class PersonaTest {
	private Persona tomas; 
	private Persona pepe;


	@BeforeEach
	void setUp() {
		tomas = new Persona(LocalDate.of(1997, 5, 7), "Tomas"); 
		pepe  = new Persona(LocalDate.of(2000, 5, 7), "Pepe");
	}
	
	@Test
	public void testPersonaEdad() {
		
	assertEquals(tomas.getEdad(), 25);
	assertEquals(pepe.getEdad(), 22);
	}
	
	
	@Test
	void personaEsMenorQueOtra() {
	assertTrue(pepe.esMenorQueOtra(tomas));
	}
}