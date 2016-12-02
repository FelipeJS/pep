package br.ufg.bd2.cirurgia;

import org.springframework.data.repository.CrudRepository;

public interface CirurgiaPrestadorViewRepository extends CrudRepository<CirurgiaPrestadorView, Integer> {

	public Iterable<CirurgiaPrestadorView> findByCdPrestadorAndMesAndAno(Integer cdPrestador, String mes, String ano);
}