package model;

import java.time.LocalDateTime;

public class Movimiento {
	private double cantidad;
	private LocalDateTime fecha;
	private String tipo;
	public Movimiento(double cantidad, LocalDateTime localDateTime, String tipo) {
		super();
		this.cantidad = cantidad;
		this.fecha = localDateTime;
		this.tipo = tipo;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
