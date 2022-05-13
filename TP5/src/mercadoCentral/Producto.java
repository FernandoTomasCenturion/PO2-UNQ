package mercadoCentral;

public class Producto {
	private String nombre;
	private Double precio;
	private Boolean esPrecioCuidado=false;

	public Producto() {
	}

	public Producto(String nombre, Double precio, Boolean esPrecioCuidado) {
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCuidado = esPrecioCuidado;
	}
	
	public Producto(String nombre, Double precio) {
		this.nombre= nombre;
		this.precio= precio;
	}

	public String getNombre() {
		return nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public Boolean getEsPrecioCuidado() {
		return esPrecioCuidado;
	}

	public void aumentarPrecio(double precioAumento) {
		this.precio += precioAumento;
	}

	public Boolean esPrecioCuidado() {
		return this.getEsPrecioCuidado();
	}


}
