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
import reto3.bbdd.gestor.GestorSalas;
import reto3.bbdd.gestor.GestorCines;
import reto3.bbdd.pojo.Cine;
import reto3.bbdd.pojo.Pelicula;
import reto3.bbdd.pojo.Proyeccion;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.GridLayout;

public class VentanaPrincipal {

	private JFrame frame;

	private GestorCines gestorCines = new GestorCines();
	private GestorPeliculas gestorPeliculas = new GestorPeliculas();
	private GestorProyecciones gestorProyecciones = new GestorProyecciones();
	private GestorSalas gestorSalas = new GestorSalas();
	
	private ArrayList<Cine> cines = new ArrayList<Cine>(gestorCines.obtenerTodosLosCines());
	private ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
	private ArrayList<Proyeccion> proyecciones = new ArrayList<Proyeccion>();

	private int listaFull = 0;
	private String tituloSeleccionado = null;

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

		JPanel panelMultiButton = new JPanel();
		panelMultiButton.setBounds(20, 135, 520, 250);
		scPanelSeleccionCines.add(panelMultiButton);
		panelMultiButton.setLayout(new GridLayout(0, 2, 0, 0));
		
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
		ssTextTitulo.setEditable(false);
		ssTextTitulo.setColumns(10);
		ssTextTitulo.setBounds(211, 167, 204, 20);
		ssPanelSeleccionSesiones.add(ssTextTitulo);

		ssTextHora = new JTextField();
		ssTextHora.setEditable(false);
		ssTextHora.setColumns(10);
		ssTextHora.setBounds(211, 218, 102, 20);
		ssPanelSeleccionSesiones.add(ssTextHora);

		ssTextPrecio = new JTextField();
		ssTextPrecio.setEditable(false);
		ssTextPrecio.setColumns(10);
		ssTextPrecio.setBounds(211, 270, 102, 20);
		ssPanelSeleccionSesiones.add(ssTextPrecio);

		ssTextSala = new JTextField();
		ssTextSala.setEditable(false);
		ssTextSala.setColumns(10);
		ssTextSala.setBounds(211, 323, 102, 20);
		ssPanelSeleccionSesiones.add(ssTextSala);

		// JLists

		JList<String> spListaPeliculas = new JList<String>();
		spListaPeliculas.setBounds(43, 166, 250, 248);
		spPanelSeleccionPelis.add(spListaPeliculas);
		
		JLabel spLblNombreCine = new JLabel("*");
		spLblNombreCine.setBounds(200, 30, 200, 14);
		spPanelSeleccionPelis.add(spLblNombreCine);

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

		scBtnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (listaFull == 0) {
					System.exit(0);
				}
			}
		});
		spBtnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int codCine=0;
				codCine=gestorCines.obtenerCodCinePorNombre(spLblNombreCine.getText());
				ssComboBoxSesiones.removeAllItems();
				bPanelBienvenida.setVisible(false);
				scPanelSeleccionCines.setVisible(false);
				spPanelSeleccionPelis.setVisible(false);
				ssPanelSeleccionSesiones.setVisible(true);

				tituloSeleccionado = spListaPeliculas.getSelectedValue();
				
				proyecciones = gestorProyecciones.obtenerProyeccionesPorPelicula(tituloSeleccionado, codCine);
				if (null != proyecciones) {
					for (Proyeccion proyeccion : proyecciones) {
						ssTextTitulo.setText(tituloSeleccionado);
						ssComboBoxSesiones.addItem(proyeccion.getFecha().toString());
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
		
		for(Cine cine : cines){
			String name = cine.getNombre();
			JButton button = new JButton(name);
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					listModel.clear();
					bPanelBienvenida.setVisible(false);
					scPanelSeleccionCines.setVisible(false);
					spPanelSeleccionPelis.setVisible(true);
					spLblNombreCine.setText(cine.getNombre()); 
					peliculas = gestorPeliculas.obtenerPeliculaPorCine(cine.getCodCine());
					if (null != peliculas) {
						for (Pelicula pelicula : peliculas) {
							listModel.addElement(pelicula.getTitulo());
						}
					}
					spListaPeliculas.setModel(listModel);
				}
			});
			panelMultiButton.add(button);
		}
		ssComboBoxSesiones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ssTextHora.setText(proyecciones.get(ssComboBoxSesiones.getSelectedIndex()).getHora().toString());
				ssTextPrecio.setText(Float.valueOf(proyecciones.get(ssComboBoxSesiones.getSelectedIndex()).getPrecio()).toString());
				ssTextSala.setText(Integer.toString(gestorSalas.getNumSalaPorCodSala(proyecciones.get(ssComboBoxSesiones.getSelectedIndex()).getCodSala())));
			}
		});
	}
}
