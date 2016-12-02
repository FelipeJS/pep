package br.ufg.bd2.encaminha;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EncaminhaPrestadorViewService {

	@Autowired
	private EncaminhaPrestadorViewRepository encaminhaPrestadorViewRepository;

	public EncaminhaPrestadorView obterEncaminha(Integer cdEncaminhamento) {
		return encaminhaPrestadorViewRepository.findOne(cdEncaminhamento);
	}

	public Iterable<EncaminhaPrestadorView> obterPorData(Integer cdPrestador, String mes, String ano) {
		return encaminhaPrestadorViewRepository.findByCdPrestadorAndMesAndAno(cdPrestador, mes, ano);
	}

	public Iterable<EncaminhaPrestadorView> obterTodos() {
		return encaminhaPrestadorViewRepository.findAll();
	}

}
