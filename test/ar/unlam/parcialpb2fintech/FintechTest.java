package ar.unlam.parcialpb2fintech;

import static org.junit.Assert.*;

import static org.junit.Assert.assertEquals;


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
		CuentaUsuario nuevaCuenta = new CuentaUsuario(1223652544455L);
		nuevaCuenta.cargarSaldo(2000.0);
		
		assertEquals(2000.0,nuevaCuenta.getSaldoEnPesos(), 0.01);
		
	}
	
	@Test
	public void queSePuedaComprarBitcoinsA_200_Pesos() 
	{
		CuentaUsuario nuevacuenta = new CuentaUsuario(2365252581L);
		nuevacuenta.cargarSaldo(2000.0);
		nuevacuenta.comprarCriptomonedas(TipoDeMoneda.BITCOIN, 1000.0);
		
		assertEquals(5.0, nuevacuenta.getSaldoEnBitcoins(),0.01);
		
	}
	
	@Test
	public void queSePuedaComprarEtherumA_100_Pesos() 
	{
		CuentaUsuario nuevacuenta = new CuentaUsuario(2365252581L);
		nuevacuenta.cargarSaldo(2000.0);
		nuevacuenta.comprarCriptomonedas(TipoDeMoneda.ETHERUM, 1000.0);
		
		assertEquals(10.0, nuevacuenta.getSaldoEnEtherum(),0.01);
	}
	
	@Test
	public void queSePuedaComprarDaiA_50_Pesos() 
	{
		CuentaUsuario nuevacuenta = new CuentaUsuario(2365252581L);
		nuevacuenta.cargarSaldo(2000.0);
		nuevacuenta.comprarCriptomonedas(TipoDeMoneda.DAI, 1000.0);
		
		assertEquals(20.0, nuevacuenta.getSaldoEnDai(),0.01);
	}
	
	@Test
	public void queSePuedaTenerDivididoElSaldoEnPesosYEnCripto() 
	{
		CuentaUsuario nuevacuenta = new CuentaUsuario(2365252581L);
		nuevacuenta.cargarSaldo(2000.0);
		nuevacuenta.comprarCriptomonedas(TipoDeMoneda.DAI, 1000.0);
		
		assertEquals(20.0, nuevacuenta.getSaldoEnDai(),0.01);
		assertEquals(1000.0, nuevacuenta.getSaldoEnPesos(),0.01);
	}
	
	@Test
	public void queSePuedaRetirarPesos() 
	{
		CuentaUsuario nuevacuenta = new CuentaUsuario(2365252581L);
		nuevacuenta.cargarSaldo(2000.0);
		nuevacuenta.extraerSaldo(1000.0);
		
		assertEquals(1000.0, nuevacuenta.getSaldoEnPesos(),0.01);
	}
	
	@Test
	public void queSePuedaTransferirDineroAOtroUsuario() 
	{
		final Double SALDO_ESPERADO=1000.0;
		CuentaUsuario cuentaUno = new CuentaUsuario(2365252581L);
		cuentaUno.cargarSaldo(2000.0);
		cuentaUno.extraerSaldo(1000.0);
		CuentaUsuario cuentaDos = new CuentaUsuario(2365252999L);
		cuentaDos.cargarSaldo(1000.0);
		
		assertEquals(SALDO_ESPERADO, cuentaDos.getSaldoEnPesos(), 0.01);
		assertEquals(SALDO_ESPERADO, cuentaUno.getSaldoEnPesos(), 0.01);
	}
	
	@Test
	public void queSePuedaAgendarUnUsuarioExternoComoAmigo() 
	{
		CuentaUsuario cuentaUno = new CuentaUsuario(2365252581L);
		CuentaUsuario cuentaDos = new CuentaUsuario(2365252999L);
		
		cuentaUno.agregarCuenta(cuentaDos);
		
		assertNotNull(cuentaUno);
	}
		
	@Test
	public void queSePuedaRegistrarLasTransaccionesHechas() 
	{
		CuentaUsuario cuentaUno = new CuentaUsuario(2365252581L);
		Integer transaccionEsperada= cuentaUno.getNumeroTransaccion() +1;
		cuentaUno.cargarSaldo(1000.0);
		Integer ultimaTransaccion = cuentaUno.aumentarTransacción();		
		
		assertEquals(transaccionEsperada, ultimaTransaccion);
		
	}
	
	@Test
	public void queNoSePuedaRetirarSaldoNegativo() 
	{
		CuentaUsuario cuentaUno = new CuentaUsuario(2365252581L);
		cuentaUno.cargarSaldo(1000.0);
		assertFalse(cuentaUno.extraerSaldo(2000.0));
	}

}

