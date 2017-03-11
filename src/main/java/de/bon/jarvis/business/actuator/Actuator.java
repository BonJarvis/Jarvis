package de.bon.jarvis.business.actuator;

import org.springframework.stereotype.Component;

@Component
public abstract class Actuator {

	public abstract void akt(ActuatorParams acutatorParams);

}
