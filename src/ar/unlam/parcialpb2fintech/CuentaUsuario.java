package ar.unlam.parcialpb2fintech;

public class CuentaUsuario extends Usuario {
	
		private Long cvu;
		private Double saldoEnPesos;
		private Double saldoEnBitcoins;
		private Double saldoEnEtherum;
		private Double saldoEnDai;
		private TipoDeMoneda tipoDeMoneda;
		
		public CuentaUsuario(Long cvu, Double saldoEnPesos, Double saldoEnBitcoins, Double saldoEnEtherum,
				Double saldoEnDai) {
			this.cvu = cvu;
			this.saldoEnPesos = saldoEnPesos;
			this.saldoEnBitcoins = saldoEnBitcoins;
			this.saldoEnEtherum = saldoEnEtherum;
			this.saldoEnDai = saldoEnDai;
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
		
		public void cargarSaldo(Double pesos) {
			this.saldoEnPesos += pesos;
		}
		
		public void extraerSaldo(Double pesos) {
			if(this.saldoEnPesos > pesos) {
				this.saldoEnBitcoins -= pesos;
			}
		}


		public TipoDeMoneda getTipoDeMoneda() {
			return tipoDeMoneda;
		}


		public void setTipoDeMoneda(TipoDeMoneda tipoDeMoneda) {
			this.tipoDeMoneda = tipoDeMoneda;
		}
		
		


		
		
		
		
		
		
		
}
