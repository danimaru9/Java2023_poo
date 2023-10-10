package clases;

import interfaces.Operaciones;

public class Mesa implements Operaciones{
	private int largo, alto, ancho;

	public Mesa(int largo, int alto, int ancho) {
		super();
		this.largo = largo;
		this.alto = alto;
		this.ancho = ancho;
	}

	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	
	@Override
	public void girar(int grados) {
		largo+=grados;
		ancho+=grados;
		
	}

	@Override
	public int invertir() {
		alto*=-1;
		return alto;
	}
}
