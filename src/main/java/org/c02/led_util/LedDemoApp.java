package org.c02.led_util;

import java.awt.Color;
import java.io.IOException;

import org.c02.iot.InternetButtonImpl;
import org.c02.iot.cloud.api.ParticleApiWrapper;
import org.c02.iot.cloud.api.ParticleApiWrapperImpl;
import org.c02.iot.cloud.api.ParticleException;
import org.c02.iot.cloud.examples.DemoConstants;

public class LedDemoApp  {

	static ParticleApiWrapper api = new ParticleApiWrapperImpl(DemoConstants.deviceId,
			DemoConstants.accessToken);
	
	static InternetButtonImpl LedDemo = new InternetButtonImpl (api);
	
	public static void main(String[] args) throws IOException, ParticleException { 
		LedDemo.setLed(9,Color.WHITE);
	
	}
}
