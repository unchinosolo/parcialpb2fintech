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
	
	
	

}
