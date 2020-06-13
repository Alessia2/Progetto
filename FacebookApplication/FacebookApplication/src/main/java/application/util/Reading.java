package application.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/** classe per il reading
 * @author Flavia Gioiello
 * @author Alessia Castagnolo
 */
public class Reading {
	/**
	 * legge il contenuto dell'url
	 * @param url, url per fare il reading
	 * @return String di lettura
	 */
	
	public static String read_url(String url) throws MalformedURLException, IOException {
		String str = new String();
		try {
			URL u = new URL(url);
			
				BufferedReader input = new BufferedReader(new InputStreamReader(u.openStream()));
				String s = input.readLine();
				while(s != null) {
					str += s;
				}
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return str;
		
	}


}
