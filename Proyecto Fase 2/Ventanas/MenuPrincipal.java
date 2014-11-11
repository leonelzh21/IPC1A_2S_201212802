package Ventanas;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

public class MenuPrincipal extends JFrame {

	

	
	private static final Graphics Graphics = null;

	public MenuPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(new Color(0, 0, 0));
		setJMenuBar(menuBar);
		
		JMenu mnInicio = new JMenu("Inicio");
		menuBar.add(mnInicio);
		
		JMenuItem mntmReservaciones = new JMenuItem("Reservaciones");
		mntmReservaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Menu menu = new Menu();
				menu.setVisible(true);
			}
		});
		mnInicio.add(mntmReservaciones);
		
		JMenuItem mntmPaquetes = new JMenuItem("Paquetes");
		mnInicio.add(mntmPaquetes);
		
		JMenuItem mntmInformacion = new JMenuItem("Informacion");
		mntmInformacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InformacionHabitacion infoh = new InformacionHabitacion();
				infoh.setVisible(true);
				
			}
		});
		mnInicio.add(mntmInformacion);
		
		JMenu mnServicios = new JMenu("Servicios");
		menuBar.add(mnServicios);
		
		JMenuItem mntmRestaurantes = new JMenuItem("Restaurantes");
		mntmRestaurantes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Restaurantes restaurantes = new Restaurantes();
				restaurantes.setVisible(true);
			}
		});
		mnServicios.add(mntmRestaurantes);
		
		JMenuItem mntmOtros = new JMenuItem("otros");
		mntmOtros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReservacionServicios rs = new ReservacionServicios();
				rs.setVisible(true);
			}
		});
		mnServicios.add(mntmOtros);
		
		ImageIcon imagen = new ImageIcon(new ImageIcon(getClass().getResource("/Ventanas/hotel.jpg")).getImage());
		menuprincipa mp = new menuprincipa(imagen.getImage());
		getContentPane().add(mp);
		

			}
}
