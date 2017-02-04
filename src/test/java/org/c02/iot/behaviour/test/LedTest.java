package org.c02.iot.behaviour.test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.c02.iot.cloud.api.ParticleApiWrapper;
import org.junit.Test;

import com.sun.prism.paint.Color;

import org.c02.iot.InternetButtonImpl;

public class LedTest {

	@Test
	public void test() {
		
		InternetButtonImpl api = mock(InternetButtonImpl.class);
		
		api.setLed(12, java.awt.Color.RED);
		verify(api).setLed(12, java.awt.Color.RED);
		
	}

}
