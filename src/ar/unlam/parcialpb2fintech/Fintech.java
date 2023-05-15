package ar.unlam.parcialpb2fintech;

import java.util.HashSet;

public class Fintech {
	
	private String nombre;
	private HashSet<Usuario> registroDeUsuarios = new HashSet<Usuario>();

	public Fintech(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void agregarUsuario(Usuario usuario) {
		this.registroDeUsuarios.add(usuario);
	}

	public int cantidadDeUsuarios() {
		return registroDeUsuarios.size();
	}
	
	public Usuario buscarCuenta(Integer dni) {
		for(Usuario u : registroDeUsuarios) {
			if(u.getDni() == dni) {
				return u;
			}
		}
		return null;
	}

	public String listarCuentas() {
		String cuentas = "DATOS DE CUENTAS AL DIA DE LA FECHA: \n";
		
		for(Usuario u : registroDeUsuarios) {
			cuentas += u.toString() + " \n";
		}
		
		return cuentas;
	}
	
	
	public void darDeBajaAUsuario(Integer dni, String nombre, String apellido) {
		for(Usuario u : registroDeUsuarios) {
			if(u.getDni().equals(dni) && u.getNombre().equals(nombre) && u.getApellido().equals(apellido)) {
				registroDeUsuarios.remove(u);
			}
		}
	}

}
