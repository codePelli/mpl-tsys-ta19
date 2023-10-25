package Ejercicio02;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class Peliculas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfPeli;
	
	private JComboBox<String> comboPeli;
	private ArrayList<String> listPelis;


	public Peliculas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 223);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setTitle("Peliculas");

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPeli = new JLabel("Escribe el titulo de una pelicula");
		lblPeli.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPeli.setBounds(10, 50, 186, 14);
		contentPane.add(lblPeli);
		
		tfPeli = new JTextField();
		tfPeli.setBounds(20, 75, 157, 20);
		contentPane.add(tfPeli);
		tfPeli.setColumns(10);
		
		JButton btnAnadir = new JButton("Añadir");
		btnAnadir.setBounds(56, 132, 89, 23);
		contentPane.add(btnAnadir);
		
		JLabel lblPeliculas = new JLabel("Peliculas");
		lblPeliculas.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPeliculas.setBounds(316, 50, 59, 14);
		contentPane.add(lblPeliculas);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(280, 74, 124, 22);
		contentPane.add(comboBox);
		
		listPelis = new ArrayList<String>();
		
		btnAnadir.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String tituloPeli = tfPeli.getText();
				
				if(!tituloPeli.isEmpty()) {
					
					listPelis.add(tituloPeli);
					updateCombo(comboBox);
					tfPeli.setText("");
					
				}else if(tituloPeli.isEmpty()){
			
					JOptionPane.showMessageDialog(comboBox, "Debes de ingresar una pelicula");
				}
			}
			
		});
		
	}
	
	private void updateCombo(JComboBox<String> comboBox) {
		
		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(listPelis.toArray(new String[0]));
		comboBox.setModel(model);
	}
}
