package Ventana;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

import javax.swing.JOptionPane;

public class Archivo {
	
	private File archivo ;
	private FileReader lector;
	private BufferedReader blector;
	String Linea;
	
	public Archivo(String Ruta){
		archivo = new File(Ruta);
		try {
			lector = new FileReader(archivo);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "No se pudo leer el Archivo");
		}
		blector = new BufferedReader(lector);
		
	
	}
	
	public String leerLinea()  throws IOException
	{
		
		while(blector.ready()){
			if(!(Linea = blector.readLine()).equals("\000"))
				return Linea;	
			
		}
		blector.close();
		return null;
		
	}

}
