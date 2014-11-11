package Ventana;


import Vagones.*;
import java.awt.BorderLayout;
import java.awt.Color;






import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;




public class Frame extends JFrame {

	JButton retroceder = new JButton ("<<< Retroceder");
	JButton avanzar = new JButton("Avanzar >>>");
	 private JMenuBar barra1;
	 private JMenu menu1;
	 JMenuItem item1;
	 private Container Contenedor;
	 String dato;
	 
	 	
	    
	public static void main(String[] args) throws IOException {
		
		Frame f = new Frame ();
		f.definirInicio();
	
	}
	
	public Frame (){
		super ("Train Simulator 1885");
		setSize(500,500);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
		setVisible(true);
		
		agregarMenu();
		
		
		
	}
	
	public void agregarMenu(){
		
		barra1 = new JMenuBar();
		menu1 = new JMenu("File");
		item1 = new JMenuItem("Cargar");
		barra1.add(menu1);
		
		menu1.add(item1);
		setJMenuBar(barra1);
		setLocationRelativeTo(null);
		
		
		setVisible(true);
	}
	
	public void definirInicio() throws IOException{
		Contenedor = this.getContentPane();
		Contenedor.setSize(100, 100);
		Contenedor.setLayout(new BorderLayout(5,5));
		Contenedor.add(retroceder,BorderLayout.SOUTH);
		
		Contenedor.add(avanzar,BorderLayout.NORTH);
		cargar();
		Contenedor.add(new Dibujo());
		setVisible(true);
		
	}
	
	public void cargar() throws IOException  { 
		
		ActionListener escuchador = new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Archivo archivo = new Archivo("C:\\Users\\Alejandro\\workspace\\Train Simulator1885.txt");
				boolean bandera = true;
				String Linea;
				VagonClase1 vagonc1 = new VagonClase1();
				VagonClase3 vagonc3 = new VagonClase3();
				try {
					if (archivo.leerLinea() != null){
					do{
						try {
							Linea = archivo.leerLinea();
							String instrucciones [] = Linea.split(" ");
							if (Linea != null){
								
								
									if(instrucciones[0].equals("Estacion")){
										
									}else if(instrucciones[2].equals("clase1")){
											vagonc1.agergarVagon(instrucciones[0], instrucciones[1],instrucciones[2]);
											
										}else{
											vagonc3.agregarVagon(instrucciones[0], instrucciones[1],instrucciones[2]);
										}
											
									
										
									
									
								}
								else bandera = false;
							
							
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
							
					}while(bandera== true);
					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
		};this.avanzar.addActionListener(escuchador);
		
		
				
		
		
		
		
	}


	
	
	
	
	
	
			
			
			
		
			
		
		
		
	}
	

	
	

