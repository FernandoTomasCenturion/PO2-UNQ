package ar.edu.unq.po2.tp3.ej11;

public class Persona {
	private String apellido;
	private String nombre;
	private Integer edad;

	public Persona() {

	}

	public Persona(String apellido, String nombre, Integer edad) {
		this.apellido = apellido;
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getApellido() {
		return apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public Integer getEdad() {
		return edad;
	}

}
