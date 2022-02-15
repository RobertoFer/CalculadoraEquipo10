package Calculadora;

/**
 *  <h3> Clase Resta </h3>
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
 * La clase Resta implementa todos los metodos que estan relacionados con la Resta de la calculadora:
 * <ul>
 * <li> Resta de 2 reales
 * <li> Resta de 2 enteros
 * <li> Resta de 3 reales
 * <li> Resta acumulados
 * </ul>
 * 
 */

public class Resta {
	
		/**
		 * Alamacena los valores acumulados y se los pasa a la funcion acumular.
		*/
		static double acumulador  = 0;
	
		
		/**
		 * Metodo que devuelve la resta de 2 numeros reales positivos;
		 * 
		 * @param numero1 Primer parametro a restar, tipo double
		 * @param numero2 Segundo parametro a restar, tipo double
		 * 
		 * @return Devuelve el resultado de la resta de los 2 parametros;
		 */
		public static double restaR2(double numero1,double numero2) {
			return numero1-numero2;
		}
		
		
		/**
		 * Metodo que devuelve la resta de 2 numeros reales positivos;
		 * 
		 * @param numero1 Primer parametro a restar, tipo int 
		 * @param numero2 Segundo parametro a restar, tipo int
		 * 
		 * @return Devuelve el resultado de la resta de los 2 parametros;
		 */
		public static int restaE2(int numero1,int numero2) {
			return numero1-numero2;
			
		}
		
		
		/**
		 * Metodo que devuelve la resta de 3 numeros reales positivos;
		 * 
		 * @param numero1 Primer parametro a restar, tipo double
		 * @param numero2 Segundo parametro a restar, tipo double
		 * @param numero2 Tercer parametro a restar, tipo double
		 * 
		 * @return Devuelve el resultado de la resta de los 3 parametros;
		 */
		public static double restaR3(double numero1,double numero2,double numero3) {
			return numero1-numero2-numero3;
			
		}
		
		 
		 /**
		 * Metodo que devuelve la resta del acumulador
		 * 
		 * @param acumulador
		 * @return resta de todos los parametos introducidos
		 */
		public static double acum() {
			return acumulador; 
		}
		
		
		
		
	}

