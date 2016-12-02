package br.ufg.bd2.prestador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrestadorProdViewService {

	@Autowired
	private PrestadorProdViewRepository prestadorProdViewRepository;

	public PrestadorProdView obterPrestadorProdView(Integer cdPrestador) {
		return prestadorProdViewRepository.findOne(cdPrestador);
	}

	public Iterable<PrestadorProdView> obterPorData(String mesFF, String ano) {
		return prestadorProdViewRepository.findByMesFFAndAno(mesFF, ano);
	}

	public Iterable<PrestadorProdView> obterTodos() {
		return prestadorProdViewRepository.findAll();
	}
	
	public Iterable<PrestadorProdView> obterPorPeriodo(String mesInicio, String mesFim, String ano){
		return prestadorProdViewRepository.findByMesFFBetween(mesInicio, mesFim, ano);
	}

}
