package br.ufg.bd2.prescricao;

import org.springframework.data.repository.CrudRepository;

public interface PrescricaoPrestadorViewRepository extends CrudRepository<PrescricaoPrestadorView, Integer> {
	
	public Iterable<PrescricaoPrestadorView> findByCdPrestadorAndMesAndAno(Integer cdPrestador, String mes, String ano);

}