package br.ufg.bd2.parecer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParecerPrestadorViewService {

	@Autowired
	private ParecerPrestadorViewRepository parecerPrestadorViewRepository;

	public ParecerPrestadorView obterParecer(Integer cdParMed) {
		return parecerPrestadorViewRepository.findOne(cdParMed);
	}

	public Iterable<ParecerPrestadorView> obterPorData(Integer cdPrestador, String mes, String ano) {
		return parecerPrestadorViewRepository.findByCdPrestadorAndMesAndAno(cdPrestador, mes, ano);
	}

	public Iterable<ParecerPrestadorView> obterTodos() {
		return parecerPrestadorViewRepository.findAll();
	}

}
