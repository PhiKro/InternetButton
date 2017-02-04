package org.c02.iot.behaviour.test;

import org.c02.iot.InternetButtonImpl;
import org.c02.iot.cloud.api.ParticleApiWrapper;
import org.c02.iot.cloud.api.ParticleException;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class AudioTes {

	@Test
	public void test() 
	{
		ParticleApiWrapper api = mock(ParticleApiWrapper.class);
		InternetButtonImpl test = new InternetButtonImpl(api);
	
		try {
			test.playSound();
			verify(api).callMethod("play", null);
		} catch (ParticleException e) {
			e.printStackTrace();
		}
		
		
	}

	
}
