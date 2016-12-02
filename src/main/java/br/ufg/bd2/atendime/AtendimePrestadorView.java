package br.ufg.bd2.atendime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "consulta", name = "VDIC_ATENDIME_PRESTADOR")
public class AtendimePrestadorView {

	@Id
	@Column(name = "CD_ATENDIMENTO")
	private Integer cdAtendimento;

	@Column(name = "CD_PRESTADOR")
	private Integer cdPrestador;

	@Column(name = "NM_PRESTADOR")
	private String nmPrestador;

	@Column(name = "CD_PACIENTE")
	private Integer cdPaciente;

	@Column(name = "NM_PACIENTE")
	private String nmPaciente;

	@Column(name = "MES")
	private String mes;

	@Column(name = "ANO")
	private String ano;

	@Column(name = "DT_ATENDIMENTO")
	private String dtAtendimento;

	@Column(name = "DT_ALTA")
	private String dtAlta;

	@Column(name = "TP_ATENDIMENTO")
	private String tpAtendimento;

	@Column(name = "TIPO_ATENDIMENTO")
	private String tipoAtendimento;

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

	public String getTpAtendimento() {
		return tpAtendimento;
	}

	public void setTpAtendimento(String tpAtendimento) {
		this.tpAtendimento = tpAtendimento;
	}

	public String getTipoAtendimento() {
		return tipoAtendimento;
	}

	public void setTipoAtendimento(String tipoAtendimento) {
		this.tipoAtendimento = tipoAtendimento;
	}

}
