package br.ufg.bd2.parecer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VDIC_PARECER_PRESTADOR")
public class ParecerPrestadorView {

	@Id
	@Column(name = "CD_PAR_MED")
	private Integer cdParMed;

	@Column(name = "CD_ATENDIMENTO")
	private Integer cdAtendimento;

	@Column(name = "CD_PRESTADOR")
	private Integer cdPrestador;

	@Column(name = "NM_PRESTADOR")
	private String nmPrestador;

	@Column(name = "MES")
	private String mes;

	@Column(name = "ANO")
	private String ano;

	@Column(name = "DT_PARECER")
	private String dtParecer;

	@Column(name = "DS_SOLICITACAO")
	private String dsSolicitacao;

	@Column(name = "DS_PARECER")
	private String dsParecer;

	@Column(name = "TIPO_PARECER")
	private String tipoParecer;

	public Integer getCdParMed() {
		return cdParMed;
	}

	public void setCdParMed(Integer cdParMed) {
		this.cdParMed = cdParMed;
	}

	public Integer getCdAtendimento() {
		return cdAtendimento;
	}

	public void setCdAtendimento(Integer cdAtendimento) {
		this.cdAtendimento = cdAtendimento;
	}

	public Integer getCdPrestador() {
		return cdPrestador;
	}

	public void setCdPrestador(Integer cdPrestador) {
		this.cdPrestador = cdPrestador;
	}

	public String getNmPrestador() {
		return nmPrestador;
	}

	public void setNmPrestador(String nmPrestador) {
		this.nmPrestador = nmPrestador;
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

	public String getDtParecer() {
		return dtParecer;
	}

	public void setDtParecer(String dtParecer) {
		this.dtParecer = dtParecer;
	}

	public String getDsSolicitacao() {
		return dsSolicitacao;
	}

	public void setDsSolicitacao(String dsSolicitacao) {
		this.dsSolicitacao = dsSolicitacao;
	}

	public String getDsParecer() {
		return dsParecer;
	}

	public void setDsParecer(String dsParecer) {
		this.dsParecer = dsParecer;
	}

	public String getTipoParecer() {
		return tipoParecer;
	}

	public void setTipoParecer(String tipoParecer) {
		this.tipoParecer = tipoParecer;
	}

}
