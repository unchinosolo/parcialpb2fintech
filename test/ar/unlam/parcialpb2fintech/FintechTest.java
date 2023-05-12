package ar.unlam.parcialpb2fintech;

import static org.junit.Assert.*;

import org.junit.Test;

public class FintechTest {
	
	Fintech nuevaApp = new Fintech("Liberty Coins");

	@Test
	public void queSePuedaCrearUnUsuarioNuevo() 
	{
		String usuario  = "Leo35";
		String nombre = "Leonel";
		String apellido = "Gonzalez";
		Integer dni = 25698745;
		
		Usuario nuevo = new Usuario(usuario, nombre, apellido, dni);
		nuevaApp.agregarUsuario(nuevo);
		
		assertEquals(1,nuevaApp.cantidadDeUsuarios());
		
	}
	
	@Test
	public void queNoSePuedanCrearUsuariosRepetidos() 
	{
		String usuario  = "Leo35";
		String nombre = "Leonel";
		String apellido = "Gonzalez";
		Integer dni = 25698745;
		
		Usuario nuevo = new Usuario(usuario, nombre, apellido, dni);
		Usuario copia = nuevo;
		nuevaApp.agregarUsuario(nuevo);
		nuevaApp.agregarUsuario(copia);
		
		assertEquals(1,nuevaApp.cantidadDeUsuarios());
	}
	
	@Test
	public void queSePuedaDepositarEnPesos() 
	{
		
	}
	
	@Test
	public void queSePuedaComprarBitcoinsA_200_Pesos() 
	{
		
	}
	
	@Test
	public void queSePuedaComprarEtherumA_100_Pesos() 
	{
		
	}
	
	@Test
	public void queSePuedaComprarDaiA_50_Pesos() 
	{
		
	}
	
	@Test
	public void queSePuedaTenerDivididoElSaldoEnPesosYEnCripto() 
	{
		
	}
	
	@Test
	public void queSePuedaRetirarCriptomonedas() 
	{
		
	}
	
	@Test
	public void queSePuedaRetirarPesos() 
	{
		
	}
	
	@Test
	public void queSePuedaTransferirDineroAOtroUsuario() 
	{
		
	}
	
	@Test
	public void queSePuedaAgendarUnUsuarioExternoComoAmigo() 
	{
		
	}
	
	@Test
	public void queSeAcrediteUnExtraDe_5_PorcientoDeBitcoinEnUsuariosQueSuperenElAñoDeUso() 
	{
		
	}
	
	@Test
	public void queSePuedaRegistrarLasTransaccionesHechas() 
	{
		
	}
	
	@Test
	public void queNoSePuedaRetirarSaldoNegativo() 
	{
		
	}

}
