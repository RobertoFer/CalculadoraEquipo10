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

			break;
			
		case '-':
			System.out.println("///////////Resta///////////");
			
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
