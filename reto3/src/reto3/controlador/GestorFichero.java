package reto3.controlador;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.Time;

import javax.swing.JList;
import javax.swing.JTextField;

import reto3.bbdd.gestor.GestorCines;
import reto3.vista.VentanaPrincipal;


public class GestorFichero {

	VentanaPrincipal ventpri = new VentanaPrincipal();
	
	private GestorCines gestorCines = new GestorCines();
	private JTextField ssTextTitulo;
	private JTextField ssTextHora;
	private JTextField ssTextPrecio;
	private JTextField ssTextSala;
	private JTextField ssTextFecha;
	private JList spListaPeliculas;

	
	public void ImprimirFichero() throws IOException {
	
		ventpri.tituloSeleccionado = (String) spListaPeliculas.getSelectedValue();
		ventpri.fechaSeleccionada = Date.valueOf(ssTextFecha.getText());
		ventpri.horaSeleccionada = Time.valueOf(ssTextHora.getText());
		ventpri.precioSeleccionado = Float.valueOf(ssTextPrecio.getText());
		ventpri.numSalaSeleccionada = Integer.valueOf(ssTextSala.getText());
		ventpri.nombreCine = gestorCines.getNombrePorCodCine(ventpri.codCine);

		FileWriter fichero = null;
		PrintWriter pw = null;
		fichero = new FileWriter("C:\\Users\\in1dw3\\Desktop\\ImprimirRecibo.txt");
		pw = new PrintWriter(fichero);
		pw.write(Date.valueOf(ssTextFecha.getText()).toString());
		pw.write(ventpri.nombreCine);
		pw.write(ventpri.tituloSeleccionado);
		pw.write((ventpri.fechaSeleccionada).toString());
		pw.write((ventpri.horaSeleccionada).toString());
		pw.write((ventpri.precioSeleccionado).toString());
		pw.write(ventpri.numSalaSeleccionada);
		fichero.close();

	};
	
	public class BasicFileManager {

		private String filePath;
		private BasicFileManager() {
		}

		public BasicFileManager(String filePath) {
			this.filePath = filePath;
		}

		public void write() throws IOException {
			FileWriter fileWriter = new FileWriter(filePath);
			doWrite(fileWriter, filePath);
			fileWriter.close();
		}

		private void doWrite(FileWriter fileWriter, String nombreCine) {
			PrintWriter printWriter = new PrintWriter(fileWriter);
			printWriter.println(ventpri.nombreCine);
			printWriter.close();
		}
	}


}
