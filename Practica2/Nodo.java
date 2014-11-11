package trainSimulator1885;

public class Nodo {
	private int info;
	Nodo siguiente; 
	
	public Nodo(int i,Nodo n){
		info = i;
		n = siguiente;
	}

	public int getInfo() {
		return info;
	}

	public void setInfo(int info) {
		this.info = info;
	}

	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
}
