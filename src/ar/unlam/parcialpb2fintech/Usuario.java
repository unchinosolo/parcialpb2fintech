package ar.unlam.parcialpb2fintech;

import java.util.ArrayList;
import java.util.Objects;

public class Usuario {
	
	private String usuario;
	private String nombre;
	private String apellido;
	private Integer dni;
	private ArrayList<CuentaUsuario> cuentas = new ArrayList<CuentaUsuario>();
	
	public Usuario() { 	}
	
	public Usuario(String usuario, String nombre, String apellido, Integer dni)
	{
		this.usuario = usuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}
	
	public Usuario(String usuario, Integer dni) {
		this.usuario = usuario;
		this.dni = dni;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public ArrayList<CuentaUsuario> getCuentas() {
		return cuentas;
	}

	public void setListaDeUsuariosAmigos(ArrayList<CuentaUsuario> cuentas) {
		this.cuentas = cuentas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni, usuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Usuario other = (Usuario) obj;
		return Objects.equals(dni, other.dni) && Objects.equals(usuario, other.usuario);
	}

	public void agregarCuenta(CuentaUsuario cuentaUsuario) {
		this.cuentas.add(cuentaUsuario);
	}
	
	
	

	

}
