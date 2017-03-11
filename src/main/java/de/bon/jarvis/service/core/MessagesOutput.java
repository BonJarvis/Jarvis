package de.bon.jarvis.service.core;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class MessagesOutput {

	private List<String> messages = new ArrayList<String>();
	
	public String pop() {
		if(messages.isEmpty()){
			return "";
		}
		
		return this.messages.remove(0);
	}
	
	public boolean isEmpty(){
		return this.messages.isEmpty();
	}
	
	public void add(String message) {
		this.messages.add(message);
	}
}
