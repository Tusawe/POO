// javadoc -d docRectangulo -author -version -html5 Rectangulo.java

/**
 * @author José Luis Gómez
 * @version 1.0
*/

public class Rectangulo {

	// atributos
	private int base;
	private int altura;
	
	// métodos
	
	/** Metodo getBase que pide la variable base del objeto rectangulo.
	 * @return int que es el valor de la base.
	*/
	public int getBase() {
	
		return base;
	
	}
	
	/** Metodo getAltura que pide la variable altura del objeto rectangulo.
	 * @return int que es el valor de la altura.
	*/
	public int getAltura() {
	
		return altura;
	
	}
	
	/** Metodo setBase con el que le asginamos valor a la variable base del objeto rectangulo.
	 * @param int que es el valor de la base.
	*/
	public void setBase(int base) {
	
		this.base = base;
	
	}
	
	/** Metodo setAltura con el que le asginamos valor a la variable altura del objeto rectangulo.
	 * @param int que es el valor de la altura.
	*/
	public void setAltura(int altura) {
	
		this.altura = altura;
	
	}
	
	/** Metodo getPerimetro que pide el calculo del perimetro del objeto rectangulo.
	 * @return int que es el valor de la perimetro del objeto rectangulo.
	*/
	public int getPerimetro() {
	
		return (base + altura) * 2;

	}
	
	/** Metodo getArea que pide el calculo del area del objeto rectangulo.
	 * @return int que es el valor de la area del objeto rectangulo.
	*/
	public int getArea() {
	
		return base * altura;
	
	}

}
