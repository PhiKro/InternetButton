package org.c02.iot.behaviour.test;

import static org.junit.Assert.*;

import org.c02.iot.cloud.api.ParticleApiWrapper;
import org.c02.iot.cloud.api.ParticleException;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class AudioTes {

	@Test
	public void test() 
	{
		ParticleApiWrapper api = mock(ParticleApiWrapper.class);
	
		try {
			api.callMethod("play", null);
			verify(api).callMethod("play", null);
		} catch (ParticleException e) {
			e.printStackTrace();
		}
		
		
	}

	
}
