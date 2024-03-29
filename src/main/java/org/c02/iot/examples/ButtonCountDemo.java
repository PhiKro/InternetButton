package org.c02.iot.examples;

import org.c02.iot.InternetButtonApi.ButtonDirection;

import java.awt.Color;

import org.c02.iot.InternetButtonImpl;
import org.c02.iot.behaviour.CountAndShowLed;
import org.c02.iot.behaviour.CountAndSound;
import org.c02.iot.behaviour.CountandMoreRed;
import org.c02.iot.cloud.api.ParticleApiWrapper;
import org.c02.iot.cloud.api.ParticleApiWrapperImpl;
import org.c02.iot.cloud.examples.DemoConstants;

public class ButtonCountDemo {
	
	static ParticleApiWrapper api = new ParticleApiWrapperImpl(DemoConstants.deviceId,
			DemoConstants.accessToken);
	
	static InternetButtonImpl CountDemo = new InternetButtonImpl (api);

	public static void main(String[] args) {
		
		//CountDemo.allLedsOff();
		//CountDemo.setLed(1, Color.WHITE);
		
		//CountDemo.allLedsOff();

		//ButtonDirection button = null;
		//System.out.println(CountDemo.getButtonCounter(button.North));
		
		//CountDemo.resetButtonCounters();
		
		//CountAndShowLed newCount = new CountAndShowLed(CountDemo);
		//newCount.run();
        
		
		//CountandMoreRed newRed = new CountandMoreRed(CountDemo);
		//newRed.run();
		
		CountDemo.resetButtonCounters();
		CountAndSound newSound = new CountAndSound(CountDemo);
		newSound.run();
	}

}
