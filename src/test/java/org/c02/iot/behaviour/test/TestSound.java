package org.c02.iot.behaviour.test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import org.c02.iot.InternetButtonImpl;
import org.c02.iot.behaviour.CountAndSound;
import org.c02.iot.behaviour.CountandMoreRed;
import org.c02.iot.cloud.api.ParticleApiWrapper;
import org.c02.iot.cloud.api.ParticleException;
import org.junit.Test;

public class TestSound {

	@Test
	public void test() {
		ParticleApiWrapper api = mock(ParticleApiWrapper.class);
		InternetButtonImpl CountDemo = new InternetButtonImpl (api);
		CountAndSound newSound = new CountAndSound(CountDemo);
		
		newSound.run(10);
		try {
			verify(api).callMethod("Play", "1");
		} catch (ParticleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		newSound.run(1);
		verifyNoMoreInteractions(api);
		
		
	}

}
