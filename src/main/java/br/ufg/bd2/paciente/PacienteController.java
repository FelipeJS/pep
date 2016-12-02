package br.ufg.bd2.paciente;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paciente")
public class PacienteController {

	@Autowired
	private PacienteService pacienteService;

	@RequestMapping(value = "/consultar", method = GET)
	public Paciente consultar(@RequestParam Integer cdPaciente) {
		return pacienteService.obterPaciente(cdPaciente);
	}

	@RequestMapping("/listar")
	public Iterable<Paciente> listar() {
		return pacienteService.obterTodos();
	}

}