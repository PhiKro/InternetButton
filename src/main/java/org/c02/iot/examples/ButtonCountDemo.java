package org.c02.iot.examples;

import org.c02.iot.InternetButtonApi.ButtonDirection;
import org.c02.iot.InternetButtonImpl;
import org.c02.iot.behaviour.CountAndShowLed;
import org.c02.iot.cloud.api.ParticleApiWrapper;
import org.c02.iot.cloud.api.ParticleApiWrapperImpl;
import org.c02.iot.cloud.examples.DemoConstants;

public class ButtonCountDemo {
	
	static ParticleApiWrapper api = new ParticleApiWrapperImpl(DemoConstants.deviceId,
			DemoConstants.accessToken);
	
	static InternetButtonImpl CountDemo = new InternetButtonImpl (api);

	public static void main(String[] args) {

		ButtonDirection button = null;
		//CountDemo.getButtonCounter(button.North);
		
		CountAndShowLed newCount = new CountAndShowLed(CountDemo);
		newCount.run();


	}

}
