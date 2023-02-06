package reto3.vista;

public class Menu {

	// Scanner y array
		private Scanner teclado = null;
		private int numeroArray[] = null;

		public Menu() {
			numeroArray = new int[10];

		}

		public void iniciar() {
			teclado = new Scanner(System.in);
			int opcion = 0;
			do {
				opcion = opcionMenu();
				if (opcion != 0) {
					ejecutarOpcionMenu(opcion);
					System.out.println(" ");
				}
			} while (opcion != 0);
			System.out.print("Adios!!!");
		}

		// Opciones del menu
		private int opcionMenu() {
			int ret = 0;
			do {
				try {
					escribirMenu();
					System.out.print("Elija una opcion: ");
					ret = teclado.nextInt();
					teclado.nextLine();
				} catch (Exception e) {
					teclado.nextLine();
					ret = -1;
				}
			} while ((ret < 0) && (ret > 7));
			return ret;
		}

		// Escribe los literales del menu
		private void escribirMenu() {

			System.out.println("1.Introducir un valor");
			System.out.println("2.Buscar un numero");
			System.out.println("3.Borrar un numero");
			System.out.println("0.Salir");
		}
		// ----------------- TECLADO ---------------------

		// Lee del teclado un numero
		private int leerOperandoInt() {
			int ret = 0;
			do {
				try {
					System.out.print(" : ");
					ret = teclado.nextInt();
					teclado.nextLine();
				} catch (Exception e) {
					teclado.nextLine();
					ret = -1;
				}
			} while (ret < 0);
			return ret;
		}

		// Lee del teclado un texto
		private String leerOperandoText() {
			String ret = null;
			try {
				System.out.print(" : ");
				ret = teclado.nextLine();
			} catch (Exception e) {
				teclado.nextLine();
			}
			return ret;
		}
		// ----------------- OPCIONES ---------------------

		// Ejecuta la opcion de menu elegida
		private void ejecutarOpcionMenu(int opcion) {
			switch (opcion) {
			case 1:
				introducirUnValor();
				break;

			case 2:
				buscarUnValor();
				break;

			case 3:
				borrarUnValor();
				break;
			}
		}
}
