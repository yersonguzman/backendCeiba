package com.parqueadero.modelsTest;

public class VehiculoTestDataBuilder {

		private static final String placa = "LAT605";
		private static final String tipo =  "carro";
		private static final Integer cilindraje = "500";
	
	
	private String placa ;
		private Integer cilindraje;
		private String tipo;
		
		public VehiculoTestDataBuilder(String placa, Integer cilindraje, String tipo) {
			super();
			this.placa = placa;
			this.cilindraje = cilindraje;
			this.tipo = tipo;
		}

		public String getPlaca() {
			return placa;
		}

		public void setPlaca(String placa) {
			this.placa = placa;
		}

		public Integer getCilindraje() {
			return cilindraje;
		}

		public void setCilindraje(Integer cilindraje) {
			this.cilindraje = cilindraje;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

}
