package de.bon.jarvis.business.actuator;

import org.springframework.beans.factory.annotation.Autowired;

import de.bon.jarvis.service.core.MessagesOutput;

public class VoiceActuator extends Actuator {

	@Autowired
	MessagesOutput messageOutput;
	
	@Override
	public void akt(ActuatorParams acutatorParams) {
		messageOutput.add((acutatorParams.getValue()));
	}

}
