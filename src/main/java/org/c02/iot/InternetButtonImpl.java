package org.c02.iot;

import java.awt.Color;
import java.io.IOException;

import org.c02.iot.cloud.api.ParticleApiWrapper;
import org.c02.iot.cloud.api.ParticleException;

public class InternetButtonImpl implements InternetButtonApi {

	ParticleApiWrapper wrapper;

	public InternetButtonImpl(ParticleApiWrapper wrapperInstance) {
		wrapper = wrapperInstance;
	}

	public int getButtonCounter(ButtonDirection button) {
		// TODO Auto-generated method stub
		
		System.out.println("Test Test");
		try {
			String l_button = null;
			
			if ("North" == button.North.toString()) {
				l_button = "countButton1";
		    }else if("South" == button.South.toString()) {
		    	l_button = "countButton2";
		    }else if("East" == button.South.toString()) {
		    	l_button = "countButton3";
		    } else if("West" == button.South.toString()) {
		    	l_button = "countButton4";
		    }
			
			System.out.println(wrapper.readVariable(l_button));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	

	public void setLed(int position, Color color)  {
		// TODO Auto-generated method stub
		try {
			wrapper.callMethod("led",String.format("%02d", position)+color.getRed()+color.getGreen()+color.getBlue());
		} catch (ParticleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void allLedsOff() {
		// TODO Auto-generated method stub
        try {
			wrapper.callMethod("ledsOff",null);
		} catch (ParticleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void playSound() {
		try {
			wrapper.callMethod("play", null);
		} catch (ParticleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void resetButtonCounters() {
		// TODO Auto-generated method stub
		try {
			wrapper.callMethod("reset",null);
		} catch (ParticleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
