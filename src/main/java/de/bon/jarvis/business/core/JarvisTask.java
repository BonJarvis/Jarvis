package de.bon.jarvis.business.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.bon.jarvis.business.actuator.Actuator;
import de.bon.jarvis.business.actuator.ActuatorParams;

public class JarvisTask {

	@Autowired
	private final Actuator actuator;
	private ActuatorParams actuatorParams;

	public JarvisTask(Actuator actuator) {
		this.actuator = actuator;
	}
	
	public void doTask(){
		this.actuator.akt(this.getAcutatorParams());
	}

	public ActuatorParams getAcutatorParams() {
		return actuatorParams;
	}

	public void setActuatorParams(ActuatorParams acutatorParams) {
		this.actuatorParams = acutatorParams;
	}
}
