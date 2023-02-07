package reto3.vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

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
		frame.setBounds(100, 100, 615, 488);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel seleccionPeliculasLogo = new JLabel("");
		seleccionPeliculasLogo.setIcon(new ImageIcon("C:\\Users\\in1dw3\\Desktop\\Ibai\\Reto 3\\bienvenida.png"));
		seleccionPeliculasLogo.setBounds(395, 25, 137, 172);
		frame.getContentPane().add(seleccionPeliculasLogo);
		
		JPanel panelSelecPelis = new JPanel();
		panelSelecPelis.setBounds(0, 252, 434, -251);
		frame.getContentPane().add(panelSelecPelis);
		
		JLabel labelSeleccionPeliculas = new JLabel("Selecciona una Pelicula");
		labelSeleccionPeliculas.setBounds(48, 92, 253, 29);
		frame.getContentPane().add(labelSeleccionPeliculas);
		labelSeleccionPeliculas.setHorizontalAlignment(SwingConstants.CENTER);
		labelSeleccionPeliculas.setFont(new Font("Tahoma", Font.PLAIN, 24));
	}
}
