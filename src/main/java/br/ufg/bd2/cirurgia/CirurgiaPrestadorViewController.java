package br.ufg.bd2.cirurgia;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cirurgia")
public class CirurgiaPrestadorViewController {

	@Autowired
	private CirurgiaPrestadorViewService cirurgiaPrestadorViewService;

	@RequestMapping(value = "/consultar", method = GET)
	public CirurgiaPrestadorView consultar(@RequestParam Integer cdAvisoCirurgia) {
		return cirurgiaPrestadorViewService.obterCirurgia(cdAvisoCirurgia);
	}

	@RequestMapping("/listar")
	public Iterable<CirurgiaPrestadorView> listar() {
		return cirurgiaPrestadorViewService.obterTodos();
	}

	@RequestMapping(value = "/listarPorData", method = GET)
	public Iterable<CirurgiaPrestadorView> listarPorData(@RequestParam Integer cdPrestador, @RequestParam String mes, @RequestParam String ano) {
		return cirurgiaPrestadorViewService.obterPorData(cdPrestador, mes, ano);
	}

}