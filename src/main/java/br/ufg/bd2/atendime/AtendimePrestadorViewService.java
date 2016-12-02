package br.ufg.bd2.atendime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AtendimePrestadorViewService {

	@Autowired
	private AtendimePrestadorViewRepository atendimePrestadorViewRepository;

	public AtendimePrestadorView obterAtendime(Integer cdAtendimento) {
		return atendimePrestadorViewRepository.findOne(cdAtendimento);
	}

	public Iterable<AtendimePrestadorView> obterPorData(Integer cdPrestador, String mes, String ano) {
		return atendimePrestadorViewRepository.findByCdPrestadorAndMesAndAno(cdPrestador, mes, ano);
	}

	public Iterable<AtendimePrestadorView> obterTodos() {
		return atendimePrestadorViewRepository.findAll();
	}

}
