package service;

public class Cuenta {
	private String codigoCuenta;
	private double saldo;
	public Cuenta(String codigoCuenta, double saldo) {
		this.codigoCuenta = codigoCuenta;
		this.saldo = saldo;
	}
	public Cuenta(String codigoCuenta) {
		this.codigoCuenta = codigoCuenta;
		this.saldo=50;
	}
	//métodos
	public void ingresar(double cantidad) {
		saldo+=cantidad;
	}
	public void extraer(double cantidad) {
		saldo-=cantidad;
	}
	public double getSaldo() {
		return saldo;
	}
	
}
/*
clase CuentaLimite
Clase que hereda Cuenta. Incorporará un atributo "limite",
para limitar la extracción a dicho valor.
Dispondrá también de un método ajustarLimite(), que fijará el límite
en la mitad del saldo
*/