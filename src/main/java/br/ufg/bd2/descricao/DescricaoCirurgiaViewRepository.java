package br.ufg.bd2.descricao;

import org.springframework.data.repository.CrudRepository;

public interface DescricaoCirurgiaViewRepository extends
		CrudRepository<DescricaoCirurgiaView, Integer> {

	public Iterable<DescricaoCirurgiaView> findByCdAvisoCirurgiaAndCdPrestadorAndMesAndAno(
			Integer cdAvisoCirurgia, Integer cdPrestador, String mes, String ano);

}