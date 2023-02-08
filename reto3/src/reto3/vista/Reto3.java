package reto3.vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JList;

public class Reto3 {

	private JFrame frame;

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

		JPanel panelBienvenida = new JPanel();
		panelBienvenida.setBounds(0, 0, 564, 441);
		frame.getContentPane().add(panelBienvenida);
		panelBienvenida.setLayout(null);

		JPanel panelSelecCines = new JPanel();
		panelSelecCines.setBounds(0, 0, 564, 441);
		frame.getContentPane().add(panelSelecCines);
		panelSelecCines.setLayout(null);
		
		JPanel panelSelecPelis = new JPanel();
		panelSelecPelis.setLayout(null);
		panelSelecPelis.setBounds(0, 0, 564, 441);
		frame.getContentPane().add(panelSelecPelis);

		JButton botonBienvenida = new JButton("\r\n\r\n\r\n\r\nBIENVENIDO\r\n");
		botonBienvenida.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				panelBienvenida.setVisible(false);
				panelSelecCines.setVisible(true);

			}

		});

		botonBienvenida.setIcon(new ImageIcon("C:\\Users\\in1dw3\\Desktop\\Ibai\\Reto 3\\bienvenida.png"));
		botonBienvenida.setBounds(0, 0, 564, 441);
		botonBienvenida.setForeground(Color.BLACK);
		botonBienvenida.setFont(new Font("Yu Gothic", Font.PLAIN, 50));
		botonBienvenida.setBackground(new Color(255, 255, 240));
		panelBienvenida.add(botonBienvenida);

		JLabel labelSeleccionCines = new JLabel("Selecciona un Cine");
		labelSeleccionCines.setHorizontalAlignment(SwingConstants.CENTER);
		labelSeleccionCines.setFont(new Font("Tahoma", Font.PLAIN, 24));
		labelSeleccionCines.setBounds(33, 69, 241, 57);
		panelSelecCines.add(labelSeleccionCines);

		JLabel seleccionCinesLogo = new JLabel("");
		seleccionCinesLogo.setBounds(376, 11, 137, 156);
		panelSelecCines.add(seleccionCinesLogo);

		JButton seleccionBtnCine1 = new JButton("Cine1\r\n");
		seleccionBtnCine1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panelBienvenida.setVisible(false);
				panelSelecCines.setVisible(false);
				panelSelecPelis.setVisible(true);
				
			}
		});
		seleccionCinesLogo.setIcon(new ImageIcon("C:\\Users\\in1dw3\\Desktop\\Ibai\\Reto 3\\bienvenida.png"));
		seleccionBtnCine1.setBounds(97, 184, 121, 74);
		panelSelecCines.add(seleccionBtnCine1);

		JButton seleccionBtnCine2 = new JButton("Cine2\r\n");
		seleccionBtnCine2.setBounds(317, 184, 127, 74);
		panelSelecCines.add(seleccionBtnCine2);

		JButton seleccionBtnCine3 = new JButton("Cine3");
		seleccionBtnCine3.setBounds(97, 282, 121, 74);
		panelSelecCines.add(seleccionBtnCine3);

		JButton seleccionBtnCine4 = new JButton("Cine4\r\n");
		seleccionBtnCine4.setBounds(317, 282, 127, 74);
		panelSelecCines.add(seleccionBtnCine4);

		JButton btnFinalizar = new JButton("FINALIZAR");
		btnFinalizar.setBounds(221, 392, 96, 38);
		panelSelecCines.add(btnFinalizar);
		
		JLabel labelSeleccionPelis = new JLabel("Selecciona una Pelicula");
		labelSeleccionPelis.setFont(new Font("Tahoma", Font.PLAIN, 24));
		labelSeleccionPelis.setBounds(43, 101, 250, 37);
		panelSelecPelis.add(labelSeleccionPelis);
		
		JLabel labelLogoPelis = new JLabel("");
		labelLogoPelis.setIcon(new ImageIcon("C:\\Users\\in1dw3\\Desktop\\Ibai\\Reto 3\\bienvenida.png"));
		labelLogoPelis.setBounds(362, 11, 192, 188);
		panelSelecPelis.add(labelLogoPelis);
		
		JList listaPeliculas = new JList();
		listaPeliculas.setForeground(Color.WHITE);
		listaPeliculas.setBackground(Color.BLACK);
		listaPeliculas.setBounds(298, 406, -261, -221);
		panelSelecPelis.add(listaPeliculas);

	}

}
