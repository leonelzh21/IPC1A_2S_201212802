package Alamacenamiento;

public class Lista {
	Nodo inicio;
	Nodo fin;
	
	public Lista(){
		inicio = null;
		fin = null;
	}
	
	public void agregarInicio(String info ){
		Nodo nuevo = new Nodo(info,inicio);
		inicio = nuevo;
		if(fin == null){
			fin  = inicio;
		}
		
	}
	
	public void agregarFin(String info){
		Nodo nuevo = new Nodo(info,null);
		if(inicio == null){
			fin = nuevo ;
			inicio = fin;
		}else{
			fin.setSiguiente(nuevo);
			fin = nuevo;
		}
	}
}
