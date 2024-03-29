package org.c02.iot.cloud.api;

import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;
import org.restlet.data.Form;
import org.restlet.representation.Representation;
import org.restlet.resource.ClientResource;

public class ParticleApiWrapperImpl implements ParticleApiWrapper {

	public final static String BASE_URL_PATTERN = "https://api.particle.io/v1/devices/";
	private ClientResource cr_ = new ClientResource("");

	private final String deviceId;
	private final String accessToken;

	public ParticleApiWrapperImpl(String deviceId, String accessToken) {
		super();
		this.deviceId = deviceId;
		this.accessToken = accessToken;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public String getRequestURL(String cloudFunction) {
		return BASE_URL_PATTERN + deviceId + "/" + cloudFunction;
	}

	public String getVariable(String variable) {
		return BASE_URL_PATTERN + deviceId + "/" + variable + "?access_token=" + accessToken + "&format=raw";
	}

	public Representation buildPostRequestData(String cloudFunctionArg) {
		Form form = new Form();
		form.set("access_token", accessToken);
		form.set("args", cloudFunctionArg);
		return form.getWebRepresentation();
	}

	public int readVariable(String variable) throws IOException {
		cr_.setReference(this.getVariable(variable));
		Representation representation = cr_.get();
		String text = representation.getText();
		return Integer.parseInt(text);
	}

	public int callMethod(String method, String parameter) throws ParticleException {
		try {
			cr_.setReference(this.getRequestURL(method));
			Representation postData = this.buildPostRequestData(parameter);
			JSONObject post = cr_.post(postData, JSONObject.class);
			return post.getInt("return_value");
		} catch (JSONException e) {
			throw new ParticleException(e);
		}
	}
	
	public void playsound()
	{
		
	}

}
