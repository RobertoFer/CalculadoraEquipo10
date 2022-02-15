package Calculadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		
		
		System.out.println("/////////////////////// Calculadora/////////////////////////7");
		System.out.println(" ");
		System.out.println(" ");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Selecciones una opcion de operacion");
		
		System.out.println("+ : Suma"+"\n- : resta"+"\n* : multiplicacion"+"\n/ : Division");
		System.out.println();
		char te = input.next().charAt(0);
		
		switch(te) {
		case '+':
			System.out.println("///////////Suma///////////////");

				System.out.println(Suma.sumaR2(5, 4.5));

				System.out.println(Suma.sumarE2(5, 7));

				System.out.println(Suma.sumaR3(4.5, 7.8, 4.3));

				System.out.println(Suma.acumulador = Suma.acumulador + Suma.sumaR3(4.5, 7.8, 4.3) + Suma.sumarE2(5, 7) + +Suma.sumaR2(5, 4.5));

			break;
			
		case '-':
			System.out.println("///////////Resta///////////");
			System.out.println(Resta.restaR2(5, 4.5));

			System.out.println(Resta.restaE2(5, 7));

			System.out.println(Resta.restaR3(4.5, 7.8, 4.3));

			System.out.println(Resta.acumulador = Suma.acumulador + Suma.sumaR3(4.5, 7.8, 4.3) - Suma.sumarE2(5, 7) - Suma.sumaR2(5, 4.5));
			break;
			
		case '*':
			System.out.println("///////////Multiplicacion///////////");

			break;
			
		case '/':
			System.out.println("///////////Division///////////");

			break;
		} 
		
		
		
		
	}

}
