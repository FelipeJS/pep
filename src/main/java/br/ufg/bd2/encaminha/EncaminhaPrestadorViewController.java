package br.ufg.bd2.encaminha;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/encaminha")
public class EncaminhaPrestadorViewController {

	@Autowired
	private EncaminhaPrestadorViewService encaminhaPrestadorViewService;

	@RequestMapping(value = "/consultar", method = GET)
	public EncaminhaPrestadorView consultar(@RequestParam Integer cdEncaminhamento) {
		return encaminhaPrestadorViewService.obterEncaminha(cdEncaminhamento);
	}

	@RequestMapping("/listar")
	public Iterable<EncaminhaPrestadorView> listar() {
		return encaminhaPrestadorViewService.obterTodos();
	}

	@RequestMapping(value = "/listarPorData", method = GET)
	public Iterable<EncaminhaPrestadorView> listarPorData(@RequestParam Integer cdPrestador, @RequestParam String mes, @RequestParam String ano) {
		return encaminhaPrestadorViewService.obterPorData(cdPrestador, mes, ano);
	}

}