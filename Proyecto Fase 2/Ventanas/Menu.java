package Ventanas;


import javax.swing.JFrame;
import javax.swing.JScrollPane;

import java.awt.Color;

import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

import javax.swing.JComboBox;

import Alamacenamiento.*;
import datos.Cliente;
public class Menu extends JFrame {
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtID;

	private String Nombre,Apellido,ID;
	private int dia=0,mes=0,año=0;
	private JFormattedTextField fechaFormattedTextField =null;
	private String [][] datos ={};
	private String [] titulos = {"Nombre","Apellido","ID","Fecha Inicio","Fecha Fin","Tipo"};
	private DefaultTableModel modelo = new DefaultTableModel(datos,titulos);
	Lista listacliente = new Lista();
	public static LinkedList lclientes = new LinkedList();
	Cliente cliente;
	int cont=0;
	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 *
	 */
	
	
	
	public Menu() {
		setTitle("Reservacion");
		getContentPane().setBackground(new Color(240, 255, 240));
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		setBounds(100, 100, 476, 551);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 255, 51));
		panel.setBounds(31, 11, 391, 462);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 35, 46, 14);
		panel.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(122, 32, 202, 20);
		panel.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(10, 87, 46, 14);
		panel.add(lblApellido);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(122, 84, 202, 20);
		panel.add(txtApellido);
		txtApellido.setColumns(10);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(10, 141, 46, 14);
		panel.add(lblId);
		
		txtID = new JTextField();
		txtID.setBounds(122, 138, 202, 20);
		panel.add(txtID);
		txtID.setColumns(10);
		
		JLabel lblFecha = new JLabel("Fecha Inicio");
		lblFecha.setBounds(10, 191, 63, 14);
		panel.add(lblFecha);
		
		JButton btnNewButton = new JButton("Nuevo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtNombre.setText("");
				txtApellido.setText("");
				txtID.setText("");
			}
		});
		btnNewButton.setBounds(10, 403, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Guardar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Nombre = txtNombre.getText();
				Apellido = txtApellido.getText();
			
				cliente = new Cliente(Nombre,Apellido);
				lclientes.add(cliente);
				grabarArchivo(cliente);
				
				
				
			
				
				
			}
		});
		btnNewButton_1.setBounds(122, 403, 89, 23);
		panel.add(btnNewButton_1);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setToolTipText("00/00/0000");
		formattedTextField.setBounds(122, 188, 202, 20);
		panel.add(formattedTextField);
		
		JLabel lblTipo = new JLabel(" Tipo");
		lblTipo.setBounds(10, 277, 46, 14);
		panel.add(lblTipo);
		
		JLabel lblFechacFin = new JLabel("Fechac Fin");
		lblFechacFin.setBounds(10, 237, 63, 14);
		panel.add(lblFechacFin);
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		formattedTextField_1.setBounds(122, 234, 202, 20);
		panel.add(formattedTextField_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(122, 274, 202, 20);
		panel.add(comboBox);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Tabla t = new Tabla();
				t.setVisible(true);
			
				for(int i=0; i<lclientes.size();i++){
					cliente = (Cliente)lclientes.get(i);
					
					t.cargarInterfaz(cliente);
					
				}
			}
		});
		btnMostrar.setBounds(235, 403, 89, 23);
		panel.add(btnMostrar);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(122, 329, 202, 20);
		panel.add(comboBox_1);
		
		JLabel lblNumHabitacion = new JLabel("Num Habitacion");
		lblNumHabitacion.setBounds(10, 332, 74, 14);
		panel.add(lblNumHabitacion);
		
		
		
		
		
	}
	
	public void grabarArchivo(Cliente c){
		try{
			FileWriter fw = new FileWriter("registro.txt", true);
				PrintWriter pw= new PrintWriter(fw);
				pw.println(c.getNombre()+" "+c.getApellido());
				pw.close();
		}
		catch(Exception ex){
			JOptionPane.showMessageDialog(this, "Eror: No se puede crear el archivo");
		}
		
	}
	
	public void extraerArchivo(){
		String Linea;
		File f;
		javax.swing.JFileChooser j= new javax.swing.JFileChooser();
		j.showOpenDialog(j);
		
		String path= j.getSelectedFile().getAbsolutePath();
		String lectura="";
		f = new File(path);


		try{
			FileReader fr = new FileReader(path);
			BufferedReader bf = new BufferedReader(fr);
			while((Linea = bf.readLine())!=null){
				StringTokenizer st = new StringTokenizer(Linea," ");
				String nombre = st.nextToken();
				String apellido =st.nextToken();
				
				cliente = new Cliente(nombre,apellido);
				Tabla tabla = new Tabla();
				
				
			}
			bf.close();
			fr.close();
		}catch(Exception ex){
			JOptionPane.showMessageDialog(this, "Eror: No se puede leer el archivo");
		}
		
	}
}
