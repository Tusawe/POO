public class TestRectangulo {
	
	public static void main(String[] args) {
	
		// creamos un objeto Circulo.
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo();
		
		// asignamos valor al radio
		r1.setBase(5);
		r1.setAltura(3);
		r2.setBase(4);
		r2.setAltura(2);
		
		// y lo mostramos
		System.out.printf("El primer rectangulo de base %d y de altura %d tiene un perimetro de %d y un area de %d%n",r1.getBase(),r1.getAltura(),r1.getPerimetro(),r1.getArea());
		System.out.printf("El segundo rectangulo de base %d y de altura %d tiene un perimetro de %d y un area de %d%n",r2.getBase(),r2.getAltura(),r2.getPerimetro(),r2.getArea());
	
	}

}
