package de.bon.jarvis.business.actuator;

public class ActuatorParams {

	private String value;

	public ActuatorParams(String value) {
		this.setValue(value);
	}

	public ActuatorParams() {
		// TODO Auto-generated constructor stub
	}

	public String getValue() {
		return value == null ? "" : value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
