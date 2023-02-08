package reto3.vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JList;
import java.awt.SystemColor;
import java.awt.Color;

public class VentanaPeliculas {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPeliculas window = new VentanaPeliculas();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public VentanaPeliculas() {
		initialize();
	}


	private void initialize() {
		frame = new JFrame();
	}
}
