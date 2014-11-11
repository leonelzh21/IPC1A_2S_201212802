package Vagones;

public class VagonClase3 extends VagonPasajeros{

		public VagonClase3(){
			
			
		}
		
		public void agregarVagon (String dato,String pasajeros, String clase){
			if(dato.equals("Suben")){
				int p = Integer.parseInt(pasajeros);
				if(p <= 40){
					this.agregarVagones(clase,p);
				}else {
					if(p>10){
						int v;
						do{
						int cont = 10;	
						agregarVagones(clase,p);
						 v = cont + (p-40);
						}while(v != p);
					}
				}
			}
		}
	

}
