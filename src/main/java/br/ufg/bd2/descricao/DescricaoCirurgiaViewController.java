package br.ufg.bd2.descricao;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/descricao")
public class DescricaoCirurgiaViewController {

	@Autowired
	private DescricaoCirurgiaViewService descricaoCirurgiaViewService;

	@RequestMapping(value = "/consultar", method = GET)
	public DescricaoCirurgiaView consultar(@RequestParam Integer cdAvisoCirurgia) {
		return descricaoCirurgiaViewService
				.obterDescricaoCirurgia(cdAvisoCirurgia);
	}
	
	@RequestMapping("/listar")
	public Iterable<DescricaoCirurgiaView> listar() {
		return descricaoCirurgiaViewService.obterTodos();
	}

	@RequestMapping(value = "/listarPorData", method = GET)
	public Iterable<DescricaoCirurgiaView> listarPorData(
			@RequestParam Integer cdAvisoCirurgia,
			@RequestParam Integer cdPrestador, @RequestParam String mes,
			@RequestParam String ano) {
		return descricaoCirurgiaViewService.obterPorData(cdAvisoCirurgia,
				cdPrestador, mes, ano);
	}

}