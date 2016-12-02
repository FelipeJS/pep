package br.ufg.bd2.atendime;

import org.springframework.data.repository.CrudRepository;

public interface AtendimePrestadorViewRepository extends CrudRepository<AtendimePrestadorView, Integer> {

	public Iterable<AtendimePrestadorView> findByCdPrestadorAndMesAndAno(Integer cdPrestador, String mes, String ano);
}