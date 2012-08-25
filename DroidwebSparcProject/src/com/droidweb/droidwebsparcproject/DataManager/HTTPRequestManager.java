package com.droidweb.droidwebsparcproject.DataManager;

import java.net.URL;

import android.os.AsyncTask;

public class HTTPRequestManager {

	public HTTPRequestManager() {
	}

	public static void makeRequest(String URL) {

	}

	private class HTTPRequestTask extends AsyncTask<URL, Integer, Long> {
		protected Long doInBackground(URL... urls) {
			
			return null;
		}

		protected void onProgressUpdate(Long result) {
			// drive the percentage
		}

		protected void onPostExecute(Long result) {
			// we're done, parse the result
			//parseResponse();
		}
	}

}
