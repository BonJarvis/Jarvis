package de.bon.jarvis.service.receptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.bon.jarvis.business.interpreter.InterpreterEar;
import de.bon.jarvis.model.Ear;

@Service
public class ReceptorEar {

	@Autowired
	InterpreterEar interpreterEar;
	
//	TODO Muss noch mit @Autowired versehen werden damit es korrekt instantiiert wird.
	private Ear ear = new Ear();

	public void listenTo(String word) {
		ear.setSpokenWord(word);		
		interpreterEar.process(ear.getSpokenWord());
	}
	
}
