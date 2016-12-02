package br.ufg.bd2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {

	private static final String projectUrl = "/www/index.html";

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView method() {
		return new ModelAndView("redirect:" + projectUrl);
	}

}
