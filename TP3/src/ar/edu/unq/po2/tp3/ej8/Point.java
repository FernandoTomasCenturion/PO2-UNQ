package ar.edu.unq.po2.tp3.ej8;

public class Point {
	private Integer x = 0; // Por referencia
	private Integer y = 0; // Por referencia significa que en stack de memoria y llama a la memoria heap
							// para pedirle el obj.

	public Point() {
	}

	public Point(Integer x, Integer y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x; // Le pido el valor a la instacia.
	}

	public int getY() {
		return y;
	}

	public void moverAPosicion(Integer x, Integer y) {
		this.x = x;
		this.y = y;
	}

	public void sumarPuntos(Point punto) { // x punto y punto
		this.x += punto.getX();
		this.y += punto.getY();
	}
}
