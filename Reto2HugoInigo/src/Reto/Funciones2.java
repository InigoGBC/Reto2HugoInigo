package Reto;

import java.util.Scanner;

public class Funciones2 {
	
	public static double celsiusFarenheit(double celsius) {
		return (celsius*9/5)+32;
	}
	public static double farenheitCelsius(double farenheit) {
		return (farenheit-32)*5/9;
	}
	public static double litrosgalones(double litros) {
		return litros/3.785;
	}
	public static double galoneslitros(double galones) {
		return galones*3.785;
	}
	
	public static void menuTemperatura(Scanner sc) {
		String menu = """ 
				Elige la operacion:
				1. De celsius a farenheit
				2. De farenheit a cesius
				0. Volver
				""";
		System.out.println(menu);
		int opcion = Funciones.dimeEntero("Opcion: ", sc);
		switch (opcion) {
		case 1 -> System.out.println("Resultado: "+celsiusFarenheit(Funciones.dimeDouble("Cantidad: ", sc)));
		case 2 -> System.out.println("Resultado: "+farenheitCelsius(Funciones.dimeDouble("Cantidad: ", sc)));
		case 3 -> Reto2.main(null);
		default -> System.out.println("Opcion no valida"); 
		}
		return;
		}
	
	public static void menuVolumen(Scanner sc) {
		String menu = """ 
				Elige la operacion:
				1. De litros a galones
				2. De galones a litros
				0. Volver
				""";
		System.out.println(menu);
		int opcion = Funciones.dimeEntero("Opcion: ", sc);
		switch (opcion) {
		case 1 -> System.out.println("Resultado: "+litrosgalones(Funciones.dimeDouble("Cantidad: ", sc)));
		case 2 -> System.out.println("Resultado: "+galoneslitros(Funciones.dimeDouble("Cantidad: ", sc)));
		case 3 -> Reto2.main(null);
		default -> System.out.println("Opcion no valida"); 
		}
		return;
		}
	}