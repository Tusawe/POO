public class TestPersona {

	public static void main(String[] args) {
		
		Persona p1 = new Persona("Juan Ramon", "Garcia del Amo", 45, "666112233", "11111111H");
		Persona p2 = new Persona("Pedro", "Perez Rodriguez", 56, "677558866", "22222222Y");
		
		System.out.println(p1);
		System.out.println(p2);
		
		p2.setTelefono("666554422");
		System.out.printf("%s, %s ha cambiado de numero al %s",p2.getApellidos(), p2.getNombre(), p2.getTelefono());
	
	}

}
