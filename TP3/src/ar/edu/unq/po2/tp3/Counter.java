package ar.edu.unq.po2.tp3;
import java.util.ArrayList;
import java.util.List; 

public class Counter {
	
	private List <Integer> numeros = new ArrayList<Integer>();
	
 	 public int contarPares() {
 	 	int cantidad = 0;
     	for (Integer numero : this.getNumeros()) {
     		if (numero % 2 ==0)  cantidad ++;
     	}
     	return cantidad;
 	 }

	private List<Integer> getNumeros() {
		return numeros;
	}

	public Counter addNumber(int i) {
		// TODO Auto-generated method stub
		this.getNumeros().add(i);	
		return this;
	}
	
	public int contarMultiplos(int x) {
 	 	int cantidad = 0;
     	for (Integer numero : this.getNumeros()) {
     		if (numero % x ==0)  cantidad ++;
     	}
     	return cantidad;
 	 }
	
	public int cantPares (int x) {
		int cantidad = 0;
		while (x > 0) {
			int digito = x % 10;
			if (digito % 2 == 0) {
				cantidad ++;
			}
			x = x / 10;
		}
		return cantidad;
	}
}

