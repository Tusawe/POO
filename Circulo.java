public class Circulo {

	// atributos
	private int radio;
	
	// métodos
	
	public int getRadio() {
	
		return radio;
	
	}
	
	public void setRadio(int radio) {
	
		this.radio = radio;
	
	}
	
	public double getPerimetro() {
	
		return 2 * Math.PI * radio;

	}
	
	public double getArea() {
	
		return Math.PI * Math.pow(radio,2);
	
	}

}
