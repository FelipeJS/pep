package br.ufg.bd2.prestador;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PrestadorProdViewRepository extends CrudRepository<PrestadorProdView, Integer> {
	
	public Iterable<PrestadorProdView> findByMesFFAndAno(String mesFF, String ano);
	
	@Query("select b from PrestadorProdView b "
		 + "where b.mesFF between ?1 and ?2 and b.ano = ?3")
	public Iterable<PrestadorProdView> findByMesFFBetween(String mesInicio, String mesFim, String ano);
}