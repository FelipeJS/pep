package br.ufg.bd2.atendime;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atendime")
public class AtendimePrestadorViewController {

	@Autowired
	private AtendimePrestadorViewService atendimePrestadorViewService;

	@RequestMapping(value = "/consultar", method = GET)
	public AtendimePrestadorView consultar(@RequestParam Integer cdAtendimento) {
		return atendimePrestadorViewService.obterAtendime(cdAtendimento);
	}

	@RequestMapping("/listar")
	public Iterable<AtendimePrestadorView> listar() {
		return atendimePrestadorViewService.obterTodos();
	}

	@RequestMapping(value = "/listarPorData", method = GET)
	public Iterable<AtendimePrestadorView> listarPorData(@RequestParam Integer cdPrestador, @RequestParam String mes, @RequestParam String ano) {
		return atendimePrestadorViewService.obterPorData(cdPrestador, mes, ano);
	}

}