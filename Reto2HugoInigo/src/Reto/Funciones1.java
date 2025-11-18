package Reto;

import java.util.Scanner;

public class Funciones1 {

	
	public static double MillasaKm(double n1) {
		return n1*1.60934;
	}
	
	public static double KmaMilla(double n1 ) {
		return n1*0.62137;
	}
	
	public static double KilogramosAlibras(double n1) {
		return n1*2.20462;
	}
	public static double LibrasaKilogramos(double n1) {
		return n1*0.453592;
	}
	public static void menuLongitud(Scanner sc) {
		String menu = """ 
				Elige la operacion:
				1. De millas a km
				2. De km a millas
				0. Volver
				""";
		System.out.println(menu);
		int opcion = Funciones.dimeEntero("Opcion: ", sc);
		switch (opcion) {
		case 1 -> System.out.println("Resultado: "+MillasaKm(Funciones.dimeDouble("Cantidad: ", sc)));
		case 2 -> System.out.println("Resultado: "+KmaMilla(Funciones.dimeDouble("Cantidad: ", sc)));
		case 3 -> Reto2.main(null);
		default -> System.out.println("Opcion no valida"); 
		}
		return;
		}
	public static void menuPeso(Scanner sc) {
		String menu = """ 
				Elige la operacion:
				1. De kg a libras
				2. De libras a kg 
				0. Volver
				""";
		System.out.println(menu);
		int opcion = Funciones.dimeEntero("Opcion: ", sc);
		switch (opcion) {
		case 1 -> System.out.println("Resultado: "+KilogramosAlibras(Funciones.dimeDouble("Cantidad: ", sc)));
		case 2 -> System.out.println("Resultado: "+LibrasaKilogramos(Funciones.dimeDouble("Cantidad: ", sc)));
		case 3 -> Reto2.main(null);
		default -> System.out.println("Opcion no valida"); 
		}
		return;
		}
}

