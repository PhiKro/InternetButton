package org.c02.iot.behaviour;

import java.awt.Color;
import java.util.Iterator;

import org.c02.iot.InternetButtonApi;
import org.c02.iot.InternetButtonApi.ButtonDirection;
import org.c02.iot.cloud.api.ParticleApiWrapper;
import org.c02.iot.cloud.api.ParticleApiWrapperImpl;
import org.c02.iot.cloud.api.ParticleException;
import org.c02.iot.cloud.examples.DemoConstants;



public class CountAndSound extends AbstractBehaviour {

	ParticleApiWrapper api = new ParticleApiWrapperImpl(DemoConstants.deviceId,
			DemoConstants.accessToken);
	
	public CountAndSound(InternetButtonApi buttonInstance) {
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
			
			if(buttonCounter%10 == 0) {
				try {
					api.callMethod("play", "1");
				} catch (ParticleException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
				
		
	}
	

	public void run(int counter) {
		int buttonCounter = button.getButtonCounter(ButtonDirection.North);
		Color newC;
	
		button.allLedsOff();
		button.resetButtonCounters();
		
		
			buttonCounter = counter;
			
			if(buttonCounter%10 == 0) {
				try {
					api.callMethod("play", "1");
				} catch (ParticleException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
	}
}
	
	

