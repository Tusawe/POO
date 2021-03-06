public class Persona {

	private String nombre;
	private String apellidos;
	private int edad;
	private String telefono;
	private String dni;
	
	public Persona(String nombre, String apellidos, int edad, String telefono, String dni) {
	
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.telefono = telefono;
		this.dni = dni;
		
	}
	
	public String getNombre() {
	
		return nombre;
	
	}
	
	public String getApellidos() {
	
		return apellidos;
	
	}
	
	public int getEdad() {
	
		return edad;
	
	}
	
	public String getTelefono() {
	
		return telefono;
	
	}
	
	public String getDNI() {
	
		return dni;
	
	}
	
	public void setTelefono(String telefono) {
	
		this.telefono = telefono;
	
	}
	
	public boolean esMayorEdad() {
	
		return edad >= 18; 
	
	}
	
	@Override
	public String toString() {
	
		return nombre + " " + apellidos + ", con DNI " + dni + ", tiene " + edad + " años y su número de telefono es " + telefono + ".";
	
	}
	

}
