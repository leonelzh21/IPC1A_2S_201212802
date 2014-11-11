package datos;

public class Habitaciones {
	
	String tipo,Caracteristicas;
	String NumCamas,precio;
	
	public Habitaciones(String tipo, String caracteristicas, String numCamas,
			String precio) {
		super();
		this.tipo = tipo;
		Caracteristicas = caracteristicas;
		NumCamas = numCamas;
		this.precio = precio;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCaracteristicas() {
		return Caracteristicas;
	}
	public void setCaracteristicas(String caracteristicas) {
		Caracteristicas = caracteristicas;
	}
	public String getNumCamas() {
		return NumCamas;
	}
	public void setNumCamas(String numCamas) {
		NumCamas = numCamas;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	

}
