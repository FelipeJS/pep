package br.ufg.bd2.encaminha;

import org.springframework.data.repository.CrudRepository;

public interface EncaminhaPrestadorViewRepository extends CrudRepository<EncaminhaPrestadorView, Integer> {

	public Iterable<EncaminhaPrestadorView> findByCdPrestadorAndMesAndAno(Integer cdPrestador, String mes, String ano);
}