package com.droidweb.droidwebsparcproject.DataManager;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;

import android.os.AsyncTask;
import android.util.Log;

public class HTTPRequestManager {

	private static final String RECIPEREQUESTFORINGREDIENTURL = "http://192.168.8.149/Speakeasy/retrieve.php";
	
	public HTTPRequestManager() {
	}

	public void makeRequest(RequestType request, String argument) {
		switch (request){
			case GetRecipesForIngredient:
				// make the url
			try {
				URL url = new URL(RECIPEREQUESTFORINGREDIENTURL + "?type=" + "recipes" + "&argument='" + argument + "'");
				Log.d("Making Request", url.toString());
				HTTPRequestTask myHttpRequestTask = new HTTPRequestTask(request);
				myHttpRequestTask.execute(url);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private class HTTPRequestTask extends AsyncTask<URL, Integer, Long> {
		RequestType request;
		
		public HTTPRequestTask(RequestType request){
			super();
			this.request = request;
		}
		
		protected Long doInBackground(URL... urls) {

			HttpClient httpclient = new DefaultHttpClient();
			HttpPost httpost = null;
			HttpResponse response;
			InputStream stream;

			try {
				httpost = new HttpPost(urls[0].toURI());
			} catch (URISyntaxException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			try {
				response = httpclient.execute(httpost);
				HttpEntity entity = response.getEntity();
				stream = entity.getContent();
				Log.d("response", ReadInputStream(stream));
				
				
				// parse this puppy out
				HTTPResponseParser.parseResponse(ReadInputStream(stream), request);
			} catch (ClientProtocolException e) {
				// Handle not connecting to client
				Log.d("ClientProtocolException Thrown", e.toString());
			} catch (IOException e) {
				// couldn't connect to host
				// TODO: HANDLE NOT CONNECTING TO CLIENT
				Log.d("IOException Thrown", e.toString());
			}
			
			
			return null;
		}

		protected void onProgressUpdate(Long result) {
			// drive the percentage
		}

		protected void onPostExecute(String result) {
			// we're done, parse the result
			// parseResponse();
		}
	}

	public static String ReadInputStream(InputStream in) throws IOException {
		StringBuffer stream = new StringBuffer();
		byte[] b = new byte[4096];
		for (int n; (n = in.read(b)) != -1;) {
			stream.append(new String(b, 0, n));
		}
		return stream.toString();
	}

}
