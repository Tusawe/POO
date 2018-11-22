public class TestCirculo {
	
	public static void main(String[] args) {
	
		// creamos un bojeto Circulo.
		Circulo c = new Circulo();
		
		// asignamos valor al radio
		c.setRadio(5);
		
		// solicitamos perimetro y area
		double perimetro = c.getPerimetro();
		double area = c.getArea();
		
		// y lo mostramos
		System.out.printf("El círculo de radio %d tiene de perimetro %.2f y de area %.2f%n",c.getRadio(),perimetro,area);
	
	}

}
