package Ejercicio01;

import java.awt.EventQueue;

public class MainApp {

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				
				try {
					
					Saludador frame = new Saludador();
					frame.setVisible(true);
					
				} catch (Exception e) {
					
					e.printStackTrace();
				}
			}
		});
	}
}
