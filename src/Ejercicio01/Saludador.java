package Ejercicio01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Button;
import java.awt.Cursor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Saludador extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfNombre;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Saludador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSaludar = new JButton("¡Saludar!");
		btnSaludar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String nombre = tfNombre.getText();
				
				if(!nombre.isEmpty()) {
					
					JOptionPane.showMessageDialog(btnSaludar,"Saludos, " + nombre);
					
				}else {
					
					JOptionPane.showMessageDialog(btnSaludar,"Ingresa un nombre");
					
				}
				
			}
		});
		btnSaludar.setBackground(Color.WHITE);
		btnSaludar.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnSaludar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSaludar.setBounds(167, 182, 89, 23);
		contentPane.add(btnSaludar);
		
		tfNombre = new JTextField();
		tfNombre.setActionCommand("nombre");
		tfNombre.setBounds(97, 114, 235, 20);
		contentPane.add(tfNombre);
		tfNombre.setColumns(10);
		
		JLabel lblSaludador = new JLabel("Escribe un nombre para saludar");
		lblSaludador.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSaludador.setBounds(121, 42, 191, 23);
		contentPane.add(lblSaludador);
	}
}
