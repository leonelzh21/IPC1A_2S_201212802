package Ventanas;


import java.awt.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;

import javax.swing.JList;

import java.awt.Color;


import javax.swing.border.LineBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import datos.Restaurante;

import javax.swing.JScrollPane;

import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class Restaurantes extends JFrame {
	private JTextField txtHorario;
	private JTextField txtEspecialidad;
	private JTextField txtCapacidad;
	private JTextField txtUbicacion;
	String datos[] ={};
	DefaultListModel modelolista = new DefaultListModel();
	

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public Restaurantes() {
		getContentPane().setBackground(new Color(245, 222, 179));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 566, 496);
		getContentPane().setLayout(null);
		
		
		
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBounds(215, 0, 325, 200);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(10, 21, 46, 14);
		panel.add(lblNewLabel);
		
		JTextArea txtNombreR = new JTextArea();
		txtNombreR.setBounds(85, 16, 200, 20);
		panel.add(txtNombreR);
		
		JLabel lblHorario = new JLabel("Horario");
		lblHorario.setBounds(10, 52, 46, 14);
		panel.add(lblHorario);
		
		JLabel lblNewLabel_1 = new JLabel("Especialidad");
		lblNewLabel_1.setBounds(10, 90, 65, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Capacidad");
		lblNewLabel_2.setBounds(10, 123, 65, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Ubicacion\r\n");
		lblNewLabel_3.setBounds(10, 159, 46, 14);
		panel.add(lblNewLabel_3);
		
		txtHorario = new JTextField();
		txtHorario.setBounds(85, 47, 200, 20);
		panel.add(txtHorario);
		txtHorario.setColumns(10);
		
		txtEspecialidad = new JTextField();
		txtEspecialidad.setBounds(85, 87, 200, 20);
		panel.add(txtEspecialidad);
		txtEspecialidad.setColumns(10);
		
		txtCapacidad = new JTextField();
		txtCapacidad.setBounds(85, 120, 200, 20);
		panel.add(txtCapacidad);
		txtCapacidad.setColumns(10);
		
		txtUbicacion = new JTextField();
		txtUbicacion.setBounds(85, 150, 200, 20);
		panel.add(txtUbicacion);
		txtUbicacion.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.ORANGE);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBounds(215, 211, 325, 236);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Nombre");
		lblNewLabel_4.setBounds(10, 28, 46, 14);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Horario");
		lblNewLabel_5.setBounds(10, 65, 46, 14);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Especialidad");
		lblNewLabel_6.setBounds(10, 107, 72, 14);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Capacidad");
		lblNewLabel_7.setBounds(10, 156, 72, 14);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Ubicacion");
		lblNewLabel_8.setBounds(10, 197, 72, 14);
		panel_1.add(lblNewLabel_8);
		
		JLabel lblN = new JLabel("");
		lblN.setBounds(92, 28, 180, 14);
		panel_1.add(lblN);
		
		JLabel lblH = new JLabel("");
		lblH.setBounds(92, 65, 180, 14);
		panel_1.add(lblH);
		
		JLabel lblES = new JLabel("");
		lblES.setBounds(92, 107, 180, 14);
		panel_1.add(lblES);
		
		JLabel lblCap = new JLabel("");
		lblCap.setBounds(92, 156, 180, 14);
		panel_1.add(lblCap);
		
		JLabel lblUbi = new JLabel("");
		lblUbi.setBounds(92, 197, 180, 14);
		panel_1.add(lblUbi);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			String Nombre,Horario,Especialidad,Ubicacion;
			int Cantidad;
			Nombre = txtNombreR.getText();
			Horario = txtHorario.getText();
			Especialidad = txtEspecialidad.getText();
			Ubicacion = txtUbicacion.getText();
			Cantidad = Integer.parseInt(txtCapacidad.getText());
			Restaurante restaurante = new Restaurante(Nombre,Ubicacion,Especialidad,Horario,Cantidad);
			modelolista.addElement(restaurante);
				
			}
		});
		btnNewButton.setBounds(35, 300, 89, 23);
		getContentPane().add(btnNewButton);
		
		JList list = new JList();
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent arg0) {
				int index= list.getSelectedIndex();
				 Restaurante objUsuario=(Restaurante)modelolista.getElementAt(index);
				 
				 lblN.setText(objUsuario.getNombre());
				 lblH.setText(objUsuario.getHorario());
				 lblES.setText(objUsuario.getEspecialidad());
				
				 lblUbi.setText(objUsuario.getUbicacion());
			}
		});
		
		list.setBackground(Color.ORANGE);
		list.setBounds(25, 211, 113, -192);
		list.setModel(modelolista);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(28, 11, 132, 252);
		scrollPane.setViewportView(list);
		getContentPane().add(scrollPane);
		
		
		
		
	}
	
}
