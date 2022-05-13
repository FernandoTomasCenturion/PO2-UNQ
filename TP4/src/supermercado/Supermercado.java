package supermercado;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	private String nombre;
	private String direccion;
	private List<Producto> productos;
	

	public Supermercado(String nombre, String direccion) {
		this.nombre= nombre;
		this.direccion= direccion;
		this.productos= new ArrayList<>();
	}
	
	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}
	public Integer getCantidadDeProductos() {
		// TODO Auto-generated method stub
		return this.productos.size();
	}
	public Double getPrecioTotal() {
		Double precioTotal= 0.0;
		for (Producto producto : productos) {
			precioTotal += producto.getPrecio();
		}
		return precioTotal;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public List<Producto> getProductos() {
		return productos;
	}
}
