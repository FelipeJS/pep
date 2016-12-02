package br.ufg.bd2.encaminha;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VDIC_ENCAMINHA_PRESTADOR")
public class EncaminhaPrestadorView {

	@Id
	@Column(name = "CD_ENCAMINHAMENTO")
	private Integer cdEncaminhamento;

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

	@Column(name = "ANO")
	private String ano;

	@Column(name = "MES")
	private String mes;

	@Column(name = "DT_ENCAMINHAMENTO")
	private String dtEncaminhamento;

	public Integer getCdEncaminhamento() {
		return cdEncaminhamento;
	}

	public void setCdEncaminhamento(Integer cdEncaminhamento) {
		this.cdEncaminhamento = cdEncaminhamento;
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

	public String getDtEncaminhamento() {
		return dtEncaminhamento;
	}

	public void setDtEncaminhamento(String dtEncaminhamento) {
		this.dtEncaminhamento = dtEncaminhamento;
	}

}
