package Calculadora;
/**
 *  <h3> Clase Producto </h3>
 * *
* Version 1.0 
* autor Albert Gonzales Medina


 *
 * * Clases del Paquete:
 * @see Suma
 * @see Resta
 * @see Cociente 
 * @see Producto
 * 
 * La clase Producto implementa todos los metodos que estan relacionados con la multiplicacion de la calculadora:
 * <ul>
 * <li> Producto de 2 reales
 * <li> Producto de 2 enteros
 * <li> Producto de 3 reales
 * <li> Potencia
 * </ul>
 */

public class Producto {

	
	/**
	 * Metodo que devuelve la multiplicacion de 2 numeros reales positivos;
	 * 
	 * @param numero1 Primer parametro a multiplicar, tipo double
	 * @param numero2 Segundo parametro a multiplicar, tipo double
	 * 
	 * @return Devuelve el resultado de la multiplicacion de los 2 parametros;
	 */
	public static double productoReales(double numero1,double numero2) {
		return numero1*numero2;
		
	}

	
	/**
	 * Metodo que devuelve la multiplicacion de 2 numeros enteros positivos;
	 * 
	 * @param numero1 Primer parametro a multiplicar, tipo int
	 * @param numero2 Segundo parametro a multiplicar, tipo int
	 * 
	 * @return  Devuelve el resultado de la multiplicacion de los 2 parametros;
	 */
	public static int productoEnteros2(int numero1,int numero2) {
		return numero1*numero2;
		
	}

	/**
	 * Metodo que devuelve la multiplicacion de 3 numeros reales positivos;
	 * 
	 * @param numero1 Primer parametro a multiplicar, tipo double
	 * @param numero2 Segundo parametro a multiplicar, tipo double
	 * @param numero3 Tercer parametro a multiplicar, tipo double
	 * 
	 * @return  Devuelve el resultado de la multiplicacion de los 3 parametros;
	 */
	public static double productoReales3(double numero1,double numero2,double numero3) {
		return numero1*numero2*numero3;
		
	}
	/**
	 * Metodo que tealiza la potencia del parametro real intoducido;
	 * 
	 * Si la base es 0 la pontencia tambien.
	 * Si el exponente es 0 la potencia es 1.
	 * 
	 * @param base Numero que se multiplica por si mismo las veces que indica el exponente.
	 * @param exponente Numero de veces que se multiplica la base.
	 * 
	 * @return  Devuelve la potencia del numero introducido
	 */
	public static double potenciaReales(double x,double z) {
		double resultado=1;
		for(int i=0;i<=z;i++) {
			resultado=resultado*x;
		}
		return resultado;
		
	}
/** Final Clase Producto*/
}





