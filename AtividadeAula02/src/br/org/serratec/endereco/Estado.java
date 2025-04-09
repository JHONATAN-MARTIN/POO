package br.org.serratec.endereco;

public class Estado {

		private String nomeEstado;
		private String sigla;
		
		public Estado(String nomeEstado, String sigla) {
			this.nomeEstado = nomeEstado;
			this.sigla = sigla;
		}
		

		@Override
		public String toString() {
			return "Estado [nomeEstado=" + nomeEstado + ", sigla=" + sigla + "]";
		}



		public String getNomeEstado() {
			return nomeEstado;
		}

		public String getSigla() {
			return sigla;
		}
		
		
}
