package reto3.vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import reto3.bbdd.gestor.GestorPeliculas;
import reto3.bbdd.pojo.Pelicula;

import javax.swing.JTextField;
import javax.swing.JComboBox;

public class Reto3 {

	private JFrame frame;

	private ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
	private ArrayList<String> titulos = new ArrayList<String>();

	private int ListaFull = 0;

	private DefaultListModel<String> listModel = new DefaultListModel<String>();

	private JTextField SStextTitulo;
	private JTextField SStextHora;
	private JTextField SStextPrecio;
	private JTextField SStextSala;

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

	/**
	 * @wbp.parser.entryPoint
	 */
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
		SCpanelSeleccionCines.setLayout(null);
		SCpanelSeleccionCines.setBounds(0, 0, 564, 441);
		frame.getContentPane().add(SCpanelSeleccionCines);

		JPanel SPpanelSeleccionPelis = new JPanel();
		SPpanelSeleccionPelis.setLayout(null);
		SPpanelSeleccionPelis.setBounds(0, 0, 564, 441);
		frame.getContentPane().add(SPpanelSeleccionPelis);

		JPanel SSpanelSeleccionSesiones = new JPanel();
		SSpanelSeleccionSesiones.setLayout(null);
		SSpanelSeleccionSesiones.setBounds(0, 0, 564, 441);
		frame.getContentPane().add(SSpanelSeleccionSesiones);

		// JLabels

		JLabel SClabelSeleccionCines = new JLabel("Selecciona un Cine");
		SClabelSeleccionCines.setHorizontalAlignment(SwingConstants.CENTER);
		SClabelSeleccionCines.setFont(new Font("Tahoma", Font.PLAIN, 24));
		SClabelSeleccionCines.setBounds(33, 69, 241, 57);
		SCpanelSeleccionCines.add(SClabelSeleccionCines);

		JLabel SCseleccionCinesLogo = new JLabel("");
		SCseleccionCinesLogo.setIcon(new ImageIcon("/reto3/img/bienvenida.png"));
		SCseleccionCinesLogo.setBounds(376, 11, 137, 156);
		SCpanelSeleccionCines.add(SCseleccionCinesLogo);

		JLabel SPlabelSeleccionPelis = new JLabel("Selecciona una Pelicula");
		SPlabelSeleccionPelis.setFont(new Font("Tahoma", Font.PLAIN, 24));
		SPlabelSeleccionPelis.setBounds(43, 101, 250, 37);
		SPpanelSeleccionPelis.add(SPlabelSeleccionPelis);

		JLabel SPlabelLogoPelis = new JLabel("");
		SPlabelLogoPelis.setIcon(new ImageIcon("/reto3/img/bienvenida.png"));
		SPlabelLogoPelis.setBounds(362, 11, 192, 188);
		SPpanelSeleccionPelis.add(SPlabelLogoPelis);

		JLabel SSlblTitulo = new JLabel("Titulo:");
		SSlblTitulo.setBounds(81, 170, 81, 14);
		SSpanelSeleccionSesiones.add(SSlblTitulo);

		JLabel SSlblHora = new JLabel("Hora:");
		SSlblHora.setBounds(81, 221, 81, 14);
		SSpanelSeleccionSesiones.add(SSlblHora);

		JLabel SSlblPrecio = new JLabel("Precio:");
		SSlblPrecio.setBounds(81, 273, 81, 14);
		SSpanelSeleccionSesiones.add(SSlblPrecio);

		JLabel SSlblSala = new JLabel("Sala:");
		SSlblSala.setBounds(81, 326, 81, 14);
		SSpanelSeleccionSesiones.add(SSlblSala);

		JLabel SSlblSesiones = new JLabel("Seleccionar sesion");
		SSlblSesiones.setBounds(216, 21, 157, 14);
		SSpanelSeleccionSesiones.add(SSlblSesiones);

		JLabel SSlblSesionesDisponibles = new JLabel("Sesiones disponibles:");
		SSlblSesionesDisponibles.setBounds(81, 107, 130, 14);
		SSpanelSeleccionSesiones.add(SSlblSesionesDisponibles);

