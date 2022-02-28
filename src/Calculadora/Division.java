package Calculadora;

/**
 *  <h3> Clase Division </h3>
 * 	
 * @version 1.2
 * @author Ricard Penin Honrubia
 * 
 * * Clases del Paquete:
 * @see Producto
 * @see Cociente
 * @see Suma
 * @see Rest
 * 
 * 
 * Clase de objeto para hacer divisiones simples pasando parametros como el dividendo y el divisor.
 * <ul>
 * <li> Division de 2 reales
 * <li> Division de 2 enteros
 * <li> Division de 3 reales
 * <li> Division acumulada
 * </ul>
 * 
 */
public class Division {
	
	/**
	 * Atributo encargado de guardar el último resultado reistrado o acumulado.
	 */
	private static double ans;
	

	/**
	 * Función para dividir un número real primitivo.
	 * @param dividendo número real ha ser dividido.
	 * @param divisor número real por el que se divide el dividendo.
	 * @return devuele el resultado de dividir el dividendo entre las veces que dicta el divisor.
	 */
	public double dividir(double dividendo, double divisor) {
		return dividendo / divisor;
	}
	
	/**
	 * Función para dividir un número entero primitivo.
	 * @param dividendo número entero ha ser dividido.
	 * @param divisor número entero por el que se divide el dividendo.
	 * @return devuele el resultado de dividir el dividendo entre las veces que dicta el divisor.
	 */
	public int dividir(int dividendo, int divisor) {
		return dividendo / divisor;
	}
	
	/**
	 * Función para dividir un número real primitivo entre dos divisores.
	 * @param dividendo número que ha ser dividido.
	 * @param primerDivisor número real que divide el dividendo en primer lugar.
	 * @param segundoDivisor número real que divide el dividendo en segundo lugar.
	 * @return devuele el resultado de dividir el dividendo entre las veces que dicta cada divisor.
	 */
	public double dividir(double dividendo, double primerDivisor, double segundoDivisor) {
		return (dividendo / primerDivisor) / segundoDivisor;
	}
	
	/**
	 * Método para dividir el atributo Ans 
	 * @param divisor número real de veces a dividir
	 */
	public void dividir(double divisor) {
		ans /= divisor;
	}

	/**
	 * @return valor primitvo y real de ans
	 */
	public static double getAns() {
		return ans;
	}

	/**
	 * @param valor primitvo real de ans ha establecer
	 */
	public static void setAns(double ans) {
		Division.ans = ans;
	}	
}
