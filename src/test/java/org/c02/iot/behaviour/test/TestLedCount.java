package org.c02.iot.behaviour.test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.c02.iot.InternetButtonImpl;
import org.c02.iot.behaviour.CountAndShowLed;
import org.c02.iot.cloud.api.ParticleApiWrapper;
import org.c02.iot.cloud.api.ParticleException;
import org.junit.Test;

public class TestLedCount {

	@Test
	public void test() {
		ParticleApiWrapper api = mock(ParticleApiWrapper.class);
		InternetButtonImpl CountDemo = new InternetButtonImpl (api);
		CountAndShowLed newCount = new CountAndShowLed(CountDemo);
		
		newCount.run();
		try {
			verify(api).callMethod("ledsOff", null);
			verify(api).callMethod("led", "0002550");
		} catch (ParticleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