		// TextFields

		SStextTitulo = new JTextField();
		SStextTitulo.setColumns(10);
		SStextTitulo.setBounds(211, 167, 204, 20);
		SSpanelSeleccionSesiones.add(SStextTitulo);

		SStextHora = new JTextField();
		SStextHora.setColumns(10);
		SStextHora.setBounds(211, 323, 102, 20);
		SSpanelSeleccionSesiones.add(SStextHora);

		SStextPrecio = new JTextField();
		SStextPrecio.setColumns(10);
		SStextPrecio.setBounds(211, 218, 102, 20);
		SSpanelSeleccionSesiones.add(SStextPrecio);

		SStextSala = new JTextField();
		SStextSala.setColumns(10);
		SStextSala.setBounds(211, 270, 102, 20);
		SSpanelSeleccionSesiones.add(SStextSala);

		// Buttons

		JButton BbotonBienvenida = new JButton("BIENVENIDO");
		BbotonBienvenida.setForeground(Color.BLACK);
		BbotonBienvenida.setFont(new Font("Yu Gothic", Font.PLAIN, 50));
		BbotonBienvenida.setFocusable(false);
		BbotonBienvenida.setBackground(Color.WHITE);
		BbotonBienvenida.setBounds(0, 0, 564, 441);
		BpanelBienvenida.add(BbotonBienvenida);

		JButton SCseleccionBtnCine1 = new JButton("Cine Bilbao");
		SCseleccionBtnCine1.setFocusable(false);
		SCseleccionBtnCine1.setBounds(97, 184, 121, 74);
		SCpanelSeleccionCines.add(SCseleccionBtnCine1);

		JButton SCseleccionBtnCine2 = new JButton("Cine Basauri");
		SCseleccionBtnCine2.setFocusable(false);
		SCseleccionBtnCine2.setBounds(317, 184, 127, 74);
		SCpanelSeleccionCines.add(SCseleccionBtnCine2);

		JButton SCseleccionBtnCine3 = new JButton("Cine Baracaldo");
		SCseleccionBtnCine3.setFocusable(false);
		SCseleccionBtnCine3.setBounds(97, 282, 121, 74);
		SCpanelSeleccionCines.add(SCseleccionBtnCine3);

		JButton SCseleccionBtnCine4 = new JButton("Cine Elorrieta");
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

		JButton SPbtnAceptar = new JButton("Aceptar");
		SPbtnAceptar.setFocusable(false);
		SPbtnAceptar.setBounds(337, 280, 89, 23);
		SPpanelSeleccionPelis.add(SPbtnAceptar);

		JButton SSbtnAtras = new JButton("Atras");
		SSbtnAtras.setBounds(112, 407, 113, 23);
		SSpanelSeleccionSesiones.add(SSbtnAtras);

		JButton SSbtnConfirmar = new JButton("Confirmar");
		SSbtnConfirmar.setBounds(353, 407, 130, 23);
		SSpanelSeleccionSesiones.add(SSbtnConfirmar);

		// JLists

		JList<String> SPlistaPeliculas = new JList<String>();
		SPlistaPeliculas.setBounds(43, 166, 250, 248);
		SPpanelSeleccionPelis.add(SPlistaPeliculas);

		// JComboBox

		JComboBox<String> SScomboBoxSesiones = new JComboBox<String>();
		SScomboBoxSesiones.setBounds(211, 103, 204, 22);
		SSpanelSeleccionSesiones.add(SScomboBoxSesiones);

		// Action listeners

