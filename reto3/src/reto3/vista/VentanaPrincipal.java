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
import reto3.bbdd.gestor.GestorProyecciones;
import reto3.bbdd.pojo.Pelicula;
import reto3.bbdd.pojo.Proyeccion;

import javax.swing.JTextField;
import javax.swing.JComboBox;

public class VentanaPrincipal {

	private JFrame frame;

	private GestorPeliculas gestorPeliculas = new GestorPeliculas();
	private GestorProyecciones gestorProyecciones = new GestorProyecciones();
	
	private ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
	private ArrayList<Proyeccion> proyecciones = new ArrayList<Proyeccion>();
	private ArrayList<String> titulos = new ArrayList<String>();

	private int listaFull = 0;

	private DefaultListModel<String> listModel = new DefaultListModel<String>();

	private JTextField ssTextTitulo;
	private JTextField ssTextHora;
	private JTextField ssTextPrecio;
	private JTextField ssTextSala;
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal window = new VentanaPrincipal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public VentanaPrincipal() {
		
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

		JPanel bPanelBienvenida = new JPanel();
		bPanelBienvenida.setLayout(null);
		bPanelBienvenida.setBounds(0, 0, 938, 704);
		frame.getContentPane().add(bPanelBienvenida);

		JPanel scPanelSeleccionCines = new JPanel();
		scPanelSeleccionCines.setLayout(null);
		scPanelSeleccionCines.setBounds(0, 0, 564, 441);
		scPanelSeleccionCines.setVisible(false);
		frame.getContentPane().add(scPanelSeleccionCines);

		JPanel spPanelSeleccionPelis = new JPanel();
		spPanelSeleccionPelis.setLayout(null);
		spPanelSeleccionPelis.setBounds(0, 0, 564, 441);
		spPanelSeleccionPelis.setVisible(false);
		frame.getContentPane().add(spPanelSeleccionPelis);

		JPanel ssPanelSeleccionSesiones = new JPanel();
		ssPanelSeleccionSesiones.setLayout(null);
		ssPanelSeleccionSesiones.setBounds(0, 0, 564, 441);
		ssPanelSeleccionSesiones.setVisible(false);
		frame.getContentPane().add(ssPanelSeleccionSesiones);

		// JLabels

		JLabel scLabelSeleccionCines = new JLabel("Selecciona un Cine");
		scLabelSeleccionCines.setHorizontalAlignment(SwingConstants.CENTER);
		scLabelSeleccionCines.setFont(new Font("Tahoma", Font.PLAIN, 24));
		scLabelSeleccionCines.setBounds(33, 69, 241, 57);
		scPanelSeleccionCines.add(scLabelSeleccionCines);

		JLabel scSeleccionCinesLogo = new JLabel("");
		scSeleccionCinesLogo.setIcon(new ImageIcon("/reto3/img/bienvenida.png"));
		scSeleccionCinesLogo.setBounds(376, 11, 137, 156);
		scPanelSeleccionCines.add(scSeleccionCinesLogo);

		JLabel spLabelSeleccionPelis = new JLabel("Selecciona una Pelicula");
		spLabelSeleccionPelis.setFont(new Font("Tahoma", Font.PLAIN, 24));
		spLabelSeleccionPelis.setBounds(43, 101, 250, 37);
		spPanelSeleccionPelis.add(spLabelSeleccionPelis);

		JLabel spLabelLogoPelis = new JLabel("");
		spLabelLogoPelis.setIcon(new ImageIcon("//reto3//img//bienvenida.png"));
		spLabelLogoPelis.setBounds(362, 11, 192, 188);
		spPanelSeleccionPelis.add(spLabelLogoPelis);

		JLabel ssLblTitulo = new JLabel("Titulo:");
		ssLblTitulo.setBounds(81, 170, 81, 14);
		ssPanelSeleccionSesiones.add(ssLblTitulo);

		JLabel ssLblHora = new JLabel("Hora:");
		ssLblHora.setBounds(81, 221, 81, 14);
		ssPanelSeleccionSesiones.add(ssLblHora);

		JLabel ssLblPrecio = new JLabel("Precio:");
		ssLblPrecio.setBounds(81, 273, 81, 14);
		ssPanelSeleccionSesiones.add(ssLblPrecio);

		JLabel ssLblSala = new JLabel("Sala:");
		ssLblSala.setBounds(81, 326, 81, 14);
		ssPanelSeleccionSesiones.add(ssLblSala);

		JLabel ssLblSesiones = new JLabel("Seleccionar sesion");
		ssLblSesiones.setBounds(216, 21, 157, 14);
		ssPanelSeleccionSesiones.add(ssLblSesiones);

		JLabel ssLblSesionesDisponibles = new JLabel("Sesiones disponibles:");
		ssLblSesionesDisponibles.setBounds(81, 107, 130, 14);
		ssPanelSeleccionSesiones.add(ssLblSesionesDisponibles);

		// Buttons

		JButton bBotonBienvenida = new JButton("BIENVENIDO");
		bBotonBienvenida.setIcon(new ImageIcon("C:\\Users\\in1daw\\git\\Grupo4Reto3.1\\reto3\\img\\bienvenida.png"));
		bBotonBienvenida.setForeground(Color.BLACK);
		bBotonBienvenida.setFont(new Font("Yu Gothic", Font.PLAIN, 50));
		bBotonBienvenida.setFocusable(false);
		bBotonBienvenida.setBackground(Color.WHITE);
		bBotonBienvenida.setBounds(0, 0, 564, 441);
		bPanelBienvenida.add(bBotonBienvenida);

		JButton scSeleccionBtnCine1 = new JButton("Cine Bilbao");
		scSeleccionBtnCine1.setFocusable(false);
		scSeleccionBtnCine1.setBounds(97, 184, 121, 74);
		scPanelSeleccionCines.add(scSeleccionBtnCine1);

		JButton scSeleccionBtnCine2 = new JButton("Cine Basauri");
		scSeleccionBtnCine2.setFocusable(false);
		scSeleccionBtnCine2.setBounds(317, 184, 127, 74);
		scPanelSeleccionCines.add(scSeleccionBtnCine2);

		JButton scSeleccionBtnCine3 = new JButton("Cine Baracaldo");
		scSeleccionBtnCine3.setFocusable(false);
		scSeleccionBtnCine3.setBounds(97, 282, 121, 74);
		scPanelSeleccionCines.add(scSeleccionBtnCine3);

		JButton scSeleccionBtnCine4 = new JButton("Cine Elorrieta");
		scSeleccionBtnCine4.setFocusable(false);
		scSeleccionBtnCine4.setBounds(317, 282, 127, 74);
		scPanelSeleccionCines.add(scSeleccionBtnCine4);

		JButton scBtnFinalizar = new JButton("FINALIZAR");
		scBtnFinalizar.setFocusable(false);
		scBtnFinalizar.setBounds(221, 392, 96, 38);
		scPanelSeleccionCines.add(scBtnFinalizar);

		JButton spBtnAtras = new JButton("Atras");
		spBtnAtras.setFocusable(false);
		spBtnAtras.setBounds(337, 391, 89, 23);
		spPanelSeleccionPelis.add(spBtnAtras);

		JButton spBtnAceptar = new JButton("Aceptar");
		spBtnAceptar.setFocusable(false);
		spBtnAceptar.setBounds(337, 280, 89, 23);
		spPanelSeleccionPelis.add(spBtnAceptar);

		JButton ssBtnAtras = new JButton("Atras");
		ssBtnAtras.setBounds(112, 407, 113, 23);
		ssPanelSeleccionSesiones.add(ssBtnAtras);

		JButton ssBtnConfirmar = new JButton("Confirmar");
		ssBtnConfirmar.setBounds(353, 407, 130, 23);
		ssPanelSeleccionSesiones.add(ssBtnConfirmar);

		// TextFields

				ssTextTitulo = new JTextField();
				ssTextTitulo.setColumns(10);
				ssTextTitulo.setBounds(211, 167, 204, 20);
				ssPanelSeleccionSesiones.add(ssTextTitulo);

				ssTextHora = new JTextField();
				ssTextHora.setColumns(10);
				ssTextHora.setBounds(211, 323, 102, 20);
				ssPanelSeleccionSesiones.add(ssTextHora);

				ssTextPrecio = new JTextField();
				ssTextPrecio.setColumns(10);
				ssTextPrecio.setBounds(211, 218, 102, 20);
				ssPanelSeleccionSesiones.add(ssTextPrecio);

				ssTextSala = new JTextField();
				ssTextSala.setColumns(10);
				ssTextSala.setBounds(211, 270, 102, 20);
				ssPanelSeleccionSesiones.add(ssTextSala);
		
		// JLists

		JList<String> spListaPeliculas = new JList<String>();
		spListaPeliculas.setBounds(43, 166, 250, 248);
		spPanelSeleccionPelis.add(spListaPeliculas);

		// JComboBox

		JComboBox<String> ssComboBoxSesiones = new JComboBox<String>();
		ssComboBoxSesiones.setBounds(211, 103, 204, 22);
		ssPanelSeleccionSesiones.add(ssComboBoxSesiones);

		// Action listeners

		bBotonBienvenida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bPanelBienvenida.setVisible(false);
				scPanelSeleccionCines.setVisible(true);
				spPanelSeleccionPelis.setVisible(false);
				ssPanelSeleccionSesiones.setVisible(false);
			}
		});

		spBtnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bPanelBienvenida.setVisible(false);
				spPanelSeleccionPelis.setVisible(false);
				scPanelSeleccionCines.setVisible(true);
			}
		});

		scSeleccionBtnCine1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listModel.clear();
				titulos.clear();
				bPanelBienvenida.setVisible(false);
				scPanelSeleccionCines.setVisible(false);
				spPanelSeleccionPelis.setVisible(true);

				peliculas = gestorPeliculas.obtenerPeliculaPorCine(1);
				
				if (null != peliculas) {
					for (Pelicula pelicula : peliculas) {
						listModel.addElement(pelicula.getTitulo());
					}
				}
				
				spListaPeliculas.setModel(listModel);
			}
		});

		scSeleccionBtnCine2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listModel.clear();
				titulos.clear();
				bPanelBienvenida.setVisible(false);
				scPanelSeleccionCines.setVisible(false);
				spPanelSeleccionPelis.setVisible(true);

				peliculas = gestorPeliculas.obtenerPeliculaPorCine(2);
				if (null != peliculas) {
					for (Pelicula pelicula : peliculas) {
						listModel.addElement(pelicula.getTitulo());
					}
				}
				
				spListaPeliculas.setModel(listModel);
			}
		});
		scSeleccionBtnCine3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listModel.clear();
				titulos.clear();
				bPanelBienvenida.setVisible(false);
				scPanelSeleccionCines.setVisible(false);
				spPanelSeleccionPelis.setVisible(true);

				peliculas = gestorPeliculas.obtenerPeliculaPorCine(3);
				if (null != peliculas) {
					for (Pelicula pelicula : peliculas) {
						listModel.addElement(pelicula.getTitulo());
					}
				}
				
				spListaPeliculas.setModel(listModel);
			}
		});
		scSeleccionBtnCine4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listModel.clear();
				titulos.clear();
				bPanelBienvenida.setVisible(false);
				scPanelSeleccionCines.setVisible(false);
				spPanelSeleccionPelis.setVisible(true);

				peliculas = gestorPeliculas.obtenerPeliculaPorCine(4);
				if (null != peliculas) {
					for (Pelicula pelicula : peliculas) {
						listModel.addElement(pelicula.getTitulo());
					}
				}
				
				spListaPeliculas.setModel(listModel);
			}
		});
		scBtnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (listaFull == 0) {
					System.exit(0);
				}
			}
		});
		spBtnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bPanelBienvenida.setVisible(false);
				scPanelSeleccionCines.setVisible(false);
				spPanelSeleccionPelis.setVisible(false);
				ssPanelSeleccionSesiones.setVisible(true);
				
				proyecciones = gestorProyecciones.obtenerProyeccionPorPelicula(1);
				if (null != proyecciones) {
					for (Proyeccion proyeccion : proyecciones) {
						ssComboBoxSesiones.setSelectedItem(proyeccion.getFechaHora());
					}
				}
				
			}
		});
		ssBtnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bPanelBienvenida.setVisible(false);
				scPanelSeleccionCines.setVisible(false);
				spPanelSeleccionPelis.setVisible(true);
				ssPanelSeleccionSesiones.setVisible(false);
			}
		});
		ssBtnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bPanelBienvenida.setVisible(false);
				scPanelSeleccionCines.setVisible(true);
				spPanelSeleccionPelis.setVisible(false);
				ssPanelSeleccionSesiones.setVisible(false);
			}
		});
	}
}
