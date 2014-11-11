package datos;

public class Cliente {
	
	public Cliente(String nombre, String apellido ) {
		super();
		Nombre = nombre;
		Apellido = apellido;
		
	}
	
	String Nombre,Apellido;
	
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	
	

}
