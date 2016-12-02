package br.ufg.bd2.prescricao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VDIC_PRESCRICAO_PRESTADOR")
public class PrescricaoPrestadorView {

	@Id
	@Column(name = "CD_PRE_MED")
	private Integer cdPreMed;

	@Column(name = "CD_ATENDIMENTO")
	private Integer cdAtendimento;

	@Column(name = "CD_PACIENTE")
	private Integer cdPaciente;

	@Column(name = "NM_PACIENTE")
	private String nmPaciente;

	@Column(name = "DT_ATENDIMENTO")
	private String dtAtendimento;

	@Column(name = "DT_ALTA")
	private String dtAlta;

	@Column(name = "DT_PRE_MED")
	private String dtPreMed;

	@Column(name = "CD_OBJETO")
	private Integer cdObjeto;

	@Column(name = "NM_OBJETO")
	private String nmObjeto;

	@Column(name = "TIPO_ATENDIMENTO")
	private String tipoAtendimento;

	@Column(name = "TP_ATENDIMENTO")
	private String tpAtendimento;

	@Column(name = "CD_PRESTADOR")
	private Integer cdPrestador;

	@Column(name = "MES")
	private String mes;

	@Column(name = "ANO")
	private String ano;

	@Column(name = "NM_PRESTADOR")
	private String nmPrestador;

	@Column(name = "DS_EVOLUCAO")
	private String dsEvolucao;

	public Integer getCdPreMed() {
		return cdPreMed;
	}

	public void setCdPreMed(Integer cdPreMed) {
		this.cdPreMed = cdPreMed;
	}

	public Integer getCdAtendimento() {
		return cdAtendimento;
	}

	public void setCdAtendimento(Integer cdAtendimento) {
		this.cdAtendimento = cdAtendimento;
	}

	public Integer getCdPaciente() {
		return cdPaciente;
	}

	public void setCdPaciente(Integer cdPaciente) {
		this.cdPaciente = cdPaciente;
	}

	public String getNmPaciente() {
		return nmPaciente;
	}

	public void setNmPaciente(String nmPaciente) {
		this.nmPaciente = nmPaciente;
	}

	public String getDtAtendimento() {
		return dtAtendimento;
	}

	public void setDtAtendimento(String dtAtendimento) {
		this.dtAtendimento = dtAtendimento;
	}

	public String getDtAlta() {
		return dtAlta;
	}

	public void setDtAlta(String dtAlta) {
		this.dtAlta = dtAlta;
	}

	public String getDtPreMed() {
		return dtPreMed;
	}

	public void setDtPreMed(String dtPreMed) {
		this.dtPreMed = dtPreMed;
	}

	public Integer getCdObjeto() {
		return cdObjeto;
	}

	public void setCdObjeto(Integer cdObjeto) {
		this.cdObjeto = cdObjeto;
	}

	public String getNmObjeto() {
		return nmObjeto;
	}

	public void setNmObjeto(String nmObjeto) {
		this.nmObjeto = nmObjeto;
	}

	public String getTipoAtendimento() {
		return tipoAtendimento;
	}

	public void setTipoAtendimento(String tipoAtendimento) {
		this.tipoAtendimento = tipoAtendimento;
	}

	public String getTpAtendimento() {
		return tpAtendimento;
	}

	public void setTpAtendimento(String tpAtendimento) {
		this.tpAtendimento = tpAtendimento;
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

	public String getNmPrestador() {
		return nmPrestador;
	}

	public void setNmPrestador(String nmPrestador) {
		this.nmPrestador = nmPrestador;
	}

	public String getDsEvolucao() {
		return dsEvolucao;
	}

	public void setDsEvolucao(String dsEvolucao) {
		this.dsEvolucao = dsEvolucao;
	}

}
