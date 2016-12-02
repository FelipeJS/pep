package br.ufg.bd2.itpremed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItPreMedPrescricaoViewService {

	@Autowired
	private ItPreMedPrescricaoViewRepository itPreMedPrescricaoViewRepository;

	public ItPreMedPrescricaoView obterItPreMed(Integer cdItPreMed) {
		return itPreMedPrescricaoViewRepository.findOne(cdItPreMed);
	}

	public Iterable<ItPreMedPrescricaoView> obterPorData(Integer cdPreMed, Integer cdPrestador, String mes, String ano) {
		return itPreMedPrescricaoViewRepository.findByCdPreMedAndCdPrestadorAndMesAndAno(cdPreMed, cdPrestador, mes, ano);
	}

	public Iterable<ItPreMedPrescricaoView> obterTodos() {
		return itPreMedPrescricaoViewRepository.findAll();
	}

}
