package datos;

public class Servicios {
	int Precio;
	String Nombre,NombreServicio;
	
	public Servicios(int precio, String nombre, String nombreServicio) {
		super();
		Precio = precio;
		Nombre = nombre;
		NombreServicio = nombreServicio;
	}
	
	public int getPrecio() {
		return Precio;
	}
	public void setPrecio(int precio) {
		Precio = precio;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getNombreServicio() {
		return NombreServicio;
	}
	public void setNombreServicio(String nombreServicio) {
		NombreServicio = nombreServicio;
	}

}
