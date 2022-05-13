package ar.edu.unq.po2.tp3.ej11;

import java.util.ArrayList;
import java.util.List;

public class EquipoDeTrabajo {
	private String nombre;
	private List<Persona> personas;

	public EquipoDeTrabajo(String nombre) {
		this.personas = new ArrayList<>();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public Integer tamanhoDelEquipo() {
		return personas.size();
	}

	public void agregarPersonas(Persona persona) {
		personas.add(persona);
	}

	public Integer sumaDeEdades() {
		Integer suma = 0;
		for (Persona persona : personas) {
			suma += persona.getEdad();
		}
		return suma;
	}

	public Integer calcularPromedioEdad() {
		return (this.sumaDeEdades() / this.tamanhoDelEquipo());
	}

}
