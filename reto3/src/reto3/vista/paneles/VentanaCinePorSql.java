package reto3.vista.paneles;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import reto3.bbdd.gestor.GestorCines;
import reto3.bbdd.pojo.Cine;
import rsscalelabel.RSScaleLabel;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaCinePorSql {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCinePorSql window = new VentanaCinePorSql();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaCinePorSql() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		GestorCines gestCi = new GestorCines();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 580, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		// JPanels
		JPanel panelSelecionCine = new JPanel();
		panelSelecionCine.setBounds(0, 0, 564, 441);
		frame.getContentPane().add(panelSelecionCine);
		panelSelecionCine.setLayout(null);

		JPanel panelBilbao = new JPanel();
		panelBilbao.setBounds(322, 112, 218, 304);
		panelSelecionCine.add(panelBilbao);
		panelBilbao.setLayout(null);

		JPanel panelBasauri = new JPanel();
		panelBasauri.setLayout(null);
		panelBasauri.setBounds(322, 112, 218, 304);
		panelSelecionCine.add(panelBasauri);

		JPanel panelBaracaldo = new JPanel();
		panelBaracaldo.setLayout(null);
		panelBaracaldo.setBounds(322, 112, 218, 304);
		panelSelecionCine.add(panelBaracaldo);

		JPanel panelElorrieta = new JPanel();
		panelElorrieta.setLayout(null);
		panelElorrieta.setBounds(322, 112, 218, 304);
		panelSelecionCine.add(panelElorrieta);

		// JLabels
		JLabel lblImagenBilbao = new JLabel("");
		lblImagenBilbao.setBounds(0, 0, 218, 304);
		RSScaleLabel.setScaleLabel(lblImagenBilbao, "img/cineBilbao.png");
		panelBilbao.add(lblImagenBilbao);

		JLabel lblImagenBasauri = new JLabel("");
		lblImagenBasauri.setBounds(0, 0, 218, 304);
		RSScaleLabel.setScaleLabel(lblImagenBasauri, "img/cineBasauri.jpg");
		panelBasauri.add(lblImagenBasauri);

		JLabel lblImagenBaracaldo = new JLabel("");
		lblImagenBaracaldo.setBounds(0, 0, 218, 304);
		RSScaleLabel.setScaleLabel(lblImagenBaracaldo, "img/cineBaracaldo.jpg");
		panelBaracaldo.add(lblImagenBaracaldo);

		JLabel lblImagenElorrieta = new JLabel("");
		lblImagenElorrieta.setBounds(0, 0, 218, 304);
		RSScaleLabel.setScaleLabel(lblImagenElorrieta, "img/cineElorrieta.jpg");
		panelElorrieta.add(lblImagenElorrieta);

		JLabel lblSeleccionCinesTitulo = new JLabel("SELECCION DE CINES");
		lblSeleccionCinesTitulo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSeleccionCinesTitulo.setBounds(154, 32, 198, 22);
		panelSelecionCine.add(lblSeleccionCinesTitulo);

		// JButtons
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setBounds(10, 366, 132, 50);
		panelSelecionCine.add(btnSalir);

		JButton btnSeleccionCine = new JButton("SELECCIONAR");
		btnSeleccionCine.setBounds(154, 366, 131, 50);
		panelSelecionCine.add(btnSeleccionCine);

		// JComboBox
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(38, 112, 218, 22);
		panelSelecionCine.add(comboBox);

		ArrayList<Cine> cines = gestCi.obtenerTodosLosCines();
		
		for (int i = 0; i < cines.size(); i++) {
			Cine cine = cines.get(i);
			String nombreCine = cine.getNombre();
			comboBox.addItem(nombreCine);
		}
		// Action Listeners
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
	}
}
