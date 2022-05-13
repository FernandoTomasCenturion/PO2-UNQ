package ar.edu.unq.po2.tp3.ej6;

public class Multioperador {
	
	public Integer sumar(int[] listaDeNumeros) {
		int contador = 0;
		for(int i : listaDeNumeros) {
			contador += i;
		}
		return contador;
	}

	public Integer restar(int[] numeros) {
		int contador = 0;
		for(int i : numeros) {
			contador = contador - i ;
		}
		return contador;
	}
	
	public Integer multiplicar(int[] listaDeNumeros) {
	int contador = 0; 
	for(int i : listaDeNumeros) {
		if (contador ==0) {
			contador = i;
			continue; // pasar al sig. elemento del for.
		}
		contador = contador * i;
	}
	return contador;
	}
}
