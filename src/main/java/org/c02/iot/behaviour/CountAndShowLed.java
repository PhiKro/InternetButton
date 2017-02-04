package org.c02.iot.behaviour;

import java.awt.Color;

import org.c02.iot.InternetButtonApi;
import org.c02.iot.InternetButtonApi.ButtonDirection;

public class CountAndShowLed extends AbstractBehaviour {

	public CountAndShowLed(InternetButtonApi buttonInstance) {
		super(buttonInstance);
	}

	@Override
	public void run() {
		int buttonCounter = button.getButtonCounter(ButtonDirection.North);
		
		//buttonCounter = buttonCounter%12;
		System.out.println("Bis hierher");
		System.out.println(buttonCounter);
		button.allLedsOff();
		button.setLed(buttonCounter, Color.GREEN);
		
	}

}
