public class TestRectangulo2 {
	
	public static void main(String[] args) {
	
		// creamos un objeto Circulo.
		Rectangulo r1 = new Rectangulo();
		r1.setBase(5);
		r1.setAltura(3);
		imprimirRectangulo(r1);
		
		Rectangulo r2 = new Rectangulo();
		r2.setBase(4);
		r2.setAltura(2);
		imprimirRectangulo(r2);
	
	}
	
	public static void imprimirRectangulo(Rectangulo r) {
	
		System.out.printf("El rectangulo de base %d y de altura %d tiene un perimetro de %d y un area de %d%n",r.getBase(),r.getAltura(),r.getPerimetro(),r.getArea());
	
	}

}
