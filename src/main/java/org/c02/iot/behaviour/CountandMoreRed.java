package org.c02.iot.behaviour;

import java.awt.Color;
import java.util.Iterator;

import org.c02.iot.InternetButtonApi;
import org.c02.iot.InternetButtonApi.ButtonDirection;

public class CountandMoreRed extends AbstractBehaviour {

	public CountandMoreRed(InternetButtonApi buttonInstance) {
		super(buttonInstance);
	}

	@Override
	public void run() {
		int buttonCounter = button.getButtonCounter(ButtonDirection.North);
		Color newC;
	
		Boolean l_bol = true;
		button.allLedsOff();
		button.resetButtonCounters();
		
		while(l_bol) {
			buttonCounter = button.getButtonCounter(ButtonDirection.North);
			
			if(buttonCounter > 24) {
				buttonCounter = 24;
			}
			
			newC = new Color(buttonCounter*10+15, 150, 30);
			button.setLed(5, newC);
		}
		
		
		
				
		
	}

}
