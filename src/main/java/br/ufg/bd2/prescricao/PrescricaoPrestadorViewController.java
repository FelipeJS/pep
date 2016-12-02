package br.ufg.bd2.prescricao;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prescricao")
public class PrescricaoPrestadorViewController {

	@Autowired
	private PrescricaoPrestadorViewService prescricaoPrestadorViewService;

	@RequestMapping(value = "/consultar", method = GET)
	public PrescricaoPrestadorView consultar(@RequestParam Integer cdPreMed) {
		return prescricaoPrestadorViewService.obterPrestadorProdView(cdPreMed);
	}

	@RequestMapping("/listar")
	public Iterable<PrescricaoPrestadorView> listar() {
		return prescricaoPrestadorViewService.obterTodos();
	}
	
	@RequestMapping(value = "/listarPorData", method = GET)
	public Iterable<PrescricaoPrestadorView> listarPorData(@RequestParam Integer cdPrestador, @RequestParam String mes, @RequestParam String ano) {
		return prescricaoPrestadorViewService.obterPorData(cdPrestador, mes, ano);
	}
}