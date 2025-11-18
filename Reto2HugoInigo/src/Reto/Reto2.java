package Reto;

import java.util.Locale;
import java.util.Scanner;

public class Reto2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		int opcion = 1;
		do {
		String menu = """ 
				Elige la operacion:
				1. Longitud
				2. Peso
				3. Temperatura
				4. Volumen
				0. Salir
				""";
		System.out.println(menu);
		opcion = Funciones.dimeEntero("Opcion: ", sc);
			switch (opcion) {
			case 1 -> Funciones1.menuLongitud(sc);
			case 2 -> Funciones1.menuPeso(sc);
			case 3 -> Funciones2.menuTemperatura(sc);
			case 4 -> Funciones2.menuVolumen(sc);
			default -> System.out.println("Opcion no valida"); 
			}
		} while (opcion!=0);
				
				
		

	}

}
