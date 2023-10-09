package view;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import model.Movimiento;
import service.CuentaMovimientos;

public class ProgramaCuentaBancaria {
	static CuentaMovimientos cuentamov;
	public static void main(String[] args) {
		//pido código, saldo, límite y creo el objeto CuentaMovimientos
		String codigo;
		double saldo,limite;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce codigo de cuenta:");
		codigo=sc.nextLine();
		System.out.println("Introduce saldo:");
		saldo=Double.parseDouble(sc.nextLine());
		System.out.println("Introduce límite:");
		limite=Double.parseDouble(sc.nextLine());
		cuentamov=new CuentaMovimientos(codigo,saldo,limite);
		//viene menú
		int opcion;
	
		do {
			mostrarMenu();
			opcion=sc.nextInt();
			switch(opcion) {
				case 1:
					ingresar();
					break;
				case 2:
					extraer();
					break;
				case 3:
					saldoMovimientos();
					break;
				case 4:
					System.out.println("Hasta pronto.");
					
					}
		}
		while(opcion!=4); 
			


	}
	static void mostrarMenu() {
		System.out.println("1.- Ingresar.");
		System.out.println("2.- Extraer.");
		System.out.println("3.- Saldo y movimientos.");
		System.out.println("4.- Salir.");
	}
	static void ingresar() {
		Scanner sc=new Scanner(System.in);
		double cantidad;
		System.out.println("Introduce cantidad: ");
		cantidad=Double.parseDouble(sc.nextLine());
		cuentamov.ingresar(cantidad);
	}
	static void extraer() {
		Scanner sc=new Scanner(System.in);
		double cantidad;
		System.out.println("Introduce cantidad: ");
		cantidad=Double.parseDouble(sc.nextLine());
		cuentamov.extraer(cantidad);
	}
	static void saldoMovimientos()	{
		ArrayList<Movimiento> movs=cuentamov.obtenerMovimientos();
		for(Movimiento m:movs) {
			System.out.println("Tipo:"+m.getTipo()+" Cantiad:"+m.getCantidad()+" Fecha:"+m.getFecha());
		}
		System.out.println("Saldo final: "+cuentamov.getSaldo());
		
	}
	

}
/*
Pide nº cuenta y saldo inicial.
1.- Ingresar
2.- Extraer
3.- Saldo y movimientos
4.- Salir
*/