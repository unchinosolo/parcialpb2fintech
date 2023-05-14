package ar.unlam.parcialpb2fintech;

public class CuentaUsuario extends Usuario {
	
		private Long cvu;
		private double saldoEnPesos;
		private double saldoEnBitcoins;
		private double saldoEnEtherum;
		private double saldoEnDai;
		private TipoDeMoneda tipoDeMoneda;
		
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
		
		public void extraerSaldo(Double pesos) {
			if(this.saldoEnPesos > pesos) {
				this.saldoEnPesos -= pesos;
			}
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
				this.saldoEnBitcoins += monto / 200;
			}if(TipoDeMoneda.ETHERUM.equals(tipo) && saldoEnPesos >= monto) {
				this.saldoEnPesos -= monto;
				this.saldoEnEtherum += monto/100;
			}if(TipoDeMoneda.DAI.equals(tipo) && saldoEnPesos >= monto) {
				this.saldoEnPesos -= monto;
				this.saldoEnDai += monto/50;
			}
		}
		
		


		
		
		
		
		
		
		
}
