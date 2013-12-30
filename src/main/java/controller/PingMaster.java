package controller;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class PingMaster {

	PingResponse response = null;


	public PingResponse ping(String target) {
		response = new PingResponse(target);
		URL url;
		try {
			url = new URL("http://" + target);
			response.success = executePingCommand(url);		
			response.setMessage("Ping OK. Duration is " + response.getResponseTime());
		} catch (MalformedURLException e) {
			response.setMessage(e.getMessage());
			response.setSuccess(false);
			e.printStackTrace();
		} catch (IOException e) {
			response.setMessage(e.getMessage());
			response.setSuccess(false);
			e.printStackTrace();
		}
		
		return response;
	}

	private boolean executePingCommand(URL url) throws IOException {
		HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
		
		long start = System.currentTimeMillis();
		urlConnection.connect();
		long finish = System.currentTimeMillis();
		
		long responseTime = finish - start;
		response.setResponseTime(responseTime);
		
		if(urlConnection.getResponseCode() == HttpURLConnection.HTTP_OK){
			return true;
		}
		return false;
	}

	public PingResponse ping(String target, int pingCount) {
		// TODO Auto-generated method stub
		return null;
	}
}
