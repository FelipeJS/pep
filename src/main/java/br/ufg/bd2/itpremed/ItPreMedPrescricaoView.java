package br.ufg.bd2.itpremed;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "consulta", name = "VDIC_ITPRE_MED_PRESCRICAO")
public class ItPreMedPrescricaoView {

	@Id
	@Column(name = "CD_ITPRE_MED")
	private Integer cdItPreMed;

	@Column(name = "DS_TIP_PRESC")
	private String dsTipPresc;

	@Column(name = "DS_ITPRE_MED")
	private String dsItPreMed;

	@Column(name = "DH_REGISTRO")
	private String dhRegistro;

	@Column(name = "CD_PRE_MED")
	private Integer cdPreMed;

	@Column(name = "CD_PRESTADOR")
	private Integer cdPrestador;

	@Column(name = "MES")
	private String mes;

	@Column(name = "ANO")
	private String ano;

	public Integer getCdItPreMed() {
		return cdItPreMed;
	}

	public void setCdItPreMed(Integer cdItPreMed) {
		this.cdItPreMed = cdItPreMed;
	}

	public String getDsTipPresc() {
		return dsTipPresc;
	}

	public void setDsTipPresc(String dsTipPresc) {
		this.dsTipPresc = dsTipPresc;
	}

	public String getDsItPreMed() {
		return dsItPreMed;
	}

	public void setDsItPreMed(String dsItPreMed) {
		this.dsItPreMed = dsItPreMed;
	}

	public String getDhRegistro() {
		return dhRegistro;
	}

	public void setDhRegistro(String dhRegistro) {
		this.dhRegistro = dhRegistro;
	}

	public Integer getCdPreMed() {
		return cdPreMed;
	}

	public void setCdPreMed(Integer cdPreMed) {
		this.cdPreMed = cdPreMed;
	}

	public Integer getCdPrestador() {
		return cdPrestador;
	}

	public void setCdPrestador(Integer cdPrestador) {
		this.cdPrestador = cdPrestador;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

}
