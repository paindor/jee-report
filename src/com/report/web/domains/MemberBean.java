package com.report.web.domains;

import java.io.Serializable;

public class MemberBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String name, stuNum, ssn;
	private String kor , eng , math, society;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStuNum() {
		return stuNum;
	}
	public void setStuNum(String stuNum) {
		this.stuNum = stuNum;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getKor() {
		return kor;
	}
	public void setKor(String kor) {
		this.kor = kor;
	}
	public String getEng() {
		return eng;
	}
	public void setEng(String eng) {
		this.eng = eng;
	}
	public String getMath() {
		return math;
	}
	public void setMath(String math) {
		this.math = math;
	}
	public String getSociety() {
		return society;
	}
	public void setSociety(String society) {
		this.society = society;
	}
	@Override
	public String toString() {
		return "MemberBean [name=" + name + ", stuNum=" + stuNum + ", ssn=" + ssn + ", kor=" + kor + ", eng=" + eng
				+ ", math=" + math + ", society=" + society + "]";
	}
	

}