		BbotonBienvenida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BpanelBienvenida.setVisible(false);
				SCpanelSeleccionCines.setVisible(true);
				SPpanelSeleccionPelis.setVisible(false);
				SSpanelSeleccionSesiones.setVisible(false);
			}
		});

		SPbtnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BpanelBienvenida.setVisible(false);
				SPpanelSeleccionPelis.setVisible(false);
				SCpanelSeleccionCines.setVisible(true);
			}
		});

		SCseleccionBtnCine1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listModel.clear();
				titulos.clear();
				BpanelBienvenida.setVisible(false);
				SCpanelSeleccionCines.setVisible(false);
				SPpanelSeleccionPelis.setVisible(true);

				// peliculas = GestorPeliculas.obtenerPeliculaPorCine(1);
				// titulos = GestorPeliculas.obtenerTitulosPorPeliculas(peliculas);

				titulos.add("Peli1Cine1");
				titulos.add("Peli2Cine1");
				titulos.add("Peli3Cine1");
				if (titulos != null) {
					for (int i = 0; i < titulos.size(); i++) {
						listModel.addElement(titulos.get(i));
					}
				}
				SPlistaPeliculas.setModel(listModel);
			}
		});

		SCseleccionBtnCine2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listModel.clear();
				titulos.clear();
				BpanelBienvenida.setVisible(false);
				SCpanelSeleccionCines.setVisible(false);
				SPpanelSeleccionPelis.setVisible(true);

				// peliculas = GestorPeliculas.obtenerPeliculaPorCine(2);
				// titulos = GestorPeliculas.obtenerTitulosPorPeliculas(peliculas);

				titulos.add("Peli1Cine2");
				titulos.add("Peli2Cine2");
				titulos.add("Peli3Cine2");
				if (titulos != null) {
					for (int i = 0; i < titulos.size(); i++) {
						listModel.addElement(titulos.get(i));
					}
				}
				SPlistaPeliculas.setModel(listModel);
			}
		});
		SCseleccionBtnCine3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listModel.clear();
				titulos.clear();
				BpanelBienvenida.setVisible(false);
				SCpanelSeleccionCines.setVisible(false);
				SPpanelSeleccionPelis.setVisible(true);

				//peliculas = GestorPeliculas.obtenerPeliculaPorCine(3);
				//titulos = GestorPeliculas.obtenerTitulosPorPeliculas(peliculas);

				titulos.add("Peli1Cine3");
				titulos.add("Peli2Cine3");
				titulos.add("Peli3Cine3");
				if (titulos != null) {
					for (int i = 0; i < titulos.size(); i++) {
						listModel.addElement(titulos.get(i));
					}
				}
				SPlistaPeliculas.setModel(listModel);
			}
		});
		SCseleccionBtnCine4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				titulos=null;
				listModel.clear();
				titulos.clear();
				BpanelBienvenida.setVisible(false);
				SCpanelSeleccionCines.setVisible(false);
				SPpanelSeleccionPelis.setVisible(true);

				//peliculas = GestorPeliculas.obtenerPeliculaPorCine(4);
				//titulos = GestorPeliculas.obtenerTitulosPorPeliculas(peliculas);
				titulos.add("Peli1Cine4");
				titulos.add("Peli2Cine4");
				titulos.add("Peli3Cine4");
				if (titulos != null) {
					for (int i = 0; i < titulos.size(); i++) {
						listModel.addElement(titulos.get(i));
					}
				}
				SPlistaPeliculas.setModel(listModel);
			}
		});
		SCbtnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ListaFull == 0) {
					System.exit(0);
				}
			}
		});
		SPbtnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BpanelBienvenida.setVisible(false);
				SCpanelSeleccionCines.setVisible(false);
				SPpanelSeleccionPelis.setVisible(false);
				SSpanelSeleccionSesiones.setVisible(true);
			}
		});
		SSbtnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BpanelBienvenida.setVisible(false);
				SCpanelSeleccionCines.setVisible(false);
				SPpanelSeleccionPelis.setVisible(true);
				SSpanelSeleccionSesiones.setVisible(false);
			}
		});
		SSbtnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BpanelBienvenida.setVisible(false);
				SCpanelSeleccionCines.setVisible(true);
				SPpanelSeleccionPelis.setVisible(false);
				SSpanelSeleccionSesiones.setVisible(false);
			}
		});
	}
}
