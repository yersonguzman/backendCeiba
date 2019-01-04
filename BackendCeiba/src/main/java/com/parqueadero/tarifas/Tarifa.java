package com.parqueadero.tarifas;

import java.math.BigDecimal;

public class Tarifa {
	
	protected BigDecimal  ValorHora;
	protected BigDecimal  ValorDia;
	
	public Tarifa (BigDecimal ValorHora,BigDecimal ValorDia) {
		this.ValorHora = ValorHora;
		this.ValorDia = ValorDia;
	}

	public BigDecimal getValorHora() {
		return ValorHora;
	}

	public void setValorHora(BigDecimal valorHora) {
		ValorHora = valorHora;
	}

	public BigDecimal getValorDia() {
		return ValorDia;
	}

	public void setValorDia(BigDecimal valorDia) {
		ValorDia = valorDia;
	}
}
