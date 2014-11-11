package Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

import javax.swing.JTable;
import javax.swing.JScrollPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class ReservacionServicios extends JFrame {
	private JTextField textNombre;
	private JTextField textID;
	private JTable table;
	String [][] datos ={};
	String [] titulos = {"Nombre","Apellido","ID","Servicio"};
	private DefaultTableModel modelo = new DefaultTableModel(datos,titulos);

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public ReservacionServicios() {
		getContentPane().setBackground(new Color(224, 255, 255));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 625);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(100, 149, 237));
		panel.setBounds(10, 11, 414, 565);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(24, 30, 46, 14);
		panel.add(lblNewLabel);
		
		textNombre = new JTextField();
		textNombre.setBounds(99, 27, 154, 20);
		panel.add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel(" Servcio");
		lblNewLabel_1.setBounds(24, 120, 46, 14);
		panel.add(lblNewLabel_1);
		
		JComboBox comServicio = new JComboBox();
		comServicio.setBounds(99, 117, 154, 20);
		panel.add(comServicio);
		String[] servicios = {"psicina","jacuzzi","gimnasion","canch de tenis"};
		int cont = 0;
		while(cont < servicios.length){
			comServicio.addItem(servicios[cont]);
			cont++;
		}
		
		JLabel lblNewLabel_2 = new JLabel("precio");
		lblNewLabel_2.setBounds(24, 176, 46, 14);
		panel.add(lblNewLabel_2);
		
		JComboBox comboPrecio = new JComboBox();
		comboPrecio.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentHidden(ComponentEvent arg0) {
				if(comServicio.getSelectedIndex()== 0 ){
					comboPrecio.addItem("$10");
					
				}else if(comServicio.getSelectedIndex() == 1){
					comboPrecio.addItem("$5");
					
				}else if(comServicio.getSelectedIndex() == 2){
					comboPrecio.addItem("$25");
				}else {
					comboPrecio.addItem("$15");
				}
			}
		});
		
	
		comboPrecio.setBounds(99, 173, 154, 20);
		panel.add(comboPrecio);
		
		
		
		
	
		
		
		
		
		
		
		
		
		JLabel lblNewLabel_3 = new JLabel("ID");
		lblNewLabel_3.setBounds(24, 72, 46, 14);
		panel.add(lblNewLabel_3);
		
		textID = new JTextField();
		textID.setBounds(99, 69, 154, 20);
		panel.add(textID);
		textID.setColumns(10);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Nombre = textNombre.getText();
				String ID = textID.getText();
				guardar(Nombre , ID);
			}
		});
		btnNewButton.setBounds(24, 506, 89, 23);
		panel.add(btnNewButton);
		cargarInformacion();
		table = new JTable();
		table.setBounds(10, 244, 394, 251);
		table.setModel(modelo);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 219, 359, 276);
		scrollPane.setViewportView(table);
		panel.add(scrollPane);
			}
	
	public void guardar(String Nombre,String Apellido){
		try{
			FileWriter fw = new FileWriter("Servicios.txt", true);
				PrintWriter pw= new PrintWriter(fw);
				pw.println(Nombre+" "+Apellido);
				pw.close();
		}
		catch(Exception ex){
			JOptionPane.showMessageDialog(this, "Eror: No se puede crear el archivo");
		}
	}
	
	public void cargarInformacion(){
		File f = new File("Servicios.txt");
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
				table.setValueAt(nombre, file, 0);
				table.setValueAt(apellido, file, 1);
				file++;
			
				
			}
			
		}catch(Exception ex){
			JOptionPane.showMessageDialog(this, "Eror: No se puede leer el archivo");
		}
	}
	
	public void llenarCombo(){
		
		
		

		
	}
}
