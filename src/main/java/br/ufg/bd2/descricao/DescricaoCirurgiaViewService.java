package br.ufg.bd2.descricao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DescricaoCirurgiaViewService {

	@Autowired
	private DescricaoCirurgiaViewRepository descricaoCirurgiaViewRepository;

	public DescricaoCirurgiaView obterDescricaoCirurgia(Integer cdAvisoCirurgia) {
		return descricaoCirurgiaViewRepository.findOne(cdAvisoCirurgia);
	}
	
	public Iterable<DescricaoCirurgiaView> obterPorData(
			Integer cdAvisoCirurgia, Integer cdPrestador, String mes, String ano) {
		return descricaoCirurgiaViewRepository
				.findByCdAvisoCirurgiaAndCdPrestadorAndMesAndAno(cdAvisoCirurgia, cdPrestador, mes, ano);
	}

	public Iterable<DescricaoCirurgiaView> obterTodos() {
		return descricaoCirurgiaViewRepository.findAll();
	}

}
