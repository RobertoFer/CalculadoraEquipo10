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
	 * Atributo encargado de guardar el �ltimo resultado reistrado o acumulado.
	 */
	private static double ans;
	

	/**
	 * Funci�n para dividir un n�mero real primitivo.
	 * @param dividendo n�mero real ha ser dividido.
	 * @param divisor n�mero real por el que se divide el dividendo.
	 * @return devuele el resultado de dividir el dividendo entre las veces que dicta el divisor.
	 */
	public double dividir(double dividendo, double divisor) {
		return dividendo / divisor;
	}
	
	/**
	 * Funci�n para dividir un n�mero entero primitivo.
	 * @param dividendo n�mero entero ha ser dividido.
	 * @param divisor n�mero entero por el que se divide el dividendo.
	 * @return devuele el resultado de dividir el dividendo entre las veces que dicta el divisor.
	 */
	public int dividir(int dividendo, int divisor) {
		return dividendo / divisor;
	}
	
	/**
	 * Funci�n para dividir un n�mero real primitivo entre dos divisores.
	 * @param dividendo n�mero que ha ser dividido.
	 * @param primerDivisor n�mero real que divide el dividendo en primer lugar.
	 * @param segundoDivisor n�mero real que divide el dividendo en segundo lugar.
	 * @return devuele el resultado de dividir el dividendo entre las veces que dicta cada divisor.
	 */
	public double dividir(double dividendo, double primerDivisor, double segundoDivisor) {
		return (dividendo / primerDivisor) / segundoDivisor;
	}
	
	/**
	 * M�todo para dividir el atributo Ans 
	 * @param divisor n�mero real de veces a dividir
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
