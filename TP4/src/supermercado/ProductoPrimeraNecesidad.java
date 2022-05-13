package supermercado;

public class ProductoPrimeraNecesidad {
	private String nombre;
	private Double precio;
	private Boolean esPrecioCuidado=false;
	
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado) {
		this.nombre= nombre;
		this.precio=precio;
		this.esPrecioCuidado=esPrecioCuidado;
}

	public Double getPrecio() {
		// TODO Auto-generated method stub
		return this.precio *= 0.9;
	}

	public String getNombre() {
		return nombre;
	}

	public Boolean getEsPrecioCuidado() {
		return esPrecioCuidado;
	}

	
	
	
}