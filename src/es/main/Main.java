package es.main;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// Agrego los clientes a la lista
		ArrayList<Cliente> listaCliente = new ArrayList<>();
		Cliente c = new Cliente();
		int num = -1;
		// Cargo arrray
		listaCliente.ensureCapacity(5);
		listaCliente.add(new Cliente("Valerico", "Casanova"));
		listaCliente.add(new Cliente("Florencio", "Varela"));
		listaCliente.add(new Cliente("Gustavo", "Sosa"));
		listaCliente.add(new Cliente("Rodriguez", "Perez"));
		listaCliente.add(new Cliente("Troncha", "Toro"));
		String busqueda;
		int posicion;
		Scanner sc = new Scanner(System.in);
		do {
			// pido insersion de datos
			System.out.println("Ingrese nombre a buscar");
			busqueda = sc.next();
			// verifico solo letras
			if (c.verificacionSoloLetras(busqueda)) {	
				// llamo metodo que me busca los clientes en clase cliente
				System.out.println(c.encontrar(listaCliente, busqueda.toLowerCase()));
				num = 0;
			} else {
				System.out.println("Debe ingresar solo letras");
			}
		} while (num != 0);
	}
}
