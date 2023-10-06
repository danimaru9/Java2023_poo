package service;

public class CuentaMovimientos extends CuentaLimite {

	public CuentaMovimientos(String codigoCuenta, double saldo, double limite) {
		super(codigoCuenta, saldo, limite);
	}
	public void obtenerMovimientos() {
		
	}
	
}
/*
Clase CuentaMovimientos
Clase que hereda CuentaLimite. Incopora un nuevo método obtenerMovimientos
que devolverá un ArraList con los movimientos realizados
en la cuenta
Cada movimiento se define por: cantidad, fechaHora, tipo (ingreso o extracción)
*/
