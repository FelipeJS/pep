package br.ufg.bd2.descricao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VDIC_DESCRICAO_CIRURGIA")
public class DescricaoCirurgiaView {

	@Id
	@Column(name = "CD_AVISO_CIRURGIA")
	private Integer cdAvisoCirurgia;

	@Column(name = "LO_VALOR")
	private String loValor;

	@Column(name = "DH_DOCUMENTO")
	private String dhDocumento;

	@Column(name = "CD_PRESTADOR")
	private Integer cdPrestador;

	@Column(name = "ANO")
	private String ano;

	@Column(name = "MES")
	private String mes;

	@Column(name = "TP_STATUS")
	private String tpStatus;

	public Integer getCdAvisoCirurgia() {
		return cdAvisoCirurgia;
	}

	public void setCdAvisoCirurgia(Integer cdAvisoCirurgia) {
		this.cdAvisoCirurgia = cdAvisoCirurgia;
	}

	public String getLoValor() {
		return loValor;
	}

	public void setLoValor(String loValor) {
		this.loValor = loValor;
	}

	public String getDhDocumento() {
		return dhDocumento;
	}

	public void setDhDocumento(String dhDocumento) {
		this.dhDocumento = dhDocumento;
	}

	public Integer getCdPrestador() {
		return cdPrestador;
	}

	public void setCdPrestador(Integer cdPrestador) {
		this.cdPrestador = cdPrestador;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public String getTpStatus() {
		return tpStatus;
	}

	public void setTpStatus(String tpStatus) {
		this.tpStatus = tpStatus;
	}

}
