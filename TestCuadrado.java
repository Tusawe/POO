public class TestCuadrado{

	public static void main(String[] args) {
		
		Cuadrado c1 = new Cuadrado(5);
		System.out.printf("Cuadrado 1 de lado %d%n",c1.getLado());
		c1.setLado(15);
		System.out.printf("Cuadrado 1 de lado %d%n",c1.getLado());
		
		Cuadrado c2 = new Cuadrado();
		System.out.printf("Cuadrado 2 de lado %d%n",c2.getLado());
		
	}

}
