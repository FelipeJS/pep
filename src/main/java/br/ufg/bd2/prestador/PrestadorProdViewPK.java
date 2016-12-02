package br.ufg.bd2.prestador;

import java.io.Serializable;

@SuppressWarnings("serial")
public class PrestadorProdViewPK implements Serializable {
	protected Integer cdPrestador;
	protected String mesFF;

	public PrestadorProdViewPK() {
	}

	public PrestadorProdViewPK(Integer cdPrestador, String mesFF) {
		this.cdPrestador = cdPrestador;
		this.mesFF = mesFF;
	}

}
