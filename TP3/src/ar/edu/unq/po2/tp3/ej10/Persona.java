package ar.edu.unq.po2.tp3.ej10;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	private LocalDate fechaDeNacimiento;
	private String nombre;
	
	public Persona() {
		
	}
	public Persona(LocalDate fecha2, String nombre) {
		this.fechaDeNacimiento= fecha2;
		this.nombre = nombre;	
	}
	
	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		LocalDate fechaDeHoy = LocalDate.now();
        Period periodo = Period.between(this.fechaDeNacimiento, fechaDeHoy);
		return periodo.getYears();
	}
	public boolean esMenorQueOtra(Persona persona) {
		// TODO Auto-generated method stub
		int miEdad = this.getEdad(); 
		int edadAComparar = persona.getEdad();
		return (miEdad < edadAComparar);
	}
}