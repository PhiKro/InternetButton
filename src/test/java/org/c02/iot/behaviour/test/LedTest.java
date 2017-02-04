package org.c02.iot.behaviour.test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Test;

import org.c02.iot.InternetButtonImpl;
import org.c02.iot.cloud.api.ParticleApiWrapper;
import org.c02.iot.cloud.api.ParticleException;

public class LedTest {

	@Test
	public void test() {
		ParticleApiWrapper api = mock(ParticleApiWrapper.class);
		InternetButtonImpl test = new InternetButtonImpl(api);

		test.setLed(12, java.awt.Color.WHITE);
		try {
			verify(api).callMethod("led", "12255255255");
		} catch (ParticleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
