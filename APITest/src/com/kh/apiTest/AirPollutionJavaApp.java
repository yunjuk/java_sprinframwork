package com.kh.apiTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class AirPollutionJavaApp {

	public static final String serviceKey = "G8md4vK%2F2ZW8EgolMGtyxOyoc88y0wHxr9RqqGhIaVaYqDqQfYuNloprTlPrSTZIdwH8DsJKfEFf0YuNTrzYdg%3D%3D";

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String url = "http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getCtprvnRltmMesureDnsty";
		//"http://apis.data.go.kr/B552584/UserSportSvc";

			
		url += "?serviceKey=" + "서비스키";
		url += "&sidoName=" + URLEncoder.encode("서울","UTF-8");
		url +="&returnType=json";
		
		URL requestUrl = new URL(url);
		HttpURLConnection urlConnection = (HttpURLConnection)requestUrl.openConnection();
		urlConnection.setRequestMethod("GET");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
		String line = null;
		while((line = br.readLine())!= null) {
			System.out.println(line);
		}
		br.close();
		urlConnection.disconnect();
	}

}
