package reto3.vista.paneles;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import reto3.bbdd.gestor.GestorClientes;
import reto3.bbdd.pojo.Cliente;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CrearUsuario {

	private JFrame frame;
	public JTextField txtNombre = null;
	public JTextField txtApellido = null;
	public JTextField txtDni = null;
	public JTextField txtUsuario = null;
	public JTextField txtContraseña = null;
	public JComboBox comboBoxSexo =null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrearUsuario window = new CrearUsuario();
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
	public CrearUsuario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		GestorClientes gestorCliente = new GestorClientes();

		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panelRegistro = new JPanel();
		panelRegistro.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panelRegistro);
		panelRegistro.setLayout(null);

		JLabel lblNewLabel = new JLabel("Regristrarme");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(145, 11, 135, 26);
		panelRegistro.add(lblNewLabel);

		JLabel lblNewLabelNombre = new JLabel("Nombre");
		lblNewLabelNombre.setBounds(10, 60, 46, 14);
		panelRegistro.add(lblNewLabelNombre);

		JLabel lblNewLabelApellido = new JLabel("Apellido");
		lblNewLabelApellido.setBounds(10, 96, 46, 14);
		panelRegistro.add(lblNewLabelApellido);

		JLabel lblNewLabelDni = new JLabel("DNI");
		lblNewLabelDni.setBounds(10, 132, 46, 14);
		panelRegistro.add(lblNewLabelDni);

		JLabel lblNewLabelSexo = new JLabel("Sexo");
		lblNewLabelSexo.setBounds(10, 168, 46, 14);
		panelRegistro.add(lblNewLabelSexo);

		JLabel lblNewLabelUsuario = new JLabel("Usuario");
		lblNewLabelUsuario.setBounds(224, 60, 46, 14);
		panelRegistro.add(lblNewLabelUsuario);

		JLabel lblNewLabelContraseña = new JLabel("Contraseña");
		lblNewLabelContraseña.setBounds(224, 96, 56, 14);
		panelRegistro.add(lblNewLabelContraseña);

		txtNombre = new JTextField();
		txtNombre.setBounds(74, 57, 86, 20);
		panelRegistro.add(txtNombre);
		txtNombre.setColumns(10);

		txtApellido = new JTextField();
		txtApellido.setBounds(74, 93, 86, 20);
		panelRegistro.add(txtApellido);
		txtApellido.setColumns(10);

		txtDni = new JTextField();
		txtDni.setBounds(74, 129, 86, 20);
		panelRegistro.add(txtDni);
		txtDni.setColumns(10);
		
		JComboBox comboBoxSexo = new JComboBox();
		comboBoxSexo.setModel(new DefaultComboBoxModel(new String[] { "Seleccione", "Hombre", "Mujer" }));
		comboBoxSexo.setBounds(74, 164, 86, 22);
		panelRegistro.add(comboBoxSexo);

		txtUsuario = new JTextField();
		txtUsuario.setBounds(294, 57, 86, 20);
		panelRegistro.add(txtUsuario);
		txtUsuario.setColumns(10);

		txtContraseña = new JTextField();
		txtContraseña.setBounds(294, 93, 86, 20);
		panelRegistro.add(txtContraseña);
		txtContraseña.setColumns(10);

		JButton btnNewButtonAtras = new JButton("Atrás");
		btnNewButtonAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelRegistro.setVisible(false);
			}
		});
		btnNewButtonAtras.setBounds(222, 227, 89, 23);
		panelRegistro.add(btnNewButtonAtras);

		JButton btnNewButtonAceptar = new JButton("Aceptar");
		btnNewButtonAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Cliente clienteNuevo = new Cliente();

				clienteNuevo.setNombre(txtNombre.getText());
				clienteNuevo.setApellido(txtApellido.getText());
				clienteNuevo.setDNI(txtDni.getText());
				clienteNuevo.setSexo(comboBoxSexo.getSelectedItem().toString());
				clienteNuevo.setUsuario(txtUsuario.getText());
				clienteNuevo.setContraseña(txtContraseña.getText());

				gestorCliente.añadirUsuario(clienteNuevo);

				JFrame jFrame = new JFrame();
				JOptionPane.showMessageDialog(jFrame, "Cuenta creada");
				panelRegistro.setVisible(false);
				// Ventana login()
			}
		});
		btnNewButtonAceptar.setBounds(321, 227, 89, 23);
		panelRegistro.add(btnNewButtonAceptar);

		
	}
}
