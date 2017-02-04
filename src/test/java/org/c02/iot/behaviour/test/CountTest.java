package org.c02.iot.behaviour.test;



import org.c02.iot.InternetButtonApi.ButtonDirection;
import org.c02.iot.InternetButtonImpl;
import org.c02.iot.cloud.api.ParticleApiWrapper;
import org.c02.iot.cloud.api.ParticleApiWrapperImpl;
import org.c02.iot.cloud.examples.DemoConstants;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedDeque;

public class CountTest {

	@Test
	public void test() {
		
		ParticleApiWrapper api = mock(ParticleApiWrapper.class);
		InternetButtonImpl test = new InternetButtonImpl(api);
		
		test.getButtonCounter(ButtonDirection.North);
		try {
			verify(api).readVariable("countButton1");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		 // api.getButtonCounter(bu);
		
		
	}

}
