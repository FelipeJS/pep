package br.ufg.bd2.cirurgia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CirurgiaPrestadorViewService {

	@Autowired
	private CirurgiaPrestadorViewRepository cirurgiaPrestadorViewRepository;

	public CirurgiaPrestadorView obterCirurgia(Integer cdAvisoCirurgia) {
		return cirurgiaPrestadorViewRepository.findOne(cdAvisoCirurgia);
	}

	public Iterable<CirurgiaPrestadorView> obterPorData(Integer cdPrestador, String mes, String ano) {
		return cirurgiaPrestadorViewRepository.findByCdPrestadorAndMesAndAno(cdPrestador, mes, ano);
	}

	public Iterable<CirurgiaPrestadorView> obterTodos() {
		return cirurgiaPrestadorViewRepository.findAll();
	}

}
