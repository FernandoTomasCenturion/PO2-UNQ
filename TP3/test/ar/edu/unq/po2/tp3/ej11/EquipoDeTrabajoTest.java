package ar.edu.unq.po2.tp3.ej11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class EquipoDeTrabajoTest {

	private EquipoDeTrabajo equipo1;
	private Persona tomas;
	private Persona diego;
	private Persona pepe;
	private Persona juan;
	private Persona pepito;
	
	@BeforeEach
	void setUp() {
		equipo1 = new EquipoDeTrabajo("equipo1");
		tomas = new Persona("Centurion", "Tomas", 24);
		diego = new Persona("Kippes", "Diego", 26);
		pepe = new Persona("Perez", "Pepe", 45);
		juan = new Persona("Perez", "Juan", 45);
		pepito = new Persona("Perez", "Pepito", 42); 
	}

	@Test
	void mostrarEquipoDeTrabajo() {
		assertEquals(equipo1.getNombre(), "equipo1");
		assertEquals(equipo1.tamanhoDelEquipo(), 0);
	}
	@Test
	void agregarPersonasAEquipoDeTrabajo() {
	   equipo1.agregarPersonas(tomas);
	   equipo1.agregarPersonas(diego);
	   equipo1.agregarPersonas(pepe);
	   equipo1.agregarPersonas(juan);
	   equipo1.agregarPersonas(pepito);
	   assertEquals(equipo1.tamanhoDelEquipo(), 5);
	   assertEquals(equipo1.calcularPromedioEdad(), 36);
	}
}