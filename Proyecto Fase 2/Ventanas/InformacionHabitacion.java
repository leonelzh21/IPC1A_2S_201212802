package Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import datos.Habitaciones;
import datos.Servicios;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import java.awt.Color;

public class InformacionHabitacion extends JFrame {
	private JTextField texttipo;
	private JTextField textCarac;
	private JTextField textprecio;
	private JTextField textCamas;
	DefaultListModel modelolista = new DefaultListModel();
	

	/**
	 * Create the frame.
	 */
	public InformacionHabitacion() {
		getContentPane().setBackground(new Color(255, 255, 153));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 550, 603);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 0));
		panel.setBounds(230, 11, 294, 254);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TIpo");
		lblNewLabel.setBounds(10, 21, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Caracteristicas");
		lblNewLabel_1.setBounds(10, 70, 82, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("precio");
		lblNewLabel_2.setBounds(10, 127, 46, 14);
		panel.add(lblNewLabel_2);
		
		texttipo = new JTextField();
		texttipo.setBounds(87, 18, 182, 20);
		panel.add(texttipo);
		texttipo.setColumns(10);
		
		textCarac = new JTextField();
		textCarac.setBounds(87, 67, 182, 20);
		panel.add(textCarac);
		textCarac.setColumns(10);
		
		textprecio = new JTextField();
		textprecio.setBounds(87, 124, 182, 20);
		panel.add(textprecio);
		textprecio.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("No. Camas");
		lblNewLabel_6.setBounds(10, 174, 67, 14);
		panel.add(lblNewLabel_6);
		
		textCamas = new JTextField();
		textCamas.setBounds(87, 171, 182, 20);
		panel.add(textCamas);
		textCamas.setColumns(10);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tipo , Caracteristicas;
				String precio,ncamas;
				
				tipo = texttipo.getText();
				Caracteristicas = textCarac.getText();
				precio = textprecio.getText();
				ncamas = textCamas.getText();
				Habitaciones habitacion = new Habitaciones(tipo,Caracteristicas,ncamas,precio);
				modelolista.addElement(habitacion);
				
			}
		});
		btnNewButton.setBounds(10, 220, 89, 23);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 0));
		panel_1.setBounds(29, 276, 495, 225);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblTipo = new JLabel("");
		lblTipo.setBounds(10, 24, 419, 14);
		panel_1.add(lblTipo);
		
		JLabel lblcarac = new JLabel("");
		lblcarac.setBounds(10, 76, 445, 14);
		panel_1.add(lblcarac);
		
		JLabel lblPrecio = new JLabel("");
		lblPrecio.setBounds(10, 127, 445, 14);
		panel_1.add(lblPrecio);
		
		JLabel lblcamas = new JLabel("");
		lblcamas.setBounds(10, 186, 419, 14);
		panel_1.add(lblcamas);
		
		JList list = new JList();
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent arg0) {
				int index= list.getSelectedIndex();
				Habitaciones habitacion = (Habitaciones)modelolista.getElementAt(index);
				lblTipo.setText("Tipo" +habitacion.getTipo());
				lblcarac.setText("Caracteristicas"+habitacion.getCaracteristicas());
				lblcamas.setText("Numero de Camas "+habitacion.getNumCamas());
				lblPrecio.setText("Precio"+habitacion.getPrecio());
				
			}
		});
		list.setBounds(29, 223, 104, -203);
		list.setModel(modelolista);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(29, 11, 181, 254);
		scrollPane.setViewportView(list);
		getContentPane().add(scrollPane);
		
	}
}
