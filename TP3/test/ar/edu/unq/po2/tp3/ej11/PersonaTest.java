package ar.edu.unq.po2.tp3.ej11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonaTest {

	private Persona tomas;

	@BeforeEach
	void setUp() {
		tomas = new Persona("Centurion", "Tomas", 24);
	}

	@Test
	void personaConNombreApellidoYEdad() {
		assertEquals(tomas.getApellido(), "Centurion");
		assertEquals(tomas.getNombre(), "Tomas");
		assertEquals(tomas.getEdad(), 24);
	}
}
