package reto3.vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import reto3.bbdd.gestor.GestorPeliculas;
import reto3.bbdd.gestor.GestorProyecciones;
import reto3.bbdd.gestor.GestorSalas;
import reto3.bbdd.gestor.GestorCines;
import reto3.bbdd.gestor.GestorClientes;
import reto3.bbdd.gestor.GestorEntradas;
import reto3.bbdd.pojo.Cine;
import reto3.bbdd.pojo.Cliente;
import reto3.bbdd.pojo.Entrada;
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
	private ArrayList<Entrada> entradas = new ArrayList<Entrada>();

	private int listaFull = 0;
	private String tituloSeleccionado = null;
	private int fechaSeleccionada = 0;
	private Time horaSeleccionada = null;
	private Float precioSeleccionado = null;
	private int numSalaSeleccionada = 0;
	private String nombreCine = null;
	private int codCine = 0;

	private DefaultListModel<String> listModel = new DefaultListModel<String>();
	 DefaultTableModel model = new DefaultTableModel();

	private JTextField ssTextTitulo;
	private JTextField ssTextHora;
	private JTextField ssTextPrecio;
	private JTextField ssTextSala;
	private JTable table;

	private JTextField txtNombre = null;
	private JTextField txtApellido = null;
	private JTextField txtDni = null;
	private JTextField txtUsuario = null;
	private JTextField txtUserLogin;

	private JPasswordField txtUserPass;
	private JPasswordField txtContras;

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
		bPanelBienvenida.setBounds(-90, -153, 1028, 857);
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

		JPanel panelRegistro = new JPanel();
		panelRegistro.setBounds(0, 0, 564, 441);
		frame.getContentPane().add(panelRegistro);
		panelRegistro.setLayout(null);
		panelRegistro.setVisible(false);

		JPanel ccPanelCarrito = new JPanel();
		ccPanelCarrito.setBounds(0, 0, 564, 441);
		frame.getContentPane().add(ccPanelCarrito);
		ccPanelCarrito.setLayout(null);
		ccPanelCarrito.setVisible(false);

		JPanel panelLogin = new JPanel();
		panelLogin.setBounds(0, 0, 564, 441);
		frame.getContentPane().add(panelLogin);
		panelLogin.setVisible(false);
		panelLogin.setLayout(null);

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

		JLabel lblNewLabel = new JLabel("Regristrarme");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(145, 11, 135, 26);
		panelRegistro.add(lblNewLabel);

		JLabel lblNewLabelNombre = new JLabel("Nombre");
		lblNewLabelNombre.setBounds(81, 208, 46, 14);
		panelRegistro.add(lblNewLabelNombre);

		JLabel lblNewLabelApellido = new JLabel("Apellido");
		lblNewLabelApellido.setBounds(81, 233, 46, 14);
		panelRegistro.add(lblNewLabelApellido);

		JLabel lblNewLabelDni = new JLabel("DNI");
		lblNewLabelDni.setBounds(81, 261, 46, 14);
		panelRegistro.add(lblNewLabelDni);

		JLabel lblNewLabelSexo = new JLabel("Sexo");
		lblNewLabelSexo.setBounds(81, 286, 46, 14);
		panelRegistro.add(lblNewLabelSexo);

		JLabel lblNewLabelUsuario = new JLabel("Usuario");
		lblNewLabelUsuario.setBounds(293, 236, 46, 14);
		panelRegistro.add(lblNewLabelUsuario);

		JLabel lblNewLabelContraseña = new JLabel("Contraseña");
		lblNewLabelContraseña.setBounds(283, 279, 56, 14);
		panelRegistro.add(lblNewLabelContraseña);

		JLabel lblCarrito = new JLabel("CARRITO");
		lblCarrito.setBounds(243, 81, 89, 48);
		lblCarrito.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ccPanelCarrito.add(lblCarrito);

		JLabel spLblNombreCine = new JLabel("*");
		spLblNombreCine.setBounds(200, 30, 200, 14);
		spPanelSeleccionPelis.add(spLblNombreCine);

		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setBounds(249, 100, 66, 30);
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panelLogin.add(lblLogin);

		JLabel lblNewLabel_1 = new JLabel("Usuario");
		lblNewLabel_1.setBounds(238, 172, 46, 14);
		panelLogin.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Contraseña");
		lblNewLabel_2.setBounds(238, 234, 72, 14);
		panelLogin.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("¿No tienes cuenta? Registrate gratis");
		lblNewLabel_3.setBounds(193, 15, 184, 14);
		panelLogin.add(lblNewLabel_3);

		// Buttons

		JButton bBotonBienvenida = new JButton("BIENVENIDO");
		bBotonBienvenida.setIcon(new ImageIcon("C:\\Users\\in1daw\\git\\Grupo4Reto3.1\\reto3\\img\\bienvenida.png"));
		bBotonBienvenida.setForeground(Color.BLACK);
		bBotonBienvenida.setFont(new Font("Yu Gothic", Font.PLAIN, 50));
		bBotonBienvenida.setFocusable(false);
		bBotonBienvenida.setBackground(Color.WHITE);
		bBotonBienvenida.setBounds(92, 154, 564, 441);
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

		JButton btnAtrasRegistro = new JButton("Atrás");
		btnAtrasRegistro.setBounds(181, 361, 89, 23);
		panelRegistro.add(btnAtrasRegistro);

		JButton btnAceptarRegistro = new JButton("Aceptar");
		btnAceptarRegistro.setBounds(349, 361, 89, 23);
		panelRegistro.add(btnAceptarRegistro);

		JButton btnPagarCarrito = new JButton("Pagar");
		btnPagarCarrito.setBounds(411, 85, 89, 23);
		ccPanelCarrito.add(btnPagarCarrito);

		JButton btnAtrasCarrito = new JButton("Atrás");
		btnAtrasCarrito.setBounds(10, 81, 89, 23);
		ccPanelCarrito.add(btnAtrasCarrito);

		JButton btnRegistrarse = new JButton("Registrarme");
		btnRegistrarse.setBounds(440, 11, 104, 23);
		panelLogin.add(btnRegistrarse);

		JButton btnAccederCuenta = new JButton("Acceder");
		btnAccederCuenta.setBounds(221, 334, 89, 23);
		panelLogin.add(btnAccederCuenta);

		JButton btnAtrasLogin = new JButton("Atrás");
		btnAtrasLogin.setBounds(10, 11, 89, 23);
		panelLogin.add(btnAtrasLogin);

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

		txtNombre = new JTextField();
		txtNombre.setBounds(125, 205, 86, 20);
		panelRegistro.add(txtNombre);
		txtNombre.setColumns(10);

		txtApellido = new JTextField();
		txtApellido.setBounds(125, 233, 86, 20);
		panelRegistro.add(txtApellido);
		txtApellido.setColumns(10);

		txtDni = new JTextField();
		txtDni.setBounds(125, 258, 86, 20);
		panelRegistro.add(txtDni);
		txtDni.setColumns(10);

		txtUsuario = new JTextField();
		txtUsuario.setBounds(349, 235, 86, 20);
		panelRegistro.add(txtUsuario);
		txtUsuario.setColumns(10);

		txtContras = new JPasswordField();
		txtContras.setBounds(349, 276, 90, 20);
		panelRegistro.add(txtContras);

		txtUserLogin = new JTextField();
		txtUserLogin.setBounds(221, 197, 86, 20);
		panelLogin.add(txtUserLogin);
		txtUserLogin.setColumns(10);

		txtUserPass = new JPasswordField();
		txtUserPass.setBounds(221, 259, 86, 20);
		panelLogin.add(txtUserPass);

		// JLists

		JList<String> spListaPeliculas = new JList<String>();
		spListaPeliculas.setBounds(43, 166, 250, 248);
		spPanelSeleccionPelis.add(spListaPeliculas);

		// JComboBox

		JComboBox<String> ssComboBoxSesiones = new JComboBox<String>();
		ssComboBoxSesiones.setBounds(211, 103, 204, 22);
		ssPanelSeleccionSesiones.add(ssComboBoxSesiones);

		JComboBox<?> comboBoxSexo = new JComboBox();
		comboBoxSexo.setModel(new DefaultComboBoxModel(new String[] { "Seleccione", "Hombre", "Mujer" }));
		comboBoxSexo.setBounds(125, 286, 86, 22);
		panelRegistro.add(comboBoxSexo);

		// JTable

		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{},
				{},
				{},
				{},
			},
			new String[] {
			}
		));
		table.setBounds(10, 241, 544, 32);
		table.setToolTipText("");
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		ccPanelCarrito.add(table);
  

		
		// Action Listeners
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelLogin.setVisible(false);
				panelRegistro.setVisible(true);
			}
		});

		btnAccederCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GestorClientes gestCli = new GestorClientes();
				String pwd = new String(txtUserPass.getPassword());
				if (gestCli.validarLogin(txtUserLogin.getText(), pwd)) {
					panelLogin.setVisible(false);

				}

			}
		});

		btnAtrasLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelLogin.setVisible(false);
				spPanelSeleccionPelis.setVisible(true);
			}
		});

		btnPagarCarrito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelLogin.setVisible(true);
				ccPanelCarrito.setVisible(false);
			}
		});

		btnAtrasCarrito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				spPanelSeleccionPelis.setVisible(true);
				ccPanelCarrito.setVisible(false);
			}
		});

		btnAceptarRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GestorClientes gestorCliente = new GestorClientes();
				Cliente clienteNuevo = new Cliente();

				clienteNuevo.setDNI(txtDni.getText());
				clienteNuevo.setNombre(txtNombre.getText());
				clienteNuevo.setApellido(txtApellido.getText());
				clienteNuevo.setSexo(comboBoxSexo.getSelectedItem().toString());
				clienteNuevo.setUsuario(txtUsuario.getText());
				String pwd = new String(txtContras.getPassword());
				clienteNuevo.setContraseña(pwd);

				gestorCliente.añadirUsuario(clienteNuevo);

				JFrame jFrame = new JFrame();
				JOptionPane.showMessageDialog(jFrame, "Cuenta creada");
				panelRegistro.setVisible(false);
				panelLogin.setVisible(true);
			}
		});

		btnAtrasRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelRegistro.setVisible(false);
				panelLogin.setVisible(true);
			}
		});

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
				if (table == null) {
					System.exit(0);
				} else {
					scPanelSeleccionCines.setVisible(false);
					ccPanelCarrito.setVisible(true);
				}
			}
		});
		spBtnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				codCine = gestorCines.obtenerCodCinePorNombre(spLblNombreCine.getText());
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

		for (Cine cine : cines) {
			ArrayList<String> repetidos = new ArrayList<String>();
			String name = cine.getNombre();
			JButton button = new JButton(name);
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					listModel.clear();
					boolean repetido = false;
					bPanelBienvenida.setVisible(false);
					scPanelSeleccionCines.setVisible(false);
					spPanelSeleccionPelis.setVisible(true);
					spLblNombreCine.setText(cine.getNombre());
					peliculas = gestorPeliculas.obtenerPeliculaPorCine(cine.getCodCine());
					if (null != peliculas) {
						for (Pelicula pelicula : peliculas) {
							repetido = false;
							for (int i = 0; i < repetidos.size(); i++) {
								if (pelicula.getTitulo().equalsIgnoreCase(repetidos.get(i)) == true) {
									repetido = true;
								}
							}
							if (repetido == false) {
								listModel.addElement(pelicula.getTitulo());
								repetidos.add(pelicula.getTitulo());
							}
						}
					}
					spListaPeliculas.setModel(listModel);
					repetidos.clear();
				}
			});
			panelMultiButton.add(button);
		}
		ssComboBoxSesiones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ssTextHora.setText(proyecciones.get(ssComboBoxSesiones.getSelectedIndex()).getHora().toString());
				ssTextPrecio.setText(
						Float.valueOf(proyecciones.get(ssComboBoxSesiones.getSelectedIndex()).getPrecio()).toString());
				ssTextSala.setText(Integer.toString(gestorSalas
						.getNumSalaPorCodSala(proyecciones.get(ssComboBoxSesiones.getSelectedIndex()).getCodSala())));

				fechaSeleccionada = ssComboBoxSesiones.getSelectedIndex();
				horaSeleccionada = Time.valueOf(ssTextHora.getText());
				precioSeleccionado = Float.valueOf(ssTextPrecio.getText());
				numSalaSeleccionada = Integer.valueOf(ssTextSala.getText());
	
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
		
				nombreCine = gestorCines.getNombrePorCodCine(codCine);
				
				if(table != null){
				model.addColumn("NombreCine");
				model.addColumn("Titulo");	
		        model.addColumn("Fecha");
		        model.addColumn("Hora");
		    	model.addColumn("Precio");
		        model.addColumn("NumSala");
				}
				
		        model.addRow(new Object[]{nombreCine,tituloSeleccionado, fechaSeleccionada, horaSeleccionada, precioSeleccionado, numSalaSeleccionada});
		        
		        table.setModel(model);		
			}
		});
	}
}
