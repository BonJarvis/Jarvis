package de.bon.jarvis.business.interpreter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.bon.jarvis.business.JarvisTask;
import de.bon.jarvis.business.actuator.ActuatorParams;
import de.bon.jarvis.business.actuator.VoiceActuator;

@Component
public class InterpreterEar {

	HashMap<List<String>, JarvisTask> map = new HashMap<List<String>, JarvisTask>();

	@Autowired
	public InterpreterEar(VoiceActuator voiceActuator) {
		
		List<String> words = new ArrayList<String>();
		words.add("sag");
		map.put(words, new JarvisTask(voiceActuator));
	}

	public void process(String spokenWord) {

		for (List<String> wordList : map.keySet()) {
			for (String word : wordList) {
				if (spokenWord.contains(word)) {
					ActuatorParams actuatorParams = new ActuatorParams();
					actuatorParams.setValue(spokenWord);

					map.get(wordList).setActuatorParams(actuatorParams);
					map.get(wordList).doTask();
					break;
				}
			}

		}
	}

}
