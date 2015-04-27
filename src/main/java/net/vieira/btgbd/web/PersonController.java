package net.vieira.btgbd.web;

import net.vieira.btgbd.model.Person;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/person")
public class PersonController {

	@RequestMapping(method = RequestMethod.GET)
	public Person getPerson(Long id) {
		return null;
	}

}
