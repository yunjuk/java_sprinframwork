package ch04_pjt_01.ems.member.service;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import ch04_pjt_01.ems.member.DBConnectionInfo;

public class EMSInfomationService {
	
	private String info;
	private String copyRight;
	private String ver;
	private int sYear;
	private int sMonth;
	private int sDay;
	private int eYear;
	private int eMonth;
	private int eDay;
	private List<String> developers;
	private Map<String, String> administrators;
	private Map<String, DBConnectionInfo> dbInfos;
	
	public void printEMSInfomation() {
		System.out.println("EMS INFORMAION START ------");
		String devPeriod = sYear + "/" + "sMonth" + "/"+ "sDay" + "~" + eYear +
				"/" +eMonth + "/" +eDay;
		
		System.out.println(info +"("+devPeriod +")");
		System.out.println(copyRight);
		System.out.println(ver);
		System.out.println("Developers:"+developers);
		System.out.println("Administrator:"+administrators);
		printDBInfo();
		System.out.println("END--------------");
	}

	private void printDBInfo() {
		// TODO Auto-generated method stub
		Set<String> keys = dbInfos.keySet();
		Iterator<String>iterator = keys.iterator();
		
		while (iterator.hasNext()) {
			String key = iterator.next();
			DBConnectionInfo info = dbInfos.get(key);
			System.out.println("["+key +"DB]");
			System.out.println("url:"+info.getUrl()+"\t");
			System.out.println("userId:"+info.getUserId()+"\t");
			System.out.println("userPw:"+info.getUserPw()+"\n");
		}
		
	}


	public String getCopyRight() {
		return copyRight;
	}

	public void setCopyRight(String copyRight) {
		this.copyRight = copyRight;
	}

	public String getVer() {
		return ver;
	}

	public void setVer(String ver) {
		this.ver = ver;
	}

	public int getsYear() {
		return sYear;
	}

	public void setsYear(int sYear) {
		this.sYear = sYear;
	}

	public int getsMonth() {
		return sMonth;
	}

	public void setsMonth(int sMonth) {
		this.sMonth = sMonth;
	}

	public int getsDay() {
		return sDay;
	}

	public void setsDay(int sDay) {
		this.sDay = sDay;
	}

	public int geteYear() {
		return eYear;
	}

	public void seteYear(int eYear) {
		this.eYear = eYear;
	}

	public int geteMonth() {
		return eMonth;
	}

	public void seteMonth(int eMonth) {
		this.eMonth = eMonth;
	}

	public int geteDay() {
		return eDay;
	}

	public void seteDay(int eDay) {
		this.eDay = eDay;
	}

	public List<String> getDevelopers() {
		return developers;
	}

	public void setDevelopers(List<String> developers) {
		this.developers = developers;
	}

	public Map<String, String> getAdministrators() {
		return administrators;
	}

	public void setAdministrators(Map<String, String> administrators) {
		this.administrators = administrators;
	}

	public Map<String, DBConnectionInfo> getDbInfos() {
		return dbInfos;
	}

	public void setDbInfos(Map<String, DBConnectionInfo> dbInfos) {
		this.dbInfos = dbInfos;
	}
	
	

}
