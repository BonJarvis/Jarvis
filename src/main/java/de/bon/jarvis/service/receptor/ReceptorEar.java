package de.bon.jarvis.service.receptor;

import org.springframework.stereotype.Service;

import de.bon.jarvis.model.Ear;

@Service
public class ReceptorEar {

//	TODO Muss noch mit @Autowired versehen werden damit es korrekt instantiiert wird.
	private Ear ear = new Ear();

	public void listenTo(String word) {
		ear.setSpokenWord(word);
		System.out.println(ear.getSpokenWord());
	}

	
}
