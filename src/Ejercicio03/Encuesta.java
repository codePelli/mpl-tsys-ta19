package Ejercicio03;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSlider;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;

public class Encuesta extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Encuesta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 583, 431);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setTitle("Encuesta");

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSo = new JLabel("Elije un sistema operativo:");
		lblSo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSo.setBounds(194, 11, 161, 14);
		contentPane.add(lblSo);
		
		JLabel lblElijeTuEspecialidad = new JLabel("Elije tu especialidad:");
		lblElijeTuEspecialidad.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblElijeTuEspecialidad.setBounds(206, 119, 140, 14);
		contentPane.add(lblElijeTuEspecialidad);
		
		JSlider slider = new JSlider();
		slider.setValue(5);
		slider.setMaximum(10);
		slider.setBounds(155, 288, 205, 26);
		contentPane.add(slider);
		
		JLabel lblHorasDedicadasEn = new JLabel("Horas dedicadas en el ordenador:");
		lblHorasDedicadasEn.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblHorasDedicadasEn.setBounds(160, 260, 200, 14);
		contentPane.add(lblHorasDedicadasEn);
		
		JRadioButton rdbtnWindows = new JRadioButton("Windows");
		rdbtnWindows.setBounds(28, 60, 69, 23);
		contentPane.add(rdbtnWindows);
		
		JRadioButton rdbtnLinux = new JRadioButton("Linux");
		rdbtnLinux.setBounds(234, 60, 51, 23);
		contentPane.add(rdbtnLinux);
		
		JRadioButton rdbtnMacos = new JRadioButton("MacOS");
		rdbtnMacos.setBounds(415, 60, 59, 23);
		contentPane.add(rdbtnMacos);
		
		JCheckBox chckbxProgramacion = new JCheckBox("Programacion");
		chckbxProgramacion.setBounds(28, 186, 97, 23);
		contentPane.add(chckbxProgramacion);
		
		JCheckBox chckbxDisenoGrafico = new JCheckBox("Diseno grafico");
		chckbxDisenoGrafico.setBounds(213, 186, 97, 23);
		contentPane.add(chckbxDisenoGrafico);
		
		JCheckBox chckbxAdministracion = new JCheckBox("Administracion");
		chckbxAdministracion.setBounds(406, 186, 97, 23);
		contentPane.add(chckbxAdministracion);

		ButtonGroup sistemaOperativoGroup = new ButtonGroup();
		sistemaOperativoGroup.add(rdbtnWindows);
		sistemaOperativoGroup.add(rdbtnLinux);
		sistemaOperativoGroup.add(rdbtnMacos);
		
		ButtonGroup especialidadGroup = new ButtonGroup();
		especialidadGroup.add(chckbxProgramacion);
		especialidadGroup.add(chckbxDisenoGrafico);
		especialidadGroup.add(chckbxAdministracion);
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String so = "";
				String especialidad = "";
				int horas = slider.getValue();
				
				if(rdbtnWindows.isSelected()) {
					
					so = "Windows";
					
				}else if (rdbtnLinux.isSelected()) {
					
                    so = "Linux";
                    
                }else if (rdbtnMacos.isSelected()) {
                	
                    so = "Mac";
                }
				
				if(chckbxProgramacion.isSelected()) {
					
					especialidad = "Programacion";
					
				}else if(chckbxDisenoGrafico.isSelected()) {
					
					especialidad = "Diseno Grafico";
					
				}else if(chckbxAdministracion.isSelected()) {
					
					especialidad = "Administracion";
				}
				
				String resultado = "SO: " +	so + ", especilidad: " + especialidad + ", horas dedicadas en el ordenador: " + horas;	
				JOptionPane.showMessageDialog(btnNewButton, resultado);
			}
		});
		btnNewButton.setBounds(221, 358, 89, 23);
		contentPane.add(btnNewButton);
	}
}
