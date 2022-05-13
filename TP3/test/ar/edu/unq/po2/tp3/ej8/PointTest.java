package ar.edu.unq.po2.tp3.ej8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PointTest {

	private Point point;
	// private Point point39; // las variables son privadas.
	private Point point45;

	@BeforeEach
	void setUp() {
		point = new Point();
		// point39 = new Point(3, 9);
		point45 = new Point(4, 5);
	}

	@Test
	void nuevaCoordenada() {
		assertEquals(point.getX(), 0);
		assertEquals(point.getY(), 0);
	}

	@Test
	void moverCoordenada() {
		point.moverAPosicion(3, 9);
		assertEquals(point.getX(), 3);
		assertEquals(point.getY(), 9);
	}

	@Test
	void sumarCoordenada() {
		point.sumarPuntos(point45);
		assertEquals(point.getX(), 4);
		assertEquals(point.getY(), 5);
	}
}
