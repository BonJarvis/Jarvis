package de.bon.jarvis.business.actuator;

import org.springframework.stereotype.Service;

@Service
public abstract class Actuator {

	public abstract void akt(ActuatorParams acutatorParams);

}
