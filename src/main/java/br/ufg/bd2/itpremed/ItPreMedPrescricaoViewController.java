package br.ufg.bd2.itpremed;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/itpremed")
public class ItPreMedPrescricaoViewController {

	@Autowired
	private ItPreMedPrescricaoViewService itPreMedPrescricaoViewService;

	@RequestMapping(value = "/consultar", method = GET)
	public ItPreMedPrescricaoView consultar(@RequestParam Integer cdItPreMed) {
		return itPreMedPrescricaoViewService.obterItPreMed(cdItPreMed);
	}

	@RequestMapping("/listar")
	public Iterable<ItPreMedPrescricaoView> listar() {
		return itPreMedPrescricaoViewService.obterTodos();
	}

	@RequestMapping(value = "/listarPorData", method = GET)
	public Iterable<ItPreMedPrescricaoView> listarPorData(
			@RequestParam Integer cdPreMed, @RequestParam Integer cdPrestador,
			@RequestParam String mes, @RequestParam String ano) {
		return itPreMedPrescricaoViewService.obterPorData(cdPreMed,
				cdPrestador, mes, ano);
	}

}