package Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;

import datos.Cliente;

import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Tabla extends JFrame {
	private JTable tableReservaciones;
	
	int cont=0;
	String [][] datos ={};
	 String [] titulos = {"Nombre","Apellido","ID","Fecha Inicio","Fecha Fin","Tipo"};
	 private DefaultTableModel modelo = new DefaultTableModel(datos,titulos);
	 private JTextField textField;
	
	public Tabla() {
		getContentPane().setBackground(new Color(173, 255, 47));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 607, 678);
		getContentPane().setLayout(null);
		
		tableReservaciones = new JTable();
		tableReservaciones.setBounds(26, 438, 531, -409);
		tableReservaciones.setModel(modelo);
		
		
		JScrollPane scrollPane = new JScrollPane();

		scrollPane.setViewportView(tableReservaciones);;
		scrollPane.setBounds(10, 182, 571, 447);
		getContentPane().add(scrollPane);
		
		textField = new JTextField();
		textField.setBounds(29, 50, 146, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Buscar ");
		btnNewButton.setBounds(208, 49, 89, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Eliminar");
		btnNewButton_1.setBounds(324, 49, 89, 23);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Cargar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Menu menu = new Menu();
				menu.extraerArchivo();
			}
		});
		btnNewButton_2.setBounds(440, 49, 89, 23);
		getContentPane().add(btnNewButton_2);
		
	
		
	
		
		}
		

	public void cargarInterfaz(Cliente c){
		 modelo.insertRow(cont, new Object[]{});
		 modelo.setValueAt(c.getNombre(), cont, 0);
		 modelo.setValueAt(c.getApellido(), cont, 1);
		 cont++;
		 
	}
	
	public void mostrarDatos() {
		
		File f = new File("registro.txt");
	    FileReader fr = null;
	   
		
		try{
			 fr = new FileReader(f);
			 BufferedReader bf = new BufferedReader(fr);
			
			String Linea;
			int file =0;
			while((Linea = bf.readLine())!=null){
				StringTokenizer st = new StringTokenizer(Linea," ");
				String nombre = st.nextToken();
				String apellido =st.nextToken();
				tableReservaciones.setValueAt(nombre, file, 0);
				tableReservaciones.setValueAt(apellido, file, 1);
				file++;
			
				
			}
			
		}catch(Exception ex){
			JOptionPane.showMessageDialog(this, "Eror: No se puede leer el archivo");
		}
	      
		
		
		
	}
}
	

