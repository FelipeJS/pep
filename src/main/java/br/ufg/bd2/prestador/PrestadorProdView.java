package br.ufg.bd2.prestador;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@IdClass(PrestadorProdViewPK.class)
@Table(schema = "consulta", name = "VDIC_PRESTADOR_PROD_GLOBAL")
public class PrestadorProdView implements Serializable {

	@Id
	@Column(name = "CD_PRESTADOR")
	private Integer cdPrestador;
	
	@Id
	@Column(name = "MES_FF")
	private String mesFF;

	@Column(name = "PRESTADOR")
	private String prestador;
	
	@Column(name = "ANO")
	private String ano;

	@Column(name = "CD_ESPECIALIDADE")
	private Integer cdEspecialidade;

	@Column(name = "ESPECIALIDADE")
	private String especialidade;

	@Column(name = "DS_CODIGO_CONSELHO")
	private String dsCodigoConselho;

	@Column(name = "PCT_URG")
	private Integer pctUrg;

	@Column(name = "PCT_AT_ENCAM")
	private Integer pctAtEncam;

	@Column(name = "PARECERES_SOL")
	private Integer pareceresSol;

	@Column(name = "PARECERES_REA")
	private Integer pareceresRea;

	@Column(name = "CIRURGIAS")
	private Integer cirurgias;

	@Column(name = "PRESCRICOES")
	private Integer prescricoes;

	@Column(name = "EVOLUCOES")
	private Integer evolucoes;

	@Column(name = "AUXILIAR")
	private Integer auxiliar;

	@Column(name = "ATEND_AMB")
	private Integer atendAmb;

	@Column(name = "SN_ATUANTE")
	private String snAtuante;

	@Column(name = "TP_VINCULO")
	private String tpVinculo;

	public Integer getCdPrestador() {
		return cdPrestador;
	}

	public void setCdPrestador(Integer cdPrestador) {
		this.cdPrestador = cdPrestador;
	}

	public String getMesFF() {
		return mesFF;
	}

	public void setMesFF(String mesFF) {
		this.mesFF = mesFF;
	}

	public String getPrestador() {
		return prestador;
	}

	public void setPrestador(String prestador) {
		this.prestador = prestador;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public Integer getCdEspecialidade() {
		return cdEspecialidade;
	}

	public void setCdEspecialidade(Integer cdEspecialidade) {
		this.cdEspecialidade = cdEspecialidade;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getDsCodigoConselho() {
		return dsCodigoConselho;
	}

	public void setDsCodigoConselho(String dsCodigoConselho) {
		this.dsCodigoConselho = dsCodigoConselho;
	}

	public Integer getPctUrg() {
		return pctUrg;
	}

	public void setPctUrg(Integer pctUrg) {
		this.pctUrg = pctUrg;
	}

	public Integer getPctAtEncam() {
		return pctAtEncam;
	}

	public void setPctAtEncam(Integer pctAtEncam) {
		this.pctAtEncam = pctAtEncam;
	}

	public Integer getPareceresSol() {
		return pareceresSol;
	}

	public void setPareceresSol(Integer pareceresSol) {
		this.pareceresSol = pareceresSol;
	}

	public Integer getPareceresRea() {
		return pareceresRea;
	}

	public void setPareceresRea(Integer pareceresRea) {
		this.pareceresRea = pareceresRea;
	}

	public Integer getCirurgias() {
		return cirurgias;
	}

	public void setCirurgias(Integer cirurgias) {
		this.cirurgias = cirurgias;
	}

	public Integer getPrescricoes() {
		return prescricoes;
	}

	public void setPrescricoes(Integer prescricoes) {
		this.prescricoes = prescricoes;
	}

	public Integer getEvolucoes() {
		return evolucoes;
	}

	public void setEvolucoes(Integer evolucoes) {
		this.evolucoes = evolucoes;
	}

	public Integer getAuxiliar() {
		return auxiliar;
	}

	public void setAuxiliar(Integer auxiliar) {
		this.auxiliar = auxiliar;
	}

	public Integer getAtendAmb() {
		return atendAmb;
	}

	public void setAtendAmb(Integer atendAmb) {
		this.atendAmb = atendAmb;
	}

	public String getSnAtuante() {
		return snAtuante;
	}

	public void setSnAtuante(String snAtuante) {
		this.snAtuante = snAtuante;
	}

	public String getTpVinculo() {
		return tpVinculo;
	}

	public void setTpVinculo(String tpVinculo) {
		this.tpVinculo = tpVinculo;
	}

}
