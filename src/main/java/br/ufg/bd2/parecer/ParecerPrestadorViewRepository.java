package br.ufg.bd2.parecer;

import org.springframework.data.repository.CrudRepository;

public interface ParecerPrestadorViewRepository extends CrudRepository<ParecerPrestadorView, Integer> {

	public Iterable<ParecerPrestadorView> findByCdPrestadorAndMesAndAno(Integer cdPrestador, String mes, String ano);
}