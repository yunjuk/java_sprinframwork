package com.kh.apiTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class ApiExplorer {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/1741000/TsunamiShelter3/getTsunamiShelter1List");
		urlBuilder.append("?" + URLEncoder.encode("serviceKey= 서비스키","UTF-8"));
		urlBuilder.append("&"+URLEncoder.encode("pageNo = 1","UTF-8"));
		urlBuilder.append("&"+URLEncoder.encode("numOfRows=10","UTF-8"));
		urlBuilder.append("&"+URLEncoder.encode("type=json","UTF-8"));
		
		
		
		URL url = new URL(urlBuilder.toString());
		//유알엘 빌더가 실제 객체가 아니라서 투스트링을 이용해줘야 함.
		HttpURLConnection conn = (HttpURLConnection)url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Content-type", "application/json");
		
		System.out.println("Response code: " + conn.getResponseCode());
		
		BufferedReader rd;
		if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
			rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		}else {
			rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
			
		}
		StringBuilder sb = new StringBuilder();
		String line;
		while ((line=rd.readLine()) != null) {
			sb.append(line);
		}
		rd.close();
		conn.disconnect();
		System.out.println(sb.toString());
		
		
		
	}

}
