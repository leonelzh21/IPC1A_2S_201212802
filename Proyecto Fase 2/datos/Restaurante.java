package datos;

public class Restaurante {
	private String Nombre,Ubicacion,Especialidad,horario;	
	int cantidad;
	
	public Restaurante(String nombre, String ubicacion, String especialidad,
			String horario, int cantidad) {
		super();
		Nombre = nombre;
		Ubicacion = ubicacion;
		Especialidad = especialidad;
		this.horario = horario;
		this.cantidad = cantidad;
	}
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getUbicacion() {
		return Ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		Ubicacion = ubicacion;
	}
	public String getEspecialidad() {
		return Especialidad;
	}
	public void setEspecialidad(String especialidad) {
		Especialidad = especialidad;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	} 
	  @Override
	  public String toString() {
	        return Nombre+" "+Especialidad;
	    }

}
