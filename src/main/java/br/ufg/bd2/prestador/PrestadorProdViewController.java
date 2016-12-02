package br.ufg.bd2.prestador;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtividade")
public class PrestadorProdViewController {

	@Autowired
	private PrestadorProdViewService prestadorProdViewService;

	@RequestMapping(value = "/consultar", method = GET)
	public PrestadorProdView consultar(@RequestParam Integer cdPrestador) {
		return prestadorProdViewService.obterPrestadorProdView(cdPrestador);
	}

	@RequestMapping("/listar")
	public Iterable<PrestadorProdView> listar() {
		return prestadorProdViewService.obterTodos();
	}
	
	@RequestMapping(value = "/listarPorData", method = GET)
	public Iterable<PrestadorProdView> listarPorData(@RequestParam String mesFF, @RequestParam String ano) {
		return prestadorProdViewService.obterPorData(mesFF, ano);
	}
	
	@RequestMapping(value = "/listarPorPeriodo", method = GET)
	public Iterable<PrestadorProdView> listarPorPerido(@RequestParam String mesInicio, @RequestParam String mesFim, 
													   @RequestParam String ano) {
		return prestadorProdViewService.obterPorPeriodo(mesInicio, mesFim, ano);
	}
}