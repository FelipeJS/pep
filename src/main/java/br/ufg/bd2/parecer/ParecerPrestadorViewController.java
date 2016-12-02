package br.ufg.bd2.parecer;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/parecer")
public class ParecerPrestadorViewController {

	@Autowired
	private ParecerPrestadorViewService parecerPrestadorViewService;

	@RequestMapping(value = "/consultar", method = GET)
	public ParecerPrestadorView consultar(@RequestParam Integer cdParMed) {
		return parecerPrestadorViewService.obterParecer(cdParMed);
	}

	@RequestMapping("/listar")
	public Iterable<ParecerPrestadorView> listar() {
		return parecerPrestadorViewService.obterTodos();
	}

	@RequestMapping(value = "/listarPorData", method = GET)
	public Iterable<ParecerPrestadorView> listarPorData(@RequestParam Integer cdPrestador, @RequestParam String mes, @RequestParam String ano) {
		return parecerPrestadorViewService.obterPorData(cdPrestador, mes, ano);
	}

}