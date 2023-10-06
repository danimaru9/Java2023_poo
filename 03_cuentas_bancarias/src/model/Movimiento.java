package model;

import java.time.LocalDate;

public class Movimiento {
	private double cantidad;
	private LocalDate fecha;
	private String tipo;
	public Movimiento(double cantidad, LocalDate fecha, String tipo) {
		super();
		this.cantidad = cantidad;
		this.fecha = fecha;
		this.tipo = tipo;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
