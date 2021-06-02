package es.main;

import java.util.ArrayList;

public class Cliente {
	private String nombre;
	private String apellido;

	public Cliente(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public Cliente() {
	}

	public String datos() {
		return "El cliente " + nombre + " " + apellido + ". Se encuentra en la posicion";
	}

	public String getApellido() {
		return apellido;
	}

//Busca al cliente
	public String encontrar(ArrayList<Cliente> list, String buscar) {
		String a = null;
		boolean b = false;
		int id = -1;
		for (int i = 0; i < list.size(); i++) {
			if (buscar.equals(list.get(i).getApellido().toLowerCase())) {
				b = true;
				id = i;
				break;
			}
		}
		if (b == true) {
			a = "Encontrado en el indice " + id;
		} else {
			a = "No se encontraron resultados";
		}

		return a;
	}

	// Verifica solo letras
	public boolean verificacionSoloLetras(String cadena) {
		for (int x = 0; x < cadena.length(); x++) {
			char c = cadena.charAt(x);
			if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == ' ')) {
				return false;
			}
		}
		return true;
	}
}
