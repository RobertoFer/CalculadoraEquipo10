package Calculadora;

/**
 *  <h3> Clase Suma </h3>
 * 
 * @author Roberto_Fernandez_Aksenova
 * @version 1.0 
 *
 * * Clases del Paquete:
 * @see Suma
 * @see Resta
 * @see Cociente 
 * @see Producto
 * 
 * La clase Suma implementa todos los metodos que estan relacionados con la Suma de la calculadora:
 * <ul>
 * <li> Suma de 2 reales
 * <li> Suma de 2 enteros
 * <li> Suma de 3 reales
 * <li> Suma acumulados
 * </ul>
 * 
 */

public class Suma {
	
	/**
	 * Alamacena los valores acumulados y se los pasa a la funcion acumular.
	 */
	
	static double acumulador  = 0;
	
	/**
	 * Metodo que devuelve la suma de 2 numeros reales positivos;
	 * 
	 * @param numero1 Primer parametro a sumar, tipo double
	 * @param numero2 Segundo parametro a sumar, tipo double
	 * 
	 * @return Devuelve el resultado de la suma de los 2 parametros;
	 */
	public static double sumaR2(double numero1,double numero2) {
		return numero1+numero2;
		
	}
	
	/**
	 *  Metodo que devuelve la suma de 2 numeros enteros positivos;
	 *  
	 * @param numero1 Primer parametro a sumar, tipo double
	 * @param numero2 Segundo parametro a sumar, tipo double
	 * @return
	 */
	public static int sumarE2(int numero1,int numero2) {
		return numero1+numero2;
		
	}
	
	/**
	 * Metodo que devuelve la suma de 3 numeros reales positivos;
	 * 
	 * @param numero1 Primer parametro a sumar, tipo double
	 * @param numero2 Segundo parametro a sumar, tipo double
	 * @param numero3 Tercer  parametro a sumar, tipo double
	 * @return
	 */
	public static double sumaR3(double numero1,double numero2,double numero3) {
		return numero1+numero2+numero3;
	}
	
	/**
	 * Metodo que devuelve la suma del acumulador
	 * 
	 * @param acumulador
	 * @param d 
	 * @return 
	 * @return suma de todos los parametos introducidos
	 */
	public static double acum() {
		return acumulador; 
	}


	
	
	
	
/**  Fin Clase Suma */
	
}
