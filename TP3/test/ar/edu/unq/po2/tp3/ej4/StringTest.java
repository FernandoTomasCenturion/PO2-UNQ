package ar.edu.unq.po2.tp3.ej4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringTest {
	String a;
	String s;
	String t;
	
	@BeforeEach 
	 void setUp()  {
		 a = "abc";
		 s = a; 
		 t = "";
	}
	
	@Test
	void longitudStringS() {
		assertEquals(s.length(), 3);
	}
	
	@Test
	void longitudStringT() {
		assertEquals(t.length(), 0);
	}
	
	@Test
	void concatenarNumeroAlString() { 
		assertEquals(1 + a, "1abc");
	}
	
	@Test
	void z () {
		assertEquals(a.toUpperCase(), "ABC");
	}
	
	@Test
	void x() {
		assertEquals("Libertad".indexOf("r"), 4);
	}
	
	@Test
	void y() {
		assertEquals("Universidad".lastIndexOf("i"), 7);
	}
	
	@Test
	void l() {
		assertEquals("Quilmes".substring(2,4), "il");
	}
	
	@Test
	void s() {
		assertEquals((a.length() + a).startsWith("a"), false);
	}
	
	@Test
	void g() {
		assertEquals(s==a, true);
	}

	// El operador "==" compara por la instancia(Es memoria). 
	// El operador "equals" compara por atributos.
	
	
	@Test
	void h(){
		assertEquals(a.substring(1,3).equals("bc"), true);
	}
}


