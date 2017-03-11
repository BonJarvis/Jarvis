package de.bon.jarvis.business.actuator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.bon.jarvis.service.core.MessagesOutput;

@Service
public class VoiceActuator extends Actuator {

	private MessagesOutput messageOutput;
	
	@Autowired
	public VoiceActuator(MessagesOutput messageOutput) {
		this.messageOutput = messageOutput;
	}
	
	@Override
	public void akt(ActuatorParams acutatorParams) {
		messageOutput.add((acutatorParams.getValue()));
	}

}
