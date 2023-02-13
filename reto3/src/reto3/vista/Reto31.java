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
import javax.swing.JComboBox;

public class Reto31 {

	private JFrame frame;
	private String peliculas[] = new String[3];
	DefaultListModel<String> listModel = new DefaultListModel<String>();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reto31 window = new Reto31();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Reto31() {
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

		// JPanels

		JPanel BpanelBienvenida = new JPanel();
		BpanelBienvenida.setLayout(null);
		BpanelBienvenida.setBounds(0, 0, 938, 704);
		frame.getContentPane().add(BpanelBienvenida);

		JPanel SCpanelSeleccionCines = new JPanel();
		SCpanelSeleccionCines.setLayout(null);
		SCpanelSeleccionCines.setBounds(0, 0, 564, 441);
		frame.getContentPane().add(SCpanelSeleccionCines);

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

		JButton SCseleccionBtnCineBilbao = new JButton("Cine Bilbao");
		SCseleccionBtnCineBilbao.setFocusable(false);
		SCseleccionBtnCineBilbao.setBounds(97, 184, 121, 74);
		SCpanelSeleccionCines.add(SCseleccionBtnCineBilbao);

		JButton SCseleccionBtnCineBasauri = new JButton("Cine Basauri");
		SCseleccionBtnCineBasauri.setFocusable(false);
		SCseleccionBtnCineBasauri.setBounds(317, 184, 127, 74);
		SCpanelSeleccionCines.add(SCseleccionBtnCineBasauri);

		JButton SCseleccionBtnCineBaracaldo = new JButton("Cine Baracaldo");
		SCseleccionBtnCineBaracaldo.setFocusable(false);
		SCseleccionBtnCineBaracaldo.setBounds(97, 282, 121, 74);
		SCpanelSeleccionCines.add(SCseleccionBtnCineBaracaldo);

		JButton SCseleccionBtnCineElorrieta = new JButton("Cine Elorrieta");
		SCseleccionBtnCineElorrieta.setFocusable(false);
		SCseleccionBtnCineElorrieta.setBounds(317, 282, 127, 74);
		SCpanelSeleccionCines.add(SCseleccionBtnCineElorrieta);

		JButton SCbtnFinalizar = new JButton("FINALIZAR");
		SCbtnFinalizar.setFocusable(false);
		SCbtnFinalizar.setBounds(221, 392, 96, 38);
		SCpanelSeleccionCines.add(SCbtnFinalizar);

		JButton SPbtnAtras = new JButton("Atras");
		SPbtnAtras.setFocusable(false);
		SPbtnAtras.setBounds(337, 391, 89, 23);
		SPpanelSeleccionPelis.add(SPbtnAtras);

		JButton SCbtnAceptar = new JButton("Aceptar");
		SCbtnAceptar.setFocusable(false);
		SCbtnAceptar.setBounds(337, 280, 89, 23);
		SPpanelSeleccionPelis.add(SCbtnAceptar);

		// JComboBox
		JComboBox<String> SPcomboPeliculas = new JComboBox<String>();
		SPcomboPeliculas.setBounds(70, 280, 161, 22);
		SPpanelSeleccionPelis.add(SPcomboPeliculas);

		SPbtnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BpanelBienvenida.setVisible(false);
				SPpanelSeleccionPelis.setVisible(false);
				SCpanelSeleccionCines.setVisible(true);
			}
		});

		// Action listeners

		BbotonBienvenida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BpanelBienvenida.setVisible(false);
				SCpanelSeleccionCines.setVisible(true);
				SPpanelSeleccionPelis.setVisible(false);
			}
		});

		SCseleccionBtnCineBilbao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				BpanelBienvenida.setVisible(false);
				SCpanelSeleccionCines.setVisible(false);
				SPpanelSeleccionPelis.setVisible(true);

			
				for (int i = 0; i < peliculas.length; i++) {
					SPcomboPeliculas.addItem(peliculas[i]);
				}
				
			}

		});

		SCseleccionBtnCineBasauri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				BpanelBienvenida.setVisible(false);
				SCpanelSeleccionCines.setVisible(false);
				SPpanelSeleccionPelis.setVisible(true);

			
				for (int i = 0; i < peliculas.length; i++) {
					SPcomboPeliculas.addItem(peliculas[i]);
				}

			}
		});
		SCseleccionBtnCineBaracaldo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				BpanelBienvenida.setVisible(false);
				SCpanelSeleccionCines.setVisible(false);
				SPpanelSeleccionPelis.setVisible(true);

			
				for (int i = 0; i < peliculas.length; i++) {
					SPcomboPeliculas.addItem(peliculas[i]);
				}
			}
		});
		SCseleccionBtnCineElorrieta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				BpanelBienvenida.setVisible(false);
				SCpanelSeleccionCines.setVisible(false);
				SPpanelSeleccionPelis.setVisible(true);

			
				for (int i = 0; i < peliculas.length; i++) {
					SPcomboPeliculas.addItem(peliculas[i]);
				}
				
			}
		});
		
		SCbtnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			   SPcomboPeliculas.setSelectedIndex(1);
			}
		});

	}
}