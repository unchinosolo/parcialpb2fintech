package ar.unlam.parcialpb2fintech;

import java.util.LinkedList;
import java.util.List;

public class CuentaUsuario extends Usuario {
		
		private final Double VALOR_BITCOIN = 200.0;
		private final Double VALOR_ETHEREUM = 100.0;
		private final Double VALOR_DAI = 50.0;
		private Long cvu;
		private double saldoEnPesos;
		private double saldoEnBitcoins;
		private double saldoEnEtherum;
		private double saldoEnDai;
		private TipoDeMoneda tipoDeMoneda;
		private Integer numeroTransaccion=0;

		
		public CuentaUsuario(Long cvu) {
			this.cvu = cvu;

		}


		public CuentaUsuario(Long cvu, Double saldoEnPesos) {
			this.cvu = cvu;
			this.saldoEnPesos = saldoEnPesos;
			
		}


		public Long getCvu() {
			return cvu;
		}


		public void setCvu(Long cvu) {
			this.cvu = cvu;
		}


		public Double getSaldoEnPesos() {
			return saldoEnPesos;
		}


		public void setSaldoEnPesos(Double saldoEnPesos) {
			this.saldoEnPesos = saldoEnPesos;
		}


		public Double getSaldoEnBitcoins() {
			return saldoEnBitcoins;
		}


		public void setSaldoEnBitcoins(Double saldoEnBitcoins) {
			this.saldoEnBitcoins = saldoEnBitcoins;
		}


		public Double getSaldoEnEtherum() {
			return saldoEnEtherum;
		}


		public void setSaldoEnEtherum(Double saldoEnEtherum) {
			this.saldoEnEtherum = saldoEnEtherum;
		}


		public Double getSaldoEnDai() {
			return saldoEnDai;
		}


		public void setSaldoEnDai(Double saldoEnDai) {
			this.saldoEnDai = saldoEnDai;
		}
		
		public void cargarSaldo(double pesos) {
			this.saldoEnPesos += pesos;
		}
		
		public Boolean extraerSaldo(Double pesos) {
			Boolean resultado = false;
			if(this.saldoEnPesos > pesos) {
				this.saldoEnPesos -= pesos; 
				resultado = true;
			}return resultado;
		}


		public TipoDeMoneda getTipoDeMoneda() {
			return tipoDeMoneda;
		}


		public void setTipoDeMoneda(TipoDeMoneda tipoDeMoneda) {
			this.tipoDeMoneda = tipoDeMoneda;
		}
		
		public void comprarCriptomonedas(TipoDeMoneda tipo, Double monto) {
			if(TipoDeMoneda.BITCOIN.equals(tipo) && saldoEnPesos >= monto) {
				this.saldoEnPesos -= monto;
				this.saldoEnBitcoins += monto / VALOR_BITCOIN;

			}if(TipoDeMoneda.ETHERUM.equals(tipo) && saldoEnPesos >= monto) {
				this.saldoEnPesos -= monto;
				this.saldoEnEtherum += monto/ VALOR_ETHEREUM;

			}if(TipoDeMoneda.DAI.equals(tipo) && saldoEnPesos >= monto) {
				this.saldoEnPesos -= monto;
				this.saldoEnDai += monto/ VALOR_DAI;

			}
		}
		
		


		public Integer getNumeroTransaccion() {
			return this.numeroTransaccion;
		}


		public void setNumeroTransaccion(Integer numeroTransaccion) {
			this.numeroTransaccion = numeroTransaccion;
		}
		
		public Integer aumentarTransacción() {
			this.numeroTransaccion ++;
			return this.getNumeroTransaccion();
		}
		

	
		
}
