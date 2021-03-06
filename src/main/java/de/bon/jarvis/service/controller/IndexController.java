package de.bon.jarvis.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import de.bon.jarvis.service.core.MessagesOutput;
import de.bon.jarvis.service.receptor.ReceptorEar;

@Controller
public class IndexController {

	@Autowired
	ReceptorEar ear;
	
	@Autowired
	private MessagesOutput messagesOutput;
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping(value = "ear",  method = RequestMethod.POST)
	public String listen(String word) {
		ear.listenTo(word);
		
		if(!this.messagesOutput.isEmpty()){
			System.out.println(this.messagesOutput.pop());
		}
		
		return "index";
	}
}
