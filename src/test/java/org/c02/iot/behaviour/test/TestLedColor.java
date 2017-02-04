package org.c02.iot.behaviour.test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.c02.iot.InternetButtonImpl;
import org.c02.iot.behaviour.CountandMoreRed;
import org.c02.iot.cloud.api.ParticleApiWrapper;
import org.c02.iot.cloud.api.ParticleException;
import org.junit.Test;

public class TestLedColor {

	@Test
	public void test() {
		
		ParticleApiWrapper api = mock(ParticleApiWrapper.class);
		InternetButtonImpl CountDemo = new InternetButtonImpl (api);
		CountandMoreRed newRed = new CountandMoreRed(CountDemo);
		newRed.run(1);
		try {
			verify(api).callMethod("ledsOff", null);
			verify(api).callMethod("reset", null);
			verify(api).callMethod("led", "051515030");
		} catch (ParticleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//fail("Not yet implemented");
	}

}
