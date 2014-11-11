package Alamacenamiento;



public class Nodo {
	private String info;
	Nodo siguiente; 
	
	public Nodo(String i,Nodo n){
		info = i;
		n = siguiente;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
}
