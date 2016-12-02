package br.ufg.bd2.prescricao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrescricaoPrestadorViewService {

	@Autowired
	private PrescricaoPrestadorViewRepository prescricaoPrestadorViewRepository;

	public PrescricaoPrestadorView obterPrestadorProdView(Integer cdPreMed) {
		return prescricaoPrestadorViewRepository.findOne(cdPreMed);
	}

	public Iterable<PrescricaoPrestadorView> obterPorData(Integer cdPrestador, String mes, String ano) {
		return prescricaoPrestadorViewRepository.findByCdPrestadorAndMesAndAno(cdPrestador, mes, ano);
	}

	public Iterable<PrescricaoPrestadorView> obterTodos() {
		return prescricaoPrestadorViewRepository.findAll();
	}

}
