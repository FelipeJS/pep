package br.ufg.bd2.cirurgia;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "consulta", name = "VDIC_CIRURGIA_PRESTADOR")
public class CirurgiaPrestadorView {

	@Id
	@Column(name = "ID")
	private Integer id;

	@Column(name = "CD_AVISO_CIRURGIA")
	private Integer cdAvisoCirurgia;

	@Column(name = "DT_AVISO_CIRURGIA")
	private String dtAvisoCirurgia;

	@Column(name = "CD_ATENDIMENTO")
	private Integer cdAtendimento;

	@Column(name = "CD_PACIENTE")
	private Integer cdPaciente;

	@Column(name = "NM_PACIENTE")
	private String nmPaciente;

	@Column(name = "CD_PRESTADOR")
	private Integer cdPrestador;

	@Column(name = "NM_PRESTADOR")
	private String nmPrestador;

	@Column(name = "DS_CIRURGIA")
	private String dsCirurgia;

	@Column(name = "ANO")
	private String ano;

	@Column(name = "MES")
	private String mes;

	@Column(name = "TIPO_FUNCAO")
	private String tipoFuncao;

	@Column(name = "TP_FUNCAO")
	private String tpFuncao;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCdAvisoCirurgia() {
		return cdAvisoCirurgia;
	}

	public void setCdAvisoCirurgia(Integer cdAvisoCirurgia) {
		this.cdAvisoCirurgia = cdAvisoCirurgia;
	}

	public String getDtAvisoCirurgia() {
		return dtAvisoCirurgia;
	}

	public void setDtAvisoCirurgia(String dtAvisoCirurgia) {
		this.dtAvisoCirurgia = dtAvisoCirurgia;
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

	public String getDsCirurgia() {
		return dsCirurgia;
	}

	public void setDsCirurgia(String dsCirurgia) {
		this.dsCirurgia = dsCirurgia;
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

	public String getTipoFuncao() {
		return tipoFuncao;
	}

	public void setTipoFuncao(String tipoFuncao) {
		this.tipoFuncao = tipoFuncao;
	}

	public String getTpFuncao() {
		return tpFuncao;
	}

	public void setTpFuncao(String tpFuncao) {
		this.tpFuncao = tpFuncao;
	}

}
