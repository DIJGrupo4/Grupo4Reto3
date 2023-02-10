package reto3.vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import reto3.bbdd.gestor.GestorPeliculas;

public class Reto3 {

	private JFrame frame;
	private String peliculas[] = new String[3];
	private String[] peliculasSeleccionadas = new String[3];
	DefaultListModel<String> listModel = new DefaultListModel<String>();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reto3 window = new Reto3();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Reto3() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setEnabled(false);
		frame.setBackground(SystemColor.text);
		frame.getContentPane().setForeground(SystemColor.text);
		frame.getContentPane().setBackground(SystemColor.text);
		frame.setResizable(false);
		frame.setBounds(100, 100, 580, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel BpanelBienvenida = new JPanel();
		BpanelBienvenida.setLayout(null);
		BpanelBienvenida.setBounds(0, 0, 938, 704);
		frame.getContentPane().add(BpanelBienvenida);

		JPanel SCpanelSeleccionCines = new JPanel();
		SCpanelSeleccionCines.setBounds(0, 0, 564, 441);
		frame.getContentPane().add(SCpanelSeleccionCines);
		SCpanelSeleccionCines.setLayout(null);

		JPanel SPpanelSeleccionPelis = new JPanel();
		SPpanelSeleccionPelis.setLayout(null);
		SPpanelSeleccionPelis.setBounds(0, 0, 564, 441);
		frame.getContentPane().add(SPpanelSeleccionPelis);

		// JLabels

		JLabel SClabelSeleccionCines = new JLabel("Selecciona un Cine");
		SClabelSeleccionCines.setHorizontalAlignment(SwingConstants.CENTER);
		SClabelSeleccionCines.setFont(new Font("Tahoma", Font.PLAIN, 24));
		SClabelSeleccionCines.setBounds(33, 69, 241, 57);
		SCpanelSeleccionCines.add(SClabelSeleccionCines);

		JLabel SCseleccionCinesLogo = new JLabel("");
		SCseleccionCinesLogo.setIcon(new ImageIcon("C:\\Users\\in1dw3\\Desktop\\Ibai\\Reto 3\\bienvenida.png"));
		SCseleccionCinesLogo.setBounds(376, 11, 137, 156);
		SCpanelSeleccionCines.add(SCseleccionCinesLogo);

		JLabel SPlabelSeleccionPelis = new JLabel("Selecciona una Pelicula");
		SPlabelSeleccionPelis.setFont(new Font("Tahoma", Font.PLAIN, 24));
		SPlabelSeleccionPelis.setBounds(43, 101, 250, 37);
		SPpanelSeleccionPelis.add(SPlabelSeleccionPelis);

		JLabel SPlabelLogoPelis = new JLabel("");
		SPlabelLogoPelis.setIcon(new ImageIcon("C:\\Users\\in1dw3\\Desktop\\Ibai\\Reto 3\\bienvenida.png"));
		SPlabelLogoPelis.setBounds(362, 11, 192, 188);
		SPpanelSeleccionPelis.add(SPlabelLogoPelis);

		JLabel SPlblCineSeleccionado = new JLabel("Aqui se muestra el cine");
		SPlblCineSeleccionado.setBounds(216, 33, 178, 14);
		SPpanelSeleccionPelis.add(SPlblCineSeleccionado);

		// Buttons

		JButton BbotonBienvenida = new JButton("BIENVENIDO");
		BbotonBienvenida.setForeground(Color.BLACK);
		BbotonBienvenida.setFont(new Font("Yu Gothic", Font.PLAIN, 50));
		BbotonBienvenida.setFocusable(false);
		BbotonBienvenida.setBackground(Color.WHITE);
		BbotonBienvenida.setBounds(0, 0, 564, 441);
		BpanelBienvenida.add(BbotonBienvenida);

		JButton SCseleccionBtnCine1 = new JButton("Cine1");
		SCseleccionBtnCine1.setFocusable(false);
		SCseleccionBtnCine1.setBounds(97, 184, 121, 74);
		SCpanelSeleccionCines.add(SCseleccionBtnCine1);

		JButton SCseleccionBtnCine2 = new JButton("Cine2");
		SCseleccionBtnCine2.setFocusable(false);
		SCseleccionBtnCine2.setBounds(317, 184, 127, 74);
		SCpanelSeleccionCines.add(SCseleccionBtnCine2);

		JButton SCseleccionBtnCine3 = new JButton("Cine3");
		SCseleccionBtnCine3.setFocusable(false);
		SCseleccionBtnCine3.setBounds(97, 282, 121, 74);
		SCpanelSeleccionCines.add(SCseleccionBtnCine3);

		JButton SCseleccionBtnCine4 = new JButton("Cine4");
		SCseleccionBtnCine4.setFocusable(false);
		SCseleccionBtnCine4.setBounds(317, 282, 127, 74);
		SCpanelSeleccionCines.add(SCseleccionBtnCine4);

		JButton SCbtnFinalizar = new JButton("FINALIZAR");
		SCbtnFinalizar.setFocusable(false);
		SCbtnFinalizar.setBounds(221, 392, 96, 38);
		SCpanelSeleccionCines.add(SCbtnFinalizar);

		JButton SPbtnAtras = new JButton("Atras");
		SPbtnAtras.setFocusable(false);
		SPbtnAtras.setBounds(337, 391, 89, 23);
		SPpanelSeleccionPelis.add(SPbtnAtras);

		JButton SCbtnAceptar = new JButton("Aceptar");
		SCbtnAceptar.setBounds(337, 280, 89, 23);
		SPpanelSeleccionPelis.add(SCbtnAceptar);

		// JLists

		JList<String> SPlistaPeliculas = new JList<String>();
		SPlistaPeliculas.setBounds(43, 166, 250, 248);
		SPpanelSeleccionPelis.add(SPlistaPeliculas);

		JList<String> SPlistaPeliculas_1 = new JList<String>();
		SPlistaPeliculas_1.setBounds(0, 0, 250, 248);
		SPpanelSeleccionPelis.add(SPlistaPeliculas_1);

		// Action listeners

		SPbtnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BpanelBienvenida.setVisible(false);
				SPpanelSeleccionPelis.setVisible(false);
				SCpanelSeleccionCines.setVisible(true);
			}
		});

		BbotonBienvenida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BpanelBienvenida.setVisible(false);
				SCpanelSeleccionCines.setVisible(true);
			}
		});

		SCseleccionBtnCine1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				listModel.clear();
				BpanelBienvenida.setVisible(false);
				SCpanelSeleccionCines.setVisible(false);
				SPpanelSeleccionPelis.setVisible(true);

				peliculas = GestorPeliculas.rellenarListaCine1("Cine1");
				for (int i = 0; i < peliculas.length; i++) {
					listModel.addElement(peliculas[i]);
				}
				SPlistaPeliculas.setModel(listModel);
			}

		});

		SCseleccionBtnCine2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				listModel.clear();
				BpanelBienvenida.setVisible(false);
				SCpanelSeleccionCines.setVisible(false);
				SPpanelSeleccionPelis.setVisible(true);

				peliculas = GestorPeliculas.rellenarListaCine2("Cine 2");
				for (int i = 0; i < peliculas.length; i++) {
					listModel.addElement(peliculas[i]);
				}
				SPlistaPeliculas.setModel(listModel);
				;
			}
		});
		SCseleccionBtnCine3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BpanelBienvenida.setVisible(false);
				SCpanelSeleccionCines.setVisible(false);
				SPpanelSeleccionPelis.setVisible(true);
				listModel.clear();

				BpanelBienvenida.setVisible(false);
				SCpanelSeleccionCines.setVisible(false);
				SPpanelSeleccionPelis.setVisible(true);

				peliculas = GestorPeliculas.rellenarListaCine3("Cine3");
				for (int i = 0; i < peliculas.length; i++) {
					listModel.addElement(peliculas[i]);
				}
				SPlistaPeliculas.setModel(listModel);
				;
				;
			}
		});
		SCseleccionBtnCine4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BpanelBienvenida.setVisible(false);
				SCpanelSeleccionCines.setVisible(false);
				SPpanelSeleccionPelis.setVisible(true);
				listModel.clear();
				BpanelBienvenida.setVisible(false);
				SCpanelSeleccionCines.setVisible(false);
				SPpanelSeleccionPelis.setVisible(true);

				peliculas = GestorPeliculas.rellenarListaCine4("Cine4");
				for (int i = 0; i < peliculas.length; i++) {
					listModel.addElement(peliculas[i]);
				}
				SPlistaPeliculas.setModel(listModel);
			}
		});
	}
}
