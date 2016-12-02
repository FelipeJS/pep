package br.ufg.bd2.itpremed;

import org.springframework.data.repository.CrudRepository;

public interface ItPreMedPrescricaoViewRepository extends
		CrudRepository<ItPreMedPrescricaoView, Integer> {

	public Iterable<ItPreMedPrescricaoView> findByCdPreMedAndCdPrestadorAndMesAndAno(
			Integer cdPreMed, Integer cdPrestador, String mes, String ano);
}