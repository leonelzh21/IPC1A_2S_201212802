package Vagones;
import trainSimulator1885.*;
public class VagonClase1 extends VagonPasajeros{
		
	public VagonClase1(){
		
	}
	
	public void agergarVagon(String dato,String pasajaeros,String Clase){
		
		if(dato.equals("Suben")){
			int p = Integer.parseInt(pasajaeros);
			if(p <= 10){
				this.agregarVagones(Clase,p);
				
			}else {
				if(p>10){
					int v;
					do{
					int cont = 10;	
					agregarVagones(Clase,p);
					
					 v = cont + (p-10);
					}while(v != p);
				}
			}
		}
	}
	
}
